
public class Exception_Handling_with_try_catch {
    public static void main(String[] args) {

        int i=0;
        int j=0;

        try
        {
            j=18/i;
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong");
        }
        System.out.println(j);

        System.out.println("Bye");
    }
}
