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
    
    public Club c;
    public Scanner reader;

    public Window() {
        
        reader = new Scanner(System.in);
        c = new Club("Club", "12312313");
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
            boolean exit = false;

            msj += "*****************************************************************************\n";
            msj += "********************* BIENVENIDO AL CLUB PARA MASCOTAS **********************\n";
            msj += "********************* Desarrollado por: Diego Torres P **********************\n";
            msj += "*********************** <torresprimero2001@gmail.com> ***********************\n";
            msj += "****************************** Universidad Icesi  ***************************\n";
            msj += "*****************************************************************************\n";

            msj += BannerSeparation();
            
            while (!exit) {
                
                
            }

            System.out.println(msj);
            
	}
        
}
