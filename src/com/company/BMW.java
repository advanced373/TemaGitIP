
package com.company;

public class BMW implements ICar{
    public int registrationNumber;
    public int year;
    public int HP;
    public String color;
    BMW()
    {
        this.registrationNumber=0;
        this.year=0;
        this.HP=0;
        this.color="white";
    }
    BMW(int registrationNumber, int year, int HP, String color)
    {
        this.registrationNumber=registrationNumber;
        this.year=year;
        this.HP=HP;
        this.color=color;
    }
    @Override
    public void DisplayCharacteristics() {
        System.out.println("Registration number:"+this.registrationNumber+"Color: "+this.color+" HP: "+this.HP + " year: "+this.year);
    }
}
