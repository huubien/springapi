# Api Interface specification #

## Common

* Encoding
    * UTF-8
* Protocal
    * HTTPS

## Get Children API

* Get children list.

### Request

* URI
    * /person/children
* Method
    * GET

#### Header

* Content-type
    * application/json

#### Request

|Parameter name|Sample|Type|Description|
|:-----------|:------------|:------------|:------------|
|sex|male|string|Sex(male, female)|

#### Sample URL

```
/person/children?sex=male
```

### Response

#### Header

* Content-Type
    * application/json
* HTTP status
    * 200

#### Response Body

|Key|Value|Type|Description|
|:-----------|:------------|:------------|:------------|
|name|Nguyen Van A|string|Full name|
|age|8|number|Age|
|address|10 Pho Quang, Phuong 2, Tan Binh|string|Address|

##### Sample Response

```
[
  {
    "name":"Nguyen Van A",
    "age":8,
    "address":"10 Pho Quang - Phuong 2 - Quan Tan Binh"
  },
  {
    "name":"Nguyen Van B",
    "age":9,
    "address":"45/76 Cao Lo - Phuong 4 - Quan 8"
  }
]
```
