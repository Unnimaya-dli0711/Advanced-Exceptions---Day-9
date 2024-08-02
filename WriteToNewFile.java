import java.io.*;

public class WriteToNewFile {
    public static void main(String[] args) {
        try(FileWriter fileWriter=new FileWriter("src/result.txt");
            FileReader fileReader1=new FileReader("src/file1.txt");
            FileReader fileReader2=new FileReader("src/file2.txt");
            BufferedReader bufferedReader2=new BufferedReader(fileReader2);
            BufferedReader bufferedReader1=new BufferedReader(fileReader1)){

            String string=null;
            while((string=bufferedReader1.readLine())!=null){
                System.out.println(string);
                fileWriter.write(string);
            }
            bufferedReader1.close();
            while ((string=bufferedReader2.readLine())!=null){
                System.out.println(string);
                fileWriter.write(string);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
