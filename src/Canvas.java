public class Canvas{

    public Canvas(Forma[] formas) {
    }

    public void dibujaYAnimaFormas(Forma[] forma){
        for(Forma i : forma){
            if(i == null){
                continue;
            }
            if(i instanceof IAnimable){
                ((IAnimable)i).animar();
            }
            if(i instanceof  IDibujable){
                ((IDibujable)i).dibujar();
            }
            try {
                i.calcularArea();
            } catch (ErrorFormaException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Forma[] formas = new Forma[4];
        formas[0] = new Circulo(5);
        formas[1] = new Rectangulo(5, 10);
        formas[2] = new CirculoMovible(5);
        formas[3] = new Linea();
        Canvas canvas = new Canvas(formas);
        canvas.dibujaYAnimaFormas(formas);
    }
}
