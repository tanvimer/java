import java.io.*;
class Account
{
  int AccountNumber;
  double balance=0.0; 
  String name;
  
  Account(int AccountNumber,double balance,String name)
   {
   this.AccountNumber=AccountNumber;
   this.balance=balance;
   this.name=name;
   }
   Account(int AccountNumber)
   {
    this.AccountNumber=AccountNumber;
   }  
  int getAccountNumber()
  {
   return this.AccountNumber;
   }
 String getName()
  {
   return this.name;
   }
   double getBalance()
   {
    return this.balance;
   }
   void setBalance(double balance)
   {
     this.balance=balance;
    }
    void credit(double amount)
    {
      balance=balance+amount;
    }
    void debit(double amount)
    {
     if(balance>=amount)
       balance=balance-amount;
     else
       System.out.println("amount withdrawn exceeds the current balance !");

    }
    @Override
    public String toString()
   {
      return "A/C no:"+getAccountNumber()+"Balance="+getBalance()+"Name="+getName();
   }     
public static void main(String args[])throws IOException
   {
      int AccountNumber;
	String name;
      double balance;
     double amount; 
 BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
      System.out.println("Enter account number");
      AccountNumber= Integer.parseInt(br.readLine());
System.out.println("Enter name");
name=br.readLine();
      System.out.println("Enter balance");
      balance= Integer.parseInt(br.readLine());
      Account obj=new Account(AccountNumber,balance,name);
      System.out.println("Enter the amount to credit");
       amount= Integer.parseInt(br.readLine());
      obj.credit(amount);
        System.out.println("Enter the amount to debit");
      amount= Integer.parseInt(br.readLine());
   obj.debit(amount);
       String p=obj.toString();
        System.out.println(p); 
  }    
 }
     