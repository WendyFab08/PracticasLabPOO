package mx.com.softgame.poo1game.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;
public class Planta extends Personaje{
	public char escudo;

	//costructores
	public Planta (String nombre, int vida, char escudo){
		super(nombre,vida);
		this.escudo = escudo;
	}

	public Planta (String nombre, char escudo){
		this(nombre,3,escudo);
	}
	public Planta (String nombre, int vida){
		this(nombre,vida,'A');
	}

	public Planta (String nombre){
		this(nombre,3,'A');
	}

	//metodos 
	public char getEscudo(){
		return escudo;
	}

	public String toString(){
		return super.toString() + "\t" + escudo;
	}

	public void decVida(){
		if (escudo == 'A'){
			super.decVida(2);
		}
		super.decVida();
	}

	public void decVida(int resVida){
		if (escudo == 'A'){
			super.decVida(resVida * 2);
		}
		super.decVida(resVida);
	}
}