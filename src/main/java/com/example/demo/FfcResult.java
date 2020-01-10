package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfcResult {
	
	@JsonProperty(value = "fulfillmentCenter")
	private String fulfillmentCenter;
	private List<String> SuccessfullyDisabledTechNum = new ArrayList<>();
	private List<String> InvalidTechNum = new ArrayList<>();
	
	
	public String getFulfillmentCenter() {
		return fulfillmentCenter;
	}
	public void setFulfillmentCenter(String fulfillmentCenter) {
		this.fulfillmentCenter = fulfillmentCenter;
	}
	public List<String> getSuccessfullyDisabledTechNum() {
		return SuccessfullyDisabledTechNum;
	}
	public void setSuccessfullyDisabledTechNum(List<String> successfullyDisabledTechNum) {
		SuccessfullyDisabledTechNum = successfullyDisabledTechNum;
	}
	public List<String> getInvalidTechNum() {
		return InvalidTechNum;
	}
	public void setInvalidTechNum(List<String> invalidTechNum) {
		InvalidTechNum = invalidTechNum;
	}
	
}
