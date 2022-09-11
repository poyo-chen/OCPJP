package ojpcp;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Question82 {

  public static void main(String[] args) {
    List<Employee> roster = new ArrayList<>();
    Predicate<Employee> y = (Employee e) -> e.getBirthday()
        .isBefore(IsoChronology.INSTANCE.date(1989, 1, 1));
    Set<String> s1 = roster.stream()
        .collect(Collectors.partitioningBy(y)).get(true).stream().map(Employee::getName).collect(
            Collectors.toSet());
    System.out.println(s1);
  }
}

class Employee {

  private String name;
  private LocalDate birthday;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }
}
