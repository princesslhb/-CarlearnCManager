package com.haibo.daomodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(Long value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(Long value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(Long value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(Long value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(Long value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(Long value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<Long> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<Long> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(Long value1, Long value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(Long value1, Long value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andSCoachidIsNull() {
            addCriterion("s_coachid is null");
            return (Criteria) this;
        }

        public Criteria andSCoachidIsNotNull() {
            addCriterion("s_coachid is not null");
            return (Criteria) this;
        }

        public Criteria andSCoachidEqualTo(String value) {
            addCriterion("s_coachid =", value, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidNotEqualTo(String value) {
            addCriterion("s_coachid <>", value, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidGreaterThan(String value) {
            addCriterion("s_coachid >", value, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidGreaterThanOrEqualTo(String value) {
            addCriterion("s_coachid >=", value, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidLessThan(String value) {
            addCriterion("s_coachid <", value, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidLessThanOrEqualTo(String value) {
            addCriterion("s_coachid <=", value, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidLike(String value) {
            addCriterion("s_coachid like", value, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidNotLike(String value) {
            addCriterion("s_coachid not like", value, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidIn(List<String> values) {
            addCriterion("s_coachid in", values, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidNotIn(List<String> values) {
            addCriterion("s_coachid not in", values, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidBetween(String value1, String value2) {
            addCriterion("s_coachid between", value1, value2, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSCoachidNotBetween(String value1, String value2) {
            addCriterion("s_coachid not between", value1, value2, "sCoachid");
            return (Criteria) this;
        }

        public Criteria andSStudentidIsNull() {
            addCriterion("s_studentid is null");
            return (Criteria) this;
        }

        public Criteria andSStudentidIsNotNull() {
            addCriterion("s_studentid is not null");
            return (Criteria) this;
        }

        public Criteria andSStudentidEqualTo(String value) {
            addCriterion("s_studentid =", value, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidNotEqualTo(String value) {
            addCriterion("s_studentid <>", value, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidGreaterThan(String value) {
            addCriterion("s_studentid >", value, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("s_studentid >=", value, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidLessThan(String value) {
            addCriterion("s_studentid <", value, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidLessThanOrEqualTo(String value) {
            addCriterion("s_studentid <=", value, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidLike(String value) {
            addCriterion("s_studentid like", value, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidNotLike(String value) {
            addCriterion("s_studentid not like", value, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidIn(List<String> values) {
            addCriterion("s_studentid in", values, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidNotIn(List<String> values) {
            addCriterion("s_studentid not in", values, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidBetween(String value1, String value2) {
            addCriterion("s_studentid between", value1, value2, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStudentidNotBetween(String value1, String value2) {
            addCriterion("s_studentid not between", value1, value2, "sStudentid");
            return (Criteria) this;
        }

        public Criteria andSStatueIsNull() {
            addCriterion("s_statue is null");
            return (Criteria) this;
        }

        public Criteria andSStatueIsNotNull() {
            addCriterion("s_statue is not null");
            return (Criteria) this;
        }

        public Criteria andSStatueEqualTo(Integer value) {
            addCriterion("s_statue =", value, "sStatue");
            return (Criteria) this;
        }

        public Criteria andSStatueNotEqualTo(Integer value) {
            addCriterion("s_statue <>", value, "sStatue");
            return (Criteria) this;
        }

        public Criteria andSStatueGreaterThan(Integer value) {
            addCriterion("s_statue >", value, "sStatue");
            return (Criteria) this;
        }

        public Criteria andSStatueGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_statue >=", value, "sStatue");
            return (Criteria) this;
        }

        public Criteria andSStatueLessThan(Integer value) {
            addCriterion("s_statue <", value, "sStatue");
            return (Criteria) this;
        }

        public Criteria andSStatueLessThanOrEqualTo(Integer value) {
            addCriterion("s_statue <=", value, "sStatue");
            return (Criteria) this;
        }

        public Criteria andSStatueIn(List<Integer> values) {
            addCriterion("s_statue in", values, "sStatue");
            return (Criteria) this;
        }

        public Criteria andSStatueNotIn(List<Integer> values) {
            addCriterion("s_statue not in", values, "sStatue");
            return (Criteria) this;
        }

        public Criteria andSStatueBetween(Integer value1, Integer value2) {
            addCriterion("s_statue between", value1, value2, "sStatue");
            return (Criteria) this;
        }

        public Criteria andSStatueNotBetween(Integer value1, Integer value2) {
            addCriterion("s_statue not between", value1, value2, "sStatue");
            return (Criteria) this;
        }

        public Criteria andTcreatedateIsNull() {
            addCriterion("tcreatedate is null");
            return (Criteria) this;
        }

        public Criteria andTcreatedateIsNotNull() {
            addCriterion("tcreatedate is not null");
            return (Criteria) this;
        }

        public Criteria andTcreatedateEqualTo(Date value) {
            addCriterion("tcreatedate =", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateNotEqualTo(Date value) {
            addCriterion("tcreatedate <>", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateGreaterThan(Date value) {
            addCriterion("tcreatedate >", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("tcreatedate >=", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateLessThan(Date value) {
            addCriterion("tcreatedate <", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateLessThanOrEqualTo(Date value) {
            addCriterion("tcreatedate <=", value, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateIn(List<Date> values) {
            addCriterion("tcreatedate in", values, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateNotIn(List<Date> values) {
            addCriterion("tcreatedate not in", values, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateBetween(Date value1, Date value2) {
            addCriterion("tcreatedate between", value1, value2, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andTcreatedateNotBetween(Date value1, Date value2) {
            addCriterion("tcreatedate not between", value1, value2, "tcreatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateIsNull() {
            addCriterion("toperatedate is null");
            return (Criteria) this;
        }

        public Criteria andToperatedateIsNotNull() {
            addCriterion("toperatedate is not null");
            return (Criteria) this;
        }

        public Criteria andToperatedateEqualTo(Date value) {
            addCriterion("toperatedate =", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateNotEqualTo(Date value) {
            addCriterion("toperatedate <>", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateGreaterThan(Date value) {
            addCriterion("toperatedate >", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("toperatedate >=", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateLessThan(Date value) {
            addCriterion("toperatedate <", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateLessThanOrEqualTo(Date value) {
            addCriterion("toperatedate <=", value, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateIn(List<Date> values) {
            addCriterion("toperatedate in", values, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateNotIn(List<Date> values) {
            addCriterion("toperatedate not in", values, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateBetween(Date value1, Date value2) {
            addCriterion("toperatedate between", value1, value2, "toperatedate");
            return (Criteria) this;
        }

        public Criteria andToperatedateNotBetween(Date value1, Date value2) {
            addCriterion("toperatedate not between", value1, value2, "toperatedate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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