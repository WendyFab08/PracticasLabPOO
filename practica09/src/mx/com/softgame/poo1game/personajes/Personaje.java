//Wendy Fabiola Sandoval García
//5-marzo-21
//inicio: 7:44
//Herencia y arreglos
package mx.com.softgame.poo1game.personajes;
public class Personaje{
	//atributos
	private String nombre;
	private int vida;
	//constructor
	public Personaje (String nombre, int vida){
		this.nombre = nombre;
		this.vida = vida;
	}
	public Personaje (String nombre){
		this(nombre,3);
	}

	//metodos

	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public String getDetalle(){
		return (nombre + "\t" + vida); 
	}
	public void setNombre(String nombre){
		if ((nombre.length()) >= 3 && (nombre.length()) <=10){
			this.nombre = nombre;
		}
	}
	public boolean setVida(int vida){
		boolean inicio = false;
		if (vida > 0 && vida < 100 ){
			this.vida = vida;
			inicio = true;
		}
		return inicio;
	}
public void decVida(){
	if (vida!=0 && vida>0){
		vida -=1;
	}
}

public void decVida(int a){
	if ((vida!=0 && vida>0) && ((vida-a)>=0)) {
		vida -= a;
	}
}

	public void saludar(){
		System.out.println("Hola Alumno de POO " + nombre);
	}
}
