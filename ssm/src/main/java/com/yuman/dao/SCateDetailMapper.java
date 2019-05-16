package com.yuman.dao;

import com.yuman.bean.SCateDetail;
import com.yuman.bean.SCateDetailExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SCateDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    long countByExample(SCateDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    int deleteByExample(SCateDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    int insert(SCateDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    int insertSelective(SCateDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    List<SCateDetail> selectByExample(SCateDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    SCateDetail selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    int updateByExampleSelective(@Param("record") SCateDetail record, @Param("example") SCateDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    int updateByExample(@Param("record") SCateDetail record, @Param("example") SCateDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    int updateByPrimaryKeySelective(SCateDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE_DETAIL
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    int updateByPrimaryKey(SCateDetail record);
}