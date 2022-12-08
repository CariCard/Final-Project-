create database wordOccurancesDB;

CREATE TABLE word (
    WordID int,
    Term varchar (255),
	Frequency int
    
);

insert into wordOccurrencesDB.word (word) values ('the');

insert into wordOccurrencesDB.word (word) values ('test');

insert into wordOccurrencesDB.word (word) values ('this');

insert into wordOccurrencesDB.word (word) values ('a');

select * from wordOccurrencesDB.word;