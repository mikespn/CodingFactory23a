package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryMultipleExceptionsApp {
    public static void main(String[] args) {
        File file = new File("C:\\tmp\randim-file.txt");
        char ch;

        try(Scanner in = new Scanner(file) ){
            ch = (char) System.in.read();
        }catch(FileNotFoundException e2){
            System.out.println("oooppps file not found");
        }catch(IOException e){
            //e.printStackTrace();
            System.out.println("Read error");
        }catch (Exception e){
            System.out.println("something went wrong");
        }
    }
}
