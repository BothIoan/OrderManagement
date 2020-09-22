package Logic;
import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import Connection.DatabaseConnection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Visuals.ErrorUI;

public class ForReflection<T> {

    private final Class<T> type;
    public ForReflection() {
        this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    }

    public List<T> findAll() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        StringBuilder sb= new StringBuilder();
        sb.append(("SELECT * FROM "));
        sb.append(type.getSimpleName());
        String query = sb.toString();
        try{
            connection = DatabaseConnection.getConnection();
            statement=connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            List<T> list = createObjects(resultSet);
            return list;
        }
        catch (SQLException e) { }
        finally {
            DatabaseConnection.close(resultSet);
            DatabaseConnection.close(statement);
            DatabaseConnection.close(connection);
        }
        return null;
    }
    public int findMaxId() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        StringBuilder sb= new StringBuilder();
        sb.append(("SELECT * FROM "));
        sb.append(type.getSimpleName());
        String query = sb.toString();
        try{
            connection = DatabaseConnection.getConnection();
            statement=connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            ArrayList<Integer> list= new ArrayList<>();
            while(resultSet.next()){
                list.add(resultSet.getInt(1));
            }
            return list.stream().mapToInt(x->x).max().orElse(0);
        }
        catch (SQLException e) { }
        finally {
            DatabaseConnection.close(resultSet);
            DatabaseConnection.close(statement);
            DatabaseConnection.close(connection);
        }
        return -1;
    }
    private List<T> createObjects(ResultSet resultSet) {
        List<T> list = new ArrayList<T>();
        try {
            while (resultSet.next()) {
                T instance = type.newInstance();
                for (Field field : type.getDeclaredFields()) {
                    Object value = resultSet.getObject(field.getName());
                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), type);
                    Method method = propertyDescriptor.getWriteMethod();
                    method.invoke(instance, value);
                }
                list.add(instance);
            }
        } catch (InstantiationException e) {
            System.out.println("e1");
        } catch (IllegalAccessException e) {
            System.out.println("e2");
        } catch (SecurityException e) {
            System.out.println("e3");
        } catch (IllegalArgumentException e) {
            System.out.println("e4");
        } catch (InvocationTargetException e) {
            System.out.println("e5");
        } catch (SQLException e) {
            System.out.println("e6");
        } catch (IntrospectionException e) {System.out.println("e7"); }
        return list;
    }
    //For the createTable method

    public String[] genColNames()
    {
        Field[] fields= type.getDeclaredFields();
        String [] columns = new String[fields.length];
        int i = 0;
        for(Field field : fields)
        {
            columns[i] = field.getName();
            i++;
        }
        return columns;
    }
    public Object[][] getrows(List<T> list) {
        Object[][] arr = new Object[list.size()][type.getDeclaredFields().length];
        for (int i=0;i<list.size();i++)
        {
            int j=0;
            Field[] fields = type.getDeclaredFields();
            for(Field field : fields)
            {
                field.setAccessible(true);
                try {
                    arr[i][j] = field.get(list.get(i));
                }
                catch(IllegalAccessException e) {}
                finally {
                    j++;
                }
            }
        }
        return arr;
    }

    /**
     *
     * @param objects
     * @return
     */
    public JTable createTable(List<T> objects){
        return new JTable(getrows(objects),genColNames());
    }
    public DefaultTableModel updateTable(List<T> objects) {return new DefaultTableModel(getrows(objects),genColNames());}
    public void insert(String[] parameters) {
        PreparedStatement statement = null;
        Connection connection = DatabaseConnection.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ");
        sb.append(type.getSimpleName());
        sb.append(" VALUES (");
        for(String aux: parameters)
        {
            sb.append(aux);
            sb.append(" , ");
        }
        sb.delete(sb.length()-2,sb.length()-1);
        sb.append(")");
        try {
            System.out.println(sb.toString());
            statement = connection.prepareStatement(sb.toString());
            statement.executeUpdate();
        }
        catch (SQLException e){
            new ErrorUI("Id Already used");
        }
        finally {
            DatabaseConnection.close(connection);
            DatabaseConnection.close(statement);
        }
    }

    public void delete(String thisField , String thisName) {
        PreparedStatement statement = null;
        Connection connection = DatabaseConnection.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(type.getSimpleName());
        sb.append(" WHERE ");
        sb.append(thisField);
        sb.append(" = ");
        sb.append(thisName);
        try {
            System.out.println(sb.toString());
            statement = connection.prepareStatement(sb.toString());
            statement.executeUpdate();
        }
        catch (SQLException e){

           new ErrorUI("not found");
        }
        finally {
            DatabaseConnection.close(connection);
            DatabaseConnection.close(statement);
        }
    }

    public void edit(String[] fieldsToEdit,String[] newValues,String thisField,String thisName)
    {
        PreparedStatement statement = null;
        Connection connection = DatabaseConnection.getConnection();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(type.getSimpleName());
        sb.append(" SET ");
        for(int i=0;i<fieldsToEdit.length;i++)
        {
            sb.append(fieldsToEdit[i]);
            sb.append(" = ");
            sb.append(newValues[i]);
            sb.append(" , ");
        }
        sb.deleteCharAt(sb.length()-2);
        sb.append(" WHERE ");
        sb.append(thisField);
        sb.append(" = ");
        sb.append(thisName);
        try {
            System.out.println(sb.toString());
            statement = connection.prepareStatement(sb.toString());
            statement.executeUpdate();
        }
        catch (SQLException e){
            new ErrorUI("not found");
        }
        finally {
            DatabaseConnection.close(connection);
            DatabaseConnection.close(statement);
        }
    }

    public List find(String field,String searchWord) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM ");
        sb.append(type.getSimpleName());
        sb.append(" WHERE ");
        sb.append("CONVERT(");
        sb.append(field);
        sb.append(",CHAR(25) )");
        sb.append(" LIKE ");
        sb.append(searchWord);
        sb.deleteCharAt(sb.length()-1);
        sb.append("%'");
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DatabaseConnection.getConnection();
            System.out.println(sb.toString());
            statement = connection.prepareStatement(sb.toString());
            resultSet = statement.executeQuery();

            return createObjects(resultSet);
        } catch (SQLException e) { new ErrorUI("???");}
        finally {
            DatabaseConnection.close(resultSet);
            DatabaseConnection.close(statement);
            DatabaseConnection.close(connection);
        }
        return null;
    }



    public List strictFind(String field,String searchWord) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM ");
        sb.append(type.getSimpleName());
        sb.append(" WHERE ");
        sb.append(field);
        sb.append(" = ");
        sb.append(searchWord);
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DatabaseConnection.getConnection();
            System.out.println(sb.toString());
            statement = connection.prepareStatement(sb.toString());
            resultSet = statement.executeQuery();

            return createObjects(resultSet);
        } catch (SQLException e) { new ErrorUI("??2?");}
        finally {
            DatabaseConnection.close(resultSet);
            DatabaseConnection.close(statement);
            DatabaseConnection.close(connection);
        }
        return null;
    }

}
