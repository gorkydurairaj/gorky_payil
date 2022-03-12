public class AbcBranch extends AbcMobileShop
{
int discount;

public AbcBranch(int discount)
{
   super(5);
   this.discount = discount;
   System.out.println("BO" + this.discount);
}

public AbcBranch()
{
this(10);
System.out.println("Tumbler free");
}
public static void main(String[] args)
{
//AbcBranch ab = new AbcBranch();
AbcBranch iphone = new AbcBranch(10);
}
}