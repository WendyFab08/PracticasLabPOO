package mx.com.softgame.poo1game.utlis;

public class Utileria {
    private static int contadorID;// Para que nadie pueda entra al metodo del contador
    public static int getID() {
        return ++contadorID;
    }

}
