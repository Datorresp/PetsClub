package model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
/**
 *
 * @author diegoa.torres
 */
public class Club implements Comparable<Object>, Comparator<Object>{
    
    private String name;
    private String nit;

    private ArrayList <Client> client; 

    public Club(String name, String nit) {
            super();
            this.name = name;
            this.nit = nit;
            client = new ArrayList<Client>();
    }

    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getNit() {
            return nit;
    }

    public void setNit(String nit) {
            this.nit = nit;
    }

    public void addClient(Client e) {

            client.add(e);
    }

    public String addPet(String id, Pet e) {

            String msj =" ";

            for (int i = 0; i < client.size(); i++) {

                    if (client.get(i).getId().equals(id)) {

                            client.get(i).addPet(e);
                            msj += "La Mascota se añadio ";
                    }else {

                            msj += "No se encuentra el socio";

                    }
            }
            return msj + '\n';
    }

    public String ClientInfo(String id) {

            String msj = " ";

            for (int i = 0; i < client.size(); i++) {

                    if (client.get(i).getId().equals(id)) {

                            msj += client.get(i).toString() + '\n';
                    }else {

                            msj += "El cliente no existe" + '\n';
                    }
            }

            return msj + '\n';
    }

    public String petInfo(String idc, String idp) {

            String msj = " ";

            for (int i = 0; i < client.size(); i++) {

                    if (client.get(i).getId().equals(idc)) {

                            msj+=client.get(i).petInfo(idp);

                    } else {

                            msj += "La mascota o el cliente no existe";

                    }
            }

            return msj + '\n';
    }

    public int comparetoNit(Club c){

        return nit.compareTo(c.getNit());
    }

    public int comparetoName(Club c){

        return name.compareTo(c.getName());
    }

@Override
public String toString() {
    return "Club{" + "name=" + name + ", nit=" + nit + '}';
}


