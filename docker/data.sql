-- Insert five students
INSERT INTO public.Student VALUES (1, 'Jordan Walker', 'Baseball', 2002);
INSERT INTO public.Student VALUES (2, 'Nolan Arenado', 'Baseball', 1991);
INSERT INTO public.Student VALUES (3, 'Adam Wainwright', 'Baseball', 1981);
INSERT INTO public.Student VALUES (4, 'Brian Kernighan', 'C', 1942);
INSERT INTO public.Student VALUES (5, 'Linus Torvalds', 'Systems Development', 1969);

-- Insert five courses
INSERT INTO public.Course VALUES (1, 'CS101', 'Intro to Computing', 50, 'Jimmy John');
INSERT INTO public.Course VALUES (2, 'BB101', 'Intro to Baseball', 30, 'Carl Eggland');
INSERT INTO public.Course VALUES (3, 'CS102', 'Topics in Computing', 40, 'Ham Sand');
INSERT INTO public.Course VALUES (4, 'BB102', 'Topics in Baseball', 20, 'Kevin Bacon');
INSERT INTO public.Course VALUES (5, 'CS637', 'PhD in Computing', 10, 'Kevin Club');

-- Insert five instructors
INSERT INTO public.Instructor VALUES (1, 'Jimmy John', 'SD301', '123-456-7890', 'jjohn@email.com');
INSERT INTO public.Instructor VALUES (2, 'Carl Eggland', 'BR301', '098-765-4321', 'ceggland@email.com');
INSERT INTO public.Instructor VALUES (3, 'Ham Sand', 'SD304', '102-938-4756', 'hsand@email.com');
INSERT INTO public.Instructor VALUES (4, 'Kevin Bacon', 'BR202', '564-738-2910', 'kbacon@email.com');
INSERT INTO public.Instructor VALUES (5, 'Kevin Club', 'SD304', '657-483-9201', 'kclub@email.com');
