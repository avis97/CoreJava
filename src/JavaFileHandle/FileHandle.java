package JavaFileHandle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandle{
    public static void main(String[] args){

        // create a new file by help of File class

        File newFile=new File("src/JavaFileHandle/newFileForPractice.txt");
        try {
            newFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Sorry Something wrong with create this file.");
            throw new RuntimeException(e);
        }

        // write something in this file..
        try {
            FileWriter fileWriter=new FileWriter("src/JavaFileHandle/newFileForPractice.txt");
            fileWriter.
                    write("Ok this is my " +
                            "first write something in this new file.. ok its work");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // reading code in this file...
        File readFile=new File("src/JavaFileHandle/newFileForPractice.txt");
        try {
            Scanner sc=new Scanner(readFile);
            while(sc.hasNext()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Delete this file

        File deleteFile=new File("newFileForPractice.txt");
        if(deleteFile.delete()){
            System.out.println("File Delete This File");
        }else{
            System.out.println("Some issue with this file");
        }
    }
}
