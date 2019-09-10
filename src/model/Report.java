
package model;

import java.util.*;

/**
 *
 * @author diegoa.torres
 */
public class Report {
    
    

    public Report() {
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
}
