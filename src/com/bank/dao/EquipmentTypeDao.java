package com.bank.dao;

import java.util.List;

import com.bank.entity.Department;
import com.bank.entity.EquipmentType;

/**
 * 银行设备种类接口
 * 
 * @author lenovo
 *
 */
public interface EquipmentTypeDao {

	/**
	 * 添加银行设备种类
	 * @param et
	 * @return
	 */
	public boolean addEquipmentType(EquipmentType EquipmentType);
	
	/**
	 * 根据id删除银行设备种类
	 * @param id
	 * @return
	 */
	public boolean deleteEquipmentType(int id);
	
	/**
	 * 分页查询银行设备种类
	 * @param pageSize
	 * @param pageNum
	 * @param Equipment_Name
	 * @return
	 */
	public List<Department> queryEquipmentType(int pageSize, int pageNum, String Equipment_Name);
	
	/**
	 * 修改银行设备种类
	 * @param et
	 * @return
	 */
	public boolean updateEquipmentType(EquipmentType EquipmentType);
	
}
