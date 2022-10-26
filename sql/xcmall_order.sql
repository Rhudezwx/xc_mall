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

 Date: 26/10/2022 13:53:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for xcmall_order
-- ----------------------------
DROP TABLE IF EXISTS `xcmall_order`;
CREATE TABLE `xcmall_order`  (
  `order_id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` bigint(0) NULL DEFAULT NULL COMMENT '用户id',
  `goods_id` bigint(0) NULL DEFAULT NULL COMMENT '商品id',
  `goods_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名字',
  `quantity` int(0) NULL DEFAULT NULL COMMENT '商品数量',
  `total_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品总价',
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xcmall_order
-- ----------------------------
INSERT INTO `xcmall_order` VALUES (1, 1, 7, '小宠猫罐头', 10, 1000.00);
INSERT INTO `xcmall_order` VALUES (2, 1, 1, '十一猫粮', 5, 555.00);
INSERT INTO `xcmall_order` VALUES (3, 3, 8, '小宠狗罐头', 10, 1010.00);
INSERT INTO `xcmall_order` VALUES (4, 4, 6, '精美小床', 1, 99.00);
INSERT INTO `xcmall_order` VALUES (5, 5, 4, '小宠猫薄荷', 10, 50.00);

SET FOREIGN_KEY_CHECKS = 1;
