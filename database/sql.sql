CREATE TABLE `t_demo` (
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


INSERT INTO `t_demo` VALUES ('name1', 1);
INSERT INTO `t_demo` VALUES ('name2', 2);
INSERT INTO `t_demo` VALUES ('name3', 3);
