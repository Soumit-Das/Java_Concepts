
class Ab
{
    public void show()
    {
        System.out.println("in A show");
    }
}


public class Anonymous_Inner_classes
{
    public static void main(String[] args)
    {
        Ab obj = new Ab()
        {
            public void show()
            {
                System.out.println("im the best");
            }
        };

        obj.show();
    }
}