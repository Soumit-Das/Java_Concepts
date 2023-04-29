
// class Computer
// {
//
// }
// class Laptop extends Computer
// {
//
// }

class Aj
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class Bj extends Aj
{
    public void show()
    {
        System.out.println("in B show");
    }
}

class Cj extends Aj
{
    public void show()
    {
        System.out.println("in C show");
    }
}

class D
{

}


public class Dynamic_Method_Dispatch{
    public static void main(String[] args) {
//		A obj=new B();
//		obj.show();

        Aj obj=new Aj();
        obj.show();

        obj=new Bj();
        obj.show();

        obj=new Cj();
        obj.show();

//		obj=new D();

//		Laptop obj1=new Laptop();
//		Computer obj1=new Laptop();

    }
}