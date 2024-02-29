/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practice_1;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.io.*;
/**
 *
 * @author ADMIN
 */
class Point{
    private int x,y;
    private static int ps = 0;
    public Point(){
        this.x = 0;
        this.y = 1;
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int Cong(int x,int y){
        return x + y;
    }
    
    public static void getPs(){
        System.out.println(ps);
    }
}

class NhanVien{
	private static int dem = 1;
	private int mssv;
	private String hoTen;
	// Initialization block
	{
		mssv = dem++;
	}
        public NhanVien(){
            this("a");
        }
	public NhanVien(String ht){
		this.hoTen = ht;
	}
        public int getMssv(){
            return mssv;
        }
}

public class Practice_1 {
    static void swap(int a[],int index1,int index2){
        int tmp = a[index2];
        a[index2] = a[index1];
        a[index1] = tmp;
    }
    
    static void sort(int a[],int n){
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(a[i] > a[j]){
                    swap(a,i,j);
                }
            }
        }
    }
    
class Test{
        public double tinhDT(double canh,double chieuCao){
            return 0.5 * canh * chieuCao;
    }

//        public double tinhDT(double a,double b){
//            double p = (a + b) / 2;
//            return Math.sqrt(p * (p-a) * (p-b));
    //}
}

    
    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        //WeightedQuickUnionUF uf = new WeightedQuickUnionUF(10);
        //Point p1 = new Point();
//        System.out.print(p1.getXY()[0] + " " + p1.getXY()[1]);
        //Point.getPs();
        for(int i = 0;i<10;i++){
            NhanVien a = new NhanVien();
            System.out.println(a.getMssv());
        }
        
        //System.out.println(p1.x);
        //p1.Cong(0, 0);
        //Point p2 = new Point(2,4);
        /*
        JVM có thể ngầm định chuyển từ một kiểu dữ 
        liệu hẹp sang một kiểu rộng hơn
        */
        
       // System.out.println("Hello World!");
//       long p = (long) 12345.56;
//       int g = (int) p;
//       System.out.println(p);
//       System.out.println(g);
//       char c = 't';
//       int j = (int) c;
//       System.out.println(j);
       
//       short i,j = 5;
//       int n = 6;
//       i = (short)n + j; // error do chỉ có thể đổi từ 1 biến từ kiểu hẹp sang kiểu rộng hơn
//       System.out.println(i);
//         short a = 5;
//         int n;
//         n = (int)a;
//         boolean n = true;

//         if(n){
//             System.out.println("Yes");
//         }
//         else{
//             System.out.println("Nah");
//         }

//         while(true){
//             Scanner obj = new Scanner(System.in);
//             System.out.print("Press [0] to exit : ");
//             int stop = obj.nextInt();
//             if(stop == 0) break;
//             System.out.print("Enter year : ");
//             int year = obj.nextInt();
//             System.out.print("Enter month : ");
//             int month = obj.nextInt();
//             switch(month){
//                 case 1:case 3:case 5:case 7:case 8:case 10:case 12:
//                     System.out.println(31);
//                     break;
//                 case 2:
//                     if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//                         System.out.println(29);
//                         break;
//                     }
//                     else System.out.println(28);
//                 case 4:case 6:case 9:case 11:
//                     System.out.println(30);
//                     break;
//             }
//         }
//         for(int i = 0;i<10;i++){
//             System.out.println("This is the " + i + " loop");
//         }

//          int choice;
//          Scanner obj = new Scanner(System.in);
//          do{
//              System.out.print("Enter your choice : ");
//              choice = obj.nextInt();
//              if(choice == 0) break;
//              System.out.print("You choose the " + choice + " ! \n");
//          }while(choice >= 1);
            
             
//            Random random = new Random();
//            int arr[] = {5,2,4,1,3};
//            sort(arr,MAX);
//            for(int i = 0;i<MAX;i++){
//                System.out.print(arr[i] + "\t");
//            }


//            int a[][] = {
//                {1,2,3,4,5},
//                {2,3,4,5,6},
//                {3,4,5,6,7},
//                {4,5,6,7,8},
//                {5,6,7,8,9}
//            };
//            for(int i = 0;i < MAX;i++){
//                for(int j = 0;j<MAX;j++){
//                    System.out.print(a[i][j] + " ");
//                }
//                System.out.println();
//            }

//        String s1 = "   Hello   ";
//        String s2 = new String("Hello");
//        System.out.println(s1);
//        
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.trim());
//        String s1 = "Hello ";
//        String s2 = "World";
//        System.out.println(s1 + s2);
//        System.out.println(s1.concat(s2));
//        System.out.println(s1);
//        System.out.println(s2);
//        
//        
          //String s1 = "Hello ;,World";
          //String s2 = "World";
//          System.out.println(s1.contains("ll"));
//          System.out.println(s1.indexOf(s2,7));
          //String s3 = s1.substring(6,s1.length());
          //System.out.println(s3);
          //private static final String SPECIAL
