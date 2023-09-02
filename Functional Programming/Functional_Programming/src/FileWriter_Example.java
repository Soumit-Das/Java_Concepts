import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Example {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("abc.txt");

        fw.write(007);
        fw.write("\n");
        fw.write("Soumit\n");

        char[] ch = {'a','b','c'};

        fw.write(ch);

        fw.flush();
        fw.close();

    }

}
