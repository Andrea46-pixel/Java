public class TimeDepositAccount extends SavingsAccount{

   public TimeDepositAccount(double rate, int duration){
      super(rate);
      months = duration;
   }
   
   public TimeDepositAccount(double initialBalance, double rate, int duration){
      super(initialBalance, rate);
      months = duration;
   }
   
   public void withdraw(double amount)
   {
       if(monthsCounter < months){
         amount += 20;
       }
       super.withdraw(amount);
   }
   
   public void addInterest()    
   {
       super.addInterest();
       monthsCounter++;
   }
   
   // ........... toString, equals .................
    public String toString(){
      return super.toString() +"TimeDepositAccount[months="+ months +"]";
    }
    public boolean equals(Object obj){
      TimeDepositAccount otherAccount = (TimeDepositAccount)obj;
      return this.getBalance() == otherAccount.getBalance();
    }
   
    public int getMonthsLeft(){
      return months-monthsCounter;
    }





   //-------- nuovi campi di esemplare ----------------

   private int months;
   private int monthsCounter;

}
