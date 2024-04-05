CREATE TABLE products(
product_id UUID DEFAULT gen_random_uuid(),
product_name VARCHAR(40),
product_description VARCHAR(255),
product_price money
);

INSERT INTO products (product_name, product_description, product_price)
VALUES
	('Elden Ring','GOTY', 70),
	('Dragons Dogma 2', 'GOTY too', 70),
	('Baldurs Gate 3', 'Goty too too', 50)
RETURNING *;

UPDATE products SET product_name = 'Dark Souls Open World' WHERE product_id = '32c014cb-5a7e-418d-a00b-928629e52adf'
RETURNING *;

SELECT * FROM products;

DELETE FROM products WHERE product_id = '32c014cb-5a7e-418d-a00b-928629e52adf'
RETURNING *;

DROP TABLE products;