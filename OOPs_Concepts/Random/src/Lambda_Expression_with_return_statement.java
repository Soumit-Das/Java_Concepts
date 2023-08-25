
@FunctionalInterface
interface Ak
{
    int add(int i, int j);
}


public class Lambda_Expression_with_return_statement {
    public static void main(String[] args) {
//
//   	A obj=new A()
//   	{
//   		public int add(int i, int j)
//   		{
//   			return i+j;
//   		}
//   	};

        Ak obj=(i,j) -> i+j;

        int result=obj.add(5, 4);
        System.out.println(result);
    }
}

