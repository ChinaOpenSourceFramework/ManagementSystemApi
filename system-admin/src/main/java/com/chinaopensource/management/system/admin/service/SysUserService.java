package com.chinaopensource.management.system.admin.service;

import java.io.File;
import java.util.List;
import java.util.Set;

import com.chinaopensource.management.system.admin.model.SysUser;
import com.chinaopensource.management.system.admin.model.SysUserRole;
import com.chinaopensource.management.system.core.page.PageRequest;
import com.chinaopensource.management.system.core.service.CurdService;

/**
 * 用户管理
 * @author 李其伟
 * @date Jan 13, 2019
 */
public interface SysUserService extends CurdService<SysUser> {

	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * @param userName
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

	/**
	 * 生成用户信息Excel文件
	 * @param pageRequest 要导出的分页查询参数
	 * @return
	 */
	File createUserExcelFile(PageRequest pageRequest);

}
