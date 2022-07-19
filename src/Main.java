public class Main {
    public static void main(String[] args) {

        var resultado = suma(10,30,40);
        System.out.println(resultado);

        Coche MiCoche = new Coche();
        MiCoche.SumarPuerta();
        MiCoche.SumarPuerta();
        System.out.println(MiCoche.puerta);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}

class Coche {
    public int puerta = 1;

    public void SumarPuerta(){
        this.puerta++;
    }
}