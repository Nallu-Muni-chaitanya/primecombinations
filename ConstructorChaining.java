class Parent
{
    int id;
    String name;
    public Parent()
    {
        System.out.println("parent");
    }
}
class Child2 extends Parent
{
    public Child2(int id,String name)
    {
       // super();
        //{
        this.id=id; 
        this.name=name;
            System.out.println("child");
        //}
    }
}

public class ConstructorChaining
{
    public static void main(String... args)
    {
        Child2 c2=new Child2(10,"hii");
    }
}