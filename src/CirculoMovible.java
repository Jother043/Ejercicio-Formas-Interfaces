public class CirculoMovible extends Forma implements IDibujable, IAnimable{

    private double radio;
    double area;

    public CirculoMovible(double radio) throws ErrorFormaException {
        setRadio(radio);
    }

    public void setRadio(double radio) throws ErrorFormaException {
        if(radio < 0){
            throw new ErrorFormaException("El radio no puede ser 0 ni inferior a 0.");
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public void animar() {
        System.out.println("Animando circulo movible");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo movible con radio: " + radio);
    }

    @Override
    public double calcularArea() {
        return area = Math.PI*Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "CirculoMovible{" +
                "radio=" + radio +
                ", area=" + area +
                "} " + super.toString();
    }
}
