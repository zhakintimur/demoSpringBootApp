-- DDL
create table person
(
    id         bigserial not null
        constraint person_pk
            primary key,
    email      varchar(100),
    first_name varchar(100),
    last_name  varchar(100)
);

create table account
(
    id        bigserial  not null
        constraint account_pk
            primary key,
    balance   numeric not null,
    person_id bigint
        constraint account_person_id_fk
            references person
);

-- DATA
INSERT INTO person (email, first_name, last_name) VALUES ('bob.martin@example.com', 'Bob', 'Martin');
INSERT INTO account (balance, person_id) VALUES (0.0, 1);

