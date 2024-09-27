DROP TABLE POSTS CASCADE CONSTRAINTS PURGE;
DROP TABLE PROFILE_INFO CASCADE CONSTRAINTS PURGE;
DROP TABLE USERS CASCADE CONSTRAINTS PURGE;

INSERT INTO profile_info (id, title, description, profile_pic_url, followers, following)
VALUES (profile_info_sequence.NEXTVAL, 'User Title 1', 'User description 1', '/img/profile1.png', '10', '5');

INSERT INTO profile_info (id, title, description, profile_pic_url, followers, following)
VALUES (profile_info_sequence.NEXTVAL, 'User Title 2', 'User description 2', '/img/profile2.png', '20', '15');

INSERT INTO profile_info (id, title, description, profile_pic_url, followers, following)
VALUES (profile_info_sequence.NEXTVAL, 'User Title 3', 'User description 3', '/img/profile3.png', '30', '25');

INSERT INTO posts (id, caption, image_url, created_at, profile_info_id)
VALUES (post_seq.NEXTVAL, 'Post Caption 1', '/img/post1.png', SYSDATE, 1000);

INSERT INTO posts (id, caption, image_url, created_at, profile_info_id)
VALUES (post_seq.NEXTVAL, 'Post Caption 2', '/img/post2.png', SYSDATE, 1001);

INSERT INTO posts (id, caption, image_url, created_at, profile_info_id)
VALUES (post_seq.NEXTVAL, 'Post Caption 3', '/img/post3.png', SYSDATE, 1002);

INSERT INTO users (id, username, password, email, name, birthdate, profile_info_id)
VALUES (user_sequence.NEXTVAL, 'user1', 'password1', 'user1@example.com', 'User One', TO_DATE('1990-01-01', 'YYYY-MM-DD'), 1000);

INSERT INTO users (id, username, password, email, name, birthdate, profile_info_id)
VALUES (user_sequence.NEXTVAL, 'user2', 'password2', 'user2@example.com', 'User Two', TO_DATE('1992-02-02', 'YYYY-MM-DD'), 1001);

INSERT INTO users (id, username, password, email, name, birthdate, profile_info_id)
VALUES (user_sequence.NEXTVAL, 'user3', 'password3', 'user3@example.com', 'User Three', TO_DATE('1994-03-03', 'YYYY-MM-DD'), 1002);

COMMIT;
