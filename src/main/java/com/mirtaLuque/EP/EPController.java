package com.mirtaLuque.EP;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EPController {
	
	@Autowired
	private EpService epService;
	
	@RequestMapping("/ep")
	public List<EP> getAllEps(){
		return epService.getAllEps();
	}
	
	@RequestMapping("/ep/{id}")
	public Optional<EP> getEp(@PathVariable int id) {
		return epService.getEp(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value =  "/ep")
	public void addEp(@RequestBody EP ep) {
		epService.addEp(ep);
	}

	@RequestMapping(method = RequestMethod.PUT, value =  "/ep/{id}")
	public void updateEp(@RequestBody EP ep) {
		epService.addEp(ep);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/ep/{id}") 
	public void deleteEp(@PathVariable int id) {
		epService.deleteEp(id);
		
	}

}
