package com.springboot.manageroles.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "advcriteria")
public class AdvCriteria {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private String advcid;
	private String permissionid;
	private String roleid;
	private String criterianame;
	private String operation;
	private String criteriavalue;
	private String function;
	
	
	public AdvCriteria() {
		super();
	}

	public AdvCriteria(String advcid, String permissionid, String roleid, String criterianame, String operation,
			String criteriavalue, String function) {
		super();
		this.advcid = advcid;
		this.permissionid = permissionid;
		this.roleid = roleid;
		this.criterianame = criterianame;
		this.operation = operation;
		this.criteriavalue = criteriavalue;
		this.function = function;
	}

	public String getAdvcid() {
		return advcid;
	}

	public void setAdvcid(String advcid) {
		this.advcid = advcid;
	}

	public String getPermissionid() {
		return permissionid;
	}

	public void setPermissionid(String permissionid) {
		this.permissionid = permissionid;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getCriterianame() {
		return criterianame;
	}

	public void setCriterianame(String criterianame) {
		this.criterianame = criterianame;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getCriteriavalue() {
		return criteriavalue;
	}

	public void setCriteriavalue(String criteriavalue) {
		this.criteriavalue = criteriavalue;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
	
}
