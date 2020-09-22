package Visuals.TextInterface;

import Logic.Ref_Client;
import Logic.Ref_Item;
import Logic.Ref_Orders;
import Models.Client;
import Models.Item;
import Models.Orders;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReportsText {
    private final static Ref_Item auxI =new Ref_Item();
    private final static Ref_Client auxC =new Ref_Client();
    private final static Ref_Orders auxO =new Ref_Orders();
    private static int count=0;
    private static int billCount = 0;

    private static void addTableHeader(PdfPTable table, String[] names){
        Stream.of(names)
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));
                    table.addCell(header);
                });
    }
    private static void addRows(PdfPTable table) {
        table.addCell("row 1, col 1");
        table.addCell("row 1, col 2");
        table.addCell("row 1, col 3");
    }
    public static void getReport(String input) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Report"+count+".pdf"));
        ++count;
        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Chunk chunk = new Chunk("Report", font);

        if (input.equals("client")){
            List<Client> clients = auxC.findAll();
            PdfPTable table = new PdfPTable(2);
            addTableHeader(table,new String[]{"name","address"});
            clients.forEach(x->{table.addCell(x.getClient_name());x.getClient_address();});
            document.add(table);
            document.close();
            return;
        }
        if(input.equals("product")){
            List<Item> items= auxI.findAll();
            PdfPTable table = new PdfPTable(3);
            addTableHeader(table,new String[]{"name","quantity","price"});
            items.forEach(x->{
                table.addCell(x.getItem_name());
                table.addCell(Integer.toString(x.getQuantity()));
                table.addCell(Integer.toString(x.getPrice()));
            });
            document.add(table);
            document.close();
            return;
        }
        if(input.equals("order")){
            List<Orders> orders = auxO.findAll();
            PdfPTable table = new PdfPTable(3);
            addTableHeader(table,new String[]{"name","quantity","price"});
            orders.forEach(x->{table.addCell(Integer.toString(x.getClient_id()));});
            document.add(table);
            document.close();
            return;
        }
    }
    public static void createBill(String billText) throws FileNotFoundException, DocumentException {
        String[] separated = billText.split("~");
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("Bill"+count+".pdf"));
        ++billCount;
        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        Arrays.stream(separated).forEach(x-> {
            try {
                document.add(new Chunk(x));
                document.add(new Paragraph(""));
            } catch (DocumentException ignored) { }
        });
        document.close();
    }
}
