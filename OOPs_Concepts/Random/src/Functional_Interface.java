
@FunctionalInterface
interface Afi
{
    void show();
//	void run();
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class Functional_Interface {
    public static void main(String[] args) {

        Afi obj=new Afi()
        {
            public void show()
            {
                System.out.println("in Show");
            }
        };
        //   	A obj=new A();
        //   	A obj=new B();
        obj.show();
    }
}

