package vce815;

import java.util.ArrayList;

public class Question60 {

  //  var employee = new Employee(); //不可宣告在全域變數
//  public var display() {  //不可宣告在方法回傳型別
  public void display() {
    var employee = new Employee();
    var offices = new ArrayList<>();
    offices.add("Chicago");
    offices.add("Bangalore");
    for (var office : offices) {
      System.out.println("Employee Location" + office);
    }
  }
}

class Employee {

  String office;
}