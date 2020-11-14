/**
 * 
 */
package com.org.dxc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dxc.Model.MatchDetails;
import com.org.dxc.service.IPLService;

/**
 * @author skamsani2
 *
 */
@RestController
@RequestMapping("/web")
@CrossOrigin(origins="http://localhost:4200")
public class WebController {
	
	@Autowired
	private IPLService service;
	
	
@GetMapping("/match")
public List<MatchDetails> getAllMatches(){
List <MatchDetails> matchdetails=new ArrayList <MatchDetails>();
return matchdetails;
		
	}
}