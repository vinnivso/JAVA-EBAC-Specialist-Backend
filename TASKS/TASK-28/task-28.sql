CREATE TABLE users(
    id UUID DEFAULt gen_random_uuid()PRIMARY KEY NOT NULL,
    name VARCHAR(40) NOT NULL,
    email VARCHAR(40) UNIQUE NOT NULL,
    password VARCHAR(22) NOT NULL
);

CREATE TABLE products (
	id UUID DEFAULT gen_random_uuid()PRIMARY KEY NOT NULL,
	name VARCHAR(40) NOT NULL,
	price MONEY NOT NULL,
	description VARCHAR(255) NOT NULL
);

CREATE TABLE purchases (
	id UUID DEFAULT gen_random_uuid()PRIMARY KEY NOT NULL,
	total_price MONEY NOT NULL,
	paid INTEGER NOT NULL,
	buyer_id UUID NOT NULL,
	FOREIGN KEY(buyer_id) REFERENCES users(id)
);


INSERT INTO users(name, email, password)
    VALUES
        ('user0', 'user0@gmail.com', '40028922'),
        ('user1', 'user1@gmail.com', '40028922'),
        ('user2','user2@gmail.com', '40028922');
		
SELECT * FROM users;

INSERT INTO products(name, price, description)
    VALUES
        ('ELDEN RING', 50, 'Game developed by Fromsoftware'),
        ('DRAGONS DOGMA 2', 70, 'Game developed by Capcom'),
        ('THE WITCHER 3', 30, 'Game developed by CD Project Red'),
        ('CYBERPUNK 2077', 20, 'Game developed by CD Project Red'),
        ('BALDURS GATE 3', 40, 'Game developed by Larian Studios');
		
SELECT * FROM products;

INSERT INTO purchases(total_price, buyer_id)
VALUES  
    (200, 'e30a2e05-195d-4256-b602-107d55e92ac4'),
    (300, 'e30a2e05-195d-4256-b602-107d55e92ac4'),
    (100, '1c19f64c-9b76-4340-a35b-dc76d3f5231f'),
    (500, '661f3015-f11e-4a63-8945-0f47b80fa2a1');
	
ALTER TABLE purchases DROP COLUMN total_price;

SELECT * FROM purchases;

UPDATE purchases SET paid = 1 WHERE id = '7c6de3fb-de08-4d19-be66-19f6c673b381';

CREATE TABLE purchases_products(
    purchase_id UUID NOT NULL,
    product_id UUID NOT NULL,
    quantity INTEGER NOT NULL,
    FOREIGN KEY (purchase_id) REFERENCES purchases(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

INSERT INTO purchases_products
VALUES
    ('7c6de3fb-de08-4d19-be66-19f6c673b381', '8c6809b0-2a11-4103-b415-b534e54b3702', 2),
    ('7c6de3fb-de08-4d19-be66-19f6c673b381', 'a0742e91-018d-4016-97a3-b99243939c06', 1),
    ('4c5dc60f-f8b2-41cd-9162-543731ab0afe', '8c6809b0-2a11-4103-b415-b534e54b3702', 1),
    ('4c5dc60f-f8b2-41cd-9162-543731ab0afe', '9818d490-649b-44a0-9a6c-eb85900338b1', 1),
    ('e6195220-5518-4e9a-b0e3-5deb11b8fa12', '8c6809b0-2a11-4103-b415-b534e54b3702', 1),
	('95afc2e3-2268-4af4-b88c-8a53981f3967','9818d490-649b-44a0-9a6c-eb85900338b1', 2),
	('95afc2e3-2268-4af4-b88c-8a53981f3967','8c6809b0-2a11-4103-b415-b534e54b3702', 1);

SELECT * FROM purchases_products;

SELECT
    users.id,
    users.email,
    purchases.id as idPurchase,
    purchases.paid,
    products.id as idProduct,
    products.name,
    products.description,
    products.price,
    purchases_products.quantity
FROM purchases
LEFT JOIN purchases_products
ON purchases_products.purchase_id = purchases.id
LEFT JOIN products
ON purchases_products.product_id = products.id
LEFT JOIN users
ON purchases.buyer_id = users.id;