package com.yuman.dao;

import com.yuman.bean.Orderline;
import com.yuman.bean.OrderlineExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderlineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    long countByExample(OrderlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    int deleteByExample(OrderlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    int insert(Orderline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    int insertSelective(Orderline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    List<Orderline> selectByExample(OrderlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    Orderline selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    int updateByExampleSelective(@Param("record") Orderline record, @Param("example") OrderlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    int updateByExample(@Param("record") Orderline record, @Param("example") OrderlineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    int updateByPrimaryKeySelective(Orderline record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ORDERLINE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    int updateByPrimaryKey(Orderline record);
}