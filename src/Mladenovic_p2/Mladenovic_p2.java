package Mladenovic_p2;
class SavingsAccount {

    static private double annualInterestRate;
    private double savingBalance;

        // create methods to calculate interest
             private double getSavingBalance() {
                return this.savingBalance;

                 }

            private SavingsAccount(double savingBalance) {
                this.savingBalance = savingBalance;

                }

             private static void modifyInterestRate(double newInterestRate) {
                  annualInterestRate=newInterestRate;

                 }

            private void calculateMonthlyInterest() {

                double monthlyI;
                monthlyI= this.savingBalance * annualInterestRate / 12;
                this.savingBalance += monthlyI;
                 }

        //objects saver1 and saver 2
        public static void main(String[] args) {

        SavingsAccount saver1, saver2;

        saver1 = new SavingsAccount (2000.0);
        saver2 = new SavingsAccount (3000.0);
        //
        SavingsAccount.modifyInterestRate (0.04);
        System.out.println("----------------------");
        System.out.println("Interest Rate: 0.04 ");
        System.out.println("Balance for saver 1 ");
        System.out.println("----------------------");

        //interest rate
             for(int i = 0; i < 12; i++) {
        //number of months
            saver1.calculateMonthlyInterest();

            System.out.println("month " + (i + 1) + " - " + String.format("%.2f", saver1.getSavingBalance ()));

        }

             System.out.println("----------------------");
             System.out.println("Interest Rate: 0.04 ");
             System.out.println("Balance for saver 2 ");
             System.out.println("----------------------");


             for(int i = 0 ; i < 12; i++) {

            saver2.calculateMonthlyInterest();
            System.out.println("month " + (i + 1) + " - "+ String.format("%.2f",saver2.getSavingBalance()));
        }

             // modify
        SavingsAccount.modifyInterestRate(0.05);
        System.out.println("----------------------");
        System.out.println("Interest Rate: 0.05 ");
        System.out.println("Balance for Saver 1:");
        System.out.println("----------------------");

         for(int i = 0; i < 12; i++) {

            saver1.calculateMonthlyInterest();

            System.out.println("month " + (i + 1) + " - "+ String.format("%.2f",saver1.getSavingBalance()));
        }
        System.out.println("----------------------");
        System.out.println("Interest Rate: 0.05 ");
        System.out.println("Balance for Saver 2 ");
        System.out.println("----------------------");


                for(int i = 0 ; i < 12 ; i++) {

                saver2.calculateMonthlyInterest();
                System.out.println("month " + (i + 1) + " - "+ String.format("%.2f",saver2.getSavingBalance()));

        }

    }
}