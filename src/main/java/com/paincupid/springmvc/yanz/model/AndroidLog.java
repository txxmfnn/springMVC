package com.paincupid.springmvc.yanz.model;

import java.util.Date;

public class AndroidLog {

	private Integer iautoid;
	private String cuserid;
	private String cmacid;
	private String cfunction;
	private String cdescription;
	private String ctype;
	private String cmethod;
	private String cparams;
	private String ccreateby;
	private Date dcreatedate;
	private String crequestip;

	public Integer getIautoid() {
		return iautoid;
	}

	public void setIautoid(Integer iautoid) {
		this.iautoid = iautoid;
	}

	public String getCuserid() {
		return cuserid;
	}

	public void setCuserid(String cuserid) {
		this.cuserid = cuserid == null ? null : cuserid.trim();
	}

	public String getCmacid() {
		return cmacid;
	}

	public void setCmacid(String cmacid) {
		this.cmacid = cmacid == null ? null : cmacid.trim();
	}

	public String getCfunction() {
		return cfunction;
	}

	public void setCfunction(String cfunction) {
		this.cfunction = cfunction == null ? null : cfunction.trim();
	}

	public String getCdescription() {
		return cdescription;
	}

	public void setCdescription(String cdescription) {
		this.cdescription = cdescription == null ? null : cdescription.trim();
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype == null ? null : ctype.trim();
	}

	public String getCmethod() {
		return cmethod;
	}

	public void setCmethod(String cmethod) {
		this.cmethod = cmethod == null ? null : cmethod.trim();
	}

	public String getCparams() {
		return cparams;
	}

	public void setCparams(String cparams) {
		this.cparams = cparams == null ? null : cparams.trim();
	}

	public String getCcreateby() {
		return ccreateby;
	}

	public void setCcreateby(String ccreateby) {
		this.ccreateby = ccreateby == null ? null : ccreateby.trim();
	}

	public Date getDcreatedate() {
		return dcreatedate;
	}

	public void setDcreatedate(Date dcreatedate) {
		this.dcreatedate = dcreatedate;
	}

	public String getCrequestip() {
		return crequestip;
	}

	public void setCrequestip(String crequestip) {
		this.crequestip = crequestip == null ? null : crequestip.trim();
	}
}