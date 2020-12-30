class Room
{
float length;
float breadth;
void getdata(float a,float b)
{
length=a;
breadth=b;
}
}
class Roomarea
{
public static void main(String arg[])
{
float area;
Room r1=new Room();
r1.getdata(10,10);
area=r1.length*r1.breadth;
System.out.println("area="+area);

}
}