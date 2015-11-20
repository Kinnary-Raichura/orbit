# orbit

To run this project. Please download the source code and open the terminal and  go to the main project folder.

Type

gradlew build

This command, on running it for the first time, might take a while. Once the build completes. Run the command -

java -jar build/libs/orbit-0.1.0.jar

Open your browser to 

http://localhost:8080/orbit/order

for get or post requests.

Sample request for POST
----------------------

{
   "customerName": "Kinnary",
   "dealName": 1,
   "orderType": "testorderType",
   "chargeType": "chargeType",
   "status": "status",
   "orderItemsList": [   {
      "cashFlag": true,
      "chargeCode": "chargeCode",
      "chargeRate": 1,
      "quantity": 2,
      "chargeAmount": 1,
      "chargeDetail": "chargeDetail",
      "date": "11/11/1987",
      "account": 1
   }]
}

Sample response for POST or GET
-------------------------------


{
   "orderId": 1,
   "customerName": "Kinnary",
   "dealName": 1,
   "orderType": "testorderType",
   "chargeType": "chargeType",
   "status": "status",
   "orderItemsList": [   {
      "orderItemId": 1,
      "cashFlag": true,
      "chargeCode": "chargeCode",
      "chargeRate": 1,
      "quantity": 2,
      "chargeAmount": 1,
      "chargeDetail": "chargeDetail",
      "date": "11/11/1987",
      "account": 1
   }]
}

Sample request for POST when an update is required (Please note that the PUT is not configured)

{
   "orderId": 1,
   "customerName": "Kinnary 2",
   "dealName": 1,
   "orderType": "testorderType",
   "chargeType": "chargeType",
   "status": "status",
   "orderItemsList": [   {
   	 "orderItemId": 1,
      "cashFlag": false,
      "chargeCode": "chargeCode",
      "chargeRate": 1,
      "quantity": 2,
      "chargeAmount": 1,
      "chargeDetail": "chargeDetail",
      "date": "11/11/1987",
      "account": 1
   }]
}

localhost:8080/orbit/deal

for GET response

[
      {
      "dealId": 1,
      "customerName": "Customer 1",
      "dealMaker": "Deal maker 1",
      "description": "Description 1",
      "project": "Project A",
      "dealDate": "11/20/2015"
   },
      {
      "dealId": 2,
      "customerName": "Customer 2",
      "dealMaker": "Deal maker 2",
      "description": "Description 2",
      "project": "Project A",
      "dealDate": "11/20/2015"
   },
      {
      "dealId": 3,
      "customerName": "Customer 3",
      "dealMaker": "Deal maker 3",
      "description": "Description 3",
      "project": "Project A",
      "dealDate": "11/20/2015"
   },
      {
      "dealId": 4,
      "customerName": "Customer 4",
      "dealMaker": "Deal maker 4",
      "description": "Description 4",
      "project": "Project A",
      "dealDate": "11/20/2015"
   },
      {
      "dealId": 5,
      "customerName": "Customer 5",
      "dealMaker": "Deal maker 5",
      "description": "Description 5",
      "project": "Project A",
      "dealDate": "11/20/2015"
   }
]

Work in progress
----------------

1)Unit test cases
2)Date logic needs to be synced with the front end.

