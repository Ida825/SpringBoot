package cn.et.lesson02.easyui.food.service;

import java.util.List;

import cn.et.lesson02.easyui.food.entity.TreeNode;

public interface DeptService {

	public abstract List<TreeNode> queryTreeNode(Integer pid);

}