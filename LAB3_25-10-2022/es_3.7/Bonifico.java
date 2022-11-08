public class Bonifico{

   public static void main(String[] args){
   
      BankAccount account1 = new BankAccount();
      BankAccount account2 = new BankAccount();
      
      account1.deposit(1000);
      account2.deposit(100);
      
      System.out.println("Saldo account1: "+account1.getBalance());
      System.out.println("Saldo account2: "+account2.getBalance());
      
      account1.withdraw(400);
      account2.deposit(400);
      
      System.out.println("Saldo account1: "+account1.getBalance());
      System.out.println("Saldo account2: "+account2.getBalance());
   
   }

}
