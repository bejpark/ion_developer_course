

create table board(
	seq number,
	title varchar2(50),
	writer varchar2(30),
	content varchar2(200),
	regdate date,
	readcount number,
	CONSTRAINT board_seq_pk PRIMARY KEY (seq)
);
select * from board;

create SEQUENCE seq_board;
insert into board values(seq_board.nextVal,'title2','writer2','contents2...',sysdate,0);

commit;


CREATE TABLE spring_board
(
  num NUMBER, 
  NAME VARCHAR2(50), 
  email  VARCHAR2(50), 
  pwd  VARCHAR2(50), 
  subject  VARCHAR2(50), 
  content  VARCHAR2(2000), 
  regdate  date,
  hit  NUMBER, 
  parent  NUMBER, 
  sort  NUMBER, 
  tab  NUMBER
);