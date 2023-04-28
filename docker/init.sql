-- Create sequences for the JPA entities to use
CREATE SEQUENCE course_id_seq START 6;
CREATE SEQUENCE student_id_seq START 6;
CREATE SEQUENCE instructor_id_seq START 6;

-- Create the student table
CREATE TABLE IF NOT EXISTS public.Student
(
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50),
    major VARCHAR(50),
    year BIGINT
);

-- Give ownership to the postgres user
ALTER TABLE public.Student
    OWNER to postgres;

-- Create the course table
CREATE TABLE IF NOT EXISTS public.Course
(
    id SERIAL PRIMARY KEY NOT NULL,
    courseNumber VARCHAR(50),
    courseName VARCHAR(50),
    capacity BIGINT,
    instructor VARCHAR(50)
);

-- Give the postgres user ownership
ALTER TABLE public.Course
    OWNER to postgres;

-- Create the instructor table
CREATE TABLE IF NOT EXISTS public.Instructor
(
    id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(50),
    office VARCHAR(50),
    phone VARCHAR(50),
    email VARCHAR(50)
);

-- Give the postgres user ownership
ALTER TABLE public.Instructor
    OWNER to postgres;