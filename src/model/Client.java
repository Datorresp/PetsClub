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

    private static final long serialVersionUID = -1L;
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
        

    
    public int comparetoName(Client c){
            
        return name.compareTo(c.getName());
    }
            
    public int comparetoLastName(Client c){
            
        return lastName.compareTo(c.getLastName());
    }
            
    public int comparetoId(Client c){
            
        return id.compareTo(c.getId());
        
    }
    
    public int comparetoFavoritePet(Client c){
        
        return Character.toString(pet).compareTo(Character.toString(c.getPet()));
    }
    
    public int comparetoAge(Client c){
        
        return edad()-c.edad();
    }
    
    public Pet loadTextFile(String csv, String sep)throws IOException, csvException{
        
        Pet pet = null;
        
        if (csv != null) {

            File f = new File (csv);
            FileReader fr = new  FileReader(f);

            BufferedReader br = new BufferedReader(fr);

           String line = br.readLine();

           while (line != null) {

                System.out.println(line);

                if (line.charAt(0) != '#') {

                    String[] parts = line.split(sep);
                    String id = parts[5];
                    String name = parts[6];
                    String sex = parts[7];
                    String type = parts[8];
                    String age = parts[9].substring(0, 8);
                    Calendar ca = new GregorianCalendar(year, month, dayOfMonth);
                    Pet p  = new Pet(id, name, sex.charAt(0),type, ca);
                    
                    pets.add(p);
                    pet = p;
                    line = br.readLine();
                }
            }
        }else{
            
            throw new csvException();
        }
        
        return pet;
    }
    
    public void OrdenarPorID(){
        
        for (int i = 1; i < pets.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && pets.get(j).comparetoId(pets.get(j-1)) < 0) {
                
                Pet tmp = pets.get(j);
                pets.set(j, pets.get(j-1));
                pets.set(j-1, tmp);
                j--;
            }
        }
    }
    
    public void OrdenPorNombre(){
        
        String msj = "";
        
        for (int i = 1; i < pets.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && pets.get(j).comparetoName(pets.get(j-1)) < 0) {
                
                Pet tmp = pets.get(j);
                pets.set(j, pets.get(j-1));
                pets.set(j-1, tmp);
                j--;
            }
        }
    }
    
    public void OrdenPorTipo(){
        
        String msj = "";
        
        for (int i = 1; i < pets.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && pets.get(j).comparetoType(pets.get(j-1)) < 0) {
                
                Pet tmp = pets.get(j);
                pets.set(j, pets.get(j-1));
                pets.set(j-1, tmp);
                j--;
            }
        }
    }
    
    public void OrdenPorSexo(){
        
        String msj = "";
        
        for (int i = 1; i < pets.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && pets.get(j).comparetoSex(pets.get(j-1)) < 0) {
                
                Pet tmp = pets.get(j);
                pets.set(j, pets.get(j-1));
                pets.set(j-1, tmp);
                j--;
            }
        }
    }
    
}
