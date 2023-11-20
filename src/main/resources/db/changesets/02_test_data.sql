INSERT INTO products(id, create_by, create_date, edit_by, edit_date, name, code)
	VALUES (1, 1, now(), 1, now(), 'Test Product', 'test_pdt_01');
INSERT INTO product_units(id, create_by, create_date, edit_by, edit_date, code, description)
	VALUES (1, 1, now(), 1, now(), 'test_unit', 'Test Unit');
INSERT INTO suppliers(id, create_by, create_date, edit_by, edit_date, code, name)
	VALUES (1, 1, now(), 1, now(), 'test_supplier', 'Test Supplier');
INSERT INTO purchases(id, create_by, create_date, edit_by, edit_date, purchase_id, supplier_id, amount_total, tax_amount, amount_untaxed)
	VALUES (1, 1, now(), 1, now(), 1, 1, 11.0, 1.0, 10.0);
INSERT INTO product_batches(id, create_by, create_date, edit_by, edit_date, batch_code, barcode, product_id, purchase_id, unit_id, quantity, total_cost, unit_cost, unit_price)
	VALUES (1, 1, now(), 1, now(), 'test_batch', '001', 1, 1, 1, 100.0, 500.0, 5.0, 10.0);
INSERT INTO stock_total(id, create_by, create_date, edit_by, edit_date, batch_id, initial_quantity, current_quantity)
	VALUES (1, 1, now(), 1, now(), 1, 100.0, 100.0);