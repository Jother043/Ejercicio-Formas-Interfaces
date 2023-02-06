public class Circulo extends Forma implements IDibujable{

    private double radio;
    double area;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) throws ErrorFormaException {
        if(radio < 0){
            throw new ErrorFormaException();
        }
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return area = Math.PI*Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {

    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", area=" + area +
                '}';
    }
}
