CREATE SEQUENCE category_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE category (
  id BIGINT NOT NULL,
   name VARCHAR(255) NOT NULL,
   description VARCHAR(255) NOT NULL,
   registered_date date NOT NULL,
   user_name VARCHAR(255) NOT NULL,
   CONSTRAINT pk_category PRIMARY KEY (id)
);