/**
 * 
 */
package com.org.dxc.Model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author skamsani2
 *
 */
@Entity
@Table(name="match_details1")
public class MatchDetails{
@Id
@GenericGenerator(name="auto",strategy="increment")
@GeneratedValue(generator="auto")
private int id;
private String Team1;
 private String Team2;
 private String Winner;
private String Status;
private String Stadium;
private Time time;
private Date date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTeam1() {
	return Team1;
}
public void setTeam1(String team1) {
	Team1 = team1;
}
public String getTeam2() {
	return Team2;
}
public void setTeam2(String team2) {
	Team2 = team2;
}
public String getWinner() {
	return Winner;
}
public void setWinner(String winner) {
	Winner = winner;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public String getStadium() {
	return Stadium;
}
public void setStadium(String stadium) {
	Stadium = stadium;
}
public Time getTime() {
	return time;
}
public void setTime(Time time) {
	this.time = time;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "MatchDetails [id=" + id + ", Team1=" + Team1 + ", Team2=" + Team2 + ", Winner=" + Winner + ", Status="
			+ Status + ", Stadium=" + Stadium + ", time=" + time + ", date=" + date + "]";
}
public MatchDetails(int id, String team1, String team2, String winner, String status, String stadium, Time time,
		Date date) {
	super();
	this.id = id;
	Team1 = team1;
	Team2 = team2;
	Winner = winner;
	Status = status;
	Stadium = stadium;
	this.time = time;
	this.date = date;
}
public MatchDetails() {
	super();
	// TODO Auto-generated constructor stub
}



}
