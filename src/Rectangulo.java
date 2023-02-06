public class Rectangulo extends Forma implements IDibujable {

    private double altura;
    private double base;

    public Rectangulo(double altura, double base) throws ErrorFormaException {
        setAltura(altura);
        setBase(base);
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

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calcularArea() {
       return area = base * altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectangulo con base: " + base + " y altura: " + altura);
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
