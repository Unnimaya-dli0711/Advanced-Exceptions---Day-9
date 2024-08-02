import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceCleanUp {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=null;
        try {
             bufferedReader = new BufferedReader(new FileReader( "file.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File Exception"+e);
        }finally {
            if(bufferedReader!=null)
                bufferedReader.close();
        }
    }
}
