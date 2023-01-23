
class Asa
{
    public Asa()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}


public class Anonymous_Object
{
    public static void main(String a[])
    {
        int marks;
        marks=99;

        new Asa();   //anonymous object
        new Asa().show();

//		A obj=new A();
        Asa obj;
        obj=new Asa();

        obj.show();
    }
}