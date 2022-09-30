class A{
    static String bank_name;
    private String uname;
    private String acc_type;
    private long acc_no;
     int balance;
    A(String k,int b)
    {
        this.bank_name=k;
        this.balance=b;
    }
public String setun(String u)
{
    uname=u;
    return uname;
}
public long setaccno(long u)
{
    acc_no=u;
    return acc_no;
}
public String setacc_type(String accty)
{
    acc_type=accty;
    return uname;
}


public void get()
{
    System.out.println(acc_no+" "+acc_type+" "+balance+" "+ bank_name+" "+uname);
}
void showBalance()
{
    System.out.println(balance);
}
}


class F extends A
{
    F(String b,int h)
    {
        super(b,h);
    }
   void Transfer(int amt)
   {
    super.balance=super.balance-amt;
   }
   void deposit(int amt)
   {
    super.balance=super.balance+amt;
   }
   void withraw(int amt)
   {
    super.balance=super.balance-amt;
   }

    
}


public class Banking {
public static void main(String[] args) {
    F g=new F("PNB", 100);
    g.setacc_type("current");
    g.setaccno(113234);
    g.setun("Aditya");
    g.get();
    g.showBalance();
    g.deposit(123);
    g.withraw(4);
    g.Transfer(98);
    g.showBalance();
    //Simple Inheritence is used as functionalities are very simple and no need to implement any other inheritence
}
    
}
