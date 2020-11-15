public class Mercedes implements ICar{

    @Override
    public void DisplayCharacteristics() {
        System.out.println("Caracteristicile masinii sunt:\n");
    }

    public int regisitrationNumber;
    public int year;
    public int HP;
    public String color;

    public Mercedes(int reg_nr, int m_year, int hp, String m_color)
    {
        regisitrationNumber = reg_nr;
        year= m_year;
        HP = hp;
        color = m_color;
    }
}
