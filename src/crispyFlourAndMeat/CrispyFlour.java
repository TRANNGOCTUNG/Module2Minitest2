package crispyFlourAndMeat;

import material.Material;

import java.time.LocalDate;

public class CrispyFlour extends Material {

    private  int quantity;
    public CrispyFlour(){
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(int quantity, String id, String name, LocalDate manufacturingDate, int cost){
        super(id,name,manufacturingDate,cost);
        this.quantity = quantity;
    }
    @Override
    public  double getAmount(){
        return  this.quantity * this.getCost();
    }
    @Override
    public LocalDate getExpiryDate(){
        return this.getManufacturingDate().plusDays(1l);
    }

    }

