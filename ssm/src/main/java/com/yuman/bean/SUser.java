package com.yuman.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_USER.ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private BigDecimal id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_USER.USERNAME
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_USER.PASSWORD
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_USER.PHONE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_USER.EMAIL
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_USER.ADDRESS
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column S_USER.DOB
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private Date dob;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S_USER
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_USER.ID
     *
     * @return the value of S_USER.ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_USER.ID
     *
     * @param id the value for S_USER.ID
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_USER.USERNAME
     *
     * @return the value of S_USER.USERNAME
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_USER.USERNAME
     *
     * @param username the value for S_USER.USERNAME
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_USER.PASSWORD
     *
     * @return the value of S_USER.PASSWORD
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_USER.PASSWORD
     *
     * @param password the value for S_USER.PASSWORD
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_USER.PHONE
     *
     * @return the value of S_USER.PHONE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_USER.PHONE
     *
     * @param phone the value for S_USER.PHONE
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_USER.EMAIL
     *
     * @return the value of S_USER.EMAIL
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_USER.EMAIL
     *
     * @param email the value for S_USER.EMAIL
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_USER.ADDRESS
     *
     * @return the value of S_USER.ADDRESS
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_USER.ADDRESS
     *
     * @param address the value for S_USER.ADDRESS
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column S_USER.DOB
     *
     * @return the value of S_USER.DOB
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public Date getDob() {
        return dob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column S_USER.DOB
     *
     * @param dob the value for S_USER.DOB
     *
     * @mbg.generated Sun May 19 20:26:50 CST 2019
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_USER
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", address=").append(address);
        sb.append(", dob=").append(dob);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}