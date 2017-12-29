package cn.et.lesson01.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cn.et.lesson01.Emp;
import cn.et.lesson01.dao.EmpRepository;
import cn.et.lesson01.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	JdbcTemplate jdbc;
	
	@Autowired
	EmpRepository er;
	

	/**
	 * 根据id查询员工信息
	 */
	public Map getEmp(Integer empId){
		List<Map<String, Object>> empList = jdbc.queryForList("select * from emp where id="+empId);	
		return empList.get(0);
	}
	
	
	/**
	 * 添加员工信息
	 */
	public void saveEmp(){
		Emp emp = new Emp();
		emp.setEname("ss");
		emp.setSal(500.55);
		emp.setDeptid(4);
		er.save(emp);
		
	}
	
	
	/**
	 * 查询员工信息
	 */
	public Emp queryEmp(){		
		Emp emp = er.findOne(7);
		return emp;
	}
	
	/**
	 * 修改员工信息
	 */
	public void updateEmp(Integer empId){
		Emp emp = new Emp();
		emp.setId(empId);
		emp.setEname("张三疯");
		er.save(emp);
	}
	
	/**
	 * 更新员工信息
	 */
	public void deleteEmp(Integer empId){
		er.delete(empId);
	}
}
