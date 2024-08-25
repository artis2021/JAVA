import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_111_FileHandling {
    public static void main(String[] args) {
//        try{
//            FileWriter newFile = new FileWriter("CWH_111_FileHandling.txt");
//            newFile.write("Hey There! I am here.\n Okay now, Bye.");
//            newFile.close();
//        } catch(IOException o){
//            o.printStackTrace();
//        }

        //Reading the file
//        try{
//            File myFile = new File("CWH_111_FileHandling.txt");
//            Scanner sc = new Scanner(myFile);
//            while(sc.hasNextLine()){
//                System.out.println(sc.next());
//            }
//            sc.close();
//        } catch(IOException o){
//            o.printStackTrace();
//        }

        //Deleting the file
        File myFile = new File("CWH_111_FileHandling.txt");
        if(myFile.delete()){
            System.out.println("I have deleted the file." + myFile.getName());
        } else{
            System.out.println("Some error occur while deleting the file.");
        }

    }
}
