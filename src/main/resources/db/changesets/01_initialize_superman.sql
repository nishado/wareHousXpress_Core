insert into users(create_date, edit_date, emp_code, user_code, user_name, password) values(now(), now(), '1', 1, 'superman', '123');
insert into user_screen(create_date, edit_date, user_id, dashboard, stock, sales, clients, employees, attendance, salary_master, salary_payout, leave_salary, gratuity)
            values(now(), now(), 1, true, true, true, true, true, true, true, true, true, true);