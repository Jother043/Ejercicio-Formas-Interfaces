public class Linea extends Forma{

    private double longitud;

    public Linea(double longitud) {
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    @Override
    public double calcularArea() throws ErrorFormaException {
        throw new ErrorFormaException("No se puede clacular el area de una linea.");
    }

    @Override
    public String toString() {
        return "Linea{" +
                "longitud=" + longitud +
                "} " + super.toString();
    }
}
