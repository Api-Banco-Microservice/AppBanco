INSERT INTO types (id, description) VALUES (1, 'Deposito');
INSERT INTO types (id, description) VALUES (2, 'Retiro');
INSERT INTO types (id, description) VALUES (3, 'Pago Servicios');

INSERT INTO transactions (id, account, amount, date_register, number, type_id) VALUES (1, '75001958745', 500, '2022-04-18', 'T-001', 1);
INSERT INTO transactions (id, account, amount, date_register, number, type_id) VALUES (2, '75002847958', 200, '2022-05-05', 'T-002', 2);
INSERT INTO transactions (id, account, amount, date_register, number, type_id) VALUES (3, '75001958745', 150, '2022-05-13', 'T-003', 3);

INSERT INTO transactions (id, account, amount, date_register, number, type_id) VALUES (4, '75002964751', 1500, '2022-02-15', 'T-004', 1);
INSERT INTO transactions (id, account, amount, date_register, number, type_id) VALUES (5, '75002845924', 700, '2022-03-25', 'T-005', 2);
INSERT INTO transactions (id, account, amount, date_register, number, type_id) VALUES (6, '75002964751', 750, '2022-05-07', 'T-006', 3);

INSERT INTO transactions (id, account, amount, date_register, number, type_id) VALUES (7, '75003784518', 750, '2022-02-10', 'T-007', 1);
INSERT INTO transactions (id, account, amount, date_register, number, type_id) VALUES (8, '75003847592', 400, '2022-03-27', 'T-008', 2);
INSERT INTO transactions (id, account, amount, date_register, number, type_id) VALUES (9, '75003845795', 100, '2022-04-10', 'T-009', 3);