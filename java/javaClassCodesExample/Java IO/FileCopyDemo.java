package lecture9;

import java.io.*;

class FileCopyDemo 
{
  public static void main(String args[]) throws Exception 
  {
    //String source="dir/sample.txt";
    String source="C:\\Users\\user\\Desktop\\ConsoleDemo\\object.txt";
    //String destination="dir/copied.txt";   
    String destination="C:\\Users\\user\\Desktop\\ConsoleDemo\\object - Copy.txt";
    InputStream in =new FileInputStream(source);
    OutputStream out=new FileOutputStream(destination);
    while(true)
    {
    	int c=in.read();
    	if(c==-1) break;
    	out.write(c);
    }
    in.close();
    out.close();
      FileReader fr=new FileReader("C:\\Users\\user\\Desktop\\ConsoleDemo\\object - Copy.txt");
      char[] buf=new char[30];
      fr.read(buf,0,30);
      String s=new String (buf);
      System.out.println(s);
  }
}
