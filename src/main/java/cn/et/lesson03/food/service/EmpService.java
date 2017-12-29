package cn.et.lesson03.food.service;

import cn.et.lesson03.food.entity.Emp;
import cn.et.lesson03.food.utils.PageTools;

public interface EmpService {

	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.DeptService#queryTreeNode(java.lang.Integer)
	 */
	public PageTools queryEmp(String ename,Integer page,Integer rows);

	public void saveEmp(Emp emp);
	
	public void deleteEmp(Integer id);
	
	public void updateEmp(Emp emp);

	public PageTools queryEmpByDeptid(Integer deptid,Integer page,Integer rows);
}