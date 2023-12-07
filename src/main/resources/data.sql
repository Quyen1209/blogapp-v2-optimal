INSERT INTO post (id,    title,  description, content, created_at, updated_at)
VALUES (1, 'Java advance', 'Learn Spring framework', 'Learn Spring framework with mentor', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


INSERT INTO comment (id, name, email, body, created_at, updated_at, post_id)
VALUES(1, 'Le Huu Quyen', 'quyenlh1209@gmail.com', 'Bai viet hay',CURRENT_TIMESTAMP, CURRENT_TIMESTAMP,1);