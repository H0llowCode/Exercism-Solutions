public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped >= 5) ? 0.85 :  1;
    }

    public int bonusMultiplier(int productsSold) {
        if(productsSold >= 20){
            return 13;
        }
        else{
            return 10;
        }
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double calcSalary = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

        if(calcSalary > 2000){
            return 2000;
        }
        return calcSalary;
    } 
}
