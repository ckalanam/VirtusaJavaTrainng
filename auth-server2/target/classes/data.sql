insert into oauth_client_details (client_id, client_secret, web_server_redirect_uri, scope, access_token_validity, refresh_token_validity, resource_ids, authorized_grant_types, additional_information) values ('mobile', '{bcrypt}$2a$10$gPhlXZfms0EpNHX0.HHptOhoFD1AoxSr/yUIdTqA8vtjeP4zi0DDu', 'http://localhost:8084/login', 'READ,WRITE', '3600', '10000', 'inventory,payment', 'authorization_code,password,refresh_token,implicit', '{}');

 insert into permission (name) values
 ('create_profile'),
 ('read_profile'),
 ('update_profile'),
 ('delete_profile');

 insert into role (name) values
		('ROLE_admin'),('ROLE_operator');

 insert into permission_role (permission_id, role_id) values
     (1,1), /*create-> admin */
     (2,1), /* read admin */
     (3,1), /* update admin */
     (4,1), /* delete admin */
     (2,2),  /* read operator */
     (3,2);  /* update operator */
 insert into user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) values ('1', 'krish','{bcrypt}$2a$10$ODGwrk2ufy5d7T6afmACwOA/6j6rvXiP5amAMt1YjOQSdEw44QdqG', 'k@krishantha.com', '1', '1', '1', '1');
 insert into user (id, username,password, email, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked) values ('2', 'suranga', '{bcrypt}$2a$10$wQ8vZl3Zm3.zDSIcZEYym.bGq3fPMJXH9k.Vhudcfr6O6KQwDPSt6','k@krishantha.com', '1', '1', '1', '1');

insert into role_user (role_id, user_id) values
    (1, 1) /* krish-admin */,
    (2, 2) /* suranga-operatorr */ ;