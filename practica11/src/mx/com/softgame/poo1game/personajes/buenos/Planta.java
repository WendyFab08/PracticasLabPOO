package mx.com.softgame.poo1game.personajes.buenos;
import mx.com.softgame.poo1game.personajes.Personaje;
import mx.com.softgame.poo1game.personajes.malos.Zombie;

public class Planta extends Personaje{
    private char escudo;
    public Planta(String nombre,int vida,char escudo){
        super(nombre,vida);
        this.escudo = escudo;
    }
    public Planta(String nombre,char escudo){
        this(nombre,3,escudo);
    }
    public Planta(String nombre,int vida){
        this(nombre,vida,'A');
    }
    public Planta(String nombre){
        this(nombre,3,'A');
    }
    public void decVida(){
        if(escudo == 'A'){
            super.decVida(2);
        }
    }
    public void decVida(int menosVida){
        if(escudo == 'A'){
            super.decVida(menosVida*2);
        }
        
    }
    public char getEscudo(){
        return escudo;
    } 
    public String toString(){
        return super.toString()+"  "+"{"+escudo+"}";
    }
    public boolean equals(Object obj){
        return (super.equals(obj) && obj instanceof Planta && escudo == ((Planta)obj).escudo);

    }

    public void setNombre(String nombre){
        if (nombre.length() >=5 && nombre.length() <= 10){
            this.nombre = nombre;
        }
    }
    /** public static String getIdVida(){
        //getIdVida() in Planta cannot override getIdVida() in Personaje
        return (getIdVida()+" "+ escudo);*/
    


}