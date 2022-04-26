public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(7, 1);
        int b = calc.minus.apply(100,96);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
    }
}