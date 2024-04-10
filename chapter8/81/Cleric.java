public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;
  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた!");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大まで回復した");
  }
  public int pray(int sec) {
    System.out.println(this.name + "は、天に向かって" + sec "秒祈った");
    int mpRecover = new java.util.Random().next(3) + sec;
    int mpRealRecover = Math.min(this.MAX_MP - this.mp, mpRecover);
    this.mp += mpRealRecover;
    System.out.println("MPが" + mpRealRecover + "回復した");
    return mpRealRecover;
  }
}
