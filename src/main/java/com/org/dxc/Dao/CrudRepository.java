/**
 * 
 */
package com.org.dxc.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.dxc.Model.MatchDetails;


/**
 * @author skamsani2
 *
 */
public interface CrudRepository extends JpaRepository <MatchDetails,Integer> {

}
