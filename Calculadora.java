public class Calculadora {

    public double a;
    public double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double valorAbsoluto(double a) {
        return Math.abs(a);
    }

    public double exponente(double a) {
        return Math.pow(a, 2);
    }

    public boolean esPositivo(double a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }

    }
}
