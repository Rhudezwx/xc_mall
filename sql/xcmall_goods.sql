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

 Date: 26/10/2022 13:53:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for xcmall_goods
-- ----------------------------
DROP TABLE IF EXISTS `xcmall_goods`;
CREATE TABLE `xcmall_goods`  (
  `goods_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '商品id',
  `goods_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名',
  `goods_price` int(0) NULL DEFAULT NULL COMMENT '商品价格',
  `goods_stock` bigint(0) NULL DEFAULT NULL COMMENT '商品库存',
  `goods_status` bigint(0) NULL DEFAULT NULL COMMENT '商品状态【0下架 1在售】',
  `goods_detail` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '商品详情',
  PRIMARY KEY (`goods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xcmall_goods
-- ----------------------------
INSERT INTO `xcmall_goods` VALUES (1, '十一猫粮', 111, 10000, 1, '好吃的猫粮');
INSERT INTO `xcmall_goods` VALUES (2, '十一猫砂', 88, 100, 1, '好用的猫砂');
INSERT INTO `xcmall_goods` VALUES (3, '小宠猫玩具', 9, 10000, 1, '猫爱玩的玩具');
INSERT INTO `xcmall_goods` VALUES (4, '小宠猫薄荷', 5, 100, 1, '猫喜欢的薄荷');
INSERT INTO `xcmall_goods` VALUES (5, '小宠脆骨', 6, 66, 1, '狗咬不动的骨头');
INSERT INTO `xcmall_goods` VALUES (6, '精美小床', 99, 8000, 1, '猫狗都爱的小床，睡觉嘎嘎香');
INSERT INTO `xcmall_goods` VALUES (7, '小宠猫罐头', 100, 1000, 1, '小猫吃了都说好的猫罐头，买不了吃亏买不了上当');
INSERT INTO `xcmall_goods` VALUES (8, '小宠狗罐头', 101, 1000, 1, '小狗吃了回家，小狗吃了落泪，小狗吃了直接嘎嘎鼓掌的好吃狗罐头');

SET FOREIGN_KEY_CHECKS = 1;
