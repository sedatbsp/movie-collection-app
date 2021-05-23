# :clapper: Movie Collection App  

- Spring Boot
- Spring Data JPA
- Spring Security
- Thymeleaf
- Maven
- Bootstrap 

## :thought_balloon: **Information about the App**

+ Registration with admin or user role.

    + Accounts with the admin role can add, update, or delete movies, but accounts with the user role cannot update or delete movies.

+ Movies list and details of the movie can be viewed without logging into the application.

+ You need a strong password to sign up for the app. 
    + (An 8-character password pattern with at least 1 lowercase letter, 1 uppercase letter, 1 number and 1 special character.)

## :dart: **Features to be developed in the near future:** 

- [X] Searching by name of the movie (Searching by movie name, actor name and genre added.)
- [ ] Sorting by release year of the movie

## :dash: **How to run the application?**

>  Select database management system from `application.properties` (*default:mysql but **postgresql supported***)
+ schema name: ***movieCollectionDB***

    + use ***moviecollectiondb.sql*** to create tables 

```properties
spring.datasource.url = jdbc:mysql://localhost:3306/movieCollectionDB?useSSL=false
spring.datasource.username = root
spring.datasource.password = root
```

:point_right: **If you enable postgresql comment lines, you need to set your postgresql connection settings.** &darr;
```properties
## spring.datasource.url = jdbc:postgresql://localhost:5432/movieCollectionDB
## spring.datasource.username = postgresql
## spring.datasource.password = postgresql
```

_Run the application_, then open your browser and launch it at **localhost:8080** as the url.


## :camera: **Screenshots** 
- ### **Login Page**
![](https://i.hizliresim.com/gz7f5tr.png) 
- ### **Sign-up Page** 
![](https://i.hizliresim.com/8vwzox2.png)  
- ### **Home(index) Page**
![](https://i.hizliresim.com/lhj8u8q.png)  
- ### **Movie Add Page**
![](https://i.hizliresim.com/cn5zsll.png)  
- ### **Movies Page**
![](https://i.hizliresim.com/8lnki49.png)  
- ### **Search**
![](https://i.hizliresim.com/omu99hl.gif)  
- ### **Movie Details Page**
![](https://i.hizliresim.com/oo2fqhh.png) 
- ### **Movie Details Page** 
![](https://i.hizliresim.com/i1x2znl.png) 
- ### **Movie Update Page** 
![](https://i.hizliresim.com/71tfuf2.png)  
- ### **Movie Updated Alert**
![](https://i.hizliresim.com/brmsxa5.png)  
- ### **Movie Deleted Alert**
![](https://i.hizliresim.com/2k0b6eo.png) 

### :white_circle: **Entity Relationship Diagram**

![](https://i.hizliresim.com/kwq4tmq.jpg)

<hr>

- Thanks to **Özgür Yazılım** :blush:
