package cn.et.lesson01.service;

import java.util.Map;

import cn.et.lesson01.Emp;

public interface EmpService {
	/**
	 * 根据empId获取员工信息
	 * @param empId
	 * @return
	 */
	public Map getEmp(Integer empId);
	
	/**
	 * 添加员工
	 */
	public void saveEmp();
	
	/**
	 * 查询所有员工信息
	 * @return
	 */
	public Emp queryEmp();
	
	/**
	 * 根据empId修改员工信息
	 * @param empId
	 */
	public void updateEmp(Integer empId);
	
	/**
	 * 根据empId删除员工信息
	 * @param empId
	 */
	public void deleteEmp(Integer empId);
}
