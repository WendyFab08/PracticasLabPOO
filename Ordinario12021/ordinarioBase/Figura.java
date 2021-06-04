//agregar el paquete correspondiente

public class Figura {

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.base;
        hash = 17 * hash + this.altura;
        return hash;
    }

}
