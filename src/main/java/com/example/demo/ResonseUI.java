package com.example.demo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResonseUI {
	
	@JsonProperty(value = "Error")
	private String error;
	
	@JsonProperty(value = "TechNetAccessRestriction")
	private String techNetAccessRestriction;
	
	@JsonProperty(value = "TechNum")
	private String techNum;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getTechNetAccessRestriction() {
		return techNetAccessRestriction;
	}
	public void setTechNetAccessRestriction(String techNetAccessRestriction) {
		this.techNetAccessRestriction = techNetAccessRestriction;
	}
	public String getTechNum() {
		return techNum;
	}
	public void setTechNum(String techNum) {
		this.techNum = techNum;
	}
	
	
	@Override 
	public String toString() { 
		return  ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	}
	
	
	public ResonseUI(String error, String techNetAccessRestriction, String techNum) {
		super();
		this.error = error;
		this.techNetAccessRestriction = techNetAccessRestriction;
		this.techNum = techNum;
	}
	public ResonseUI() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
