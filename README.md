# A. Project Overview

This project is a student management system.  The aim of the project is to store information about students, calculate the average GPA and determine the student with the highest number of credits. 

The project consists of three classes: 

- Main
- Course
- Student
## The following course topics are used:

- classes and objects
- array
- encapsulation
---
# B. Class descriptions

A Student class describes one student.

Class field:
- name
- id
- major
- gpa
- credits

The constructor initializes the student with the name, ID and specialty.
GPA and credits are set to the initial values (0).

## Methods:

- updateGPA - updates gpa in acceptable field
- toString - returns information about the student in text form
- addCredits — adds credits to the student

---
## Course class

This class describes academic course.

Class field:

- courseName
- instructor
- students[]

The Course class contains objects of the Student class, which demonstrates a compositional relationship.
The course manages students by adding them and performing operations on them.

## Methods:

- highestCreditStudent - finds the student with the most credits
- courseAverageGPA - calculates the average GPA of students
---

# C.  Instructions to Compile and Run

For compilation :

~~~ 
javac *.java
~~~
To run the programm:
~~~
java Main
~~~
# D. Screenshots
program output:

![program output](screenshots/output.png)


# E. Reflection

During this project, I learned how to work with classes, as well as apply the basic principles of OOP.
The main difficulties in the proceedings in the intellij application.
using OOP principles makes the program more structured, understandable, and convenient for future use.

