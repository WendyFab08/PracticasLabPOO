package mx.com.softgame.poo1game.pruebapersonajes;
import mx.com.softgame.poo1game.personajes.*;
import mx.com.softgame.poo1game.buenos.*;
import mx.com.softgame.poo1game.malos.*;

public class PruebaHerencia{
	public static void main(String[] args) {
	

		Personaje personajes[] = 
		{new Personaje("Omar",99),
		 new Planta("Karen",50),
		 new Zombie("Hanna",80,false),
		 new Personaje("Omar",99), 
		 new Planta("Karen",50),
		 new Zombie("Hanna",80,false)};

		int i=0;
		while (i < personajes.length){

			for (Personaje p : personajes){
				if (personajes[i] == p){
					System.out.println("***" + personajes[i] + "identicos"
					 + "\t" + "son el mismo objeto");
				} else {
					System.out.println(personajes[i] + "!= " + p);
				}
				System.out.println("\t");
				if (personajes[i].equals(p)){
					System.out.println(personajes[i] + "\t" + "es igual a " +
					 p + " pero son diferentes objetos" );
				} else {
					System.out.println(personajes[i] + " != " + p);
				}
			} 

			i+=1;
			return;
		}
	}
}