public class Main {
  public static void main(String[] args) {
    Wizard w = new Wizard();
    Character c = w;
    c.name = "アサカ";
    c.attack();
    c.fireball();
  }
}
