INSERT INTO USER (USERNAME, PASSWORD) VALUES ('admin', '$2a$20$G4hfA4TGHwGr/cPtFfpQ7OedfVm0mu5rUId5ysRZbGMLFkdGljT/O');
INSERT INTO USER (USERNAME, PASSWORD) VALUES ('user', '$2a$10$juk7REL2YDOwN9HPiND2ZexYc0cPh9xBrWdlbJCixO.FXS9q3Q5Ry');

INSERT INTO AUTH_USER_GROUP (USERNAME, AUTH_GROUP) VALUES('admin', 'USER');
INSERT INTO AUTH_USER_GROUP (USERNAME, AUTH_GROUP) VALUES('admin', 'ADMIN');
INSERT INTO AUTH_USER_GROUP (USERNAME, AUTH_GROUP) VALUES('user', 'USER');