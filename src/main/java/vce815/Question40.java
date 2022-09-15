package vce815;

import static java.time.DayOfWeek.TUESDAY;

import java.time.LocalDate;

public class Question40 {

  public static void main(String[] args) {
    var today = LocalDate.now().with(TUESDAY).getDayOfWeek();
    switch (today) {
      case SUNDAY:
      case SATURDAY:
        System.out.println("Weekend");
        break;
      case FRIDAY:
        System.out.println("Working");
      default:
        System.out.println("Unknown");
    }
  }
}
