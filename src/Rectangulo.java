public class Rectangulo extends Forma implements IDibujable {

    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    double area;

    public void setAltura(double altura) throws ErrorFormaException {
        if(altura < 0){
            throw new ErrorFormaException();
        }
        this.altura = altura;
    }

    public void setBase(double base) throws ErrorFormaException {
        if(base < 0){
            throw new ErrorFormaException();
        }
        this.base = base;
    }

    @Override
    public double calcularArea() {
       return area = base * altura;
    }

    @Override
    public void dibujar() {
        if (altura > 0 && base > 0) {
        }
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "altura=" + altura +
                ", base=" + base +
                ", area=" + area +
                '}';
    }
}
