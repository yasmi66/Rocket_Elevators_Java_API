# Rocket_Elevators_Java_API

Built with Springboot , Java v19, Maiden v / Jar + mySQL  using IntelliJ (Used Dependencies : Rest services, lombok to reduce use/need for annotations, spring data jpa and H2 for communication with DB +  mysql driver dependencies):  springinitilizer to build initial project folder 

3 layer architecture : Controller, Service, DAO

1- setter based dependency injection
2-constructor based dependency injection

JWT auth for web security 

JPA / REST annotations for database table relations (primary / foreign keys) for the last endpoints 

uses JPA annotations, and hibernate for db interactions

# Architecture  
Service/Service impl + Repository + Entities (Models) + Controllers for :

-Batteries
-Buildings
-Columns
-Customers
-Interventions
-Users
