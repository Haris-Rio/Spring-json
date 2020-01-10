package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TechDetail {
	
	@JsonProperty(value = "fulfillmentCenter")
	private String fulFillmentCenter;
	
	@JsonProperty(value = "ntId")
	private String ntId;
	
	@JsonProperty(value = "msoUniqueId")
	private String msoUniqueId;
	
	@JsonProperty(value = "techId")
	private String techId;
	
	private List<ResonseUI> resonseUI = new ArrayList<>();
	
	public String getFulFillmentCenter() {
		return fulFillmentCenter;
	}
	public void setFulFillmentCenter(String fulFillmentCenter) {
		this.fulFillmentCenter = fulFillmentCenter;
	}
	public String getNtId() {
		return ntId;
	}
	public void setNtId(String ntId) {
		this.ntId = ntId;
	}
	public String getMsoUniqueId() {
		return msoUniqueId;
	}
	public void setMsoUniqueId(String msoUniqueId) {
		this.msoUniqueId = msoUniqueId;
	}
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	
	public List<ResonseUI> getResonseUI() {
		return resonseUI;
	}
	public void setResonseUI(List<ResonseUI> resonseUI) {
		this.resonseUI = resonseUI;
	}

	@Override 
	public String toString() { 
		return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
	 
	}
	
	
	
	
}
