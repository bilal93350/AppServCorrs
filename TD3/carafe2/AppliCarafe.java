package carafe2;

public class AppliCarafe {
  public static void main(String[] args) {
    Carafe carafe = new Carafe();
    new GarconDeCafe("MyBrette", carafe);
    new Convive("Alfred", carafe, 10);
    new Convive("Bebert", carafe, 10);
    new Convive("Chochotte", carafe, 10);
  }
}
