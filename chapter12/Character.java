public abstract class Character {
  String name;
  int hp;
  public void run() { System.out.println("逃げた"); }
  public abstract void attack();
}
