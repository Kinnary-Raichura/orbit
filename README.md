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
   "dealName": "Hello 3",
   "orderType": "testorderType",
   "chargeType": "chargeType",
   "status": "status",
   "orderItemsList": [   {
      "cashFlag": 1,
      "chargeCode": "chargeCode",
      "chargeRate": 1,
      "quantity": 2,
      "chargeAmount": 1,
      "chargeDetail": "chargeDetail",
      "date": null,
      "account": 1
   }]
}

Sample response for POST or GET
-------------------------------


{
   "orderId": 1,
   "customerName": "Kinnary",
   "dealName": "Hello 3",
   "orderType": "testorderType",
   "chargeType": "chargeType",
   "status": "status",
   "orderItemsList": [   {
      "orderItemId": 1,
      "cashFlag": 1,
      "chargeCode": "chargeCode",
      "chargeRate": 1,
      "quantity": 2,
      "chargeAmount": 1,
      "chargeDetail": "chargeDetail",
      "date": null,
      "account": 1
   }]
}

Sample request for POST when an update is required (Please note that the PUT is not configured)

{
    "orderId": 1,
    "customerName": "Kinnary",
    "dealName": "Hello 3",
    "orderType": "testorderType",
    "chargeType": "chargeType",
    "status": "status",
    "orderItemsList": [
        {
        	"orderItemId": 3,
            "cashFlag": 1,
            "chargeCode": "chargeCode",
            "chargeRate": 1,
            "quantity": 2,
            "chargeAmount": 1,
            "chargeDetail": "chargeDetail",
            "date": null,
            "account": 1
        }
    ]
}

Work in progress
----------------

1)Unit test cases
2)Date logic needs to be synced with the front end.

