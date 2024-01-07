public class taxRateCrit3 {
    public static void main(String[] args) {
        //pseudo code:
        // Application will need a paycheck variable to be organized by tax bracket: 
        //Income less than $500: tax rate 10%
        //Incomes greater than/equal to $500 and less than $1500: tax rate 15%
        //Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
        //Incomes greater than/equal to $2500: tax rate 30%
        //This can be done by using a else if system for the code to funnel the data through until
        // the condition of the paycheck amount has been reached.

        int payCheck = 2900;

        if (payCheck < 500) { //Income less than $500: tax rate 10%
            System.out.println("Tax rate of 10%. You will have to pay " + (payCheck - (payCheck * 0.90)));
        } else if (payCheck > 500 && payCheck < 1500) { //Incomes greater than/equal to $500 and less than $1500: tax rate 15%
            System.out.println("Tax rate of 15%. You will have to pay " + (payCheck - (payCheck * 0.85)));
        } else if (payCheck > 1500 && payCheck < 2500) { //Incomes greater than/equal to $1500 and less than $2500: tax rate 20%
            System.out.println("Tax rate of 20%. You will have to pay " + (payCheck - (payCheck * 0.80)));
        } else if (payCheck > 2500) { //Incomes greater than/equal to $2500: tax rate 30%
            System.out.println("Tax rate of 30%. You will have to pay " + (payCheck - (payCheck * 0.70)));
        }
    }
}
