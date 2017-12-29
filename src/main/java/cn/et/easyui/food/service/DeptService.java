package cn.et.easyui.food.service;

import java.util.List;

import cn.et.easyui.food.entity.TreeNode;

public interface DeptService {

	public abstract List<TreeNode> queryTreeNode(Integer pid);

}