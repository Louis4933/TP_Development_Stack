# Docker Project
The application is an online library where existing books can be added, deleted, updated and viewed. It is coded in AngularJS (front-end), Spring Boot (back-end) and uses the H2 in-memory database.

# Goal
Simple project in order to build a working set of docker layers.

# Installation and use

## Clone this Git repository on your local machine using the following command:
```bash
git clone https://github.com/Louis4933/TP_Development_Stack.git
```

## Navigate to the cloned directory:
``bash
cd TP_Development_Stack/
```

## Launch the application:
``bash
docker-compose up
```

## Stop application:
```bash
Ctrl+C or docker-compose down
```

## Delete application
```bash
docker-compose down --rmi all -v
```

# The stack
The front depends on the back, so as not to needlessly continue launching an erroneous application.

# Screenshot

![screen_TP_Dev_Stack](https://github.com/Louis4933/TP_Development_Stack/assets/100688035/c8e74a88-5547-47c7-af95-88f81523085b)
