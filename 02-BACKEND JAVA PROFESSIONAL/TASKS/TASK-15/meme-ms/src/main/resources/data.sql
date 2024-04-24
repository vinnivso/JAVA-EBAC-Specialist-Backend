INSERT
INTO
  meme
  (id, name, description, registered_date, category, "user")
VALUES
  (NEXTVAL('meme_sequence'), 'Siuuu', 'CR7 Scream', current_date, 'funny', 'vinicius'),;
  (NEXTVAL('meme_sequence'), 'Birrr', 'Kleber Bambam Scream', current_date, 'stupid', 'radagon'),;
  (NEXTVAL('meme_sequence'), 'Nice!', 'Random Nice speaking', current_date, 'trolling', 'rennala');