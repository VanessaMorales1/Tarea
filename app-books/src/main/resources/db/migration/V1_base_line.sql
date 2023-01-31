create table public.books
(
    id        serial
        primary key,
    isbn      varchar(16),
    title     varchar(128),
    price     numeric(6, 2),
    author_id integer
        constraint pk_author_books
            references public.authors
);

alter table public.books
    owner to postgres;

