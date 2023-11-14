insert into employees(create_by, create_date, edit_by, edit_date, id, emp_code, first_name) values(1, now(), 1, now(), 1, 1, 'superman');
insert into users(create_by, create_date, edit_by, edit_date, id, emp_id, user_code, user_name, password) values(1, now(), 1, now(), 1, 1, 1, 'superman', '123');
insert into user_screens(create_by, create_date, edit_by, edit_date, user_id, dashboard, stock, sales, customers, employees, attendance, salary_master, salary_payout, leave_salary, gratuity)
            values(1, now(), 1, now(), 1, true, true, true, true, true, true, true, true, true, true);




