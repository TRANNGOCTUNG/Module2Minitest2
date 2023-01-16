package crispyFlourAndMeat;

import material.Material;

import java.time.LocalDate;

public class Meat extends Material{
    private double weight;
    public Meat (){

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Meat(Double weight, String id, String name, LocalDate manufacturingDate, int cost){
        super(id,name,manufacturingDate,cost);
        this.weight = weight;
    }
@Override
    public double getAmount(){
        return this.weight * this.getCost();
    }
    @Override
    public LocalDate getExpiryDate(){
        return this.getManufacturingDate().plusDays(7);

    }

}
