package cn.et.lesson02.easyui.food.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;

import cn.et.lesson02.easyui.food.entity.Food;
import cn.et.lesson02.easyui.food.entity.FoodExample;

@Mapper
public interface FoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @SelectProvider(type=FoodSqlProvider.class, method="countByExample")
    long countByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @DeleteProvider(type=FoodSqlProvider.class, method="deleteByExample")
    int deleteByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @Delete({
        "delete from food",
        "where foodid = #{foodid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer foodid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @Insert({
        "insert into food (foodid, foodname, ",
        "price, img)",
        "values (#{foodid,jdbcType=INTEGER}, #{foodname,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=INTEGER}, #{img,jdbcType=VARCHAR})"
    })
    int insert(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @InsertProvider(type=FoodSqlProvider.class, method="insertSelective")
    int insertSelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @SelectProvider(type=FoodSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="foodid", property="foodid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="foodname", property="foodname", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR)
    })
    List<Food> selectByExampleWithRowbounds(FoodExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @SelectProvider(type=FoodSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="foodid", property="foodid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="foodname", property="foodname", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR)
    })
    List<Food> selectByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @Select({
        "select",
        "foodid, foodname, price, img",
        "from food",
        "where foodid = #{foodid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="foodid", property="foodid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="foodname", property="foodname", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.INTEGER),
        @Result(column="img", property="img", jdbcType=JdbcType.VARCHAR)
    })
    Food selectByPrimaryKey(Integer foodid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @UpdateProvider(type=FoodSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @UpdateProvider(type=FoodSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @UpdateProvider(type=FoodSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table food
     *
     * @mbg.generated Fri Dec 08 19:37:34 CST 2017
     */
    @Update({
        "update food",
        "set foodname = #{foodname,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=INTEGER},",
          "img = #{img,jdbcType=VARCHAR}",
        "where foodid = #{foodid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Food record);
}