public class Calculadora {

    private double a;
    private double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double suma() {
        return a + b;
    }

    public double resta() {
        return a - b;
    }

    public double multiplicacion() {
        return a * b;
    }

    public double division() {
        return a / b;
    }

    public double valorAbsoluto() {
        return Math.abs(a);
    }

    public double exponente() {
        return Math.pow(a, b);
    }

    public boolean esPositivo() {
        return a >= 0;
    }
}
