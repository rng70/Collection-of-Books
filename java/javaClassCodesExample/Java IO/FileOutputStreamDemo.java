package lecture9;

import java.io.*;

class FileOutputStreamDemo 
{
  public static void main(String args[]) throws Exception 
  	{
    String source = "Now is the time for all good men\n"
      + " to come to the aid of their country\n"
      + " and pay their due taxes.";
    byte buf[] = source.getBytes();
    OutputStream f0 = new FileOutputStream("C:\\Users\\user\\Desktop\\ConsoleDemo\\object.txt");
    for (int i=0; i < buf.length; i += 2) 
    {
     	 f0.write(buf[i]);
    }
    f0.close();

    OutputStream f1 = new FileOutputStream("C:\\Users\\user\\Desktop\\ConsoleDemo\\object - Copy.txt");
    f1.write(buf);
    f1.close();

    OutputStream f2 = new FileOutputStream("C:\\Users\\user\\Desktop\\ConsoleDemo\\object - Copy - Copy.txt");
    f2.write(buf,buf.length-buf.length/4,buf.length/4);
    f2.close();
  }
}