//          String s4[] = s1.split("[ :,;'=()!\\[\\]]+");
//          for(String a : s4){
//              System.out.println(a);
//          }

//           System.out.println(s1.replace("o","a")); // Chuyển đổi một ký tự
//           System.out.println(s1.replaceFirst("Hello","Quang")); // chuyển đổi một substring đầu tiên bằng 1
//                                                                 // substring khác
//           System.out.println(s1.replaceAll(s1,s1)); // Chuyển đổi toàn bộ các substring trong chuỗi thành một
//                                                     // substring khác
//           int a = 10;
//           String s_a = String.valueOf(a);
//           System.out.println(s_a);

//           String s_num = "1234";
//           int val_Int = Integer.parseInt(s_num);
//           float val_F = Float.parseFloat(s_num);
//           System.out.println(val_Int + 1);
//           System.out.println(val_F + 1);

//             String str1 = "Hello";
//             str1 = String.format("%s Quang", str1);
//             System.out.println(str1);
//             
//             String str2 = String.format("this %20.3f",15.234324);
//             System.out.println(str2);
//             
//             String str3 = String.format("My company name's is %1$s , %1$S represents for %2$s ","GFG","GeeksforGeeks");
//             System.out.println(str3);

//               int a[] = {3,1,2};
//               int b[] = Arrays.copyOf(a,a.length); // b is different from a
//               b[1] = 10;
//               for(int x : b){
//                   System.out.print(x + " ");
//               }
//               System.out.println();
//               //Arrays.sort(a);
//               for(int x : a){
//                   System.out.print(x + " ");
//               }
//               
//               System.out.println();
//               int[] copied = a; // Doesn't copy elements of a
//                                 // only make b refer to same location
//               copied[1] = 9;
//               for(int x : a){
//                   System.out.print(x + " ");
//               }
//               System.out.println();
//               for(int x : copied){
//                   System.out.print(x + " ");
//               

//                 Date d1 = new Date(); // current date
//                 System.out.println(d1);
//                 
//                 Date d2 = new Date(System.currentTimeMillis() - 1000); // current time but slower than 1000 miliseconds
//                 System.out.println(d2);
                 
//                 Date d1 = new Date(2024,2,4);
//                 Date d2 = new Date();
//                 Date d3 = new Date(2033,1,1);
//                 
//                 boolean a = d3.after(d1);
//                 System.out.println("After ? -> " + a);
//                 
//                 boolean b = d3.before(d2);
//                 System.out.println("Before ? -> " + b);
//                 
//                 int c = d1.compareTo(d2);
//                 System.out.println(c);
                 // return 0 -> equal
                 // return > 0 -> after the Date argument
                 // return < 0 -> before the Date argument
                 
//                  Date d = new Date();
//                  SimpleDateFormat f 
//                           = new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss");
//                  System.out.println(f.format(d));
                  
//                  SimpleDateFormat f
//                          = new SimpleDateFormat("dd/MM/YYYY");
//                  Date d = f.parse("09/04/2019");
//                  System.out.println(d.getTime());

//                 GregorianCalendar c = new GregorianCalendar();
//                 System.out.println(c.get(Calendar.YEAR));
//                 System.out.println(c.get(Calendar.MONTH));
//                 System.out.println(c.get(Calendar.DAY_OF_MONTH));
//                 System.out.println(c.get(Calendar.HOUR));
//                 System.out.println(c.get(Calendar.MINUTE));
//                 System.out.println(c.get(Calendar.SECOND));
//                 System.out.println(c.get(Calendar.AM_PM));
//                 
//                 if(c.isLeapYear(2023)){
//                     System.out.println("Y");
//                 }
//                 else System.out.println("N");
                   
                   // Reading file
//                   File f = new File("D:/Y2S2/OOP/Practice_1/src/data.txt");
//                   try(Scanner in = new Scanner(f)){
//                        String HoTen = in.nextLine();
//                        String mssv = in.nextLine();
//                        double DTB = in.nextDouble();
//                        System.out.printf("Mssv : %s\n" + "Ho ten : %s\n" + "Diem TB : %.2f",mssv,HoTen,DTB);
//                   }
                   
                   // Write file
//                   File f = new File("D:/Y2S2/OOP/Practice_1/src/data.txt");
//                   try(PrintWriter write = new PrintWriter(f)){
//                       write.println("Ho Hoan Hao");
//                       write.println("22510122222");
//                       write.println(8.5);
//                       System.out.println("Done");             
//                       write.close();
//                   }
                   
                   // continue to write file
//                   File new_f = new File("D:/Y2S2/OOP/Practice_1/src/data.txt");
//                   FileWriter w = new FileWriter(new_f,true);
//                   try(PrintWriter write = new PrintWriter(w)){
//                       write.println("Phi Minh Quang");
//                       write.println("2251012121");
//                       write.println(9.25);
//                   }
                   
    }
}
