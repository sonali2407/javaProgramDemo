interface Toy
{
void setPrice(double price);
void setColor(String color);
void toyInfo();
}
interface Movable
{
void move();
}
interface Flyable
{
void fly();
}
class ToyHouse implements Toy
{
String color;
double price;
public void setPrice(double price)
{
this.price = price;

}
public void setColor(String color)
{
this.color=color;
}
public void toyInfo()
{
System.out.println( "ToyHouse: Toy house- Price: "+price+" Color:"+color);
}
}
class ToyCar implements Toy,Movable
{
String color;
double price;
public void setPrice(double price)
{
this.price = price;
}
public void setColor(String color)
{
this.color=color;
}
public void move()
{
System.out.println("ToyCar: Start moving car.");
}
public void toyInfo()
{
System.out.println( "ToyCar: Moveable Toy car- Price: "+price+" Color: "+color);
}
}
class ToyPlane implements Toy,Movable,Flyable
{
double price;
String color;
public void setPrice(double price)
{
this.price = price;
}
public void setColor(String color)
{
this.color=color;
}
public void move()
{

System.out.println("ToyPlane: Start moving plane.");
}
public void fly()
{
System.out.println("ToyPlane: Start flying plane.");
}
public void toyInfo()
{
System.out.println( "ToyPlane: Moveable and flyable toy plane- Price:"+price+" Color: "+color);
}
}
class JavaISPDemo {
public static void main(String[] args)
{
ToyHouse h1=new ToyHouse();
h1.setColor("blue");
h1.setPrice(300);
h1.toyInfo();
ToyCar c1=new ToyCar();
c1.setColor("silver");
c1.setPrice(500);
c1.toyInfo();
c1.move();
ToyPlane p1=new ToyPlane();
p1.setColor("White");
p1.setPrice(700);
p1.toyInfo();
p1.move();
p1.fly();
}
} 
