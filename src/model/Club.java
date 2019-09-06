package model;
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

    @Override
    public String toString() {
        return "Club{" + "name=" + name + ", nit=" + nit + '}';
    }
        
            
}
