package com.yuman.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class SCate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_CATE.ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private BigDecimal id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_CATE.NAME
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S_CATE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_CATE.ID
     *
     * @return the value of S_CATE.ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_CATE.ID
     *
     * @param id the value for S_CATE.ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_CATE.NAME
     *
     * @return the value of S_CATE.NAME
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_CATE.NAME
     *
     * @param name the value for S_CATE.NAME
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_CATE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}