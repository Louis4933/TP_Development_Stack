# Docker Project : Angular (front-end) / Spring Boot (back-end) / H2 in-memory database
The application is an online library where existing books can be added, deleted, updated and viewed. It is coded in AngularJS, Spring Boot and uses the H2 in-memory database.

# Goals 
Building a working set of docker layers

# To use
docker-compose up --build -d

docker-compose down

# The stack
The stack is made up of a front-end, in the application's front folder, and a back-end, in the application's back folder. The front depends on the back, so as not to needlessly continue launching an erroneous application.

# Screenshot

![screen_TP_Dev_Stack](https://github.com/Louis4933/TP_Development_Stack/assets/100688035/c8e74a88-5547-47c7-af95-88f81523085b)
