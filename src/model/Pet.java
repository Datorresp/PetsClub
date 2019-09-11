package model;
 

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
        
     public int edad(){
            
            
        Calendar fecha = new GregorianCalendar();
        int anio = fecha.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        int month = fecha.get(Calendar.MONTH) - birthDate.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH) - birthDate.get(Calendar.DAY_OF_MONTH);

        if (month < 0 || (month == 0 &&  dia < 0 )) {

            anio--;
        }

        return anio;
    }
       
        
    public int comparetoId(Pet p){

        return id.compareTo(p.getId());
    }

    public int comparetoName(Pet p){

        return name.compareTo(p.getName());
    }

    public int comparetoType(Pet p){

        return type.compareTo(p.getType());
    }

    public int comparetoSex(Pet p){

        return Character.toString(sex).compareTo(Character.toString(p.getSex()));
    }
        
    public int comparetoAge(Pet p){
        
        return edad()-p.edad();
    }         
}
