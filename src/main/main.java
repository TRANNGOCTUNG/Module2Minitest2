package main;

import crispyFlourAndMeat.CrispyFlour;
import crispyFlourAndMeat.Meat;
import material.Material;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        Material[] materials = new Material[10];
        System.out.println(materials);

        materials[0] = new CrispyFlour(10,"Number 1","RiceFlow", LocalDate.of(2000,1,1),20000);
        materials[1] = new CrispyFlour(12,"Number 2","Flour",LocalDate.of(20001,2,2),30000);
        materials[2] = new CrispyFlour(13,"Number 3","CornFlour",LocalDate.of(2002,3,3),40000);
        materials[3] = new CrispyFlour(14,"Number 4","GlutinousRiceFlour",LocalDate.of(2003,4,4),50000);
        materials[4] = new CrispyFlour(15,"Number 5","CassavaFlour",LocalDate.of(2004,5, 5),60000);
        materials[5] = new Meat(20.5,"Number 6","CassavaFlour",LocalDate.of(2004,5, 5),70000);
        materials[6] = new Meat(21.5,"Number 7","CassavaFlour",LocalDate.of(2004,5, 5),80000);
        materials[7] = new Meat(22.5,"Number 8","CassavaFlour",LocalDate.of(2004,5, 5),90000);
        materials[8] = new Meat(23.5,"Number 9","CassavaFlour",LocalDate.of(2004,5, 5),100000);
        materials[9] = new Meat(24.5,"Number 10","CassavaFlour",LocalDate.of(2004,5, 5),110000);

        for (Material material : materials) {
            System.out.println(material);
            }
        }
}
