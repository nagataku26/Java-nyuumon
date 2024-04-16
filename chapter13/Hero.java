public class Hero {
  private int hp;
  private String name;
  private Sword sword;

  void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した");
  }
  private void die() {
    System.out.println(this.name + "は死んでしまった");
    System.out.println(GAME OVERです);
  }
  public void attack() {
  }
  public String getName() {
    return this.name;
  }
}
