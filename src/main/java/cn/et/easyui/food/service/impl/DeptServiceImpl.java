package cn.et.easyui.food.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.easyui.food.entity.Dept;
import cn.et.easyui.food.entity.DeptExample;
import cn.et.easyui.food.entity.TreeNode;
import cn.et.easyui.food.mapper.DeptMapper;
import cn.et.easyui.food.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	DeptMapper dm;
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.DeptService#queryTreeNode(java.lang.Integer)
	 */
	public List<TreeNode> queryTreeNode(Integer pid){
		//������ѯ����
		DeptExample de = new DeptExample();
		de.createCriteria().andPidEqualTo(pid);
		//��ѯ���
		List<Dept> dept = dm.selectByExample(de);
		List<TreeNode> deptList = new ArrayList();
		//�����ת��TreeNode������list
		for(Dept d:dept){
			//����TreeNode
			TreeNode tn = new TreeNode();
			tn.setId(d.getDeptid());
			tn.setText(d.getDname());
			
			//�ж��ڵ�ǰ�ڵ����Ƿ�����ӽڵ�
			if(queryTreeNode(d.getDeptid()).size()==0){
				//��ǰ�ڵ���û���ӽڵ㣬��״̬��Ϊopen
				tn.setState("open");
			}
			deptList.add(tn);
		}
		
		return deptList;
	}
	
	
}
