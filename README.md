# SpringBoot--MySQL_DB <br/>

>>> Here are the steps to configure MySql database using Terminal. <br/>
# sudo mysql --password > To access mysql driver
# mysql> create database <DB_NAME>; -- Creates the new database
# mysql> create user '<USERNAME>'@'%' identified by '<PASSWORD>'; -- Creates the user
# mysql> grant all on <DB_NAME>.* to '<USERNAME>'@'%'; -- Gives all privileges to the new user on the newly created database
# 
# show databases; > lists all the databases
# use <DB_NAME>;   > to select the database
# show tables from <DB_NAME>;  > lists all created tables
# select * from <TABLE_NAME>;  > To perform SELECT sql, same for the rest of sql methods.
# \q   > to exit from mysql> prompt
#
#
