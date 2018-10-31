package week7.task1;
public class ExpressionTest {
    public static void main(String[] args) {
        Expression numeral1 = new Numeral(10);
        Expression numeral2 = new Numeral(1);
        Expression numeral3 = new Numeral(2);
        Expression numeral4 = new Numeral(3);

        Expression square_10 = new Square(numeral1);
        Expression multiplication = new Multiplication(numeral3, numeral4);
        Expression subtraction = new Subtraction(square_10, numeral2);
        Expression addition = new Addition(subtraction, multiplication);
        Expression expression = new Square(addition);

        System.out.print(expression.evaluate() + "\n");
        Division division = new Division(new Numeral(2),new Numeral(3));
        try{
            System.out.println(1.0*division.left().evaluate()/division.right().evaluate());
        }
        catch (ArithmeticException e){
            System.out.println("“Lỗi chia cho 0");
        }
    }

    }
