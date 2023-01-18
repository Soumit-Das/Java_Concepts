
interface Ac
{
    void show();
}

public class Anonymous_class_with_Interface
{
    public static void main(String[] args)
    {
        Ac obj = new Ac()
        {
            public void show()
            {
                System.out.println("Im the best");
            }
        };

        obj.show();
    }
}
