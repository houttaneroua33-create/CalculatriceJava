public class Calculatrice {

    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        System.out.println("Bienvenue!");
        System.out.println("10 + 5 = " + calc.addition(10, 5));
        System.out.println("10 - 5 = " + calc.soustraction(10, 5));
        System.out.println("10 * 5 = " + calc.multiplication(10, 5));
        System.out.println("10 / 5 = " + calc.division(10, 5));
    }
}"// Test 1: verification addition" 
"// Test 2: verification division par zero" 
