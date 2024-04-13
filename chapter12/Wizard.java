public class Wizard extends Character {
  int mp;
  public void attack() {
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に3ポイントのダメージ");
  }
  public void fireball() {
    System.out.println(this.name + "は火の玉を放った");
    System.out.println("敵に20ポイントのダメージ");
    this.mp -= 5;
  }
}
