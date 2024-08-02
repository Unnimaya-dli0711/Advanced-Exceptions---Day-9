import java.io.*;

public class WriteToNewFile {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter=new FileWriter("src/result.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            FileReader fileReader1=new FileReader("src/file1.txt");
            BufferedReader bufferedReader1=new BufferedReader(fileReader1);
            String string=null;
            while((string=bufferedReader1.readLine())!=null){
                System.out.println(string);
                fileWriter.write(string);
            }
            bufferedReader1.close();
            FileReader fileReader2=new FileReader("src/file2.txt");
            BufferedReader bufferedReader2=new BufferedReader(fileReader2);
            while ((string=bufferedReader2.readLine())!=null){
                System.out.println(string);
                fileWriter.write(string);
            }
            bufferedReader2.close();
            fileWriter.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
