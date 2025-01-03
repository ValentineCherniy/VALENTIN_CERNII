create table Books(
book_id serial primary key,
autor text, --mistake (double author column), after the table will be dropped--
name text,
author text,
date_of_publishing date,
genre text,
available_count int
);

select *
from books;

drop table books;

create table books(
book_id serial primary key,
name text,
author text,
date_of_publishing date,
genre text,
available_count int
);

select *
from books;

insert into books (name, author, date_of_publishing, genre, available_count)
values ('The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 'Classics', 4 ),
('To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 'Fiction', 5),
('1984', 'George Orwell', '1949-06-08', 'Science Ficnon', 2 ),
('Pride and Prejudice', 'Jane Austen', '1813-01-28', 'Romance', 4);

select *
from books;