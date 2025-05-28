package app;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Operaciones {
    public double suma(Numero a, Numero b) {
        return a.getValor() + b.getValor();
    }
    public double resta(Numero a, Numero b) {
        return a.getValor() - b.getValor();
    }
    public double multiplicacion(Numero a, Numero b) {
        return a.getValor() * b.getValor();
    }
    public double division(Numero a, Numero b) {
        if(b.getValor() == 0){
            System.out.println("No es posible dividir entre cero. Intentelo de nuevo");
            System.out.println("Ingrese un numero diferente de cero");
            Scanner input = new Scanner(System.in);
            b.setValor(input.nextDouble());
        }
        return a.getValor() / b.getValor();
    }
    public double potenciando(Numero a, Numero b) {
            return pow(a.getValor(), b.getValor());
    }

    public double radicacion(Numero a, Numero b) {
        if(a.getValor() == -1 && b.getValor() == 2){
            System.out.println("Numeros Complejos no estan incluidos.");
            System.out.println("No se puede usar Raiz Cuadrada de -1");
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un radicando diferente de -1");
            a.setValor(input.nextDouble());
        }
        return Math.pow( a.getValor(), 1.0/b.getValor() );
    }

}
