/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practice_1.BTH_1;
import java.util.*;
import java.io.*;
/**
 *
 * @author ADMIN
 */
public class BT_3 {
    // a
    public static String Name(String s){
        String res = s.substring(0,s.indexOf('@'));
        return res;
    }
    
    
    // b
    public static int number_of_upper_char(String s){
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                cnt+=1;
            }
        }
        return cnt;
    }
    
    // c
    public static void readfile(String file_in,String file_out){
        try{
            File r = new File(file_in);
            File o = new File(file_out);
            Scanner scanner = new Scanner(r);
            PrintWriter write = new PrintWriter(o);
            while(scanner.hasNextLine()){
                String res;
                res = scanner.nextLine();
                res = res.replaceAll("\\{file\\}", "tập tin");
                write.println(res);
                System.out.print("Success");
            }
            scanner.close();
            write.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found");
        }
    }
    
    // d
    public static void counting(String s){
        int longest = 0;
        String res = "";
        String cnt[] = s.split("[ .:,;'=()!\\[\\]]+");
        System.out.println("Number of words in string " + cnt.length);
        for(String i : cnt){
            if(longest < i.length()){
                longest = i.length();
                res = i;
            }
        }
        System.out.println("The longest substring is : " + res);
    }
    
    // e
    public static void Normalize(String s){
        String list[] = s.trim().split("\\s+");
        String res = "";
        for(String i : list){
            String first = i.substring(0, 1).toUpperCase();
            String other = i.substring(1).toLowerCase();
            res += (first + other + " ");
        }
        res = res.trim();
        System.out.println("String after normalized : " + res);
    }
    
    public static void main(String args[]){
//        System.out.print("Email : ");
//        Scanner obj = new Scanner(System.in);
//        String email = obj.nextLine();
//        System.out.println("Name in email : " + Name(email));   
//         
//        System.out.print("Input a string : ");
//        String string = obj.nextLine();
//        System.out.println("Number of uppercase char is : " + number_of_upper_char(string));  
//        
//        readfile("D:\\Y2S2\\OOP\\Practice_1\\src\\main\\java\\com\\mycompany\\practice_1\\BTH_1\\input.txt","D:\\Y2S2\\OOP\\Practice_1\\src\\main\\java\\com\\mycompany\\practice_1\\BTH_1\\output.txt");
          //counting("Hello .,; World");
          //int a[] = {1,2,3};
          //System.out.println(a.length);
          
          //Normalize("   hello world   ");
         
    }
}
