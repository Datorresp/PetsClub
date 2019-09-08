    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import model.*;
import java.util.*;

/**
 *
 * @author diegoa.torres
 */
public class Window {
    
    public ArrayList <Club> cl;
    public Scanner reader;

    public Window() {

        cl = new ArrayList<Club>();
        reader = new Scanner(System.in);
        cl.add(new Club("JAJAJA LOL", "123456789"));
        
        
    }
    
        public void addClub(Club c){
            
            cl.add(c);
        }
        
        
        public void addClubs(){
            
            System.out.println('\n');
            System.out.println("Dijite el nombre del club");
            
            String name = reader.nextLine();
            
            System.out.println('\n');
            System.out.println("Dijite el nit del nit");
            
            String nit = reader.nextLine();
            
            Club c = new Club(name, nit);
            addClub(c);
        }
        
        public int binarySearchClub(String nit){
            
            int club = 0;
            boolean encontrar = false;
            int inicio= 0;
            int fin  = cl.size() -1;
            
            while (inicio <= fin && !encontrar) {
                
                int medio = (inicio + fin)/2;
                if (cl.get(medio).getNit().compareTo(nit)==0 ) {
                    
                    encontrar = true;
                    club = medio;
                    System.out.println(" El club es: " + cl.get(club).toString());
                    
                }else if(cl.get(medio).getNit().compareTo(nit)>0 ){
                    
                    fin = medio - 1;
                    
                }else{
                    
                    inicio = medio + 1;
                }
            }
            
            return club;
        }
        
               public int primerMenu(){
            
            System.out.println("Seleccione una opcion");
            System.out.println("1. Crear un club ");
            System.out.println("2. entrar a club ");
            
            int valor = reader.nextInt();
		reader.nextLine();			
		return valor;
        }
        
        public void clubfuncion(){
            
            boolean salir = false;
            
            while (!salir) {
                
                int inputClub =primerMenu();
                
                switch (inputClub) {
                    case 1:
                        
                        addClubs();
                    
                    case 2:
                        
                        chooseClub();
                        menufuncion();
                        
                        break;
                    default:
                        salir = true;
                }
            }
        }
        
        public int chooseClub(){
            
            int finalscore = 0;

		System.out.println("Por favor elija el club: ");
		System.out.println("Digite el nit ");
			
		String seleccion = reader.nextLine();
                
                finalscore = binarySearchClub(seleccion);
 
            return finalscore;
        }
     
 
              
        public int menuClub(){
            System.out.println("Seleccione una opcion");
            System.out.println("1. Crear un socio ");
            System.out.println("2. Crear una mascota ");
            System.out.println("3. Ver modulo de reportes ");
            System.out.println("4. Salir ");

		int valor = reader.nextInt();
		reader.nextLine();			
		return valor;
	}
        
        public void banner() {

            String msj = "";
            

            msj += "*****************************************************************************\n";
            msj += "********************* BIENVENIDO AL CLUB PARA MASCOTAS **********************\n";
            msj += "********************* Desarrollado por: Diego Torres P **********************\n";
            msj += "*********************** <torresprimero2001@gmail.com> ***********************\n";
            msj += "****************************** Universidad Icesi  ***************************\n";
            msj += "*****************************************************************************\n";


            System.out.println(msj);
            fichero();
            clubfuncion();          
	}
        
        public void menufuncion(){
            
            try{
            boolean salir = false;

		while (!salir) {
			
			int userImput = menuClub();
                        
                        switch (userImput) {
                        case 1:
                            addClient();
                            try {
  				Thread.sleep(1500);
                            } catch (InterruptedException e) {

                            }
                            break;
                        
                        case 2:
                            addPet();
                            
                            try {
  				Thread.sleep(1500);
                            } catch (InterruptedException e) {

                            }
                            break;
                        
                        default:
                            salir = true;
                    }
                }
            }catch (InputMismatchException ex) {
               System.out.println("Dato Erroneo vuelva a escribirlo");
                
                reader.nextLine();
            }

        }
        