    public void OrdenPorNombre(){
        
        String msj = "";
        
        for (int i = 1; i < client.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && client.get(j).comparetoName(client.get(j-1)) < 0) {
                
                Client tmp = client.get(j);
                client.set(j, client.get(j-1));
                client.set(j-1, tmp);
                j--;
            }
        }
    }
    
    public void OrdenarPorApellido(){
        
        for (int i = 1; i < client.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && client.get(j).comparetoLastName(client.get(j-1)) < 0) {
                
                Client tmp = client.get(j);
                client.set(j, client.get(j-1));
                client.set(j-1, tmp);
                j--;
            }
        }
    }
    
        
    public void OrdenarPorID(){
        
        for (int i = 1; i < client.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && client.get(j).comparetoId(client.get(j-1)) < 0) {
                
                Client tmp = client.get(j);
                client.set(j, client.get(j-1));
                client.set(j-1, tmp);
                j--;
            }
        }
    }
 
    public void OrdenarPorFavoritePet(){
        
        for (int i = 1; i < client.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && client.get(j).comparetoFavoritePet(client.get(j-1)) < 0) {
                
                Client tmp = client.get(j);
                client.set(j, client.get(j-1));
                client.set(j-1, tmp);
                j--;
            }
        }
    }   
            
    public void OrdenarPorEdad(){
        
        for (int i = 1; i < client.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && client.get(j).comparetoAge(client.get(j-1)) < 0) {
                
                Client tmp = client.get(j);
                client.set(j, client.get(j-1));
                client.set(j-1, tmp);
                j--;
            }
        }
    }                 

    public int  buscarBinarioNombreS(String name){

        boolean encontro = false;
        int inicio = 0;
        int fin = client.size() -1;
        int persona = 0;

        while (inicio <= fin && !false) {

            int medio = (inicio + fin)/2;
            if (client.get(medio).comparetoName(client.get(0)) == client.get(medio).getName().compareTo(name)) {
                encontro = true;
            }else if (client.get(medio).comparetoName(client.get(0))  > client.get(medio).getName().compareTo(name)) {

                inicio = medio - 1;
            }else{

                inicio = medio + 1;
            }

            persona = medio;
        }

        return persona;
    }
        
    public int  buscarBinarioApellidoS(String LastName){

        boolean encontro = false;
        int inicio = 0;
        int fin = client.size() -1;
        int persona = 0;

        while (inicio <= fin && !false) {

            int medio = (inicio + fin)/2;
            if (client.get(medio).comparetoLastName(client.get(0)) == client.get(medio).getLastName().compareTo(LastName)) {
                encontro = true;
            }else if (client.get(medio).comparetoLastName(client.get(0)) > client.get(medio).getLastName().compareTo(LastName)) {

                inicio = medio - 1;
            }else{

                inicio = medio + 1;
            }

            persona = medio;
        }

        return persona;
    }

    public int  buscarBinarioIdS(String Id){

        boolean encontro = false;
        int inicio = 0;
        int fin = client.size() -1;
        int persona = 0;

        while (inicio <= fin && !false) {

            int medio = (inicio + fin)/2;
            if (client.get(medio).comparetoId(client.get(0)) == client.get(medio).getId().compareTo(Id)) {
                encontro = true;
            }else if (client.get(medio).comparetoId(client.get(0)) > client.get(medio).getId().compareTo(Id)) {

                inicio = medio - 1;
            }else{

                inicio = medio + 1;
            }

            persona = medio;
        }

        return persona;
    }
    public int  buscarBinarioEdadS(int age){

        boolean encontro = false;
        int inicio = 0;
        int fin = client.size() -1;
        int persona = 0;

        while (inicio <= fin && !false) {

            int medio = (inicio + fin)/2;
            if (client.get(medio).comparetoAge(client.get(0)) == (client.get(medio).edad() - age)) {
                encontro = true;
            }else if (client.get(medio).comparetoAge(client.get(0)) > (client.get(medio).edad() - age)) {

                inicio = medio - 1;
            }else{

                inicio = medio + 1;
            }

            persona = medio;
        }

        return persona;
    } 
    public int  buscarBinarioMascotaFav(String fav){

        boolean encontro = false;
        int inicio = 0;
        int fin = client.size() -1;
        int persona = 0;

        while (inicio <= fin && !false) {

            int medio = (inicio + fin)/2;
            if (client.get(medio).comparetoFavoritePet(client.get(0)) == Character.toString(client.get(medio).getPet()).compareTo(fav)) {
                encontro = true;
            }else if (client.get(medio).comparetoFavoritePet(client.get(0)) > Character.toString(client.get(medio).getPet()).compareTo(fav)) {

                inicio = medio - 1;
            }else{

                inicio = medio + 1;
            }

            persona = medio;
        }

        return persona; 
    }

    public void loadTextFile(String csv, String sep)throws IOException, csvException{
             
            if (csv != null) {
                
                File f = new File (csv);
                FileReader fr = new  FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                int i = 0;
                
                String line = br.readLine();
                
                while (line != null && client.size() > i) {
                    
                    System.out.println(line);
                    
                    if (line.charAt(0) != '#') {
                        
                        String[] parts = line.split(sep);
                        String id = parts[0];
                        String name = parts[1];
                        String LastName = parts[2];
                        String favPet = parts[3];
                        String Birthdate = parts[4].substring(0, 9);
                        String month = parts[4].substring(0, 1);
                        String day = parts[4].substring(3, 4);
                        String year = parts[4].substring(6, 9);
                        
                        
                       
                        Calendar ca = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month) + 1, Integer.parseInt(day));
                        Client cl = new Client(id, name, LastName, favPet.charAt(0), ca);
                        client.add(cl);
                        addPet(id, client.get(i).loadTextFile(csv, sep));                        
                        
                        String rutaFichero = "Socio.txt";

                        try{

                            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaFichero));
                            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaFichero));

                            oos.writeObject(cl);
                            oos.close();

                            Client readClient = (Client) ois.readObject();
                            ois.close();
                            System.out.println("Persona: " + cl.toString());

                        }catch (IOException ex) {

                            System.out.println(ex.getMessage());
                        }catch (ClassNotFoundException ex) {

                            System.out.println(ex.getMessage());
                        }
                        
                       
                        line = br.readLine();
                       i++; 
                    }
                }
            }else{
            
            throw new csvException();
            }
        }
    public String allClient(){
        
        String msj= "";
        
        for (int i = 0; i < client.size(); i++) {
            
            msj += client.get(i).toString();
            msj += "no";
        }
        
        return msj;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
