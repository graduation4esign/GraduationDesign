package com.yuman.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class SShopcartItem implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_SHOPCART_ITEM.ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private BigDecimal id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_SHOPCART_ITEM.USER_ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private BigDecimal userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_SHOPCART_ITEM.PRODUCT_ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private BigDecimal productId;
    
    private Product product;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_SHOPCART_ITEM.NUM
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private BigDecimal num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S_SHOPCART_ITEM
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_SHOPCART_ITEM.ID
     *
     * @return the value of S_SHOPCART_ITEM.ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_SHOPCART_ITEM.ID
     *
     * @param id the value for S_SHOPCART_ITEM.ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_SHOPCART_ITEM.USER_ID
     *
     * @return the value of S_SHOPCART_ITEM.USER_ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_SHOPCART_ITEM.USER_ID
     *
     * @param userId the value for S_SHOPCART_ITEM.USER_ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_SHOPCART_ITEM.PRODUCT_ID
     *
     * @return the value of S_SHOPCART_ITEM.PRODUCT_ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public BigDecimal getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_SHOPCART_ITEM.PRODUCT_ID
     *
     * @param productId the value for S_SHOPCART_ITEM.PRODUCT_ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setProductId(BigDecimal productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_SHOPCART_ITEM.NUM
     *
     * @return the value of S_SHOPCART_ITEM.NUM
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public BigDecimal getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_SHOPCART_ITEM.NUM
     *
     * @param num the value for S_SHOPCART_ITEM.NUM
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setNum(BigDecimal num) {
        this.num = num;
    }

    
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_SHOPCART_ITEM
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
        sb.append(", userId=").append(userId);
        sb.append(", productId=").append(productId);
        sb.append(", num=").append(num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}