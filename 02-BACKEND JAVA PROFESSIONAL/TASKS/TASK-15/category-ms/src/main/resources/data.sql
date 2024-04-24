INSERT
INTO
  category
  (id, name, description, registered_date, user_name)
VALUES
  (NEXTVAL('category_sequence'), 'funny', 'CR7 Scream', current_date, 'vinicius'),
  (NEXTVAL('category_sequence'), 'stupid', 'Kleber Bambam Scream', current_date, 'radagon'),
  (NEXTVAL('category_sequence'), 'trolling', 'Random Nice speaking', current_date, 'rennala');