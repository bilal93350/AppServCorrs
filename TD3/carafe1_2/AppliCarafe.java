package carafe1_2;

public class AppliCarafe {
  public static void main(String[] args) {
    Carafe carafe = new Carafe();
    new GarconDeCafe("Brette", carafe, 75);
    new Convive("Alfred", carafe, 25);
    new Convive("Bebert", carafe, 18);
    new Convive("Chochotte", carafe, 35);
  }
}
