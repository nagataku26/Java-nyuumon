import java.time.*;

public class Main {
  public static void main(String[] args) {
    LocalDateTime l1 = LocalDateTime.now();
    LocalDateTime l2 = LocalDateTime.of(2024, 1, 1, 9, 5, 0, 0);

    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime l3 = z1.toLocalDateTime();
    System.out.println(l3);
  }
}
