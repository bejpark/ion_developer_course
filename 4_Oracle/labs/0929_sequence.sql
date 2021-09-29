--ronum/rowid

select rownum,ename,sal  from emp;
select rownum,ename,sal from emp where rownum =1;


--게시판에 페이징 처리할 때 사용
select rownum,ename,rowid from emp;

--sequence
/*
create sequence 시퀀스이름
    [start with 시작값]
    [increment by 증가치]
    [maxvalue 최대값]
    [minvalue 최소값]
    [cycle | nocycle]
    [cache | nocache];
    */

create sequence autonum; --1부터 시작해서 1씩 증가
select autonum.currval from dual;
select autonum.nextval from dual;

create table kosa_tab (no number,name varchar2(10));
delete kosa_tab;
insert into kosa_tab values(autonum.nextval,'aa');
insert into kosa_tab values(autonum.nextval,'bb');
insert into kosa_tab values(autonum.nextval,'bccc');
insert into kosa_tab values(autonum.nextval,'dd');

select * from kosa_tab;


drop sequence seq_board;
create sequence seq_board
    start with 10
    increment by 10
    minvalue 10
    maxvalue 50
    cycle 
    nocache;
    
create table kosa_tab2 (num number,name varchar2(10));
delete kosa_tab2;
insert into kosa_tab2 values(seq_board.nextval,'aa');
insert into kosa_tab2 values(seq_board.nextval,'bb');
insert into kosa_tab2 values(seq_board.nextval,'bccc');
insert into kosa_tab2 values(seq_board.nextval,'dd');
insert into kosa_tab2 values(xseq_board.nextval,'e');
insert into kosa_tab2 values(seq_board.nextval,'f');
select * from kosa_tab2;
create sequence seq_freeboard;
insert into kosa_tab2 values(seq_freeboard.nextval,'aa1');
insert into kosa_tab2 values(seq_freeboard.nextval,'bb2');
insert into kosa_tab2 values(seq_freeboard.nextval,'bccc3');


delete from kosa_tab2 where num=3;