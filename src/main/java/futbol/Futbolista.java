package futbol;

public abstract class Futbolista implements Comparable<Object>{
	
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}
	public Futbolista( String name,int age, String position) {
		this.nombre = name;
		this.edad = age;
		this.posicion = position;		
	}
	
	public boolean equals (Futbolista gamer) {
		return this == gamer;
	}
	
	public int compareTo(Object obj){
	       return 0;		
	}
	
	public abstract boolean jugarConLasManos();
		
	public String toString() {
		return "El futbolista "+this.getNombre()+" tiene " +this.getEdad()+", y juega de "+this.getPosicion();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String name) {
		this.nombre = name;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setNombre(int age) {
		this.edad = age;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
}
