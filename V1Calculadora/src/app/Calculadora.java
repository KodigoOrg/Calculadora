package app;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Solo contenedor de metodos principales por si fuese necesario varios Hilos
        interfazMain();
    }

    public static void interfazMain(){
        //Metodo principal para el cual las de mas funciones se implementan y ejecutan
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
        Operaciones operacion = new Operaciones();
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
                double resultado = operacion.suma(num1, num2);

                System.out.println("El resultado de la suma es: " + resultado);
            }
            case 2 -> {
                System.out.println("***** RESTANDO *****");
                double resultado = operacion.resta(num1, num2);

                System.out.println("El resultado de la resta es: " + resultado);
            }
            case 3 -> {
                System.out.println("***** MULTIPLICANDO *****");
                double resultado = operacion.multiplicacion(num1, num2);

                System.out.println("El resultado de la multiplicacion es: " + resultado);
            }
            case 4 -> {
                System.out.println("***** DIVISION *****");
                double resultado = operacion.division(num1, num2);

                System.out.println("El resultado de la division es: " + resultado);
            }
            case 5 -> {
                System.out.println("***** Potenciacion *****");
                double resultado = operacion.potenciando(num1, num2);

                System.out.println("El resultado de la potencia es: " + resultado);
            }
            case 6 -> {
                System.out.println("***** Calculando *****");
                double resultado = operacion.radicacion(num1, num2);

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
