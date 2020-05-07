PRIMARYcreate database bank;
create table bank.Customers(
	customer_number int(50) not null primary  key,
    fullname varchar(100) not null,
    adress varchar(100),
    email varchar(100),
    phone varchar(11) not null
);

create table bank.accounts(
	account_number int(50) not null primary key,
    account_type varchar(100),
    date varchar(100),
    balance varchar(100),
    acount_customer int(40),
    foreign key(acount_customer)references Customers(customer_number)
);

create table bank.Transactions(
	tran_number int(50) not null primary key,
    account_number int(50),
    date varchar(50),
    amounts varchar(50),
    descriptions varchar(100),
    transaction_account int(100),
    foreign key (transaction_account) references accounts(account_number)
);