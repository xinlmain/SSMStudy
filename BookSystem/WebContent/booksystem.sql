/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : booksystem

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2016-11-08 01:15:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `Price` decimal(10,0) DEFAULT NULL,
  `Publisher` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '明朝那些事儿图文增订版', '当年明月', '82', '北京联合出版公司');
INSERT INTO `book` VALUES ('2', '战争从未如此热血4：二战美日太平洋大对决：西方视角下的晚清图景', '关河五十州', '29', '民主与建设出版社');
INSERT INTO `book` VALUES ('3', '我们的征途是星辰大海', '花千芳', '20', '作家出版社');
INSERT INTO `book` VALUES ('4', '松下幸之助经营智慧书', '松下幸之助', '54', '人民文学出版社');
INSERT INTO `book` VALUES ('5', '大数据时代', '(英)迈尔-舍恩伯格', '31', '浙江人民出版社');
INSERT INTO `book` VALUES ('6', '销售就是要搞定人-一个销售总经理十六年的抢单笔记', '倪建伟', '21', '时代文艺出版社');
INSERT INTO `book` VALUES ('7', '这个男生不太冷：告诉你一个真实的陈楚生', '万俊人', '24', '海南出版社');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhangsan', '12345678');
INSERT INTO `user` VALUES ('2', 'lisi', '87654321');
