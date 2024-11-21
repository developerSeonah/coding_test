CREATE TABLE transactions(
        id INT AUTO_INCREMENT PRIMARY KEY,
        account_number VARCHAR(20) NOT NULL,
        transaction_type ENUM('DEPOSIT', 'WITHDRAWAL') NOT NULL,
        amount DECIMAL(10,2) NOT NULL,
        transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

CREATE TABLE accounts (
    account_number VARCHAR(20) primary key,
    balance DECIMAL(10,2) NOT NULL
);

