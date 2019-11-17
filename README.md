# nrk-framework-java-1.1.0
This is a framework which helps user/developer when saving data to the database. This framework is build upon/ using reflection property of Java which is Java's unusual ability that the program can examine itself.
In this framework, handling the SQL statement is done by a class called "Commoncontroller.java". The user should pass object which is made by the MODEL class to CommonController class. For that there is a method named as "insert" in the "CommonController" class.

Guidelines:
    - When creating the database, developer should name each table to be equal to the lowercase of each Java class name which relevant each entity that they are going to use in their project.
    - Developer should follow the MVC pattern, because this framework will reduce the work that is done by CONTROLLER class.
    - Fields of the classes that we are using to represent the entities, should be public.
