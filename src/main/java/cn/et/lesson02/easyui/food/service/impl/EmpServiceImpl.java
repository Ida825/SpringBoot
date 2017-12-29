package cn.et.lesson02.easyui.food.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.et.lesson02.easyui.food.dao.EmpMapper;
import cn.et.lesson02.easyui.food.entity.Emp;
import cn.et.lesson02.easyui.food.entity.EmpExample;
import cn.et.lesson02.easyui.food.entity.EmpExample.Criteria;
import cn.et.lesson02.easyui.food.service.EmpService;
import cn.et.lesson02.easyui.food.utils.PageTools;

@Service
public class EmpServiceImpl  implements EmpService{
	
	
	@Autowired
	EmpMapper em;
	/* (non-Javadoc)
	 * @see cn.et.food.service.impl.FoodService#queryStudent(java.lang.String)
	 */
	public PageTools queryEmp(String ename,Integer page,Integer rows){
		if(ename==null){
			ename="";
		}
		EmpExample example = new EmpExample();
		//����һ������
		Criteria c = example.createCriteria();
		//����ж���������Ժ����and...
		
		c.andEnameLike("%"+ename+"%");
		//��ѯ�ܼ�¼��
		int total=(int)em.countByExample(example);
		
		PageTools ps=new PageTools(page, total, rows);
		//ͨ��RowBounds�Զ����ÿҳ�����
		RowBounds rb = new RowBounds(ps.getStartIndex()-1,rows);
		List<Emp> empList = em.selectByExampleWithRowbounds(example, rb);
		ps.setRows(empList);
	
		return ps;
	}
	

	/**
	 * ���Ա��
	 */
	public void saveEmp(Emp emp){	
		em.insert(emp);
	}
	
	
	/**
	 * ɾ��Ա��
	 */
	public void deleteEmp(Integer id){
		em.deleteByPrimaryKey(id);	
	}
	
	/**
	 * �޸�Ա��
	 */
	public void updateEmp(Emp emp){
		em.updateByPrimaryKey(emp);
	}
}
