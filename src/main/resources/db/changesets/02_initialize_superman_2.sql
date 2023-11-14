INSERT INTO departments(create_by, create_date, edit_by, edit_date,dept_name)
	VALUES (1, now(), 1, now(),'abc');
update employees set department_id = 1 where id = 1;


INSERT INTO countries(create_by, create_date, edit_by, edit_date,name)
	VALUES (1, now(), 1, now(),'india');
update employees set nationality = 1 where id = 1;

INSERT INTO statuses(create_by, create_date, edit_by, edit_date,status)
	VALUES (1, now(), 1, now(),'Active');
update employees set status = 1 where id = 1;