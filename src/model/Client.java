package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author diegoa.torres
 */
public  class Client implements Serializable{

    
    	private String id, name, lastName;
        private char pet;
	private int year;
	private int month;
	private int dayOfMonth;
	private ArrayList <Pet> pets; 
	
	Calendar cal = new GregorianCalendar(year, month, dayOfMonth);

    /**
     *
     * @param id
     * @param name
     * @param lastName
     * @param pet
     * @param cal
     */
    public Client(String id, String name, String lastName, char pet, Calendar cal) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.pet = pet;
		this.cal = cal;
		pets = new ArrayList<Pet>();
	}
	
    /**
     *
     * @return
     */
    public String getId() {
		return id;
	}
	
    /**
     *
     * @param id
     */
    public void setId(String id) {
		this.id = id;
	}
	
    /**
     *
     * @return
     */
    public String getName() {
		return name;
	}
	
    /**
     *
     * @param name
     */
    public void setName(String name) {
		this.name = name;
	}
	
    /**
     *
     * @return
     */
    public String getLastName() {
		return lastName;
	}
	
    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
    /**
     *
     * @return
     */
    public char getPet() {
		return pet;
	}
	
    /**
     *
     * @param pet
     */
    public void setPet(char pet) {
		this.pet = pet;
	}
	
    /**
     *
     * @return
     */
    public Calendar getCal() {
		return cal;
	}
	
    /**
     *
     * @param cal
     */
    public void setCal(Calendar cal) {
		this.cal = cal;
	}
	
    /**
     *
     * @param pet
     */
    public void addPet(Pet pet) {
		
		pets.add(pet);
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", lastName=" + lastName + ", fav pet=" + pet + ", years=" + edad() + "]";
	}
	
    /**
     *
     * @param id
     * @return
     */
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
        
    /**
     *
     * @return
     */
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
        
    /**
     *
     * @param csv
     * @param sep
     * @throws IOException
     * @throws csvException
     */
    public void loadTextFile(String csv, String sep)throws IOException, csvException{
             
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
    
            public int comparetoName(Client c){
            
            return name.compareTo(c.getName());
        }
            
            public int comparetoLastName(Client c){
            
            return lastName.compareTo(c.getLastName());
        }
            
            public int comparetoId(Client c){
            
            return id.compareTo(c.getId());
        }        
}
