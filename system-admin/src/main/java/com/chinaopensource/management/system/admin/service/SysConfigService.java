package com.chinaopensource.management.system.admin.service;

import java.util.List;

import com.chinaopensource.management.system.admin.model.SysConfig;
import com.chinaopensource.management.system.core.service.CurdService;

/**
 * 系统配置管理
 * @author 李其伟
 * @date Jan 13, 2019
 */
public interface SysConfigService extends CurdService<SysConfig> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysConfig> findByLable(String lable);
}
