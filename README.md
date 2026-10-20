# Java University System

A desktop university-management application built with **Java Swing**. It provides separate administrator and student screens for maintaining student and course records, handling course registration, and viewing a student timetable.

> **Project type:** Educational desktop prototype. It is not a web application and does not use a database server; it saves data to local files.

## What the application does

### Administrator

After signing in, the administrator can:

- Register, search for, update, and delete student records.
- Add, search for, update, and delete courses.
- Associate a course with a major and configure its credit hours, weekday, and meeting time.
- View and manage a student's course registrations.
- Change the administrator password through the application.

Student records include an ID, name, password, major, mobile number, and date of birth. Course records include a course ID, name, major, credit hours, and meeting schedule. The majors offered in the interface include Engineering, Medicine, Pharmacy, and Education.

### Student

A student can use the student screen to:

- View available courses for their major.
- Add or remove courses from their registration and save the changes.
- See the total number of registered credit hours. The interface enforces a limit of **21 hours** (it rejects totals above 21).
- View a weekly timetable and send it to a printer.
- Open a date calculator from the student screen.

## What you can learn from this project

This codebase is useful for practicing:

- Building desktop interfaces with **Java Swing** and handling button, form, and table events.
- Organizing an application into screens and passing user and course state between them.
- Modeling application data with Java classes (`StudentData` and `CourseData`).
- Reading and writing Java-serialized objects with `ObjectInputStream` and `ObjectOutputStream`.
- Implementing basic create, read, update, and delete (CRUD) workflows.
- Filtering courses by a student's major, calculating credit-hour totals, and constructing a weekly timetable.
- Working with a legacy **NetBeans Ant** project and its GUI Builder `.form` files.

## Technology and project layout

- **Language:** Java (project source/target compatibility is set to Java 7)
- **UI:** Java Swing
- **Build:** Apache Ant / NetBeans project
- **Libraries:** Bundled NetBeans `AbsoluteLayout` and Beans Binding JARs in `lib/`

```text
src/                 Java source files and NetBeans GUI Builder forms
lib/                 Bundled project libraries
nbproject/            NetBeans project and build configuration
build.xml             Ant build file
*.jpg, *.png          UI backgrounds and icons
admin.txt             Administrator account configuration
addStudent.txt        Serialized student records
addCourse.txt         Serialized course records
studentCourseList.txt Serialized student registrations
```

The `.txt` names are historical: the student, course, and registration files contain **Java serialized data**, not ordinary text that should be edited in a text editor. The application reads and writes these files relative to its **current working directory**.

## Getting started

### Requirements

- A JDK capable of compiling the project's Java 7 source level.
- Apache Ant, or NetBeans with Ant support.

### Run with NetBeans

1. Clone or download this repository.
2. Open the project folder in NetBeans as an existing Java/Ant project.
3. Run the project with `Main` as the entry point.
4. Keep the project folder as the working directory so the application can find its data and image files.

### Build and run from a terminal

From the repository root:

```bash
ant clean jar
java -jar dist/UniversitySystem.jar
```

Run the JAR while your current directory is still the repository root. The program expects the local data and image files there.

## Data and credentials

The application stores its data locally in the files listed above; there is no SQL database, remote service, or multi-user synchronization. Back up these files before experimenting, because changes made in the UI can overwrite them.

The administrator account is read from `admin.txt`. **Do not use real or reused passwords with this project.** The current implementation stores administrator credentials in plain text, stores student passwords in serialized student records, and the student login checks a password without validating the entered username. This is suitable only for learning and local demonstrations—not for real university records or production use.

## Current limitations

- This is a learning project, not a secure or production-ready student-information system.
- Persistence uses Java object serialization rather than a database, with limited validation and error handling.
- The student sign-in flow does not verify the username against the selected student's record.
- Some GUI-generated code contains paths tied to the original developer's Windows environment. If images or icons are missing on another machine, check the image paths and run the application from the repository root.
- The project has no automated test suite in the repository.

## License

No license file is currently included. Unless the repository owner adds a license, assume that all rights are reserved and check with the author before redistributing or reusing the code.
