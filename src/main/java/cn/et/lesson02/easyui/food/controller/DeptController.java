package cn.et.lesson02.easyui.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.et.lesson02.easyui.food.entity.TreeNode;
import cn.et.lesson02.easyui.food.service.DeptService;



@RestController
public class DeptController {
	@Autowired
	DeptService service;
	//����json
	@ResponseBody
	@RequestMapping("/queryDept")
	public  List<TreeNode> queryDept(Integer id){
		//���pid��Ĭ�ϲ��ڵ�
		if(id==null){
			id=0;
		}
		return service.queryTreeNode(id);
	}
	
	
}
