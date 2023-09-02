import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Example {

    public static void main(String[] args)throws IOException {

        PrintWriter pw = new PrintWriter("tnt.txt");

        pw.write(100);
        pw.println(200);
        pw.println(true);
        pw.println('c');
        pw.println("RDX");

        pw.flush();
        pw.close();
        System.out.println("Done...");

    }

}
