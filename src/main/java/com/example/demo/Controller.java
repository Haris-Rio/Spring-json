package com.example.demo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
public class Controller {
	
	@RequestMapping(value="/techie", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<FfcResult>> getTechDetail() throws IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		List<TechDetail> techDetail = objectMapper.readValue(new File("src/main/resources/techs.JSON"), new TypeReference<List<TechDetail>>(){});
		List<String> invalidList = new ArrayList<>();
		List<String> successList = new ArrayList<>();
		
		List<FfcResult> ffcList = new ArrayList<FfcResult>();
		
		
		for(TechDetail i:techDetail){
			FfcResult ffcResult = new FfcResult();
			String fc = i.getFulFillmentCenter();
			ffcResult.setFulfillmentCenter(fc);
			System.out.println("Fulfillment Center: "+fc);
			List<ResonseUI> resList = i.getResonseUI();
			for(ResonseUI response:resList) {
				if(StringUtils.isNotBlank(response.getError())) {
					invalidList.add(response.getTechNum());
					//invalidList.add(response.getError());
				}
				else {
					successList.add(response.getTechNum());
				}
			}
			ffcResult.setInvalidTechNum(invalidList);
			ffcResult.setSuccessfullyDisabledTechNum(successList);
			ffcList.add(ffcResult);
		
}
		return new ResponseEntity<List<FfcResult>>(ffcList,HttpStatus.OK);
}
}
