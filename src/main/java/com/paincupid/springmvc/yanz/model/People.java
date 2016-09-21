package com.paincupid.springmvc.yanz.model;

import java.math.BigDecimal;
import java.util.Date;

public class People {

	private String cpscode;
	private String cpsname;
	private String cpssex;
	private String cpsdepartmentcode;
	private String cpsdepartmentname;
	private Boolean bpsattendcheck;
	private String cpsnational;
	private String cpshdcode;
	private String cpsbankaccount;
	private String cpsemail;
	private String cpsphonenumber;
	private Date dpsbirthday;
	private Date dpshareday;
	private Date dpsfireday;
	private Boolean bpspiecework;
	private Boolean bpsregular;
	private Boolean bpsoperator;
	private String cpspassword;
	private String mpsauthority;
	private Double fpsselftimes;
	private Double fpspwtimes;
	private String cpspostcode;
	private String cpspostname;
	private Boolean bpsmanager;
	private Double fpsbasicsalary;
	private Double fpsyearsubsidy;
	private String cpstitlecode;
	private String cpstitlename;
	private Double fpstitlesubsidy;
	private Double fpshelthsubsidy;
	private Double fpsfixsubsidy1;
	private Double fpsfixsubsidy2;
	private Double fpsothersubsidy1;
	private Double fpsfree1;
	private String cpsfree2;
	private String cpseducationcode;
	private String cpseducationname;
	private String fpseducationsubsidy;
	private Double fpsperformancesalary;
	private Double fpsylbx;
	private Double fpssybx;
	private Double fpsyilbx;
	private Boolean bpsneedsalarycalculate;
	private String cpsworktypecode;
	private String cpsworktypename;
	private String cpsworktyperationame;
	private BigDecimal fpsworktyperation;
	private String cpsincludeddepartmentcode;
	private String cpsincludeddepartmentname;
	private BigDecimal fpsequipmentsubsidy;

	public String getCpscode() {
		return cpscode;
	}

	public void setCpscode(String cpscode) {
		this.cpscode = cpscode == null ? null : cpscode.trim();
	}

	public String getCpsname() {
		return cpsname;
	}

	public void setCpsname(String cpsname) {
		this.cpsname = cpsname == null ? null : cpsname.trim();
	}

	public String getCpssex() {
		return cpssex;
	}

	public void setCpssex(String cpssex) {
		this.cpssex = cpssex == null ? null : cpssex.trim();
	}

	public String getCpsdepartmentcode() {
		return cpsdepartmentcode;
	}

	public void setCpsdepartmentcode(String cpsdepartmentcode) {
		this.cpsdepartmentcode = cpsdepartmentcode == null ? null : cpsdepartmentcode.trim();
	}

	public String getCpsdepartmentname() {
		return cpsdepartmentname;
	}

	public void setCpsdepartmentname(String cpsdepartmentname) {
		this.cpsdepartmentname = cpsdepartmentname == null ? null : cpsdepartmentname.trim();
	}

	public Boolean getBpsattendcheck() {
		return bpsattendcheck;
	}

	public void setBpsattendcheck(Boolean bpsattendcheck) {
		this.bpsattendcheck = bpsattendcheck;
	}

	public String getCpsnational() {
		return cpsnational;
	}

	public void setCpsnational(String cpsnational) {
		this.cpsnational = cpsnational == null ? null : cpsnational.trim();
	}

	public String getCpshdcode() {
		return cpshdcode;
	}

	public void setCpshdcode(String cpshdcode) {
		this.cpshdcode = cpshdcode == null ? null : cpshdcode.trim();
	}

	public String getCpsbankaccount() {
		return cpsbankaccount;
	}

	public void setCpsbankaccount(String cpsbankaccount) {
		this.cpsbankaccount = cpsbankaccount == null ? null : cpsbankaccount.trim();
	}

	public String getCpsemail() {
		return cpsemail;
	}

	public void setCpsemail(String cpsemail) {
		this.cpsemail = cpsemail == null ? null : cpsemail.trim();
	}

	public String getCpsphonenumber() {
		return cpsphonenumber;
	}

	public void setCpsphonenumber(String cpsphonenumber) {
		this.cpsphonenumber = cpsphonenumber == null ? null : cpsphonenumber.trim();
	}

