package operaciones;

import app.Numero;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Raiz {
    public double radicacion(Numero a, Numero b) {
        if(a.getValor() == -1 && b.getValor() == 2){
            System.out.println("Numeros Complejos no estan incluidos.");
            System.out.println("No se puede usar Raiz Cuadrada de -1");
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un radicando diferente de -1");
            a.setValor(input.nextDouble());
        }
        return pow( a.getValor(), 1.0/b.getValor() );
    }

}
