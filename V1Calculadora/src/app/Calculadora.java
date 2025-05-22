package app;

import operaciones.*;

import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args) {
        interfazMain();
    }

    public static void interfazMain(){
        int salir = 0;
        Scanner input = new Scanner(System.in);

        do{
            try{
                int opcion = mostrarMenu(input);
                salir = calcular(opcion);
            }catch(Exception e){
                System.out.println("Valor Ingresado no valido "+e.getMessage());
            }finally{
                System.out.print(" ");
            }

        }while(salir == 1);

    }

    public static int mostrarMenu(Scanner input){
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Potencia
                6. Raices
                Elige una opcion: """);

        return Integer.parseInt(input.nextLine());
    }
    public static int calcular(int opcion){
        Scanner input2 = new Scanner(System.in);
        Numero num1 = new Numero();
        Numero num2 = new Numero();

        int continuar = 0;
//TRY CATCH
        if(opcion >=1 && opcion <= 4){
            System.out.println("Ingrese el primer numero a calcular y presione Enter: ");
            num1.setValor(input2.nextDouble());
            System.out.println("Ingrese el segundo numero a calcular y presione Enter: ");
            num2.setValor(input2.nextDouble());
        }else if(opcion == 5 || opcion == 6){
            System.out.println("Ingrese el numero base a calcular y presione Enter: ");
            num1.setValor(input2.nextDouble());
            System.out.println("Ingrese el numero Exponente/Raiz a calcular y presione Enter: ");
            num2.setValor(input2.nextDouble());
        }else{
            System.out.println("El valor ingresado no es valido.");
        }

        switch(opcion){
            case 1 -> {
                System.out.println("***** SUMANDO *****");
                Suma sumando = new Suma();
                double resultado = sumando.suma(num1, num2);

                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                System.out.println("***** RESTANDO *****");
                Resta restando = new Resta();
                double resultado = restando.resta(num1, num2);

                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {
                System.out.println("***** MULTIPLICANDO *****");
                Multiplicacion multiplicando = new Multiplicacion();
                double resultado = multiplicando.multiplicacion(num1, num2);

                System.out.println("El resultado de la multiplicacion es: " + resultado);
            }
            case 4 -> {
                System.out.println("***** DIVISION *****");
                Division dividiendo = new Division();
                double resultado = dividiendo.division(num1, num2);

                System.out.println("El resultado de la division es: " + resultado);
            }
            case 5 -> {
                System.out.println("***** Potenciacion *****");
                Potencia potenciando = new Potencia();
                double resultado = potenciando.potenciando(num1, num2);

                System.out.println("El resultado de la potencia es: " + resultado);
            }
            case 6 -> {
                System.out.println("***** Calculando *****");
                Raiz radicando = new Raiz();
                double resultado = radicando.radicacion(num1, num2);

                System.out.println("El resultado de la Raiz es: " + resultado);
            }
        }

        System.out.println(" *********************************** ");
        try{
            System.out.println("Si desea continuar presione 1, sino 0");
            continuar = input2.nextInt();
        }catch(Exception e){
            System.out.println("Debe ingresar un valor numerico ...Salida automatica activada ");
        }finally{
            System.out.println(" ");
        }

        return continuar;
    }


}
