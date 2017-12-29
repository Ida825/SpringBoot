package cn.et.lesson03.food.service;

import java.util.List;

import cn.et.lesson03.food.entity.TreeNode;

public interface DeptService {

	public abstract List<TreeNode> queryTreeNode(Integer pid);

}