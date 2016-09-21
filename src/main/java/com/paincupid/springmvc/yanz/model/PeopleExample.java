package com.paincupid.springmvc.yanz.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PeopleExample {
    protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public PeopleExample() {
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

		public Criteria andCpscodeIsNull() {
			addCriterion("cPsCode is null");
			return (Criteria) this;
		}

		public Criteria andCpscodeIsNotNull() {
			addCriterion("cPsCode is not null");
			return (Criteria) this;
		}

		public Criteria andCpscodeEqualTo(String value) {
			addCriterion("cPsCode =", value, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeNotEqualTo(String value) {
			addCriterion("cPsCode <>", value, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeGreaterThan(String value) {
			addCriterion("cPsCode >", value, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeGreaterThanOrEqualTo(String value) {
			addCriterion("cPsCode >=", value, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeLessThan(String value) {
			addCriterion("cPsCode <", value, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeLessThanOrEqualTo(String value) {
			addCriterion("cPsCode <=", value, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeLike(String value) {
			addCriterion("cPsCode like", value, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeNotLike(String value) {
			addCriterion("cPsCode not like", value, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeIn(List<String> values) {
			addCriterion("cPsCode in", values, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeNotIn(List<String> values) {
			addCriterion("cPsCode not in", values, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeBetween(String value1, String value2) {
			addCriterion("cPsCode between", value1, value2, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpscodeNotBetween(String value1, String value2) {
			addCriterion("cPsCode not between", value1, value2, "cpscode");
			return (Criteria) this;
		}

		public Criteria andCpsnameIsNull() {
			addCriterion("cPsName is null");
			return (Criteria) this;
		}

		public Criteria andCpsnameIsNotNull() {
			addCriterion("cPsName is not null");
			return (Criteria) this;
		}

		public Criteria andCpsnameEqualTo(String value) {
			addCriterion("cPsName =", value, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameNotEqualTo(String value) {
			addCriterion("cPsName <>", value, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameGreaterThan(String value) {
			addCriterion("cPsName >", value, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameGreaterThanOrEqualTo(String value) {
			addCriterion("cPsName >=", value, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameLessThan(String value) {
			addCriterion("cPsName <", value, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameLessThanOrEqualTo(String value) {
			addCriterion("cPsName <=", value, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameLike(String value) {
			addCriterion("cPsName like", value, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameNotLike(String value) {
			addCriterion("cPsName not like", value, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameIn(List<String> values) {
			addCriterion("cPsName in", values, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameNotIn(List<String> values) {
			addCriterion("cPsName not in", values, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameBetween(String value1, String value2) {
			addCriterion("cPsName between", value1, value2, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpsnameNotBetween(String value1, String value2) {
			addCriterion("cPsName not between", value1, value2, "cpsname");
			return (Criteria) this;
		}

		public Criteria andCpssexIsNull() {
			addCriterion("cPsSex is null");
			return (Criteria) this;
		}

		public Criteria andCpssexIsNotNull() {
			addCriterion("cPsSex is not null");
			return (Criteria) this;
		}

		public Criteria andCpssexEqualTo(String value) {
			addCriterion("cPsSex =", value, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexNotEqualTo(String value) {
			addCriterion("cPsSex <>", value, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexGreaterThan(String value) {
			addCriterion("cPsSex >", value, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexGreaterThanOrEqualTo(String value) {
			addCriterion("cPsSex >=", value, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexLessThan(String value) {
			addCriterion("cPsSex <", value, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexLessThanOrEqualTo(String value) {
			addCriterion("cPsSex <=", value, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexLike(String value) {
			addCriterion("cPsSex like", value, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexNotLike(String value) {
			addCriterion("cPsSex not like", value, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexIn(List<String> values) {
			addCriterion("cPsSex in", values, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexNotIn(List<String> values) {
			addCriterion("cPsSex not in", values, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexBetween(String value1, String value2) {
			addCriterion("cPsSex between", value1, value2, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpssexNotBetween(String value1, String value2) {
			addCriterion("cPsSex not between", value1, value2, "cpssex");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeIsNull() {
			addCriterion("cPsDepartmentCode is null");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeIsNotNull() {
			addCriterion("cPsDepartmentCode is not null");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeEqualTo(String value) {
			addCriterion("cPsDepartmentCode =", value, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeNotEqualTo(String value) {
			addCriterion("cPsDepartmentCode <>", value, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeGreaterThan(String value) {
			addCriterion("cPsDepartmentCode >", value, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeGreaterThanOrEqualTo(String value) {
			addCriterion("cPsDepartmentCode >=", value, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeLessThan(String value) {
			addCriterion("cPsDepartmentCode <", value, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeLessThanOrEqualTo(String value) {
			addCriterion("cPsDepartmentCode <=", value, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeLike(String value) {
			addCriterion("cPsDepartmentCode like", value, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeNotLike(String value) {
			addCriterion("cPsDepartmentCode not like", value, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeIn(List<String> values) {
			addCriterion("cPsDepartmentCode in", values, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeNotIn(List<String> values) {
			addCriterion("cPsDepartmentCode not in", values, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeBetween(String value1, String value2) {
			addCriterion("cPsDepartmentCode between", value1, value2, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentcodeNotBetween(String value1, String value2) {
			addCriterion("cPsDepartmentCode not between", value1, value2, "cpsdepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameIsNull() {
			addCriterion("cPsDepartmentName is null");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameIsNotNull() {
			addCriterion("cPsDepartmentName is not null");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameEqualTo(String value) {
			addCriterion("cPsDepartmentName =", value, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameNotEqualTo(String value) {
			addCriterion("cPsDepartmentName <>", value, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameGreaterThan(String value) {
			addCriterion("cPsDepartmentName >", value, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameGreaterThanOrEqualTo(String value) {
			addCriterion("cPsDepartmentName >=", value, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameLessThan(String value) {
			addCriterion("cPsDepartmentName <", value, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameLessThanOrEqualTo(String value) {
			addCriterion("cPsDepartmentName <=", value, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameLike(String value) {
			addCriterion("cPsDepartmentName like", value, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameNotLike(String value) {
			addCriterion("cPsDepartmentName not like", value, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameIn(List<String> values) {
			addCriterion("cPsDepartmentName in", values, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameNotIn(List<String> values) {
			addCriterion("cPsDepartmentName not in", values, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameBetween(String value1, String value2) {
			addCriterion("cPsDepartmentName between", value1, value2, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsdepartmentnameNotBetween(String value1, String value2) {
			addCriterion("cPsDepartmentName not between", value1, value2, "cpsdepartmentname");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckIsNull() {
			addCriterion("bPsAttendCheck is null");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckIsNotNull() {
			addCriterion("bPsAttendCheck is not null");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckEqualTo(Boolean value) {
			addCriterion("bPsAttendCheck =", value, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckNotEqualTo(Boolean value) {
			addCriterion("bPsAttendCheck <>", value, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckGreaterThan(Boolean value) {
			addCriterion("bPsAttendCheck >", value, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckGreaterThanOrEqualTo(Boolean value) {
			addCriterion("bPsAttendCheck >=", value, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckLessThan(Boolean value) {
			addCriterion("bPsAttendCheck <", value, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckLessThanOrEqualTo(Boolean value) {
			addCriterion("bPsAttendCheck <=", value, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckIn(List<Boolean> values) {
			addCriterion("bPsAttendCheck in", values, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckNotIn(List<Boolean> values) {
			addCriterion("bPsAttendCheck not in", values, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsAttendCheck between", value1, value2, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andBpsattendcheckNotBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsAttendCheck not between", value1, value2, "bpsattendcheck");
			return (Criteria) this;
		}

		public Criteria andCpsnationalIsNull() {
			addCriterion("cPsNational is null");
			return (Criteria) this;
		}

		public Criteria andCpsnationalIsNotNull() {
			addCriterion("cPsNational is not null");
			return (Criteria) this;
		}

		public Criteria andCpsnationalEqualTo(String value) {
			addCriterion("cPsNational =", value, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalNotEqualTo(String value) {
			addCriterion("cPsNational <>", value, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalGreaterThan(String value) {
			addCriterion("cPsNational >", value, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalGreaterThanOrEqualTo(String value) {
			addCriterion("cPsNational >=", value, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalLessThan(String value) {
			addCriterion("cPsNational <", value, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalLessThanOrEqualTo(String value) {
			addCriterion("cPsNational <=", value, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalLike(String value) {
			addCriterion("cPsNational like", value, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalNotLike(String value) {
			addCriterion("cPsNational not like", value, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalIn(List<String> values) {
			addCriterion("cPsNational in", values, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalNotIn(List<String> values) {
			addCriterion("cPsNational not in", values, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalBetween(String value1, String value2) {
			addCriterion("cPsNational between", value1, value2, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpsnationalNotBetween(String value1, String value2) {
			addCriterion("cPsNational not between", value1, value2, "cpsnational");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeIsNull() {
			addCriterion("cPsHDCode is null");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeIsNotNull() {
			addCriterion("cPsHDCode is not null");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeEqualTo(String value) {
			addCriterion("cPsHDCode =", value, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeNotEqualTo(String value) {
			addCriterion("cPsHDCode <>", value, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeGreaterThan(String value) {
			addCriterion("cPsHDCode >", value, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeGreaterThanOrEqualTo(String value) {
			addCriterion("cPsHDCode >=", value, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeLessThan(String value) {
			addCriterion("cPsHDCode <", value, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeLessThanOrEqualTo(String value) {
			addCriterion("cPsHDCode <=", value, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeLike(String value) {
			addCriterion("cPsHDCode like", value, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeNotLike(String value) {
			addCriterion("cPsHDCode not like", value, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeIn(List<String> values) {
			addCriterion("cPsHDCode in", values, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeNotIn(List<String> values) {
			addCriterion("cPsHDCode not in", values, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeBetween(String value1, String value2) {
			addCriterion("cPsHDCode between", value1, value2, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpshdcodeNotBetween(String value1, String value2) {
			addCriterion("cPsHDCode not between", value1, value2, "cpshdcode");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountIsNull() {
			addCriterion("cPsBankAccount is null");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountIsNotNull() {
			addCriterion("cPsBankAccount is not null");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountEqualTo(String value) {
			addCriterion("cPsBankAccount =", value, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountNotEqualTo(String value) {
			addCriterion("cPsBankAccount <>", value, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountGreaterThan(String value) {
			addCriterion("cPsBankAccount >", value, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountGreaterThanOrEqualTo(String value) {
			addCriterion("cPsBankAccount >=", value, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountLessThan(String value) {
			addCriterion("cPsBankAccount <", value, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountLessThanOrEqualTo(String value) {
			addCriterion("cPsBankAccount <=", value, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountLike(String value) {
			addCriterion("cPsBankAccount like", value, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountNotLike(String value) {
			addCriterion("cPsBankAccount not like", value, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountIn(List<String> values) {
			addCriterion("cPsBankAccount in", values, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountNotIn(List<String> values) {
			addCriterion("cPsBankAccount not in", values, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountBetween(String value1, String value2) {
			addCriterion("cPsBankAccount between", value1, value2, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsbankaccountNotBetween(String value1, String value2) {
			addCriterion("cPsBankAccount not between", value1, value2, "cpsbankaccount");
			return (Criteria) this;
		}

		public Criteria andCpsemailIsNull() {
			addCriterion("cPsEmail is null");
			return (Criteria) this;
		}

		public Criteria andCpsemailIsNotNull() {
			addCriterion("cPsEmail is not null");
			return (Criteria) this;
		}

		public Criteria andCpsemailEqualTo(String value) {
			addCriterion("cPsEmail =", value, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailNotEqualTo(String value) {
			addCriterion("cPsEmail <>", value, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailGreaterThan(String value) {
			addCriterion("cPsEmail >", value, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailGreaterThanOrEqualTo(String value) {
			addCriterion("cPsEmail >=", value, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailLessThan(String value) {
			addCriterion("cPsEmail <", value, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailLessThanOrEqualTo(String value) {
			addCriterion("cPsEmail <=", value, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailLike(String value) {
			addCriterion("cPsEmail like", value, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailNotLike(String value) {
			addCriterion("cPsEmail not like", value, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailIn(List<String> values) {
			addCriterion("cPsEmail in", values, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailNotIn(List<String> values) {
			addCriterion("cPsEmail not in", values, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailBetween(String value1, String value2) {
			addCriterion("cPsEmail between", value1, value2, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsemailNotBetween(String value1, String value2) {
			addCriterion("cPsEmail not between", value1, value2, "cpsemail");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberIsNull() {
			addCriterion("cPsPhoneNumber is null");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberIsNotNull() {
			addCriterion("cPsPhoneNumber is not null");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberEqualTo(String value) {
			addCriterion("cPsPhoneNumber =", value, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberNotEqualTo(String value) {
			addCriterion("cPsPhoneNumber <>", value, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberGreaterThan(String value) {
			addCriterion("cPsPhoneNumber >", value, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberGreaterThanOrEqualTo(String value) {
			addCriterion("cPsPhoneNumber >=", value, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberLessThan(String value) {
			addCriterion("cPsPhoneNumber <", value, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberLessThanOrEqualTo(String value) {
			addCriterion("cPsPhoneNumber <=", value, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberLike(String value) {
			addCriterion("cPsPhoneNumber like", value, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberNotLike(String value) {
			addCriterion("cPsPhoneNumber not like", value, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberIn(List<String> values) {
			addCriterion("cPsPhoneNumber in", values, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberNotIn(List<String> values) {
			addCriterion("cPsPhoneNumber not in", values, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberBetween(String value1, String value2) {
			addCriterion("cPsPhoneNumber between", value1, value2, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andCpsphonenumberNotBetween(String value1, String value2) {
			addCriterion("cPsPhoneNumber not between", value1, value2, "cpsphonenumber");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayIsNull() {
			addCriterion("dPsBirthday is null");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayIsNotNull() {
			addCriterion("dPsBirthday is not null");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayEqualTo(Date value) {
			addCriterion("dPsBirthday =", value, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayNotEqualTo(Date value) {
			addCriterion("dPsBirthday <>", value, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayGreaterThan(Date value) {
			addCriterion("dPsBirthday >", value, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayGreaterThanOrEqualTo(Date value) {
			addCriterion("dPsBirthday >=", value, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayLessThan(Date value) {
			addCriterion("dPsBirthday <", value, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayLessThanOrEqualTo(Date value) {
			addCriterion("dPsBirthday <=", value, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayIn(List<Date> values) {
			addCriterion("dPsBirthday in", values, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayNotIn(List<Date> values) {
			addCriterion("dPsBirthday not in", values, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayBetween(Date value1, Date value2) {
			addCriterion("dPsBirthday between", value1, value2, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsbirthdayNotBetween(Date value1, Date value2) {
			addCriterion("dPsBirthday not between", value1, value2, "dpsbirthday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayIsNull() {
			addCriterion("dPsHareDay is null");
			return (Criteria) this;
		}

		public Criteria andDpsharedayIsNotNull() {
			addCriterion("dPsHareDay is not null");
			return (Criteria) this;
		}

		public Criteria andDpsharedayEqualTo(Date value) {
			addCriterion("dPsHareDay =", value, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayNotEqualTo(Date value) {
			addCriterion("dPsHareDay <>", value, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayGreaterThan(Date value) {
			addCriterion("dPsHareDay >", value, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayGreaterThanOrEqualTo(Date value) {
			addCriterion("dPsHareDay >=", value, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayLessThan(Date value) {
			addCriterion("dPsHareDay <", value, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayLessThanOrEqualTo(Date value) {
			addCriterion("dPsHareDay <=", value, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayIn(List<Date> values) {
			addCriterion("dPsHareDay in", values, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayNotIn(List<Date> values) {
			addCriterion("dPsHareDay not in", values, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayBetween(Date value1, Date value2) {
			addCriterion("dPsHareDay between", value1, value2, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsharedayNotBetween(Date value1, Date value2) {
			addCriterion("dPsHareDay not between", value1, value2, "dpshareday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayIsNull() {
			addCriterion("dPsFireDay is null");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayIsNotNull() {
			addCriterion("dPsFireDay is not null");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayEqualTo(Date value) {
			addCriterion("dPsFireDay =", value, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayNotEqualTo(Date value) {
			addCriterion("dPsFireDay <>", value, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayGreaterThan(Date value) {
			addCriterion("dPsFireDay >", value, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayGreaterThanOrEqualTo(Date value) {
			addCriterion("dPsFireDay >=", value, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayLessThan(Date value) {
			addCriterion("dPsFireDay <", value, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayLessThanOrEqualTo(Date value) {
			addCriterion("dPsFireDay <=", value, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayIn(List<Date> values) {
			addCriterion("dPsFireDay in", values, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayNotIn(List<Date> values) {
			addCriterion("dPsFireDay not in", values, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayBetween(Date value1, Date value2) {
			addCriterion("dPsFireDay between", value1, value2, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andDpsfiredayNotBetween(Date value1, Date value2) {
			addCriterion("dPsFireDay not between", value1, value2, "dpsfireday");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkIsNull() {
			addCriterion("bPsPieceWork is null");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkIsNotNull() {
			addCriterion("bPsPieceWork is not null");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkEqualTo(Boolean value) {
			addCriterion("bPsPieceWork =", value, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkNotEqualTo(Boolean value) {
			addCriterion("bPsPieceWork <>", value, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkGreaterThan(Boolean value) {
			addCriterion("bPsPieceWork >", value, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkGreaterThanOrEqualTo(Boolean value) {
			addCriterion("bPsPieceWork >=", value, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkLessThan(Boolean value) {
			addCriterion("bPsPieceWork <", value, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkLessThanOrEqualTo(Boolean value) {
			addCriterion("bPsPieceWork <=", value, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkIn(List<Boolean> values) {
			addCriterion("bPsPieceWork in", values, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkNotIn(List<Boolean> values) {
			addCriterion("bPsPieceWork not in", values, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsPieceWork between", value1, value2, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpspieceworkNotBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsPieceWork not between", value1, value2, "bpspiecework");
			return (Criteria) this;
		}

		public Criteria andBpsregularIsNull() {
			addCriterion("bPsRegular is null");
			return (Criteria) this;
		}

		public Criteria andBpsregularIsNotNull() {
			addCriterion("bPsRegular is not null");
			return (Criteria) this;
		}

		public Criteria andBpsregularEqualTo(Boolean value) {
			addCriterion("bPsRegular =", value, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsregularNotEqualTo(Boolean value) {
			addCriterion("bPsRegular <>", value, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsregularGreaterThan(Boolean value) {
			addCriterion("bPsRegular >", value, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsregularGreaterThanOrEqualTo(Boolean value) {
			addCriterion("bPsRegular >=", value, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsregularLessThan(Boolean value) {
			addCriterion("bPsRegular <", value, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsregularLessThanOrEqualTo(Boolean value) {
			addCriterion("bPsRegular <=", value, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsregularIn(List<Boolean> values) {
			addCriterion("bPsRegular in", values, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsregularNotIn(List<Boolean> values) {
			addCriterion("bPsRegular not in", values, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsregularBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsRegular between", value1, value2, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsregularNotBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsRegular not between", value1, value2, "bpsregular");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorIsNull() {
			addCriterion("bPsOperator is null");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorIsNotNull() {
			addCriterion("bPsOperator is not null");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorEqualTo(Boolean value) {
			addCriterion("bPsOperator =", value, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorNotEqualTo(Boolean value) {
			addCriterion("bPsOperator <>", value, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorGreaterThan(Boolean value) {
			addCriterion("bPsOperator >", value, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorGreaterThanOrEqualTo(Boolean value) {
			addCriterion("bPsOperator >=", value, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorLessThan(Boolean value) {
			addCriterion("bPsOperator <", value, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorLessThanOrEqualTo(Boolean value) {
			addCriterion("bPsOperator <=", value, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorIn(List<Boolean> values) {
			addCriterion("bPsOperator in", values, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorNotIn(List<Boolean> values) {
			addCriterion("bPsOperator not in", values, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsOperator between", value1, value2, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andBpsoperatorNotBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsOperator not between", value1, value2, "bpsoperator");
			return (Criteria) this;
		}

		public Criteria andCpspasswordIsNull() {
			addCriterion("cPsPassword is null");
			return (Criteria) this;
		}

		public Criteria andCpspasswordIsNotNull() {
			addCriterion("cPsPassword is not null");
			return (Criteria) this;
		}

		public Criteria andCpspasswordEqualTo(String value) {
			addCriterion("cPsPassword =", value, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordNotEqualTo(String value) {
			addCriterion("cPsPassword <>", value, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordGreaterThan(String value) {
			addCriterion("cPsPassword >", value, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordGreaterThanOrEqualTo(String value) {
			addCriterion("cPsPassword >=", value, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordLessThan(String value) {
			addCriterion("cPsPassword <", value, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordLessThanOrEqualTo(String value) {
			addCriterion("cPsPassword <=", value, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordLike(String value) {
			addCriterion("cPsPassword like", value, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordNotLike(String value) {
			addCriterion("cPsPassword not like", value, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordIn(List<String> values) {
			addCriterion("cPsPassword in", values, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordNotIn(List<String> values) {
			addCriterion("cPsPassword not in", values, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordBetween(String value1, String value2) {
			addCriterion("cPsPassword between", value1, value2, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andCpspasswordNotBetween(String value1, String value2) {
			addCriterion("cPsPassword not between", value1, value2, "cpspassword");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityIsNull() {
			addCriterion("mPsAuthority is null");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityIsNotNull() {
			addCriterion("mPsAuthority is not null");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityEqualTo(String value) {
			addCriterion("mPsAuthority =", value, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityNotEqualTo(String value) {
			addCriterion("mPsAuthority <>", value, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityGreaterThan(String value) {
			addCriterion("mPsAuthority >", value, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityGreaterThanOrEqualTo(String value) {
			addCriterion("mPsAuthority >=", value, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityLessThan(String value) {
			addCriterion("mPsAuthority <", value, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityLessThanOrEqualTo(String value) {
			addCriterion("mPsAuthority <=", value, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityLike(String value) {
			addCriterion("mPsAuthority like", value, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityNotLike(String value) {
			addCriterion("mPsAuthority not like", value, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityIn(List<String> values) {
			addCriterion("mPsAuthority in", values, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityNotIn(List<String> values) {
			addCriterion("mPsAuthority not in", values, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityBetween(String value1, String value2) {
			addCriterion("mPsAuthority between", value1, value2, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andMpsauthorityNotBetween(String value1, String value2) {
			addCriterion("mPsAuthority not between", value1, value2, "mpsauthority");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesIsNull() {
			addCriterion("fPsSelfTimes is null");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesIsNotNull() {
			addCriterion("fPsSelfTimes is not null");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesEqualTo(Double value) {
			addCriterion("fPsSelfTimes =", value, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesNotEqualTo(Double value) {
			addCriterion("fPsSelfTimes <>", value, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesGreaterThan(Double value) {
			addCriterion("fPsSelfTimes >", value, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesGreaterThanOrEqualTo(Double value) {
			addCriterion("fPsSelfTimes >=", value, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesLessThan(Double value) {
			addCriterion("fPsSelfTimes <", value, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesLessThanOrEqualTo(Double value) {
			addCriterion("fPsSelfTimes <=", value, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesIn(List<Double> values) {
			addCriterion("fPsSelfTimes in", values, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesNotIn(List<Double> values) {
			addCriterion("fPsSelfTimes not in", values, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesBetween(Double value1, Double value2) {
			addCriterion("fPsSelfTimes between", value1, value2, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpsselftimesNotBetween(Double value1, Double value2) {
			addCriterion("fPsSelfTimes not between", value1, value2, "fpsselftimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesIsNull() {
			addCriterion("fPsPwTimes is null");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesIsNotNull() {
			addCriterion("fPsPwTimes is not null");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesEqualTo(Double value) {
			addCriterion("fPsPwTimes =", value, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesNotEqualTo(Double value) {
			addCriterion("fPsPwTimes <>", value, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesGreaterThan(Double value) {
			addCriterion("fPsPwTimes >", value, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesGreaterThanOrEqualTo(Double value) {
			addCriterion("fPsPwTimes >=", value, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesLessThan(Double value) {
			addCriterion("fPsPwTimes <", value, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesLessThanOrEqualTo(Double value) {
			addCriterion("fPsPwTimes <=", value, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesIn(List<Double> values) {
			addCriterion("fPsPwTimes in", values, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesNotIn(List<Double> values) {
			addCriterion("fPsPwTimes not in", values, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesBetween(Double value1, Double value2) {
			addCriterion("fPsPwTimes between", value1, value2, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andFpspwtimesNotBetween(Double value1, Double value2) {
			addCriterion("fPsPwTimes not between", value1, value2, "fpspwtimes");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeIsNull() {
			addCriterion("cPsPostCode is null");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeIsNotNull() {
			addCriterion("cPsPostCode is not null");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeEqualTo(String value) {
			addCriterion("cPsPostCode =", value, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeNotEqualTo(String value) {
			addCriterion("cPsPostCode <>", value, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeGreaterThan(String value) {
			addCriterion("cPsPostCode >", value, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeGreaterThanOrEqualTo(String value) {
			addCriterion("cPsPostCode >=", value, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeLessThan(String value) {
			addCriterion("cPsPostCode <", value, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeLessThanOrEqualTo(String value) {
			addCriterion("cPsPostCode <=", value, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeLike(String value) {
			addCriterion("cPsPostCode like", value, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeNotLike(String value) {
			addCriterion("cPsPostCode not like", value, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeIn(List<String> values) {
			addCriterion("cPsPostCode in", values, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeNotIn(List<String> values) {
			addCriterion("cPsPostCode not in", values, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeBetween(String value1, String value2) {
			addCriterion("cPsPostCode between", value1, value2, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostcodeNotBetween(String value1, String value2) {
			addCriterion("cPsPostCode not between", value1, value2, "cpspostcode");
			return (Criteria) this;
		}

		public Criteria andCpspostnameIsNull() {
			addCriterion("cPsPostName is null");
			return (Criteria) this;
		}

		public Criteria andCpspostnameIsNotNull() {
			addCriterion("cPsPostName is not null");
			return (Criteria) this;
		}

		public Criteria andCpspostnameEqualTo(String value) {
			addCriterion("cPsPostName =", value, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameNotEqualTo(String value) {
			addCriterion("cPsPostName <>", value, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameGreaterThan(String value) {
			addCriterion("cPsPostName >", value, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameGreaterThanOrEqualTo(String value) {
			addCriterion("cPsPostName >=", value, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameLessThan(String value) {
			addCriterion("cPsPostName <", value, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameLessThanOrEqualTo(String value) {
			addCriterion("cPsPostName <=", value, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameLike(String value) {
			addCriterion("cPsPostName like", value, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameNotLike(String value) {
			addCriterion("cPsPostName not like", value, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameIn(List<String> values) {
			addCriterion("cPsPostName in", values, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameNotIn(List<String> values) {
			addCriterion("cPsPostName not in", values, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameBetween(String value1, String value2) {
			addCriterion("cPsPostName between", value1, value2, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andCpspostnameNotBetween(String value1, String value2) {
			addCriterion("cPsPostName not between", value1, value2, "cpspostname");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerIsNull() {
			addCriterion("bPsManager is null");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerIsNotNull() {
			addCriterion("bPsManager is not null");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerEqualTo(Boolean value) {
			addCriterion("bPsManager =", value, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerNotEqualTo(Boolean value) {
			addCriterion("bPsManager <>", value, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerGreaterThan(Boolean value) {
			addCriterion("bPsManager >", value, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerGreaterThanOrEqualTo(Boolean value) {
			addCriterion("bPsManager >=", value, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerLessThan(Boolean value) {
			addCriterion("bPsManager <", value, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerLessThanOrEqualTo(Boolean value) {
			addCriterion("bPsManager <=", value, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerIn(List<Boolean> values) {
			addCriterion("bPsManager in", values, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerNotIn(List<Boolean> values) {
			addCriterion("bPsManager not in", values, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsManager between", value1, value2, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andBpsmanagerNotBetween(Boolean value1, Boolean value2) {
			addCriterion("bPsManager not between", value1, value2, "bpsmanager");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryIsNull() {
			addCriterion("fPsBasicSalary is null");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryIsNotNull() {
			addCriterion("fPsBasicSalary is not null");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryEqualTo(Double value) {
			addCriterion("fPsBasicSalary =", value, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryNotEqualTo(Double value) {
			addCriterion("fPsBasicSalary <>", value, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryGreaterThan(Double value) {
			addCriterion("fPsBasicSalary >", value, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryGreaterThanOrEqualTo(Double value) {
			addCriterion("fPsBasicSalary >=", value, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryLessThan(Double value) {
			addCriterion("fPsBasicSalary <", value, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryLessThanOrEqualTo(Double value) {
			addCriterion("fPsBasicSalary <=", value, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryIn(List<Double> values) {
			addCriterion("fPsBasicSalary in", values, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryNotIn(List<Double> values) {
			addCriterion("fPsBasicSalary not in", values, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryBetween(Double value1, Double value2) {
			addCriterion("fPsBasicSalary between", value1, value2, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsbasicsalaryNotBetween(Double value1, Double value2) {
			addCriterion("fPsBasicSalary not between", value1, value2, "fpsbasicsalary");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyIsNull() {
			addCriterion("fPsYearSubsidy is null");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyIsNotNull() {
			addCriterion("fPsYearSubsidy is not null");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyEqualTo(Double value) {
			addCriterion("fPsYearSubsidy =", value, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyNotEqualTo(Double value) {
			addCriterion("fPsYearSubsidy <>", value, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyGreaterThan(Double value) {
			addCriterion("fPsYearSubsidy >", value, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyGreaterThanOrEqualTo(Double value) {
			addCriterion("fPsYearSubsidy >=", value, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyLessThan(Double value) {
			addCriterion("fPsYearSubsidy <", value, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyLessThanOrEqualTo(Double value) {
			addCriterion("fPsYearSubsidy <=", value, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyIn(List<Double> values) {
			addCriterion("fPsYearSubsidy in", values, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyNotIn(List<Double> values) {
			addCriterion("fPsYearSubsidy not in", values, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyBetween(Double value1, Double value2) {
			addCriterion("fPsYearSubsidy between", value1, value2, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsyearsubsidyNotBetween(Double value1, Double value2) {
			addCriterion("fPsYearSubsidy not between", value1, value2, "fpsyearsubsidy");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeIsNull() {
			addCriterion("cPsTitleCode is null");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeIsNotNull() {
			addCriterion("cPsTitleCode is not null");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeEqualTo(String value) {
			addCriterion("cPsTitleCode =", value, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeNotEqualTo(String value) {
			addCriterion("cPsTitleCode <>", value, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeGreaterThan(String value) {
			addCriterion("cPsTitleCode >", value, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeGreaterThanOrEqualTo(String value) {
			addCriterion("cPsTitleCode >=", value, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeLessThan(String value) {
			addCriterion("cPsTitleCode <", value, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeLessThanOrEqualTo(String value) {
			addCriterion("cPsTitleCode <=", value, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeLike(String value) {
			addCriterion("cPsTitleCode like", value, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeNotLike(String value) {
			addCriterion("cPsTitleCode not like", value, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeIn(List<String> values) {
			addCriterion("cPsTitleCode in", values, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeNotIn(List<String> values) {
			addCriterion("cPsTitleCode not in", values, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeBetween(String value1, String value2) {
			addCriterion("cPsTitleCode between", value1, value2, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlecodeNotBetween(String value1, String value2) {
			addCriterion("cPsTitleCode not between", value1, value2, "cpstitlecode");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameIsNull() {
			addCriterion("cPsTitleName is null");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameIsNotNull() {
			addCriterion("cPsTitleName is not null");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameEqualTo(String value) {
			addCriterion("cPsTitleName =", value, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameNotEqualTo(String value) {
			addCriterion("cPsTitleName <>", value, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameGreaterThan(String value) {
			addCriterion("cPsTitleName >", value, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameGreaterThanOrEqualTo(String value) {
			addCriterion("cPsTitleName >=", value, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameLessThan(String value) {
			addCriterion("cPsTitleName <", value, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameLessThanOrEqualTo(String value) {
			addCriterion("cPsTitleName <=", value, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameLike(String value) {
			addCriterion("cPsTitleName like", value, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameNotLike(String value) {
			addCriterion("cPsTitleName not like", value, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameIn(List<String> values) {
			addCriterion("cPsTitleName in", values, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameNotIn(List<String> values) {
			addCriterion("cPsTitleName not in", values, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameBetween(String value1, String value2) {
			addCriterion("cPsTitleName between", value1, value2, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andCpstitlenameNotBetween(String value1, String value2) {
			addCriterion("cPsTitleName not between", value1, value2, "cpstitlename");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyIsNull() {
			addCriterion("fPsTitleSubsidy is null");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyIsNotNull() {
			addCriterion("fPsTitleSubsidy is not null");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyEqualTo(Double value) {
			addCriterion("fPsTitleSubsidy =", value, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyNotEqualTo(Double value) {
			addCriterion("fPsTitleSubsidy <>", value, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyGreaterThan(Double value) {
			addCriterion("fPsTitleSubsidy >", value, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyGreaterThanOrEqualTo(Double value) {
			addCriterion("fPsTitleSubsidy >=", value, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyLessThan(Double value) {
			addCriterion("fPsTitleSubsidy <", value, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyLessThanOrEqualTo(Double value) {
			addCriterion("fPsTitleSubsidy <=", value, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyIn(List<Double> values) {
			addCriterion("fPsTitleSubsidy in", values, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyNotIn(List<Double> values) {
			addCriterion("fPsTitleSubsidy not in", values, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyBetween(Double value1, Double value2) {
			addCriterion("fPsTitleSubsidy between", value1, value2, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpstitlesubsidyNotBetween(Double value1, Double value2) {
			addCriterion("fPsTitleSubsidy not between", value1, value2, "fpstitlesubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyIsNull() {
			addCriterion("fPsHelthSubsidy is null");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyIsNotNull() {
			addCriterion("fPsHelthSubsidy is not null");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyEqualTo(Double value) {
			addCriterion("fPsHelthSubsidy =", value, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyNotEqualTo(Double value) {
			addCriterion("fPsHelthSubsidy <>", value, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyGreaterThan(Double value) {
			addCriterion("fPsHelthSubsidy >", value, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyGreaterThanOrEqualTo(Double value) {
			addCriterion("fPsHelthSubsidy >=", value, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyLessThan(Double value) {
			addCriterion("fPsHelthSubsidy <", value, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyLessThanOrEqualTo(Double value) {
			addCriterion("fPsHelthSubsidy <=", value, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyIn(List<Double> values) {
			addCriterion("fPsHelthSubsidy in", values, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyNotIn(List<Double> values) {
			addCriterion("fPsHelthSubsidy not in", values, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyBetween(Double value1, Double value2) {
			addCriterion("fPsHelthSubsidy between", value1, value2, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpshelthsubsidyNotBetween(Double value1, Double value2) {
			addCriterion("fPsHelthSubsidy not between", value1, value2, "fpshelthsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1IsNull() {
			addCriterion("fPsFixSubsidy1 is null");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1IsNotNull() {
			addCriterion("fPsFixSubsidy1 is not null");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1EqualTo(Double value) {
			addCriterion("fPsFixSubsidy1 =", value, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1NotEqualTo(Double value) {
			addCriterion("fPsFixSubsidy1 <>", value, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1GreaterThan(Double value) {
			addCriterion("fPsFixSubsidy1 >", value, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1GreaterThanOrEqualTo(Double value) {
			addCriterion("fPsFixSubsidy1 >=", value, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1LessThan(Double value) {
			addCriterion("fPsFixSubsidy1 <", value, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1LessThanOrEqualTo(Double value) {
			addCriterion("fPsFixSubsidy1 <=", value, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1In(List<Double> values) {
			addCriterion("fPsFixSubsidy1 in", values, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1NotIn(List<Double> values) {
			addCriterion("fPsFixSubsidy1 not in", values, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1Between(Double value1, Double value2) {
			addCriterion("fPsFixSubsidy1 between", value1, value2, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy1NotBetween(Double value1, Double value2) {
			addCriterion("fPsFixSubsidy1 not between", value1, value2, "fpsfixsubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2IsNull() {
			addCriterion("fPsFixSubsidy2 is null");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2IsNotNull() {
			addCriterion("fPsFixSubsidy2 is not null");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2EqualTo(Double value) {
			addCriterion("fPsFixSubsidy2 =", value, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2NotEqualTo(Double value) {
			addCriterion("fPsFixSubsidy2 <>", value, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2GreaterThan(Double value) {
			addCriterion("fPsFixSubsidy2 >", value, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2GreaterThanOrEqualTo(Double value) {
			addCriterion("fPsFixSubsidy2 >=", value, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2LessThan(Double value) {
			addCriterion("fPsFixSubsidy2 <", value, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2LessThanOrEqualTo(Double value) {
			addCriterion("fPsFixSubsidy2 <=", value, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2In(List<Double> values) {
			addCriterion("fPsFixSubsidy2 in", values, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2NotIn(List<Double> values) {
			addCriterion("fPsFixSubsidy2 not in", values, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2Between(Double value1, Double value2) {
			addCriterion("fPsFixSubsidy2 between", value1, value2, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsfixsubsidy2NotBetween(Double value1, Double value2) {
			addCriterion("fPsFixSubsidy2 not between", value1, value2, "fpsfixsubsidy2");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1IsNull() {
			addCriterion("fPsOtherSubsidy1 is null");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1IsNotNull() {
			addCriterion("fPsOtherSubsidy1 is not null");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1EqualTo(Double value) {
			addCriterion("fPsOtherSubsidy1 =", value, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1NotEqualTo(Double value) {
			addCriterion("fPsOtherSubsidy1 <>", value, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1GreaterThan(Double value) {
			addCriterion("fPsOtherSubsidy1 >", value, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1GreaterThanOrEqualTo(Double value) {
			addCriterion("fPsOtherSubsidy1 >=", value, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1LessThan(Double value) {
			addCriterion("fPsOtherSubsidy1 <", value, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1LessThanOrEqualTo(Double value) {
			addCriterion("fPsOtherSubsidy1 <=", value, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1In(List<Double> values) {
			addCriterion("fPsOtherSubsidy1 in", values, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1NotIn(List<Double> values) {
			addCriterion("fPsOtherSubsidy1 not in", values, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1Between(Double value1, Double value2) {
			addCriterion("fPsOtherSubsidy1 between", value1, value2, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsothersubsidy1NotBetween(Double value1, Double value2) {
			addCriterion("fPsOtherSubsidy1 not between", value1, value2, "fpsothersubsidy1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1IsNull() {
			addCriterion("fPSFree1 is null");
			return (Criteria) this;
		}

		public Criteria andFpsfree1IsNotNull() {
			addCriterion("fPSFree1 is not null");
			return (Criteria) this;
		}

		public Criteria andFpsfree1EqualTo(Double value) {
			addCriterion("fPSFree1 =", value, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1NotEqualTo(Double value) {
			addCriterion("fPSFree1 <>", value, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1GreaterThan(Double value) {
			addCriterion("fPSFree1 >", value, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1GreaterThanOrEqualTo(Double value) {
			addCriterion("fPSFree1 >=", value, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1LessThan(Double value) {
			addCriterion("fPSFree1 <", value, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1LessThanOrEqualTo(Double value) {
			addCriterion("fPSFree1 <=", value, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1In(List<Double> values) {
			addCriterion("fPSFree1 in", values, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1NotIn(List<Double> values) {
			addCriterion("fPSFree1 not in", values, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1Between(Double value1, Double value2) {
			addCriterion("fPSFree1 between", value1, value2, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andFpsfree1NotBetween(Double value1, Double value2) {
			addCriterion("fPSFree1 not between", value1, value2, "fpsfree1");
			return (Criteria) this;
		}

		public Criteria andCpsfree2IsNull() {
			addCriterion("cPSFree2 is null");
			return (Criteria) this;
		}

		public Criteria andCpsfree2IsNotNull() {
			addCriterion("cPSFree2 is not null");
			return (Criteria) this;
		}

		public Criteria andCpsfree2EqualTo(String value) {
			addCriterion("cPSFree2 =", value, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2NotEqualTo(String value) {
			addCriterion("cPSFree2 <>", value, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2GreaterThan(String value) {
			addCriterion("cPSFree2 >", value, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2GreaterThanOrEqualTo(String value) {
			addCriterion("cPSFree2 >=", value, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2LessThan(String value) {
			addCriterion("cPSFree2 <", value, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2LessThanOrEqualTo(String value) {
			addCriterion("cPSFree2 <=", value, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2Like(String value) {
			addCriterion("cPSFree2 like", value, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2NotLike(String value) {
			addCriterion("cPSFree2 not like", value, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2In(List<String> values) {
			addCriterion("cPSFree2 in", values, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2NotIn(List<String> values) {
			addCriterion("cPSFree2 not in", values, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2Between(String value1, String value2) {
			addCriterion("cPSFree2 between", value1, value2, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpsfree2NotBetween(String value1, String value2) {
			addCriterion("cPSFree2 not between", value1, value2, "cpsfree2");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeIsNull() {
			addCriterion("cPSEducationCode is null");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeIsNotNull() {
			addCriterion("cPSEducationCode is not null");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeEqualTo(String value) {
			addCriterion("cPSEducationCode =", value, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeNotEqualTo(String value) {
			addCriterion("cPSEducationCode <>", value, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeGreaterThan(String value) {
			addCriterion("cPSEducationCode >", value, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeGreaterThanOrEqualTo(String value) {
			addCriterion("cPSEducationCode >=", value, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeLessThan(String value) {
			addCriterion("cPSEducationCode <", value, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeLessThanOrEqualTo(String value) {
			addCriterion("cPSEducationCode <=", value, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeLike(String value) {
			addCriterion("cPSEducationCode like", value, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeNotLike(String value) {
			addCriterion("cPSEducationCode not like", value, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeIn(List<String> values) {
			addCriterion("cPSEducationCode in", values, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeNotIn(List<String> values) {
			addCriterion("cPSEducationCode not in", values, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeBetween(String value1, String value2) {
			addCriterion("cPSEducationCode between", value1, value2, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationcodeNotBetween(String value1, String value2) {
			addCriterion("cPSEducationCode not between", value1, value2, "cpseducationcode");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameIsNull() {
			addCriterion("cPsEducationName is null");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameIsNotNull() {
			addCriterion("cPsEducationName is not null");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameEqualTo(String value) {
			addCriterion("cPsEducationName =", value, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameNotEqualTo(String value) {
			addCriterion("cPsEducationName <>", value, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameGreaterThan(String value) {
			addCriterion("cPsEducationName >", value, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameGreaterThanOrEqualTo(String value) {
			addCriterion("cPsEducationName >=", value, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameLessThan(String value) {
			addCriterion("cPsEducationName <", value, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameLessThanOrEqualTo(String value) {
			addCriterion("cPsEducationName <=", value, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameLike(String value) {
			addCriterion("cPsEducationName like", value, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameNotLike(String value) {
			addCriterion("cPsEducationName not like", value, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameIn(List<String> values) {
			addCriterion("cPsEducationName in", values, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameNotIn(List<String> values) {
			addCriterion("cPsEducationName not in", values, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameBetween(String value1, String value2) {
			addCriterion("cPsEducationName between", value1, value2, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andCpseducationnameNotBetween(String value1, String value2) {
			addCriterion("cPsEducationName not between", value1, value2, "cpseducationname");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyIsNull() {
			addCriterion("fPSEducationSubsidy is null");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyIsNotNull() {
			addCriterion("fPSEducationSubsidy is not null");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyEqualTo(String value) {
			addCriterion("fPSEducationSubsidy =", value, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyNotEqualTo(String value) {
			addCriterion("fPSEducationSubsidy <>", value, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyGreaterThan(String value) {
			addCriterion("fPSEducationSubsidy >", value, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyGreaterThanOrEqualTo(String value) {
			addCriterion("fPSEducationSubsidy >=", value, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyLessThan(String value) {
			addCriterion("fPSEducationSubsidy <", value, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyLessThanOrEqualTo(String value) {
			addCriterion("fPSEducationSubsidy <=", value, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyLike(String value) {
			addCriterion("fPSEducationSubsidy like", value, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyNotLike(String value) {
			addCriterion("fPSEducationSubsidy not like", value, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyIn(List<String> values) {
			addCriterion("fPSEducationSubsidy in", values, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyNotIn(List<String> values) {
			addCriterion("fPSEducationSubsidy not in", values, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyBetween(String value1, String value2) {
			addCriterion("fPSEducationSubsidy between", value1, value2, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpseducationsubsidyNotBetween(String value1, String value2) {
			addCriterion("fPSEducationSubsidy not between", value1, value2, "fpseducationsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryIsNull() {
			addCriterion("fPsPerformanceSalary is null");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryIsNotNull() {
			addCriterion("fPsPerformanceSalary is not null");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryEqualTo(Double value) {
			addCriterion("fPsPerformanceSalary =", value, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryNotEqualTo(Double value) {
			addCriterion("fPsPerformanceSalary <>", value, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryGreaterThan(Double value) {
			addCriterion("fPsPerformanceSalary >", value, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryGreaterThanOrEqualTo(Double value) {
			addCriterion("fPsPerformanceSalary >=", value, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryLessThan(Double value) {
			addCriterion("fPsPerformanceSalary <", value, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryLessThanOrEqualTo(Double value) {
			addCriterion("fPsPerformanceSalary <=", value, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryIn(List<Double> values) {
			addCriterion("fPsPerformanceSalary in", values, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryNotIn(List<Double> values) {
			addCriterion("fPsPerformanceSalary not in", values, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryBetween(Double value1, Double value2) {
			addCriterion("fPsPerformanceSalary between", value1, value2, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsperformancesalaryNotBetween(Double value1, Double value2) {
			addCriterion("fPsPerformanceSalary not between", value1, value2, "fpsperformancesalary");
			return (Criteria) this;
		}

		public Criteria andFpsylbxIsNull() {
			addCriterion("fPsYLBX is null");
			return (Criteria) this;
		}

		public Criteria andFpsylbxIsNotNull() {
			addCriterion("fPsYLBX is not null");
			return (Criteria) this;
		}

		public Criteria andFpsylbxEqualTo(Double value) {
			addCriterion("fPsYLBX =", value, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpsylbxNotEqualTo(Double value) {
			addCriterion("fPsYLBX <>", value, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpsylbxGreaterThan(Double value) {
			addCriterion("fPsYLBX >", value, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpsylbxGreaterThanOrEqualTo(Double value) {
			addCriterion("fPsYLBX >=", value, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpsylbxLessThan(Double value) {
			addCriterion("fPsYLBX <", value, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpsylbxLessThanOrEqualTo(Double value) {
			addCriterion("fPsYLBX <=", value, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpsylbxIn(List<Double> values) {
			addCriterion("fPsYLBX in", values, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpsylbxNotIn(List<Double> values) {
			addCriterion("fPsYLBX not in", values, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpsylbxBetween(Double value1, Double value2) {
			addCriterion("fPsYLBX between", value1, value2, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpsylbxNotBetween(Double value1, Double value2) {
			addCriterion("fPsYLBX not between", value1, value2, "fpsylbx");
			return (Criteria) this;
		}

		public Criteria andFpssybxIsNull() {
			addCriterion("fPSSYBX is null");
			return (Criteria) this;
		}

		public Criteria andFpssybxIsNotNull() {
			addCriterion("fPSSYBX is not null");
			return (Criteria) this;
		}

		public Criteria andFpssybxEqualTo(Double value) {
			addCriterion("fPSSYBX =", value, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpssybxNotEqualTo(Double value) {
			addCriterion("fPSSYBX <>", value, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpssybxGreaterThan(Double value) {
			addCriterion("fPSSYBX >", value, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpssybxGreaterThanOrEqualTo(Double value) {
			addCriterion("fPSSYBX >=", value, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpssybxLessThan(Double value) {
			addCriterion("fPSSYBX <", value, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpssybxLessThanOrEqualTo(Double value) {
			addCriterion("fPSSYBX <=", value, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpssybxIn(List<Double> values) {
			addCriterion("fPSSYBX in", values, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpssybxNotIn(List<Double> values) {
			addCriterion("fPSSYBX not in", values, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpssybxBetween(Double value1, Double value2) {
			addCriterion("fPSSYBX between", value1, value2, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpssybxNotBetween(Double value1, Double value2) {
			addCriterion("fPSSYBX not between", value1, value2, "fpssybx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxIsNull() {
			addCriterion("fPsYiLBX is null");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxIsNotNull() {
			addCriterion("fPsYiLBX is not null");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxEqualTo(Double value) {
			addCriterion("fPsYiLBX =", value, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxNotEqualTo(Double value) {
			addCriterion("fPsYiLBX <>", value, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxGreaterThan(Double value) {
			addCriterion("fPsYiLBX >", value, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxGreaterThanOrEqualTo(Double value) {
			addCriterion("fPsYiLBX >=", value, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxLessThan(Double value) {
			addCriterion("fPsYiLBX <", value, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxLessThanOrEqualTo(Double value) {
			addCriterion("fPsYiLBX <=", value, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxIn(List<Double> values) {
			addCriterion("fPsYiLBX in", values, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxNotIn(List<Double> values) {
			addCriterion("fPsYiLBX not in", values, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxBetween(Double value1, Double value2) {
			addCriterion("fPsYiLBX between", value1, value2, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andFpsyilbxNotBetween(Double value1, Double value2) {
			addCriterion("fPsYiLBX not between", value1, value2, "fpsyilbx");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateIsNull() {
			addCriterion("bPSNeedSalaryCalculate is null");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateIsNotNull() {
			addCriterion("bPSNeedSalaryCalculate is not null");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateEqualTo(Boolean value) {
			addCriterion("bPSNeedSalaryCalculate =", value, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateNotEqualTo(Boolean value) {
			addCriterion("bPSNeedSalaryCalculate <>", value, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateGreaterThan(Boolean value) {
			addCriterion("bPSNeedSalaryCalculate >", value, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateGreaterThanOrEqualTo(Boolean value) {
			addCriterion("bPSNeedSalaryCalculate >=", value, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateLessThan(Boolean value) {
			addCriterion("bPSNeedSalaryCalculate <", value, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateLessThanOrEqualTo(Boolean value) {
			addCriterion("bPSNeedSalaryCalculate <=", value, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateIn(List<Boolean> values) {
			addCriterion("bPSNeedSalaryCalculate in", values, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateNotIn(List<Boolean> values) {
			addCriterion("bPSNeedSalaryCalculate not in", values, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateBetween(Boolean value1, Boolean value2) {
			addCriterion("bPSNeedSalaryCalculate between", value1, value2, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andBpsneedsalarycalculateNotBetween(Boolean value1, Boolean value2) {
			addCriterion("bPSNeedSalaryCalculate not between", value1, value2, "bpsneedsalarycalculate");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeIsNull() {
			addCriterion("cPsWorkTypeCode is null");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeIsNotNull() {
			addCriterion("cPsWorkTypeCode is not null");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeEqualTo(String value) {
			addCriterion("cPsWorkTypeCode =", value, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeNotEqualTo(String value) {
			addCriterion("cPsWorkTypeCode <>", value, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeGreaterThan(String value) {
			addCriterion("cPsWorkTypeCode >", value, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeGreaterThanOrEqualTo(String value) {
			addCriterion("cPsWorkTypeCode >=", value, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeLessThan(String value) {
			addCriterion("cPsWorkTypeCode <", value, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeLessThanOrEqualTo(String value) {
			addCriterion("cPsWorkTypeCode <=", value, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeLike(String value) {
			addCriterion("cPsWorkTypeCode like", value, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeNotLike(String value) {
			addCriterion("cPsWorkTypeCode not like", value, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeIn(List<String> values) {
			addCriterion("cPsWorkTypeCode in", values, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeNotIn(List<String> values) {
			addCriterion("cPsWorkTypeCode not in", values, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeBetween(String value1, String value2) {
			addCriterion("cPsWorkTypeCode between", value1, value2, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypecodeNotBetween(String value1, String value2) {
			addCriterion("cPsWorkTypeCode not between", value1, value2, "cpsworktypecode");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameIsNull() {
			addCriterion("cPsWorkTypeName is null");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameIsNotNull() {
			addCriterion("cPsWorkTypeName is not null");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameEqualTo(String value) {
			addCriterion("cPsWorkTypeName =", value, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameNotEqualTo(String value) {
			addCriterion("cPsWorkTypeName <>", value, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameGreaterThan(String value) {
			addCriterion("cPsWorkTypeName >", value, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameGreaterThanOrEqualTo(String value) {
			addCriterion("cPsWorkTypeName >=", value, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameLessThan(String value) {
			addCriterion("cPsWorkTypeName <", value, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameLessThanOrEqualTo(String value) {
			addCriterion("cPsWorkTypeName <=", value, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameLike(String value) {
			addCriterion("cPsWorkTypeName like", value, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameNotLike(String value) {
			addCriterion("cPsWorkTypeName not like", value, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameIn(List<String> values) {
			addCriterion("cPsWorkTypeName in", values, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameNotIn(List<String> values) {
			addCriterion("cPsWorkTypeName not in", values, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameBetween(String value1, String value2) {
			addCriterion("cPsWorkTypeName between", value1, value2, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktypenameNotBetween(String value1, String value2) {
			addCriterion("cPsWorkTypeName not between", value1, value2, "cpsworktypename");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameIsNull() {
			addCriterion("cPsWorkTypeRatioName is null");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameIsNotNull() {
			addCriterion("cPsWorkTypeRatioName is not null");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameEqualTo(String value) {
			addCriterion("cPsWorkTypeRatioName =", value, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameNotEqualTo(String value) {
			addCriterion("cPsWorkTypeRatioName <>", value, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameGreaterThan(String value) {
			addCriterion("cPsWorkTypeRatioName >", value, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameGreaterThanOrEqualTo(String value) {
			addCriterion("cPsWorkTypeRatioName >=", value, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameLessThan(String value) {
			addCriterion("cPsWorkTypeRatioName <", value, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameLessThanOrEqualTo(String value) {
			addCriterion("cPsWorkTypeRatioName <=", value, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameLike(String value) {
			addCriterion("cPsWorkTypeRatioName like", value, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameNotLike(String value) {
			addCriterion("cPsWorkTypeRatioName not like", value, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameIn(List<String> values) {
			addCriterion("cPsWorkTypeRatioName in", values, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameNotIn(List<String> values) {
			addCriterion("cPsWorkTypeRatioName not in", values, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameBetween(String value1, String value2) {
			addCriterion("cPsWorkTypeRatioName between", value1, value2, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andCpsworktyperationameNotBetween(String value1, String value2) {
			addCriterion("cPsWorkTypeRatioName not between", value1, value2, "cpsworktyperationame");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationIsNull() {
			addCriterion("fPsWorkTypeRation is null");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationIsNotNull() {
			addCriterion("fPsWorkTypeRation is not null");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationEqualTo(BigDecimal value) {
			addCriterion("fPsWorkTypeRation =", value, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationNotEqualTo(BigDecimal value) {
			addCriterion("fPsWorkTypeRation <>", value, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationGreaterThan(BigDecimal value) {
			addCriterion("fPsWorkTypeRation >", value, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("fPsWorkTypeRation >=", value, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationLessThan(BigDecimal value) {
			addCriterion("fPsWorkTypeRation <", value, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationLessThanOrEqualTo(BigDecimal value) {
			addCriterion("fPsWorkTypeRation <=", value, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationIn(List<BigDecimal> values) {
			addCriterion("fPsWorkTypeRation in", values, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationNotIn(List<BigDecimal> values) {
			addCriterion("fPsWorkTypeRation not in", values, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fPsWorkTypeRation between", value1, value2, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andFpsworktyperationNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fPsWorkTypeRation not between", value1, value2, "fpsworktyperation");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeIsNull() {
			addCriterion("cPSIncludedDepartmentCode is null");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeIsNotNull() {
			addCriterion("cPSIncludedDepartmentCode is not null");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeEqualTo(String value) {
			addCriterion("cPSIncludedDepartmentCode =", value, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeNotEqualTo(String value) {
			addCriterion("cPSIncludedDepartmentCode <>", value, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeGreaterThan(String value) {
			addCriterion("cPSIncludedDepartmentCode >", value, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeGreaterThanOrEqualTo(String value) {
			addCriterion("cPSIncludedDepartmentCode >=", value, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeLessThan(String value) {
			addCriterion("cPSIncludedDepartmentCode <", value, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeLessThanOrEqualTo(String value) {
			addCriterion("cPSIncludedDepartmentCode <=", value, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeLike(String value) {
			addCriterion("cPSIncludedDepartmentCode like", value, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeNotLike(String value) {
			addCriterion("cPSIncludedDepartmentCode not like", value, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeIn(List<String> values) {
			addCriterion("cPSIncludedDepartmentCode in", values, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeNotIn(List<String> values) {
			addCriterion("cPSIncludedDepartmentCode not in", values, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeBetween(String value1, String value2) {
			addCriterion("cPSIncludedDepartmentCode between", value1, value2, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentcodeNotBetween(String value1, String value2) {
			addCriterion("cPSIncludedDepartmentCode not between", value1, value2, "cpsincludeddepartmentcode");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameIsNull() {
			addCriterion("cPSIncludedDepartmentName is null");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameIsNotNull() {
			addCriterion("cPSIncludedDepartmentName is not null");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameEqualTo(String value) {
			addCriterion("cPSIncludedDepartmentName =", value, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameNotEqualTo(String value) {
			addCriterion("cPSIncludedDepartmentName <>", value, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameGreaterThan(String value) {
			addCriterion("cPSIncludedDepartmentName >", value, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameGreaterThanOrEqualTo(String value) {
			addCriterion("cPSIncludedDepartmentName >=", value, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameLessThan(String value) {
			addCriterion("cPSIncludedDepartmentName <", value, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameLessThanOrEqualTo(String value) {
			addCriterion("cPSIncludedDepartmentName <=", value, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameLike(String value) {
			addCriterion("cPSIncludedDepartmentName like", value, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameNotLike(String value) {
			addCriterion("cPSIncludedDepartmentName not like", value, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameIn(List<String> values) {
			addCriterion("cPSIncludedDepartmentName in", values, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameNotIn(List<String> values) {
			addCriterion("cPSIncludedDepartmentName not in", values, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameBetween(String value1, String value2) {
			addCriterion("cPSIncludedDepartmentName between", value1, value2, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andCpsincludeddepartmentnameNotBetween(String value1, String value2) {
			addCriterion("cPSIncludedDepartmentName not between", value1, value2, "cpsincludeddepartmentname");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyIsNull() {
			addCriterion("fPsEquipmentSubsidy is null");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyIsNotNull() {
			addCriterion("fPsEquipmentSubsidy is not null");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyEqualTo(BigDecimal value) {
			addCriterion("fPsEquipmentSubsidy =", value, "fpsequipmentsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyNotEqualTo(BigDecimal value) {
			addCriterion("fPsEquipmentSubsidy <>", value, "fpsequipmentsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyGreaterThan(BigDecimal value) {
			addCriterion("fPsEquipmentSubsidy >", value, "fpsequipmentsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("fPsEquipmentSubsidy >=", value, "fpsequipmentsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyLessThan(BigDecimal value) {
			addCriterion("fPsEquipmentSubsidy <", value, "fpsequipmentsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyLessThanOrEqualTo(BigDecimal value) {
			addCriterion("fPsEquipmentSubsidy <=", value, "fpsequipmentsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyIn(List<BigDecimal> values) {
			addCriterion("fPsEquipmentSubsidy in", values, "fpsequipmentsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyNotIn(List<BigDecimal> values) {
			addCriterion("fPsEquipmentSubsidy not in", values, "fpsequipmentsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fPsEquipmentSubsidy between", value1, value2, "fpsequipmentsubsidy");
			return (Criteria) this;
		}

		public Criteria andFpsequipmentsubsidyNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fPsEquipmentSubsidy not between", value1, value2, "fpsequipmentsubsidy");
			return (Criteria) this;
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table B_Person
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}