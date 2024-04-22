import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate ldate = LocalDate.parse("2023/09/22", fmt);

    LocalDate ldatep = ldate.plusDays(1000);
    String str = ldatep.format(fmt);
    System.out.println("1000日後は" + str);

    LocalDate now = LocalDate.now();
    if (now.isBefore(ldatep)) {
      System.out.println("本日は、その日より過去です");
    }
  }
}
