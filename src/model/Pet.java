package model;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.Serializable;


/**
 *
 * @author diegoa.torres
 */
public class Pet implements Serializable{

    	private static final long serialVersionUID = 1L;
	private String id, name, type;
	private char sex;
	private int month;
	private int year;
	private int dayOfMonth;	
	Calendar birthDate = new GregorianCalendar(year, month, dayOfMonth);
	
	
	public Pet(String id, String name, char sex, String type, Calendar birthDate) {
		
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.type = type;
		this.birthDate = birthDate;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public char getSex() {
		return sex;
	}


	public void setSex(char sex) {
		this.sex = sex;
	}


	public Calendar getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}


	@Override
	public String toString() {
		return "Pet [id=" + id + ", name: " + name + ", type: " + type + ", sex: " + sex + ", birthDate: " + birthDate + "]";
	}
        
}
