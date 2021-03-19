
//Wendy Fabiola Sandoval García
//19/03/21
//inicio: 7:44 am

package mx.com.softgame.poo1game.personajes;
public class Personaje{
	//atributos
	protected String nombre;
	protected int vida;
	private int Id;
	//constructor
	public Personaje (String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje (String nombre){
		this.nombre = nombre;
		vida = 3;
	}

	//metodos
	
	// agregar un metodo static y final getIdVida 
	public Personaje(int Id){
		this.Id = getId();
	}

	public boolean equals(Object o){
		boolean result = false;
		if ((o !=null) && (o instanceof Personaje)){
			Personaje x = (Personaje) o;
			if (nombre == x.nombre && vida == x.vida){
				result = true;
			}

		}
		return result;
	}

	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public String toString(){
		return (nombre + "\t" + vida); 
	}
	public void setNombre(String nombre){
		if (nombre.length() >= 3 && nombre.length() <=10){
			this.nombre = nombre;
		}
	}
	public boolean setVida(int vida){
		if (vida > 0 && vida < 101){
			this.vida = vida;
			return true;
		} else {
			return false;
		}
	}
	public void decVida(){
		decVida(1);
	}

	public void decVida(int resVida){
		if ((vida - resVida) > 0){
			vida = vida - resVida;
		}
	}

}
