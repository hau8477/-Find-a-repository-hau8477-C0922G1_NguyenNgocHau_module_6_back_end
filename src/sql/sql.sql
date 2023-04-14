CREATE DATABASE hospital;
USE hospital;

CREATE TABLE patients (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  dob DATE NOT NULL,
  gender ENUM('Male', 'Female', 'Other') NOT NULL,
  phone VARCHAR(20) NOT NULL,
  address VARCHAR(100) NOT NULL
);

CREATE TABLE doctors (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  specialization VARCHAR(50) NOT NULL,
  phone VARCHAR(20) NOT NULL,
  email VARCHAR(50) NOT NULL
);

CREATE TABLE appointments (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  patient_id INT(6) UNSIGNED NOT NULL,
  doctor_id INT(6) UNSIGNED NOT NULL,
  appointment_date DATETIME NOT NULL,
  description TEXT,
  FOREIGN KEY (patient_id) REFERENCES patients(id),
  FOREIGN KEY (doctor_id) REFERENCES doctors(id)
);

CREATE TABLE prescriptions (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  patient_id INT(6) UNSIGNED NOT NULL,
  doctor_id INT(6) UNSIGNED NOT NULL,
  appointment_id INT(6) UNSIGNED NOT NULL,
  medicine VARCHAR(100) NOT NULL,
  dosage VARCHAR(20) NOT NULL,
  duration VARCHAR(20) NOT NULL,
  FOREIGN KEY (patient_id) REFERENCES patients(id),
  FOREIGN KEY (doctor_id) REFERENCES doctors(id),
  FOREIGN KEY (appointment_id) REFERENCES appointments(id)
);

CREATE TABLE departments (
  id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  description TEXT
);
