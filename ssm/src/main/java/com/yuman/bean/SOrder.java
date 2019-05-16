package com.yuman.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_ORDER.ID
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private BigDecimal id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_ORDER.ORDERID
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_ORDER.PAYSTATUS
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private BigDecimal paystatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_ORDER.RECEIVENAME
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private String receivename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_ORDER.RECEIVEADDRESS
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private String receiveaddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_ORDER.RECEIVEPHONE
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private String receivephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_ORDER.SUM
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private BigDecimal sum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_ORDER.DOB
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private Date dob;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_ORDER.USER_ID
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private BigDecimal userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ORDER.ID
     *
     * @return the value of S_ORDER.ID
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ORDER.ID
     *
     * @param id the value for S_ORDER.ID
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ORDER.ORDERID
     *
     * @return the value of S_ORDER.ORDERID
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ORDER.ORDERID
     *
     * @param orderid the value for S_ORDER.ORDERID
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ORDER.PAYSTATUS
     *
     * @return the value of S_ORDER.PAYSTATUS
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public BigDecimal getPaystatus() {
        return paystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ORDER.PAYSTATUS
     *
     * @param paystatus the value for S_ORDER.PAYSTATUS
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setPaystatus(BigDecimal paystatus) {
        this.paystatus = paystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ORDER.RECEIVENAME
     *
     * @return the value of S_ORDER.RECEIVENAME
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public String getReceivename() {
        return receivename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ORDER.RECEIVENAME
     *
     * @param receivename the value for S_ORDER.RECEIVENAME
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ORDER.RECEIVEADDRESS
     *
     * @return the value of S_ORDER.RECEIVEADDRESS
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public String getReceiveaddress() {
        return receiveaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ORDER.RECEIVEADDRESS
     *
     * @param receiveaddress the value for S_ORDER.RECEIVEADDRESS
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setReceiveaddress(String receiveaddress) {
        this.receiveaddress = receiveaddress == null ? null : receiveaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ORDER.RECEIVEPHONE
     *
     * @return the value of S_ORDER.RECEIVEPHONE
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public String getReceivephone() {
        return receivephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ORDER.RECEIVEPHONE
     *
     * @param receivephone the value for S_ORDER.RECEIVEPHONE
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setReceivephone(String receivephone) {
        this.receivephone = receivephone == null ? null : receivephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ORDER.SUM
     *
     * @return the value of S_ORDER.SUM
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ORDER.SUM
     *
     * @param sum the value for S_ORDER.SUM
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ORDER.DOB
     *
     * @return the value of S_ORDER.DOB
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public Date getDob() {
        return dob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ORDER.DOB
     *
     * @param dob the value for S_ORDER.DOB
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_ORDER.USER_ID
     *
     * @return the value of S_ORDER.USER_ID
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_ORDER.USER_ID
     *
     * @param userId the value for S_ORDER.USER_ID
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderid=").append(orderid);
        sb.append(", paystatus=").append(paystatus);
        sb.append(", receivename=").append(receivename);
        sb.append(", receiveaddress=").append(receiveaddress);
        sb.append(", receivephone=").append(receivephone);
        sb.append(", sum=").append(sum);
        sb.append(", dob=").append(dob);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}