import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_Example {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("tnt.txt"));

            br.lines().forEach(System.out::println);

            br.close();

    }

}