	public Date getDpsbirthday() {
		return dpsbirthday;
	}

	public void setDpsbirthday(Date dpsbirthday) {
		this.dpsbirthday = dpsbirthday;
	}

	public Date getDpshareday() {
		return dpshareday;
	}

	public void setDpshareday(Date dpshareday) {
		this.dpshareday = dpshareday;
	}

	public Date getDpsfireday() {
		return dpsfireday;
	}

	public void setDpsfireday(Date dpsfireday) {
		this.dpsfireday = dpsfireday;
	}

	public Boolean getBpspiecework() {
		return bpspiecework;
	}

	public void setBpspiecework(Boolean bpspiecework) {
		this.bpspiecework = bpspiecework;
	}

	public Boolean getBpsregular() {
		return bpsregular;
	}

	public void setBpsregular(Boolean bpsregular) {
		this.bpsregular = bpsregular;
	}

	public Boolean getBpsoperator() {
		return bpsoperator;
	}

	public void setBpsoperator(Boolean bpsoperator) {
		this.bpsoperator = bpsoperator;
	}

	public String getCpspassword() {
		return cpspassword;
	}

	public void setCpspassword(String cpspassword) {
		this.cpspassword = cpspassword == null ? null : cpspassword.trim();
	}

	public String getMpsauthority() {
		return mpsauthority;
	}

	public void setMpsauthority(String mpsauthority) {
		this.mpsauthority = mpsauthority == null ? null : mpsauthority.trim();
	}

	public Double getFpsselftimes() {
		return fpsselftimes;
	}

	public void setFpsselftimes(Double fpsselftimes) {
		this.fpsselftimes = fpsselftimes;
	}

	public Double getFpspwtimes() {
		return fpspwtimes;
	}

	public void setFpspwtimes(Double fpspwtimes) {
		this.fpspwtimes = fpspwtimes;
	}

	public String getCpspostcode() {
		return cpspostcode;
	}

	public void setCpspostcode(String cpspostcode) {
		this.cpspostcode = cpspostcode == null ? null : cpspostcode.trim();
	}

	public String getCpspostname() {
		return cpspostname;
	}

	public void setCpspostname(String cpspostname) {
		this.cpspostname = cpspostname == null ? null : cpspostname.trim();
	}

	public Boolean getBpsmanager() {
		return bpsmanager;
	}

	public void setBpsmanager(Boolean bpsmanager) {
		this.bpsmanager = bpsmanager;
	}

	public Double getFpsbasicsalary() {
		return fpsbasicsalary;
	}

	public void setFpsbasicsalary(Double fpsbasicsalary) {
		this.fpsbasicsalary = fpsbasicsalary;
	}

	public Double getFpsyearsubsidy() {
		return fpsyearsubsidy;
	}

	public void setFpsyearsubsidy(Double fpsyearsubsidy) {
		this.fpsyearsubsidy = fpsyearsubsidy;
	}

	public String getCpstitlecode() {
		return cpstitlecode;
	}

	public void setCpstitlecode(String cpstitlecode) {
		this.cpstitlecode = cpstitlecode == null ? null : cpstitlecode.trim();
	}

	public String getCpstitlename() {
		return cpstitlename;
	}

	public void setCpstitlename(String cpstitlename) {
		this.cpstitlename = cpstitlename == null ? null : cpstitlename.trim();
	}

	public Double getFpstitlesubsidy() {
		return fpstitlesubsidy;
	}

	public void setFpstitlesubsidy(Double fpstitlesubsidy) {
		this.fpstitlesubsidy = fpstitlesubsidy;
	}

	public Double getFpshelthsubsidy() {
		return fpshelthsubsidy;
	}

	public void setFpshelthsubsidy(Double fpshelthsubsidy) {
		this.fpshelthsubsidy = fpshelthsubsidy;
	}

	public Double getFpsfixsubsidy1() {
		return fpsfixsubsidy1;
	}

	public void setFpsfixsubsidy1(Double fpsfixsubsidy1) {
		this.fpsfixsubsidy1 = fpsfixsubsidy1;
	}

	public Double getFpsfixsubsidy2() {
		return fpsfixsubsidy2;
	}

	public void setFpsfixsubsidy2(Double fpsfixsubsidy2) {
		this.fpsfixsubsidy2 = fpsfixsubsidy2;
	}

