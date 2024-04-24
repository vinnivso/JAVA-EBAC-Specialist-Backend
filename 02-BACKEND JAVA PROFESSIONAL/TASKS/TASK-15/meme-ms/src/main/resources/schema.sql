CREATE SEQUENCE meme_sequence START WITH 1 INCREMENT BY 50;

CREATE TABLE meme (
  id BIGINT NOT NULL,
   name VARCHAR(255),
   description VARCHAR(255),
   registered_date date,
   category VARCHAR(255),
   "user" VARCHAR(255),
   CONSTRAINT pk_meme PRIMARY KEY (id)
);