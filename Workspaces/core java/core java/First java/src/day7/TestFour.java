package day7;
class Account{
private int balance;

public Account(int amount) {
balance=amount;
}
public  void deposit(int amount)
{

System.out.println("balance before deposite: "+this.balance);
try {
Thread.sleep(60);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
this.balance+=amount;
System.out.println("balance after deposite: "+this.balance);
}
public int returnbalance()
{
return this.balance;
}
public void withdraw(int amount) 
{
System.out.println("balance before withdrawal: "+this.balance);
try {
Thread.sleep(60);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
balance-=amount;
System.out.println("balance after withdrawal: "+this.balance);
}
}

class AccountUser extends Thread{
private Account account;
private String name,tot;
private int amount;
public AccountUser(Account account, String name, String tot, int amount) {
this.account = account;
this.name = name;
this.tot = tot;
this.amount = amount;
}
public void run()
{
if(tot.equals("deposit")) {
account.deposit(amount);
}
else if(tot.equals("withdraw"))
{
account.withdraw(amount);
}
}
}
public class TestFour {
public static void main(String[] args) {
Account acc=new Account(50000);
AccountUser user1= new AccountUser(acc,"user1","Deposit",acc.returnbalance());
AccountUser user2=new AccountUser(acc,"user2","withdraw",10000);
user1.start();
user2.start();
acc.deposit(1000);
acc.withdraw(500);

}
}