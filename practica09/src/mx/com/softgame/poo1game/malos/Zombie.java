package mx.com.softgame.poo1game.malos;
import mx.com.softgame.poo1game.personajes.Personaje;

public class Zombie extends Personaje{

	public boolean ataque;

	//constructores

	public Zombie ( String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}

	public Zombie(String nombre, boolean ataque){
		this(nombre,3,ataque);
	}
	public Zombie(String nombre){
		this(nombre,3,false);
	}
	//Metodos

	public boolea equals(Object o){
		boolean result = super.equals(o);
		if(o !=null && instanceof Zombie){
			Zombie xy = (Zombie) o;
			if (nombre.equals(xy) && ataque == xy ataque){
				result = true;
			}
		}
		return result;
	}
	public boolean getAtaque(){
		return ataque;
	}

	public String toString(){
		return super.toString() + "\t" + ataque;
	}

	public void decVida(){
		if (!ataque){
			super.decVida(3);
		}
		super.decVida(2);
	}

	public void decVida(int resVida){
		if (!ataque){
			super.decVida(resVida * 3);
		}
		super.decVida(resVida *2);
	}
}