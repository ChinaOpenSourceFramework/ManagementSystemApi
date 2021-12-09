package com.chinaopensource.management.system.admin.service;

import java.util.List;

import com.chinaopensource.management.system.admin.model.SysDept;
import com.chinaopensource.management.system.core.service.CurdService;

/**
 * 机构管理
 * @author 李其伟
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
