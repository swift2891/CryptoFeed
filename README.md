# CryptoFeed

CryptoFeed is a REST web service which responds with current crypto-currency quotes and exchange rates on demand.

## Files
    1) CryptoFeed/ - Eclipse Project Folder
            QuotesHandler.java - Handles Quotes requests
            ExchangeHandler.java - Handles Exchange requests
            CollectionHandler.java - Handles requests for total assets
            web.xml - servlet configuration file
    2) CryptoFeed.war - Quick deploy file 

## Quick Deploy / Installation 
#### (For Windows. Similar steps for other OS)
    1) Download Tomcat v8.5 - https://tomcat.apache.org/download-80.cgi#8.5.33
    2) Copy the CryptoFeed.war file into extracted folder of /apache-tomcat-8.5.32/webapps/
    3) Start the TomCat by executing /apache-tomcat-8.5.32/bin/start.bat
    4) Access the CryptoFeed REST API service at the following URL - http://localhost:8080/CryptoFeed/ 
    
## Tech
* javax-ws-rs - web service libraries
* jersey - REST implementation and misc libraries

## API Documentation
### Quotes
##### HTTP Request
    http://localhost:8080/CryptoFeed/quotes/{symbol-id}
##### Example
    http://localhost:8080/CryptoFeed/quotes/COINBASE_SPOT_BCH_USD
    http://localhost:8080/CryptoFeed/quotes/all

##### What is symbol String?
|Type|Pattern|
|----|-------|
|SPOT|{exchange_id}_SPOT_{asset_id_base}_{asset_id_quote}|
|FUTURES|{exchange_id}_FTS_{asset_id_base}_{asset_id_quote}_{YYMMDD of future_delivery_time}|
|OPTION|{exchange_id}_OPT_{asset_id_base}_{asset_id_quote}_{YYMMDD of option_expiration_time}_{option_strike_price}_{option_type_is_call as C/P}|
|PERPETUAL|{exchange_id}_PERP_{asset_id_base}_{asset_id_quote}|
|INDEX|{exchange_id}_IDX_{index_id}|

### Exchange Rates
##### HTTP Request
    http://localhost:8080/CryptoFeed/exchangerate/{currency}/{country}
##### Example
    http://localhost:8080/CryptoFeed/exchangerate/BTC/USD
    http://localhost:8080/CryptoFeed/exchangerate/BTC/all

### All Symbols (used in quotes)
##### HTTP Request
    http://localhost:8080/CryptoFeed/total/symbols

### All Currencies (used in exchange rate)
##### HTTP Request
    http://localhost:8080/CryptoFeed/total/assets