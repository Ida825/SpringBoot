package cn.et.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.et.lesson02.entity.Emp;



@Mapper
public interface EmpMapper {
	
	@Select("select * from emp")
	List<cn.et.lesson02.entity.Emp> queryAllEmp();
	
	@Select("select * from emp where id=#{0}")
	Emp queryEmp(int id);
	
	
}
