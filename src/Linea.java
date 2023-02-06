public class Linea extends Forma{



    @Override
    public double calcularArea() throws ErrorFormaException {
        throw new ErrorFormaException("No se puede clacular el area de una linea.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
