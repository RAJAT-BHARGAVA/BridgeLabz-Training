CREATE DATABASE health_clinic_db;
USE health_clinic_db;



-- creating the new table named patients


CREATE TABLE patients (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    date_of_birth DATE,
    gender ENUM('Male','Female','Other'),
    phone_number VARCHAR(15) UNIQUE,
    email VARCHAR(100),
    registered_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);



-- creating the new table named doctors 
CREATE TABLE doctors (
    doctor_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    specialization VARCHAR(100),
    phone_number VARCHAR(15),
    email VARCHAR(100)
);


-- creating the new table named specializations
CREATE TABLE specializations (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    description VARCHAR(255)
);



-- creating the new table named appointments
CREATE TABLE appointments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id INT,
    doctor_id INT,
    appointment_date DATE
);
 
 
 -- insertion of the entries in patient table
INSERT INTO patients(first_name,last_name,date_of_birth,gender,phone_number,email)
VALUES
('Ramesh','Kumar','1979-05-14','Male','9876543210','ramesh@email.com'),
('Sita','Sharma','1990-08-21','Female','9876543211','sita@email.com'),
('Aman','Verma','2001-01-30','Male','9876543212','aman@email.com');


-- insertion of data into doctor table

INSERT INTO doctors(first_name,last_name,specialization,phone_number,email)
VALUES
('Mahesh','Bhatt','Optometrist','1569658956','bhatt@email.com'),
('Anjali','Rao','Cardiology','9123456780','rao@email.com'),
('Vikram','Iyer','Pediatrics','9123456781','iyer@email.com'),
('Meera','Singh','Orthopedics','9123456782','meera@email.com');

-- insertion of data into specilization table
INSERT INTO specializations(name,description)
VALUES
('Cardiology','Heart Specialist'),
('Pediatrics','Children Specialist'),
('Orthopedics','Bone Specialist');

-- insertion of data into appointments table
INSERT INTO appointments(patient_id,doctor_id,appointment_date)
VALUES
(1,1,'2026-08-02'),
(2,2,'2026-08-03'),
(3,3,'2026-08-04');

-- viewing data (READ Operation)

SELECT * FROM patients;

SELECT * FROM doctors;

SELECT * FROM specializations;

SELECT * FROM appointments;

-- updating the data 
UPDATE patients
SET phone_number='9999999999'
WHERE patient_id=1;


-- delete the record 

DELETE FROM appointments
WHERE id=3;

DELETE FROM doctors
WHERE doctor_id IN (9,10,11);

DELETE FROM doctors 
WHERE doctor_id = 8;
-- alter the table 
ALTER TABLE patients
ADD blood_group VARCHAR(10);

-- drop the column from table
ALTER TABLE patients
DROP COLUMN blood_group;


-- Renaming the table 

RENAME TABLE doctors TO clinic_doctors;

RENAME TABLE clinic_doctors TO doctors;