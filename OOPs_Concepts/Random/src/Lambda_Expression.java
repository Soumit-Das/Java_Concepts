
@FunctionalInterface
interface Al
{
    //	void show();
    void show(int i);
//	void show(int i,int j);


}


public class Lambda_Expression {
    public static void main(String[] args) {

        //   	A obj=() -> System.out.println("in Show");
        //   	obj.show();

//    	A obj=new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);

//    	A obj=(int i) ->System.out.println("in show "+i);
//    	obj.show(5);

//    	A obj=(int i,int j) ->System.out.println("in show "+i);
//    	obj.show(5,8);

        Al obj=i -> System.out.println("in show "+i);
        obj.show(5);
    }
}

