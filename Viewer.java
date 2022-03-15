public class Viewer	
{

public static void main(String[] args)
{
OTT tv = new OTT();
int sub = tv.getSubs();
System.out.println(sub);
tv.setSubs(120);
sub = tv.getSubs();
System.out.println(sub);

}
}