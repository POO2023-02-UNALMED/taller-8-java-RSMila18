package futbol;

public class Portero extends Futbolista{

	public short golesRecibidos;
	public byte dorsal;
	
	public Portero() {
		super("Maradona",30,"Portero");
		// TODO Auto-generated constructor stub
	}
	
	public Portero(String name, int age, short point, byte dorsal) {
		super(name, age,"Portero" );
		this.golesRecibidos=point;
		this.dorsal=dorsal;
		// TODO Auto-generated constructor stub
	}
	
	public short getGolesRecibidos() {
		return golesRecibidos;
	}
	
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	
	public byte getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
	 public String toString() {
		 return super.toString()+" con el dorsal "+this.dorsal+". Le han marcado "+this.golesRecibidos;
    }
	 
	 public int compareTo(Object obj) {
		        Portero otroPortero = (Portero) obj;
		        return Math.abs(this.getGolesRecibidos() - otroPortero.getGolesRecibidos());}	    
	 public  boolean jugarConLasManos(){
		 return true;
	 }

}
