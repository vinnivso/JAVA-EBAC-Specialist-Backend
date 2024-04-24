INSERT
INTO
  "user"
  (id, name, email, registered_date, karma)
VALUES
  (NEXTVAL('user_sequence'), 'vinicius', 'vinicius@gmail.com', current_date, 0),
  (NEXTVAL('user_sequence'), 'radagon', 'radagon@gmail.com', current_date, 0),
  (NEXTVAL('user_sequence'), 'rennala', 'rennala@gmail.com', current_date, 0);
