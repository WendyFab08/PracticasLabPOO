package mx.com.softgame.poolgame.personajes.buenos;
import mx.com.softgame.poolgame.personajes.personaje;
public class Planta extends Personajes{
   
    public char escudo;
    
    //constructores 
    public Planta(String nombre, int vida, char escudo){
        super(nombre,vida);
        this.escudo=escudo;
    }

    public Planta(String nombre, char escudo){
        this(nombre,3,escudo);
    }

    public Planta(String nombre, int vida){
       this(nombre,vida,'A');
    }

    public Planta(String nombre){
        this(nombre,3,'A');
    }

    // metodos
    public char getEscudo(){
    return escudo;
    }

    public String getDetalle(){
    return super.getDetalle() + "\t" + escudo;
    }

    public void decVida(){
        if (escudo == 'A'){
            super.decVida(2);
        }
        super.decVida();
    }

}