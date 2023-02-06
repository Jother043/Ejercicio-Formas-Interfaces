public class Circulo extends Forma implements IDibujable{

    private double radio;
    double area;

    public Circulo(double radio) throws ErrorFormaException {
        setRadio(radio);
    }

    public void setRadio(double radio) throws ErrorFormaException {
        if(radio < 0){
            throw new ErrorFormaException("El radio no puede ser menor a 0.");
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }


    @Override
    public double calcularArea() {
        return area = Math.PI*Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo con radio: " + radio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", area=" + area +
                '}';
    }
}
