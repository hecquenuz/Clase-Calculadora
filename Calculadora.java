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

    public double valorAbsolutoA() {
        return Math.abs(a);
    }

    public double valorAbsolutoB() {
        return Math.abs(b);
    }

    public double exponente() {
        return Math.pow(a, b);
    }

    public double raizCuadradaA() {
        return Math.sqrt(a);
    }

    public double raizCuadradaB() {
        return Math.sqrt(b);
    }

    public boolean esPositivo() {
        return a >= 0;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public boolean equals(Object calculadoraObject) {
        if (calculadoraObject instanceof Calculadora) {
            Calculadora calculadora = (Calculadora) calculadoraObject;
            boolean Asoniguales = this.getA() == calculadora.getA();
            boolean Bsoniguales = this.getB() == calculadora.getB();

            return Asoniguales && Bsoniguales;

        } else {
            return false;
        }

    }
}
