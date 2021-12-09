package com.chinaopensource.management.system.admin.service;

import java.util.List;

import com.chinaopensource.management.system.admin.model.SysDict;
import com.chinaopensource.management.system.core.service.CurdService;

/**
 * 字典管理
 * @author 李其伟
 * @date Jan 13, 2019
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
