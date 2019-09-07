package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author diegoa.torres
 */
public class Client {

    	private String id, name, lastName;
	private char pet;
	private int year;
	private int month;
	private int dayOfMonth;
	private ArrayList <Pet> pets; 
	
	Calendar cal = new GregorianCalendar(year, month, dayOfMonth);
	public Client(String id, String name, String lastName, char pet, Calendar cal) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.pet = pet;
		this.cal = cal;
		pets = new ArrayList<Pet>();
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
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public char getPet() {
		return pet;
	}
	
	public void setPet(char pet) {
		this.pet = pet;
	}
	
	public Calendar getCal() {
		return cal;
	}
	
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	
	
	public void addPet(Pet pet) {
		
		pets.add(pet);
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", lastName=" + lastName + ", fav pet=" + pet + ", years=" + edad() + "]";
	}
	
	public String petInfo(String id) {
		
		String msj = " ";
		for (int i = 0; i < pets.size(); i++) {
			
			if (pets.get(i).getId().equals(id)) {
				
				msj += pets.get(i).toString();
			}else {
				msj += "La mascota no existe";
			}
		}
		
		return msj;
	}
        
        public int edad(){
            
            
            Calendar fecha = new GregorianCalendar();
            int anio = fecha.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
            int month = fecha.get(Calendar.MONTH) - cal.get(Calendar.MONTH);
            int dia = fecha.get(Calendar.DAY_OF_MONTH) - cal.get(Calendar.DAY_OF_MONTH);
            
            if (month < 0 || (month == 0 &&  dia < 0 )) {
                
                anio--;
            }
             
            return anio;
        }
        
        public void loadTextFile(String csv, String sep)throws IOException{
             
            if (csv != null) {
                
                File f = new File (csv);
                FileReader fr = new  FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                
                String line = br.readLine();
                
                while (line != null) {
                    
                    System.out.println(line);
                    
                    if (line.charAt(0) != '#') {
                        
                        String[] parts = line.split(sep);
                        
                    }
                }
            }
        }
}
