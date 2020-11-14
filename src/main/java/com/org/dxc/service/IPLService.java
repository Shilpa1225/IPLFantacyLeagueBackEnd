/**
 * 
 */
package com.org.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dxc.Dao.CrudRepository;
import com.org.dxc.Model.MatchDetails;


/**
 * @author skamsani2
 *
 */
@Service
public class IPLService {
	@Autowired
	 CrudRepository dao;
	public List <MatchDetails> getAllMatches(){
	return dao.findAll();
		
	}
}
