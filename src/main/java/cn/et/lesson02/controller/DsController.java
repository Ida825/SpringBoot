package cn.et.lesson02.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson02.entity.Emp;
import cn.et.lesson02.mapper.EmpMapper;

@RestController
public class DsController {

	@Autowired
	DataSource ds;
	
	@Autowired
	EmpMapper mapper; 
	
	@RequestMapping("/printDs")
	public String getDataSource(){
		return ds.toString(); 
	}
	
	@RequestMapping("/queryAll")
	public List<cn.et.lesson02.entity.Emp> queryAll(){
		return mapper.queryAllEmp();
	}
	
	@RequestMapping("/queryEmp/{id}")
	public Emp queryEmp(@PathVariable Integer id){
		return mapper.queryEmp(id);
	}
	
	
}
