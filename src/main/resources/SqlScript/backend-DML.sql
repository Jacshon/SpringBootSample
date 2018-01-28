SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `menu_id` varchar(32) NOT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `icon` varchar(40) DEFAULT NULL,
  `menu_name` varchar(30) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `state` varchar(60) DEFAULT NULL,
  `status` varchar(2) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `sys_module_module_id` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`menu_id`),
  UNIQUE KEY `UK_rcw1qlfjayx2gccauri8xqpnl` (`menu_name`),
  KEY `FKox7rkemsdo88rwvbq83199icf` (`sys_module_module_id`),
  CONSTRAINT `FKox7rkemsdo88rwvbq83199icf` FOREIGN KEY (`sys_module_module_id`) REFERENCES `sys_module` (`module_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', '1517143958', 'fa fa-user', '用户管理', '1', 'sys.user', 'AE', '1517143958', '1000');
INSERT INTO `sys_menu` VALUES ('2', '1517143958', 'fa fa-role', '角色管理', '2', 'sys.role', 'AE', '1517143958', '1000');
INSERT INTO `sys_menu` VALUES ('3', '1517143958', 'fa fa-pri', '权限管理', '3', 'sys.privilege', 'AE', '1517143958', '1000');
INSERT INTO `sys_menu` VALUES ('4', '1517143958', 'fa fa-log', '日志管理', '4', 'sys.log', 'AE', '1517143958', '1000');

-- ----------------------------
-- Table structure for `sys_module`
-- ----------------------------
DROP TABLE IF EXISTS `sys_module`;
CREATE TABLE `sys_module` (
  `module_id` varchar(32) NOT NULL,
  `code` varchar(32) DEFAULT NULL,
  `create_time` bigint(20) DEFAULT NULL,
  `icon` varchar(60) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `priority` int(11) DEFAULT NULL,
  `status` varchar(2) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`module_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_module
-- ----------------------------
INSERT INTO `sys_module` VALUES ('1000', 'sys', null, 'fa fa-sys', 'app.sys', '1', 'AE', null);