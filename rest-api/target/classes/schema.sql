DROP TABLE IF EXISTS `PRODUCT_DETAILS`;
CREATE TABLE `PRODUCT_DETAILS` (
  `product_id` number(20) NOT NULL AUTO_INCREMENT,
  `product_name` varchar2(50) DEFAULT NULL,
  `product_type` varchar2(50) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
);