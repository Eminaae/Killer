create table product (
  id                        bigint not null,
  tittle                    varchar(255),
  price                     decimal(10,2),
  quantity                  integer,
  constraint pk_product primary key (id))
;

create table purchase (
  id                        bigint not null,
  product_id                bigint,
  constraint pk_purchase primary key (id))
;

create table user (
  id                        bigint,
  full_name                 varchar(255),
  email                     varchar(255),
  balance                   decimal(10,2),
  constraint uq_user_email unique (email))
;

create sequence product_seq;

create sequence purchase_seq;

alter table purchase add constraint fk_purchase_product_1 foreign key (product_id) references product (id) on delete restrict on update restrict;
create index ix_purchase_product_1 on purchase (product_id);


