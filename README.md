<!-- Refresher-Training -->
# Refresher-Training - Day 1

Today was my first day of DBMS training. The session focused on understanding the basics of databases and getting familiar with MySQL. Along with the theory, I practiced creating a database and performing basic SQL operations in MySQL Workbench.

## What I Learned

- Difference between Data, Information, Database and DBMS
- Why DBMS is better than the traditional File System
- Different types of DBMS
- What an RDBMS is and why it is widely used
- Difference between SQL and NoSQL databases
- Basic architecture of MySQL
- How to create a database and tables
- Basic SQL commands (DDL, DML, TCL and DCL)

## Practical Work

For today's practice, I created a database named **health_clinic_db**.

Inside the database, I created the following tables:

- Patients
- Doctors
- Specializations
- Appointments

After creating the tables, I inserted sample records and practiced different SQL operations.

The operations I performed include:

- Creating a database
- Creating tables
- Inserting records
- Updating records
- Deleting records
- Adding a new column using `ALTER TABLE`
- Dropping a column
- Renaming a table
- Viewing data using `SELECT`






# DBMS Training - Day 2
On Day 2, I continued working on the Hospital Management Database. The main focus was to improve the database design by applying normalization, creating relationships between tables, and learning how indexes improve query performance.

---

## Topics Covered

- Database Normalization (1NF, 2NF, 3NF)
- One-to-One, One-to-Many, and Many-to-Many Relationships
- Foreign Keys
- Single Column Index
- Composite Index
- Covering Index
- EXPLAIN Statement
- Creating and Managing Tables

---

## Tables Created

- Patients
- Patient_Phones
- Doctors
- Specializations
- Doctor_Specializations
- Appointments
- Billing
- Visit_History
- Rooms
- Doctor_Room

---

## What I Learned

- Created a normalized hospital database.
- Stored multiple phone numbers using a separate table.
- Connected doctors with multiple specializations using a junction table.
- Implemented one-to-one, one-to-many, and many-to-many relationships.
- Used foreign keys to maintain data integrity.
- Inserted sample records into all tables.
- Used JOIN queries to retrieve data from multiple tables.
- Learned how to analyze query performance using the `EXPLAIN` command.
- Created different types of indexes:
  - Single Column Index
  - Composite Index
  - Covering Index
- Understood how indexes help in faster data retrieval.

---

## SQL Operations Performed

- Created Database
- Created Tables
- Added Constraints
- Inserted Sample Data
- Created Relationships
- Executed JOIN Queries
- Created Indexes
- Used EXPLAIN to analyze query execution

---

## Key Learning

This session helped me understand how proper database design and indexing improve both data organization and query performance. I also learned when to use different relationships and different types of indexes in a real-world database.

---

## Output

Successfully created the Hospital Management Database with normalized tables, relationships, sample data, and indexes. Verified the database using JOIN and EXPLAIN queries.