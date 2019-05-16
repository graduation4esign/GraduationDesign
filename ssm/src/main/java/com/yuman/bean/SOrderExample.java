package com.yuman.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SOrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public SOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("ORDERID is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("ORDERID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("ORDERID =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("ORDERID <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("ORDERID >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERID >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("ORDERID <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("ORDERID <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("ORDERID like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("ORDERID not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("ORDERID in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("ORDERID not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("ORDERID between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("ORDERID not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("PAYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("PAYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(BigDecimal value) {
            addCriterion("PAYSTATUS =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(BigDecimal value) {
            addCriterion("PAYSTATUS <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(BigDecimal value) {
            addCriterion("PAYSTATUS >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYSTATUS >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(BigDecimal value) {
            addCriterion("PAYSTATUS <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYSTATUS <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<BigDecimal> values) {
            addCriterion("PAYSTATUS in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<BigDecimal> values) {
            addCriterion("PAYSTATUS not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYSTATUS between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYSTATUS not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNull() {
            addCriterion("RECEIVENAME is null");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNotNull() {
            addCriterion("RECEIVENAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceivenameEqualTo(String value) {
            addCriterion("RECEIVENAME =", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotEqualTo(String value) {
            addCriterion("RECEIVENAME <>", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThan(String value) {
            addCriterion("RECEIVENAME >", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVENAME >=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThan(String value) {
            addCriterion("RECEIVENAME <", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThanOrEqualTo(String value) {
            addCriterion("RECEIVENAME <=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLike(String value) {
            addCriterion("RECEIVENAME like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotLike(String value) {
            addCriterion("RECEIVENAME not like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameIn(List<String> values) {
            addCriterion("RECEIVENAME in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotIn(List<String> values) {
            addCriterion("RECEIVENAME not in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameBetween(String value1, String value2) {
            addCriterion("RECEIVENAME between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotBetween(String value1, String value2) {
            addCriterion("RECEIVENAME not between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIsNull() {
            addCriterion("RECEIVEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIsNotNull() {
            addCriterion("RECEIVEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressEqualTo(String value) {
            addCriterion("RECEIVEADDRESS =", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotEqualTo(String value) {
            addCriterion("RECEIVEADDRESS <>", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressGreaterThan(String value) {
            addCriterion("RECEIVEADDRESS >", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEADDRESS >=", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLessThan(String value) {
            addCriterion("RECEIVEADDRESS <", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEADDRESS <=", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLike(String value) {
            addCriterion("RECEIVEADDRESS like", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotLike(String value) {
            addCriterion("RECEIVEADDRESS not like", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIn(List<String> values) {
            addCriterion("RECEIVEADDRESS in", values, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotIn(List<String> values) {
            addCriterion("RECEIVEADDRESS not in", values, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressBetween(String value1, String value2) {
            addCriterion("RECEIVEADDRESS between", value1, value2, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotBetween(String value1, String value2) {
            addCriterion("RECEIVEADDRESS not between", value1, value2, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNull() {
            addCriterion("RECEIVEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIsNotNull() {
            addCriterion("RECEIVEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andReceivephoneEqualTo(String value) {
            addCriterion("RECEIVEPHONE =", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotEqualTo(String value) {
            addCriterion("RECEIVEPHONE <>", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThan(String value) {
            addCriterion("RECEIVEPHONE >", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEPHONE >=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThan(String value) {
            addCriterion("RECEIVEPHONE <", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEPHONE <=", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneLike(String value) {
            addCriterion("RECEIVEPHONE like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotLike(String value) {
            addCriterion("RECEIVEPHONE not like", value, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneIn(List<String> values) {
            addCriterion("RECEIVEPHONE in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotIn(List<String> values) {
            addCriterion("RECEIVEPHONE not in", values, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneBetween(String value1, String value2) {
            addCriterion("RECEIVEPHONE between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andReceivephoneNotBetween(String value1, String value2) {
            addCriterion("RECEIVEPHONE not between", value1, value2, "receivephone");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("SUM is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("SUM is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(BigDecimal value) {
            addCriterion("SUM =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(BigDecimal value) {
            addCriterion("SUM <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(BigDecimal value) {
            addCriterion("SUM >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(BigDecimal value) {
            addCriterion("SUM <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<BigDecimal> values) {
            addCriterion("SUM in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<BigDecimal> values) {
            addCriterion("SUM not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andDobIsNull() {
            addCriterion("DOB is null");
            return (Criteria) this;
        }

        public Criteria andDobIsNotNull() {
            addCriterion("DOB is not null");
            return (Criteria) this;
        }

        public Criteria andDobEqualTo(Date value) {
            addCriterionForJDBCDate("DOB =", value, "dob");
            return (Criteria) this;
        }

        public Criteria andDobNotEqualTo(Date value) {
            addCriterionForJDBCDate("DOB <>", value, "dob");
            return (Criteria) this;
        }

        public Criteria andDobGreaterThan(Date value) {
            addCriterionForJDBCDate("DOB >", value, "dob");
            return (Criteria) this;
        }

        public Criteria andDobGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DOB >=", value, "dob");
            return (Criteria) this;
        }

        public Criteria andDobLessThan(Date value) {
            addCriterionForJDBCDate("DOB <", value, "dob");
            return (Criteria) this;
        }

        public Criteria andDobLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DOB <=", value, "dob");
            return (Criteria) this;
        }

        public Criteria andDobIn(List<Date> values) {
            addCriterionForJDBCDate("DOB in", values, "dob");
            return (Criteria) this;
        }

        public Criteria andDobNotIn(List<Date> values) {
            addCriterionForJDBCDate("DOB not in", values, "dob");
            return (Criteria) this;
        }

        public Criteria andDobBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DOB between", value1, value2, "dob");
            return (Criteria) this;
        }

        public Criteria andDobNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DOB not between", value1, value2, "dob");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(BigDecimal value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(BigDecimal value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(BigDecimal value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(BigDecimal value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<BigDecimal> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<BigDecimal> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table S_ORDER
     *
     * @mbg.generated do_not_delete_during_merge Mon May 06 02:06:24 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table S_ORDER
     *
     * @mbg.generated Mon May 06 02:06:24 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}