public class Child444 extends Parent444
{
public static void main(String[] args)
{
Parent444 ch = new Child444();
ch.study();
//ch.play();
ch.grow();
ch.watchTV();


}
public void watchTV()
{
System.out.println("Series"); 
}
public void study()
{
System.out.println("Studying"); 
}

public void play()
{
System.out.println("Cricket"); 
}
}