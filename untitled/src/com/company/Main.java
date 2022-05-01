package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Kurs Udemy 23.-33. - Compiler vs Interpreter
        //Interpreter mesela bir texti cevirir- Ama Compiler cevirmez yeni bir cikti olarak ingilizcesini olusturur.
        //C++ compiler based language, JavaScript Interpreter(Browser) based language.
        // But Java is Hybrid language; include both of them.
        //Interpreter: it ll executet for every line. Easier to learn
        // Compiler: it ll produced seperate file for all. Faster
        //java is platform independent:
        //SourceCode>FirsJava>FirstClass(Byte code)>JVM>OperatingSystem>HardWare
        //OtherLaguage(C++):
        //SourceCode>Firs.exe(machine code)>OperatingSystem>HardWare
        //WORA = write(and compile) once run anywhere = java is platform independent

      //33. Student Challenge (Total area+ volume)
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        int totalArea, volume;

        System.out.println("Enter length, breath and height :");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        int area1 = length*breadth;
        int area2 = height*breadth;

        totalArea = area1*4 + area2*2;
        volume = length*breadth*height;

        System.out.println("Total area is: "+ totalArea+ "And The volume is :"+ volume);

    }
}
