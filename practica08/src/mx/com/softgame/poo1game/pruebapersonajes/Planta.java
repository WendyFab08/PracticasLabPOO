package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.*;

public class Planta extends Personaje{
    private char escudo;

    public Planta(String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, char escudo){
        super(nombre, 3)
    }
}