package Seminar.Java_6;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите требуемую операционную систему: Windows или MacOS");
        String os = scanner.nextLine ();
        System.out.println ("Введите число Гб оперативной памяти: 8 или 16 ");
        int ram = scanner.nextInt ();
        System.out.println ("Введите число Гб памяти SSD: 120 или 240 ");
        int hdd = scanner.nextInt ();

        LaptopStore laptopStore = new LaptopStore ();
        laptopStore.sortLaptop (laptopStore.getLaptopSet (),os,ram,hdd);

    }
}