        public void addClient(){
            
            System.out.println('\n');
            System.out.println("Dijite el nombre del asociado");
            
            String name = reader.nextLine();
            
            System.out.println('\n');
            System.out.println("Dijite el apellido del asociado");
            
            String lastName = reader.nextLine();
            
            System.out.println('\n');
            System.out.println("Dijite el id del asociado");
            
            String id = reader.nextLine();
            
            System.out.println('\n');
            System.out.println("Dijite el tipo de mascota favorita del asociado");
            char type = reader.nextLine().charAt(0);
            
            
            System.out.println("\n");
            System.out.println("Ingrese el dia de nacimiento del asociado");

            int day = reader.nextInt();
            reader.nextLine();
            
            System.out.println("\n");
            System.out.println("Ingrese el mes de nacimiento del asociado");

            int month = reader.nextInt();
            reader.nextLine();
            
            System.out.println("\n");
            System.out.println("Ingrese el anio de nacimiento del asociado");

            int year = reader.nextInt();
            reader.nextLine();
            
            Calendar cal = new GregorianCalendar(year, month, day);
            
            Client e = new Client(id, name, lastName, type, cal);
                    
            cl.get(chooseClub()).addClient(e);
            
            String rutaFichero = "/Users/diegoa.torres/Documents/Socio.rtf";
            
            try{
                
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaFichero));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaFichero));
                
                oos.writeObject(e);
                oos.close();
                
                Client readClient = (Client) ois.readObject();
                ois.close();
                
            }catch (IOException ex) {
                
                System.out.println(ex.getMessage());
            }catch (ClassNotFoundException ex) {
                
                System.out.println(ex.getMessage());
            }
        }
        
        public void addPet(){
            
            try{
            
                System.out.println('\n');
                System.out.println("Dijite el id del dueno");

                String id = reader.nextLine();


                System.out.println('\n');
                System.out.println("Dijite el nombre de la mascota");

                String name = reader.nextLine();


                System.out.println('\n');
                System.out.println("Dijite el id de la mascota");

                String idc = reader.nextLine();

                System.out.println('\n');
                System.out.println("Dijite el sexo de la mascota");
                char sex = reader.nextLine().charAt(0);

                System.out.println('\n');
                System.out.println("Dijite el tipo de  mascota");

                String type = reader.nextLine();


                System.out.println("\n");
                System.out.println("Ingrese el dia de nacimiento de la mascota");

                int day = reader.nextInt();
                reader.nextLine();

                System.out.println("\n");
                System.out.println("Ingrese el mes de nacimiento de la mascota");

                int month = reader.nextInt();
                reader.nextLine();

                System.out.println("\n");
                System.out.println("Ingrese el anio de nacimiento de la mascota");

                int year = reader.nextInt();
                reader.nextLine();

                Calendar cal = new GregorianCalendar(year, month+1, day);

                Pet p = new Pet(id, name, sex, type, cal);

                cl.get(chooseClub()).addPet(id, p);

                String rutaFichero = "/Users/diegoa.torres/Documents/Objetos.rtf";         

                try{

                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaFichero));
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaFichero));

                    oos.writeObject(p);
                    oos.close();

                    Pet readClient = (Pet) ois.readObject();
                    ois.close();

                }catch (IOException ex) {

                    System.out.println(ex.getMessage());
                }catch (ClassNotFoundException ex) {

                    System.out.println(ex.getMessage());
                }
            }catch (InputMismatchException ex) {
                
                System.out.println("Dato Erroneo vuelva a escribirlo");
                
                reader.nextLine();
            }
            
        }
                    
        
        
        public void fichero(){
            
            String rutaFichero = "/Users/diegoa.torres/Documents/Objetos.rtf";
            Calendar cal = new GregorianCalendar(2001, 13, 14);
            Client c  = new Client("1193254110",  "Diego", "Torres", 'P', cal);
            
            try{
                
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaFichero));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaFichero));
                
                oos.writeObject(c);
                oos.close();
                
                Client readClient = (Client) ois.readObject();
                ois.close();
                
                System.out.println("Persona Escrita: " + c);
                System.out.println("Persona leida" + readClient);
            }catch (IOException ex) {
                
                System.out.println(ex.getMessage());
            }catch (ClassNotFoundException ex) {
                
                System.out.println(ex.getMessage());
            }
            
        }
        
}
