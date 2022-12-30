# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.7/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.7/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.7/reference/htmlsingle/#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.7.7/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/2.7.7/reference/htmlsingle/#web.reactive)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.7.7/reference/htmlsingle/#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* I have installed json-server, I am starting it using the below command:
* >json-server --host 127.0.0.1 db.json
* My db.json is as below
* {
  "users": [
  {
  "id": 1,
  "gender": "female",
  "name": {
  "title": "Ms.",
  "first": "Molly",
  "last": "Robel"
  },
  "location": {
  "street": "24674 Cyrus Key Apt. 291",
  "city": "Emilieberg",
  "state": "Texas",
  "postcode": "47890-3822"
  },
  "email": "tremblay.loy@streich.com",
  "login": {
  "username": "devonte67",
  "password": "><'}$pwwuv",
  "md5": "a9b1643ad87da1cf6598a27c5bbd3ae1",
  "sha1": "42f2cc46f189cb35c600d4a788a050d0ee27d623",
  "sha256": "9f5a440f116de4b9e54ac378ba96b98f126cf0a3ec6c76d0e01cfefd8b75fcab"
  },
  "phone": "866-864-1372",
  "job": {
  "title": "Gas Processing Plant Operator",
  "company": "Keeling, Halvorson and Mayert"
  },
  "billing": {
  "card": {
  "type": "MasterCard",
  "number": "4539661724756466",
  "expiration_date": {
  "date": "2016-09-29 01:39:53.000000",
  "timezone_type": 3,
  "timezone": "UTC"
  },
  "iban": "NA55633746255612759286461167",
  "swift": "RGBHHSXZ"
  }
  },
  "language": "yi",
  "currency": "ZAR"
  },
  {
  "id": 2,
  "gender": "female",
  "name": {
  "title": "Ms.",
  "first": "Holly",
  "last": "Robel"
  },
  "location": {
  "street": "24674 Cyrus Key Apt. 291",
  "city": "Emilieberg",
  "state": "Texas",
  "postcode": "47890-3822"
  },
  "email": "tremblay.loy@streich.com",
  "login": {
  "username": "devonte67",
  "password": "><'}$pwwuv",
  "md5": "a9b1643ad87da1cf6598a27c5bbd3ae1",
  "sha1": "42f2cc46f189cb35c600d4a788a050d0ee27d623",
  "sha256": "9f5a440f116de4b9e54ac378ba96b98f126cf0a3ec6c76d0e01cfefd8b75fcab"
  },
  "phone": "866-864-1372",
  "job": {
  "title": "Gas Processing Plant Operator",
  "company": "Keeling, Halvorson and Mayert"
  },
  "billing": {
  "card": {
  "type": "MasterCard",
  "number": "4539661724756466",
  "expiration_date": {
  "date": "2016-09-29 01:39:53.000000",
  "timezone_type": 3,
  "timezone": "UTC"
  },
  "iban": "NA55633746255612759286461167",
  "swift": "RGBHHSXZ"
  }
  },
  "language": "yi",
  "currency": "ZAR"
  },
  {
  "limit": "1",
  "id": 3
  },
  {
  "id": 4
  },
  {
  "limit": "1",
  "id": 5
  },
  {
  "limit": "1",
  "id": 6
  },
  {
  "limit": "1",
  "id": 7
  }
  ]
  }
* Your rest end point will be http://localhost:3000/users

