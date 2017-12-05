USE lms;

create table IF NOT EXISTS Book (
  isbn varchar(20) PRIMARY KEY,
  title varchar(255) not null
);

create table IF NOT EXISTS StockRecord (
  accessionNo varchar(255) PRIMARY KEY,
  isbn varchar(20) not null,
  status varchar(255) not null,
  FOREIGN KEY (isbn) REFERENCES Book(isbn)
);