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
        try {
            formas[0] = new Circulo(3);
            System.out.println("El area del circulo es de : " + formas[0].calcularArea());
        } catch (ErrorFormaException e) {
            System.out.println(e.getMessage());
        }
        try {
            formas[1] = new Rectangulo(5, 10);
            System.out.println("El area del rectangulo es de : " + formas[1].calcularArea());
        } catch (ErrorFormaException e) {
            System.out.println(e.getMessage());
        }
        try {
            formas[2] = new CirculoMovible(5);
            System.out.println("El area del circulo movible es de : " + formas[2].calcularArea());
        } catch (ErrorFormaException e) {
            System.out.println(e.getMessage());
        }
        formas[3] = new Linea(0);
        Canvas canvas = new Canvas(formas);
        canvas.dibujaYAnimaFormas(formas);
    }
}
