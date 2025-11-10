# SimpleEnroll-Array-Based-Student-Records

🎓 About the Project
This project is a back-to-basics demonstration of how to manage structured data in Java using parallel static arrays. It’s a bare-bones Student Record Management System designed to handle basic administrative tasks like adding new students, updating their details, and viewing specific records. It’s a great piece to show off fundamental data structure manipulation before jumping into more complex collections.


📝 Core Functionality

 * Static Array Data Model: Stores student names, IDs, ages, and grades in four separate, synchronized arrays.
 * Student Addition: Allows the user to input new student details until the defined maximum capacity is reached.
 * Data Update: Enables modifying existing student records (name, age, grade) by searching for the unique Student ID.
 * Record Viewing: Quick lookup of an entire student profile using their ID.
 * Index Management: The entire system revolves around carefully managing array indices to keep associated student data coherent.


🚀 Setup & Execution
Since this is a simple console app, you'll be up and running in moments.
Requirements
Just a standard Java Development Kit (JDK).


🧐 Technical Deep Dive: 
The most interesting challenge here is the findStudentIndexById helper method. Because all student information is spread across parallel arrays, this method is crucial for quickly and accurately locating the correct index before any CRUD (Create, Read, Update, Delete) operations can be performed on the student's data. It’s a pure example of index-based data management!


⚠️ Future Improvements: 
Switching from fixed-size static arrays to a dynamic structure like an ArrayList or even a HashMap would make the system more robust and eliminate the hard maxStudents limit. Definitely a fun next step!