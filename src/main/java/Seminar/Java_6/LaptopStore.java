package Seminar.Java_6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LaptopStore {
    private Set<Laptop> laptopSet = null;

    public LaptopStore(){
        this.laptopSet = FillStoreWithALotOfLaptops();
    }

    private Set<Laptop> FillStoreWithALotOfLaptops(){
        Set<Laptop> set = new HashSet<> ();
        for (int i = 0; i < 45 ; i++) {
            set.add (new Laptop ());
        }
        return set;
    }

    public Set<Laptop> getLaptopSet () {
        return laptopSet;
    }

    public void sortLaptop(Set<Laptop> laptops,String os, int ram, int hdd){

        for (Laptop laptop: laptops) {
            if (laptop.getOs ().equals (os) && laptop.getRam () == ram && laptop.getHdd () == hdd){
                System.out.println ("Для Вас найден\n"+laptop);
            }
        }
    }
}
