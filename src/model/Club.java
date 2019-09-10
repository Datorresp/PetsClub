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
public class Club {
    
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


    public void OrdenPorNombre(ArrayList<Client> cl){
        
        String msj = "";
        
        for (int i = 1; i < cl.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && cl.get(j).comparetoName(cl.get(j-1)) < 0) {
                
                Client tmp = cl.get(j);
                cl.set(j, cl.get(j-1));
                cl.set(j-1, tmp);
                j--;
            }
        }
    }
    
    public void OrdenarPorApellido(ArrayList<Client> cl){
        
        for (int i = 1; i < cl.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && cl.get(j).comparetoLastName(cl.get(j-1)) < 0) {
                
                Client tmp = cl.get(j);
                cl.set(j, cl.get(j-1));
                cl.set(j-1, tmp);
                j--;
            }
        }
    }
    
        
    public void OrdenarPorID(ArrayList<Client> cl){
        
        for (int i = 1; i < cl.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && cl.get(j).comparetoId(cl.get(j-1)) < 0) {
                
                Client tmp = cl.get(j);
                cl.set(j, cl.get(j-1));
                cl.set(j-1, tmp);
                j--;
            }
        }
    }
 
    public void OrdenarPorFavoritePet(ArrayList<Client> cl){
        
        for (int i = 1; i < cl.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && cl.get(j).comparetoFavoritePet(cl.get(j-1)) < 0) {
                
                Client tmp = cl.get(j);
                cl.set(j, cl.get(j-1));
                cl.set(j-1, tmp);
                j--;
            }
        }
    }   
            
    public void OrdenarPorEdad(ArrayList<Client> cl){
        
        for (int i = 1; i < cl.size() ; i++) {
            
            int j = i;
            
            while (j > 0 && cl.get(j).comparetoAge(cl.get(j-1)) < 0) {
                
                Client tmp = cl.get(j);
                cl.set(j, cl.get(j-1));
                cl.set(j-1, tmp);
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
                
                String line = br.readLine();
                
                while (line != null) {
                    
                    System.out.println(line);
                    
                    if (line.charAt(0) != '#') {
                        
                        String[] parts = line.split(sep);
                        String id = parts[6];
                        String name = parts[7];
                        String LastName = parts[8];
                        String favPet = parts[9];
                        String Birthdate = parts[10].substring(0, 8);
                        
                        Calendar ca = new GregorianCalendar(1, 2, 3);
                        Client cl = new Client(id, name, LastName, favPet.charAt(0), ca);
                        client.add(cl);
                        line = br.readLine();
                        
                    }
                }
            }else{
            
            throw new csvException();
            }
        }
    
}
