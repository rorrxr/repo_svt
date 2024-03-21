select * from codeGroup;

create database pro_food;

use pro_food;

 CREATE database pro_food;
 
 use pro_food;


CREATE TABLE IF NOT EXISTS `pro_food`.`codeGroup` (
  `seq` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `insertDate` DATETIME NULL,
  `updateDate` DATETIME NULL,
  `delNy` TINYINT NULL,
  PRIMARY KEY (`seq`))
ENGINE = InnoDB;

DROP TABLE codeGroup;

CREATE TABLE IF NOT EXISTS `pro_food`.`code` (
  `seq` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `insertDate` DATETIME NULL,
  `updateDate` DATETIME NULL,
  `delNy` TINYINT NULL,
  `codeGroup_seq` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`seq`),
  INDEX `fk_code_codeGroup1_idx` (`codeGroup_seq` ASC) VISIBLE,
  CONSTRAINT `fk_code_codeGroup1`
    FOREIGN KEY (`codeGroup_seq`)
    REFERENCES `pro_food`.`codeGroup` (`seq`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
;

DROP TABLE code;


CREATE TABLE IF NOT EXISTS `pro_food`.`member` (
  `seq` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `easyLoginCD` VARCHAR(45) NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `birthday` VARCHAR(45) NULL,
  `genderCD` INT NULL,
  `pwCreate` VARCHAR(45) NULL,
  `pwCheck` VARCHAR(45) NULL,
  `registerYn` TINYINT NULL,
  `memberYn` TINYINT NULL,
  PRIMARY KEY (`seq`))
ENGINE = InnoDB
;

CREATE TABLE IF NOT EXISTS `pro_food`.`restaurant` (
  `seq` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `filterCategoryCD` INT NULL,
  `name` VARCHAR(45) NULL,
  `mainImage` VARCHAR(45) NULL,
  `rating` INT NULL,
  `price` INT NULL,
  `priceDistance` INT NULL,
  `viewCount` INT NULL,
  `likeCount` INT NULL,
  `reviewCount` INT NULL,
  `addressDetail` VARCHAR(45) NULL,
  `timetable` VARCHAR(5000) NULL,
  `menuList` VARCHAR(1000) NULL,
  `menuImage` VARCHAR(1000) NULL,
  `delYn` TINYINT NULL,
  PRIMARY KEY (`seq`))
ENGINE = InnoDB
;

CREATE TABLE IF NOT EXISTS `pro_food`.`mypage_orderlist` (
  `seq` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL COMMENT '식당이름',
  `orderDate` DATETIME NULL,
  `people` INT NULL,
  `customerName` VARCHAR(45) NULL,
  `telNumber` VARCHAR(45) NULL,
  `easyOrderCD` INT NULL,
  `member_seq` INT UNSIGNED NOT NULL,
  `food_seq` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`seq`),
  INDEX `fk_mypage_orderlist_member1_idx` (`member_seq` ASC) VISIBLE,
  INDEX `fk_mypage_orderlist_food1_idx` (`food_seq` ASC) VISIBLE,
  CONSTRAINT `fk_mypage_orderlist_member1`
    FOREIGN KEY (`member_seq`)
    REFERENCES `pro_food`.`member` (`seq`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_mypage_orderlist_food1`
    FOREIGN KEY (`food_seq`)
    REFERENCES `pro_food`.`restaurant` (`seq`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
;

CREATE TABLE IF NOT EXISTS `pro_food`.`wishlist` (
  `seq` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `delYn` INT NULL,
  `likeYn` INT NULL,
  `list_seq` INT UNSIGNED NOT NULL,
  `member_seq` INT NULL,
  PRIMARY KEY (`seq`),
  INDEX `fk_wishlist_list1_idx` (`list_seq` ASC) VISIBLE,
  CONSTRAINT `fk_wishlist_list1`
    FOREIGN KEY (`list_seq`)
    REFERENCES `pro_food`.`restaurant` (`seq`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
;

CREATE TABLE IF NOT EXISTS `pro_food`.`review_list` (
  `seq` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `reviewContent` VARCHAR(1000) NULL,
  `reviewRating` INT NULL,
  `reviewDate` DATETIME NULL,
  `reviewerName` VARCHAR(45) NULL,
  `reviewerImage` VARCHAR(45) NULL,
  `delYn` TINYINT NULL,
  `food_seq` INT UNSIGNED NOT NULL,
  INDEX `fk_review_list_food1_idx` (`food_seq` ASC) VISIBLE,
  PRIMARY KEY (`seq`),
  CONSTRAINT `fk_review_list_food1`
    FOREIGN KEY (`food_seq`)
    REFERENCES `pro_food`.`restaurant` (`seq`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
;

insert into codegroup(
	name,
    insertDate,
    updateDate,
    delNy
)
VALUES(
	"성별",
    now(),
    now(),
    0
 );
 
 select * from codegroup;
 
 insert into code(
	name,
    insertDate,
    updateDate,
    delNy,
    codeGroup_seq
 )
 VALUES(
	"남성",
    now(),
    now(),
    0,
    1
 );
 
  insert into code(
	name,
	insertDate,
    updateDate,
    delNy,
    codeGroup_seq
 )
 VALUES(
	"여자",
    now(),
    now(),
    0,
    1
 );
 
  insert into code(
	name,
	insertDate,
    updateDate,
    delNy,
    codeGroup_seq
 )
 VALUES(
	"기타",
    now(),
    now(),
    0,
    1
 );
 
 select * from code;
 
 insert into member(

easyLoginCD, 
firstName, 
lastName, 
email, 
birthday, 
genderCD, 
pwCreate, 
pwCheck, 
registerYn, 
memberYn
 )value(
 3,
 '홍',
 '길동',
 'hong@naver.com',
 '2024-03-21',
 1,
 '1234',
 '1234',
 1,
 1
 );
 
  insert into member(

easyLoginCD, 
firstName, 
lastName, 
email, 
birthday, 
genderCD, 
pwCreate, 
pwCheck, 
registerYn, 
memberYn
 )value(
 3,
 '김',
 '민주',
 'min@naver.com',
 '1998-07-07',
 1,
 '4567',
 '4567',
 1,
 1
 );
 
 
 select * from member;
 
 