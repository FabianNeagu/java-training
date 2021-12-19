package code._4_student_effort._1_Phone_Book;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneBook
{
    public static void main(String[] args)
    {
        String cautat="abc";
        try{
            readPhoneBook("Fisier");
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public static void readPhoneBook(String file) throws FileNotFoundException
    {
        Scanner s = new Scanner(new BufferedReader(new FileReader(file)));
    }
}
