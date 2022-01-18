import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массу тела в килограммах: ");
        double weight = in.nextDouble();
        while (weight < 20 || weight > 300) {
            System.out.println("Значения массы тела должны быть в пределах 20кг - 300 кг");
            weight = in.nextDouble();
        }
        System.out.println("Введите ваш рост в метрах: ");
        double height = in.nextDouble();
        while (height < 1 || height > 2.5) {
            System.out.println("Значения роста должны быть в пределах 1м - 2.5м");
            height = in.nextDouble();
            ;
        }
        double resultBMI = calculateBMI(weight, height);
        System.out.printf("ВАШ индекс массы тела BMI: %.1f \n", resultBMI);


        TableOfResultBMI bmi = new TableOfResultBMI();
        bmi.tableOfResult(resultBMI);
        System.out.println("Надо что-то с этим делать");
    }
        public static double calculateBMI ( double weight, double height){
            return weight / Math.pow(height, 2);                            //формула расчета BMI
        }


}