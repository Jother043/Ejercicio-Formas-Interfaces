public class CirculoMovible extends Forma implements IDibujable, IAnimable{

    private double radio;
    double area;

    public CirculoMovible(double radio) {
        this.radio = radio;
    }

    @Override
    public void animar() {
        System.out.println("Animando circulo movible");
    }

    @Override
    public void dibujar() {

    }

    @Override
    public double calcularArea() {
        return area = Math.PI*Math.pow(radio, 2);
    }
}
