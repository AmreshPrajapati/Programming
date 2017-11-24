import java.io.*;

public class filehandling 
{
public static void main(String args[])
{
try
{
/*File f=new File("hello.txt");
if(f.createNewFile())
System.out.println("file is created");
else
System.out.println("file is already exist");
*/
FileWriter w=new FileWriter(new File("test.txt"));
w.write("hi this is amresh prajapati");
w.close();
}
catch(IOException a)
{
a.printStackTrace();
}
}
}
