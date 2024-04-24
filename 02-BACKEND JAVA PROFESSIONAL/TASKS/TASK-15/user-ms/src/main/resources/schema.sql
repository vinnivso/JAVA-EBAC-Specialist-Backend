CREATE SEQUENCE user_sequence START WITH 1 INCREMENT BY 50;

CREATE TABLE "user" (
  id BIGINT NOT NULL,
   name VARCHAR(255) NOT NULL,
   email VARCHAR(255) NOT NULL,
   registered_date date NOT NULL,
   karma INT NOT NULL,
   CONSTRAINT pk_user PRIMARY KEY (id)
);