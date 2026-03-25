import java.io.*;
public class file
{
    public static void main(String args[])
    {
        String filename="example.txt";
        try
        {
            BufferedWriter writer=new BufferedWriter(new FileWriter(filename));
            writer.write("Hello ");
            writer.write("Yadhu");
            writer.close();

            BufferedReader reader=new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("File contents");
            while((line=reader.readLine())!=null){
                System.out.println(line);
            }reader.close();

        }
        catch(IOException e)
        {
            System.out.println(("error"));
            e.printStackTrace();
        }
    }
    
}
