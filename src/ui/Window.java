    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import model.*;
import java.util.*;

/**
 *
 * @author diegoa.torres
 */
public class Window {
    
    public Club cl;
    public Scanner reader;

    public Window() {
        
        reader = new Scanner(System.in);
        cl = new Club("Club", "12312313");
    }

    	public String BannerSeparation() {
		StringBuilder all = new StringBuilder();
		all.append("\n");
		int ancho = 17;
		for (int a = 1; a <= 4; a++) {
			int cantidadAsteriscos = ancho - a;
			int cantidadEspacios = ancho - cantidadAsteriscos;
			int cantidadSlashes = (ancho - a) * 2;
			int cantidadDeBackSlashes = (a - 1) * 2;
			appendChars(all, '*', cantidadAsteriscos);
			appendChars(all, ' ', cantidadEspacios);
			appendChars(all, '/', cantidadSlashes);
			appendChars(all, '\\', cantidadDeBackSlashes);
			appendChars(all, ' ', cantidadEspacios);
			appendChars(all, '*', cantidadAsteriscos);
			all.append("\n");
		}

		for (int a = 4; a >= 1; a--) {
			int cantidadAsteriscos = ancho - a;
			int cantidadEspacios = ancho - cantidadAsteriscos;
			int cantidadDeBackSlashes = (ancho - a) * 2;
			int cantidadSlashes = (a - 1) * 2;
			appendChars(all, '*', cantidadAsteriscos);
			appendChars(all, ' ', cantidadEspacios);
			appendChars(all, '/', cantidadSlashes);
			appendChars(all, '\\', cantidadDeBackSlashes);
			appendChars(all, ' ', cantidadEspacios);
			appendChars(all, '*', cantidadAsteriscos);
			all.append("\n");
		}
		all.append("\n");
		return all.toString();
	}
    
    	public void appendChars(StringBuilder sb, char c, int count) {
		for (int i = 0; i < count; i++) {
			sb.append(c);
		}
	}
        
        public int menuJuego(){
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

            msj += BannerSeparation();
            
            menufuncion();

            System.out.println(msj);
            
	}
        
        public void menufuncion(){
            
            boolean salir = false;

		while (!salir) {
			
			int userImput = menuJuego();
                        
                        switch (userImput) {
                        case 1:
                            addClient();
                            try {
  				Thread.sleep(3000);
                            } catch (InterruptedException e) {

                            }
                            break;
                        
                        case 2:
                            addPet();
                            
                            try {
  				Thread.sleep(3000);
                            } catch (InterruptedException e) {

                            }
                        
                        default:
                            throw new AssertionError();
                    }
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
                    
            cl.addClient(e);
        }
        
        public void addPet(){
            
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
            
            Calendar cal = new GregorianCalendar(year, month, day);
            
            Pet p = new Pet(id, name, sex, type, cal);
                    
            cl.addPet(idc, p);
        }
        
}
