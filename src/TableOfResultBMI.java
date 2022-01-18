public class TableOfResultBMI {
    public void tableOfResult(double resultBMI) {
        if (resultBMI < 16) {
            System.out.println("Severe Thinness");
        }
        if (resultBMI >= 16 && resultBMI < 17) {
            System.out.println("Moderate Thinness");
        }
        if (resultBMI >= 17 && resultBMI < 18.5) {
            System.out.println("Mild Thinness");
        }
        if (resultBMI >= 18.5 && resultBMI < 25) {
            System.out.println("Normal");
        }
        if (resultBMI >= 25 && resultBMI < 30) {
            System.out.println("Overweight");
        }
        if (resultBMI >= 30 && resultBMI < 35) {
            System.out.println("Obese Class I");
        }
        if (resultBMI >= 35 && resultBMI < 40) {
            System.out.println("Obese Class II");
        }
        if (resultBMI >= 40) {
            System.out.println("Obese Class III");
        }
    }
}
