package mx.com.softgame.poo1game.personajes.malos;
import mx.com.softgame.poo1game.personajes.buenos.Planta;
import mx.com.softgame.poo1game.personajes.Personaje;
public final class Zombie extends Personaje{
    private boolean ataque;
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre,vida);
        this.ataque = ataque;
    }
    public Zombie(String nombre,boolean ataque){
        this(nombre,3,ataque);
    }
    public Zombie(String nombre){
        this(nombre,3,false);
        
    }
    public boolean getAtaque(){
        return ataque;
    }
    public void decVida(){
        if(ataque == false){
            super.decVida(3);
        }else{
            super.decVida(2);
        }
    }
    public void decVida(int menosVida){
        if(ataque == false){
            super.decVida((menosVida*3));
        }else{
            super.decVida((menosVida*2));
        }
        
    }
    public String toString(){
        return super.toString()+" "+"{"+ataque+"}";
    }

    public boolean equals(Object obj){
        Boolean iguales = false;
        if ((obj != null) && (obj instanceof Zombie)){
    Zombie y = (Zombie) obj;
    if (this.nombre.equals(y.nombre) && vida == y.vida && ataque == y.ataque){
        iguales = true;
        }
    }
    }
      


    public void setNombre(String nombre){
        if (nombre.length() >=3 && nombre.length() <= 8){
            this.nombre = nombre;
        }

    }
    public void setNombre(String nombre); 

    public boolean equals( Object obj);

    /** public static String getIdVida(){
        //getIdVida() in Planta cannot override getIdVida() in Personaje
        return (getIdVida()+" "+ ataque);*/


}