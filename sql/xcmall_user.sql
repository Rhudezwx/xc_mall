/*
 Navicat Premium Data Transfer

 Source Server         : mysql@localhost
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : ry-cloud

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 26/10/2022 13:54:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for xcmall_user
-- ----------------------------
DROP TABLE IF EXISTS `xcmall_user`;
CREATE TABLE `xcmall_user`  (
  `user_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `phone` bigint(0) NULL DEFAULT NULL COMMENT '电话号码',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '家庭地址',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xcmall_user
-- ----------------------------
INSERT INTO `xcmall_user` VALUES (1, '芊芊', 11922022201, '江西省南昌市');
INSERT INTO `xcmall_user` VALUES (2, '十一', 11022991199, '阿拉丁市');
INSERT INTO `xcmall_user` VALUES (3, 'kido', 19022884583, '阿凡达市');
INSERT INTO `xcmall_user` VALUES (4, '岁岁', 10293852001, 'A市');
INSERT INTO `xcmall_user` VALUES (5, '年年', 19022730841, 'B市');

SET FOREIGN_KEY_CHECKS = 1;
