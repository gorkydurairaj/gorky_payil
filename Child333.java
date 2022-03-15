public class Child333 extends Parent333
{
public static void main(String[] args)
{
Child333 ch = new Child333();
System.out.println(ch.packet_money);

ch.packet_money = 50;
System.out.println(ch.packet_money);

ch.study();

}
public void study()
{
System.out.println("Whenever possible");
}

}
