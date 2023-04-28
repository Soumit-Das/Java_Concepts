
class NavinException extends Exception
{
    public NavinException(String string)
    {
        super(string);
    }
}

class As
{
    public void show() throws ClassNotFoundException
    {
//    	try
//    	{
//    		Class.forName("Calc");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        Class.forName("Calc");
    }
}

public class Ducking_Exception_using_throws {

    static {
        System.out.println("Class Loader");
    }

    public static void main(String[] args) {

//    	try
//    	{
//    		Class.forName("Class");
//    	}
//    	catch(ClassNotFoundException e)
//    	{
//    		System.out.println("Not able to find theh class");
//    	}

        As obj=new As();
        try {
            obj.show();
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }


    }
}

