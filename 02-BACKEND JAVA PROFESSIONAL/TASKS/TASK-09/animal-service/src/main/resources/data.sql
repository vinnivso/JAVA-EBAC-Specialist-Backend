INSERT
INTO
  animal
  (name, specie, age, breed, input_date, observation, caretaker, size, adoption_date, death_date)
VALUES
  ('Toto', 'dog', 1, 'SRD', current_date, 'scars in face', 'Jonas', 'MEDIUM', NULL, NULL),
  ('Rott', 'dog', 14, 'Rottweiler', current_date, 'old one', 'Priscilla', 'LARGE', NULL, current_date + 32),
  ('Lilly', 'dog', 2, 'Labrador', current_date, 'a puppy', 'Jonas', 'LARGE', current_date + 7, NULL),
  ('Lolly', 'dog', 12, 'Shitzu', current_date, 'old one', 'Jonas', 'SMALL', current_date + 2, current_date + 91),
  ('Naomi', 'dog', 3, 'Pastor Belga', current_date, 'well being', 'Priscilla', 'LARGE', NULL, NULL),
  ('Catty', 'cat', 1, 'SRD', current_date, 'happy', 'Geovanna', 'SMALL', current_date + 2, NULL ),
  ('Katz', 'cat', 11, 'Persa', current_date, 'old one', 'Geovanna', 'MEDIUM', current_date + 41, current_date + 186),
  ('Mad Catz', 'cat', 1, 'Angora', current_date, 'a puppy', 'Mario', 'SMALL', current_date, NULL),
  ('Frajola', 'cat', 1, 'Ragdoll', current_date, 'a puppy', 'Mario', 'SMALL', current_date, NULL),
  ('Tom', 'cat', 4, 'Maine Coon', current_date, 'well being', 'Geovanna', 'LARGE', current_date + 8, NULL);

INSERT
INTO
  caretaker
  (name, contact, age, contract_start, contract_end)
VALUES
  ('Jonas', '+5511911112222', 21, current_date - 62, current_date + 658),
  ('Priscilla', '+55 11 922223333', 32, current_date - 198, current_date + 522),
  ('Geovanna', '+55 11 933334444', 28, current_date - 4, current_date + 716),
  ('Mario', '+55 11 944445555', 41, current_date, current_date + 720);