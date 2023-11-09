public class Bear extends Animal  {
   public String vive;
    public int mass;

    public String getVive() {
        return vive;
    }

    public void setVive(String vive) {
        this.vive = vive;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public void bear(){
        System.out.println("Вид медведя: Бурий");


    }
    public void eating(){
        System.out.println("Кушают в основном мясо : рыб, дичь");

    }
    public void sleeping(){
        System.out.println("Спят во время зимной спячки 5-7 мусясеф");

    }

}
