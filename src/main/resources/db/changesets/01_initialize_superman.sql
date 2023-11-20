INSERT INTO departments(id, create_by, create_date, edit_by, edit_date,name)
	VALUES (1, 1, now(), 1, now(),'admin');
INSERT INTO nationalities(id, create_by, create_date, edit_by, edit_date,name)
	VALUES (1, 1, now(), 1, now(),'india');
INSERT INTO statuses(id, create_by, create_date, edit_by, edit_date,name)
	VALUES (1, 1, now(), 1, now(),'Active');
INSERT INTO employees(create_by, create_date, edit_by, edit_date, id, emp_code, first_name, department_id, nationality, status)
    VALUES(1, now(), 1, now(), 1, '1', 'superman', 1, 1, 1);
INSERT INTO users(create_by, create_date, edit_by, edit_date, id, emp_id, user_code, user_name, password)
    VALUES(1, now(), 1, now(), 1, 1, 1, 'superman', '123');
INSERT INTO user_screens(create_by, create_date, edit_by, edit_date, user_id, dashboard, stock, sales, customers, employees, attendance, salary_master, salary_payout, leave_salary, gratuity)
            VALUES(1, now(), 1, now(), 1, true, true, true, true, true, true, true, true, true, true);
