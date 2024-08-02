import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultipleFileReading {
    static void processFiles(ArrayList<String> filepaths){
        for(String file:filepaths){
            try (BufferedReader reader = new BufferedReader(new FileReader( file))){

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                } 
            } catch (IOException e) {
                System.out.println("File Exception"+e);
            }
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {

        ArrayList<String>filepaths=new ArrayList<>();
        System.out.println("Enter the number of files paths");
        Scanner scannerobject=new Scanner(System.in);
        int number=scannerobject.nextInt();
        System.out.println("enter the paths");
        for(int i=0;i<number;i++){
            filepaths.add(scannerobject.next());
        }
        processFiles(filepaths);
    }
}
