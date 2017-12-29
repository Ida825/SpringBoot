package cn.et.easyui.food.service;

import cn.et.easyui.food.entity.Food;
import cn.et.easyui.food.utils.PageTools;

public interface FoodService {

	public abstract PageTools queryFood(String foodname,Integer page,Integer rows);
	
	
	public void saveFood(Food food);
	
	public void deleteFood(Integer foodid);
	
	public void updateFood(Food food);
}