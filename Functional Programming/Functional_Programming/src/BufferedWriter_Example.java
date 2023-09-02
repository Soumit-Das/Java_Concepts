import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_Example {

    public static void main(String[] args)throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("tnt.txt"));

        bw.write(001);
        bw.newLine();
        bw.write("Soumit");
        bw.newLine();
        bw.newLine();
        bw.newLine();
        char[] ch = {'t','n','t'};
        bw.write(ch);

        bw.flush();
        bw.close();
    }

}
