package Seminar.Java_6;

import java.util.Objects;
import java.util.Random;

public class Laptop {

    public Laptop(){
        Laptop.countModel ++;
    }

    private static int countModel = 0;
    private String modelLaptops = "Laptop "+countModel;
    private String os = countModel % 2 == 0? "MacOS" : "Windows";
    private int ram = countModel % 2 == 0 ? 8 : 16;
    private int hdd = countModel % 2 !=0 ? 240 : 120;
    private String color = this.os.equals ("MacOS") ? "Silver" : "Black";

    @Override
    public String toString () {
        return String.format ("Ноутбук модель: %s\n Операционная система: %s\n Оперативная память: %s\n Жесткий диск: %d\n Цвет ноутбука: %s ",this.modelLaptops,this.os,this.ram,this.hdd,this.color);
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && hdd == laptop.hdd && modelLaptops.equals (laptop.modelLaptops) && os.equals (laptop.os) && color.equals (laptop.color);
    }

    @Override
    public int hashCode () {
        return Objects.hash (modelLaptops, os, ram, hdd, color);
    }

    public String getOs () {
        return os;
    }

    public int getRam () {
        return ram;
    }

    public int getHdd () {
        return hdd;
    }

}
