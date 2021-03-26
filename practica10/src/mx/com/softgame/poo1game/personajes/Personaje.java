
//Wendy Fabiola Sandoval García
<<<<<<< HEAD
//19/03/21
//inicio: 7:44 am

package mx.com.softgame.poo1game.personajes;
import mx.com.softgame.poo1game.utils.*;
=======
//12/03/21
//inicio: 7:44

package mx.com.softgame.poo1game.personajes;
>>>>>>> 45a3b0a1c6a7e79f6b7812d2afee14547931c846
public class Personaje{
	//atributos
	protected String nombre;
	protected int vida;
<<<<<<< HEAD
	private final int id = 0;
	//constructor

=======
	//constructor
>>>>>>> 45a3b0a1c6a7e79f6b7812d2afee14547931c846
	public Personaje (String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje (String nombre){
		this.nombre = nombre;
		vida = 3;
	}
<<<<<<< HEAD
	//metodos
	// agregar un metodo static y final getIdVida 

	
	public final String getIdVida(){
		return ("id" + "vida");
	}
	public Personaje(int id){ 
		this.id = id;
	}
=======

	//metodos
	//agregar el metodo equals
>>>>>>> 45a3b0a1c6a7e79f6b7812d2afee14547931c846

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
<<<<<<< HEAD
		return (id + nombre + "\t" + vida); 
=======
		return (nombre + "\t" + vida); 
>>>>>>> 45a3b0a1c6a7e79f6b7812d2afee14547931c846
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
