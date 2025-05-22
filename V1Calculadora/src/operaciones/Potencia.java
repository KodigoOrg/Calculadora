package operaciones;

import app.Numero;

import static java.lang.StrictMath.pow;

public class Potencia {
    public double potenciando(Numero a, Numero b) {
        return pow(a.getValor(), b.getValor());
    }

}
