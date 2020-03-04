package lecture9;

import java.io.*;

class BufferedReaderDemo {
  public static void main(String args[]) throws Exception
  {
  	FileReader fr = new FileReader("BufferedReaderDemo.java");
  	BufferedReader br=new BufferedReader(fr);
  	while(true)
  	{
  		String s=br.readLine();
  		if(s==null) break;
  		System.out.println (s);
  	}
  	br.close();
  	fr.close();  	
   
  }
}