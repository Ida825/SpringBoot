package cn.et.lesson01.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson01.Emp;
import cn.et.lesson01.service.EmpService;

@RestController
public class SbController {
	@Autowired
	EmpService service;
	
	@RequestMapping("/helloSb")
	public Map helloSb(){
		Map map = new HashMap();
		map.put("id",1);
		map.put("name","zs");
		map.put("age",20);
		return map;
	}
	
	/**
	 * 根据员工id查询员工信息
	 * @param empId
	 * @return
	 */
	@RequestMapping("/emp/{empId}")
	public Map getEmp(@PathVariable Integer empId){
		return service.getEmp(empId);		
	}
	
	/**
	 * 添加员工信息
	 * @return
	 */
	@RequestMapping("/saveEmp")
	public String saveEmp(){
		service.saveEmp();
		return "1";
	}
	
	/**
	 *  查询员工信息
	 * @return
	 */
	@RequestMapping("/queryEmp")
	public Emp queryEmp(){		
		return service.queryEmp();
	}
	
	/**
	 * 删除员工信息
	 * @return
	 */
	@RequestMapping("/deleteEmp/{empId}")
	public String  deleteEmp(@PathVariable Integer empId){		
		service.deleteEmp(empId);
		return "1";
	}

	/**
	 * 修改员工信息
	 * @return
	 */
	@RequestMapping("/updateEmp/{empId}")
	public String updateEmp(@PathVariable Integer empId){		
		service.updateEmp(empId);
		
		return "1";
	}
	

	

}
