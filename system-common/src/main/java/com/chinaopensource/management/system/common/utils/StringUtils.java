package com.chinaopensource.management.system.common.utils;

/**
 * 字符串工具类
 * @author 李其伟
 * @date Sep 1, 2018
 */
public class StringUtils {

	/**
	 * 判空操作
	 * @param value
	 * @return
	 */
	public static boolean isBlank(String value) {
		return value == null || "".equals(value) || "null".equals(value) || "undefined".equals(value);
	}

}
