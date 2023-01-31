create table public.authors
(
    id        serial
        primary key,
    first_name varchar(255),
    last_name  varchar(255)
);

alter table public.authors
    owner to postgres;