	public Double getFpsothersubsidy1() {
		return fpsothersubsidy1;
	}

	public void setFpsothersubsidy1(Double fpsothersubsidy1) {
		this.fpsothersubsidy1 = fpsothersubsidy1;
	}

	public Double getFpsfree1() {
		return fpsfree1;
	}

	public void setFpsfree1(Double fpsfree1) {
		this.fpsfree1 = fpsfree1;
	}

	public String getCpsfree2() {
		return cpsfree2;
	}

	public void setCpsfree2(String cpsfree2) {
		this.cpsfree2 = cpsfree2 == null ? null : cpsfree2.trim();
	}

	public String getCpseducationcode() {
		return cpseducationcode;
	}

	public void setCpseducationcode(String cpseducationcode) {
		this.cpseducationcode = cpseducationcode == null ? null : cpseducationcode.trim();
	}

	public String getCpseducationname() {
		return cpseducationname;
	}

	public void setCpseducationname(String cpseducationname) {
		this.cpseducationname = cpseducationname == null ? null : cpseducationname.trim();
	}

	public String getFpseducationsubsidy() {
		return fpseducationsubsidy;
	}

	public void setFpseducationsubsidy(String fpseducationsubsidy) {
		this.fpseducationsubsidy = fpseducationsubsidy == null ? null : fpseducationsubsidy.trim();
	}

	public Double getFpsperformancesalary() {
		return fpsperformancesalary;
	}

	public void setFpsperformancesalary(Double fpsperformancesalary) {
		this.fpsperformancesalary = fpsperformancesalary;
	}

	public Double getFpsylbx() {
		return fpsylbx;
	}

	public void setFpsylbx(Double fpsylbx) {
		this.fpsylbx = fpsylbx;
	}

	public Double getFpssybx() {
		return fpssybx;
	}

	public void setFpssybx(Double fpssybx) {
		this.fpssybx = fpssybx;
	}

	public Double getFpsyilbx() {
		return fpsyilbx;
	}

	public void setFpsyilbx(Double fpsyilbx) {
		this.fpsyilbx = fpsyilbx;
	}

	public Boolean getBpsneedsalarycalculate() {
		return bpsneedsalarycalculate;
	}

	public void setBpsneedsalarycalculate(Boolean bpsneedsalarycalculate) {
		this.bpsneedsalarycalculate = bpsneedsalarycalculate;
	}

	public String getCpsworktypecode() {
		return cpsworktypecode;
	}

	public void setCpsworktypecode(String cpsworktypecode) {
		this.cpsworktypecode = cpsworktypecode == null ? null : cpsworktypecode.trim();
	}

	public String getCpsworktypename() {
		return cpsworktypename;
	}

	public void setCpsworktypename(String cpsworktypename) {
		this.cpsworktypename = cpsworktypename == null ? null : cpsworktypename.trim();
	}

	public String getCpsworktyperationame() {
		return cpsworktyperationame;
	}

	public void setCpsworktyperationame(String cpsworktyperationame) {
		this.cpsworktyperationame = cpsworktyperationame == null ? null : cpsworktyperationame.trim();
	}

	public BigDecimal getFpsworktyperation() {
		return fpsworktyperation;
	}

	public void setFpsworktyperation(BigDecimal fpsworktyperation) {
		this.fpsworktyperation = fpsworktyperation;
	}

	public String getCpsincludeddepartmentcode() {
		return cpsincludeddepartmentcode;
	}

	public void setCpsincludeddepartmentcode(String cpsincludeddepartmentcode) {
		this.cpsincludeddepartmentcode = cpsincludeddepartmentcode == null ? null : cpsincludeddepartmentcode.trim();
	}

	public String getCpsincludeddepartmentname() {
		return cpsincludeddepartmentname;
	}

	public void setCpsincludeddepartmentname(String cpsincludeddepartmentname) {
		this.cpsincludeddepartmentname = cpsincludeddepartmentname == null ? null : cpsincludeddepartmentname.trim();
	}

	public BigDecimal getFpsequipmentsubsidy() {
		return fpsequipmentsubsidy;
	}

	public void setFpsequipmentsubsidy(BigDecimal fpsequipmentsubsidy) {
		this.fpsequipmentsubsidy = fpsequipmentsubsidy;
	}
}