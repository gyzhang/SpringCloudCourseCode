CREATE database account;
CREATE TABLE `account`.`repayment` (  
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(32) NOT NULL COMMENT '用户id',
  `repay_date` DATETIME NOT NULL COMMENT '还款日期',
  `repay_amount` DECIMAL(18,4) NOT NULL COMMENT '还款金额',
  PRIMARY KEY (`id`) 
);

CREATE database loan;
CREATE TABLE `loan`.`iou` (  
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(32) NOT NULL COMMENT '用户id',
  `balance` DECIMAL(18,4) NOT NULL COMMENT '借款余额',
  PRIMARY KEY (`id`) 
);
INSERT INTO iou (id, user_id, balance) VALUES (1, '1001', 100000);

CREATE database credit;
CREATE TABLE `credit`.`line` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(32) NOT NULL COMMENT '用户id',
  `limit_amount` DECIMAL(18,4) NOT NULL COMMENT '授信额度',
  `balance` DECIMAL(18,4) NOT NULL COMMENT '授信额度余额',
  PRIMARY KEY (`id`)
);
INSERT INTO line (id, user_id, limit_amount, balance) VALUES (1, '1001', 300000, 200000);