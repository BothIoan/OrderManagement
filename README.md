# OrderManagement

 An order management for processing customer orders for a warehouse.
 In more technical terms, the app just manages a relational database used to store products, clients and orders.
 ##Input 
 
 There are two ways to interact with the application. You chose which one you want at the beginning
 
 ### 1 Console based
 
 You have the following commands:
 
 _For CRUD stuff_
 
 > Insert client: (name), (location)
 
 > Delete client: (name)
 
 > Insert product: (name), (quantity), (price)
 
 > Delete product: (name)
 
 > Order: (name_client), (name_product), (quantity)
 
 _For generating reports_
 
 > Report client
 
 > Report order
 
 > Reprt product
 
Observations:
 
 * The separator is usually comma space
 * Insert means create, Order means create order 
 * Reports are generated in PDF format
 
 ### 2 GUI based
 
 * buttons for everything 
 * items are displayed in tables 
 * you can search for items by name
 
 ## Implementation
 
 The main ideea behind the project was to learn how to communicate with a db.
 There is some reflection used here and there.
