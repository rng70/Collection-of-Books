package lecture9;

import java.io.*;

class FileWriterDemo {
  public static void main(String args[]) throws Exception {
    String source = "Now is the time for all good men\n"
      + " to come to the aid of their country\n"
      + " and pay their due taxes.";
    char buffer[] = new char[source.length()];
    source.getChars(0, source.length(), buffer, 0);

    FileWriter f0 = new FileWriter("C:\\Users\\user\\Desktop\\ConsoleDemo\\object - Copy - Copy.txt");
    for (int i=0; i < buffer.length; i += 2) {
      f0.write(buffer[i]);
    }
    f0.close();

    FileWriter f1 = new FileWriter("C:\\Users\\user\\Desktop\\ConsoleDemo\\object - Copy.txt");
    f1.write(buffer);
    f1.close();

    FileWriter f2 = new FileWriter("C:\\Users\\user\\Desktop\\ConsoleDemo\\object.txt");

    f2.write(source);
    f2.close();
  }
}
