package operaciones;

import app.Numero;

import java.util.Scanner;

public class Division {
    public double division(Numero a, Numero b) {
        if(b.getValor() == 0){
            System.out.println("No es posible dividir entre cero. Intentelo de nuevo");
            System.out.println("Ingrese un numero diferente de cero");
            Scanner input = new Scanner(System.in);
            b.setValor(input.nextDouble());
        }
        return a.getValor() / b.getValor();
    }

}
