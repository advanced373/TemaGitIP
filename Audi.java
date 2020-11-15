
public class Audi implements ICar{

    @Override
    public void DisplayCharacteristics() {
        System.out.println("Caracteristicile masinii sunt:");
        System.out.println("Marca: Audi;\n");
        System.out.println("Reg nr:"+ registrationNumber +";\n");
        System.out.println("Year:"+year+";\n");
        System.out.println("HP:"+HP+";\n");
        System.out.println("Color:"+color+";\n");
    }

    public int registrationNumber;
    public int year;
    public int HP;
    public String color;

    public Audi(int reg_nr, int m_year, int hp, String m_color)
    {
        registrationNumber = reg_nr;
        year= m_year;
        HP = hp;
        color = m_color;
    }

}

