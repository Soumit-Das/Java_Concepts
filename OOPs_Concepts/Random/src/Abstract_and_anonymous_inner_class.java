abstract class Aa
{
    public abstract void show();
    public abstract void config();

}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}



public class Abstract_and_anonymous_inner_class {

    public static void main(String[] args) {

        //    	A obj=new B();

        Aa obj=new Aa()
        {
            public void show()
            {
                System.out.println("in new show");
            }


            public void config() {
                System.out.println("in new config");
            }


        };
        obj.show();

    }

}
