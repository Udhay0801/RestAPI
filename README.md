# RestAPI
Created a spring boot aplication and exposed rest API's. This is a standalone project which can be imported and run.

Dependencies Included 
---------------------
1. spring-boot-starter-web
2. spring-boot-starter-data-jpa
3. spring-boot-starter-security
4. h2 DB
5. spring-boot-starter-actuator

As Per specification created 2 rest API's with endpoints as below:-
This Endpoints returns JSON response
1. GET /api/product/getproductdetails
2. GET /api/product/getproductbyid/{productId} (productId as pathVariable)
3. GET /api/config/getconfigdetails - this endpoint returns application config properties in json format

Included basic inmemory security as below:-
1. Endpoint GET /api/product/getproductdetails & /api/product/getproductbyid/{productId} can be accessed by role USER
2. Endpoint GET /api/config/getconfigdetails can be accessed by role ADMIN

Created two users:-
------------------
1. USER Role
   Username = Balaji
   password = pass
   Authorized to access only below URLs
   1. GET /api/product/getproductdetails
   2. GET /api/product/getproductbyid/{productId} (productId as pathVariable)
   
2. ADMIN Role
   Username = Udhay
   Password = adminpass
   Authorized to access only below URLs
   GET /api/config/getconfigdetails
   
   To Test:-
   ---------
   Use PostMan
   1. paste URL in get method
   2. Under Authorization tab give the username and password and click on preview request
   3. Now headers will be populated with Authorization key 
   4. Now hit the request 
   
