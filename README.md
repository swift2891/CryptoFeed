# CryptoFeed

CryptoFeed is a REST web service which responds with current crypto-currency quotes and exchange rates on demand.

# Files
- CryptoFeed/ ---------------- Eclipse Project Folder
-- QuotesHandler.java ----- handles current quotes requests
-- ExchangeHandler.java -- handles current exchange requests
-- web.xml ------------------ servlet configuration file
- CryptoFeed.war ------------ Quick deploy file 

# Quick Deploy / Installation
    1) Download Tomcat v8.5 - https://tomcat.apache.org/download-80.cgi#8.5.33
    2) Copy the CryptoFeed.war file into extracted folder of /apache-tomcat-8.5.32/webapps/
    3) Start the TomCat by executing /apache-tomcat-8.5.32/bin/start.bat
    4) Access the CryptoFeed REST API service at the following URL-              http://localhost:8080/CryptoFeed/ 
    
### Tech
* javax-ws-rs - web service libraries
* jersey - REST implementation and misc libraries

# API Documentation
### Quotes
##### HTTP Request
    http://localhost:8080/CryptoFeed/quotes/{symbol-id}
##### Example
    http://localhost:8080/CryptoFeed/quotes/COINBASE_SPOT_BCH_USD
    http://localhost:8080/CryptoFeed/quotes/all
### Exchange Rates
##### HTTP Request
    http://localhost:8080/CryptoFeed/exchangerate/{currency}/{country}
##### Example
    http://localhost:8080/CryptoFeed/exchangerate/BTC/USD
    http://localhost:8080/CryptoFeed/exchangerate/BTC/all