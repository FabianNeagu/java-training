package code._4_student_effort._2_incercare;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage
{
    public static void main(String[] args)
    {
        try
        {
            Citire("Fisier");
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
    public static void Citire(String file) throws FileNotFoundException
    {
        Scanner s = new Scanner(new BufferedReader(new FileReader(file)));
    }
}
