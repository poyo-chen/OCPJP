package ocpjp;

public class Question72 {

  static String prefix = "Global:";
  private String name = "namescope";

  public static String getName() {
    return new Question72().name;
  }

  public static void main(String[] args) {
    Question72 t=new Question72();
    //name不為static
//    System.out.println(Question72.prefix+Question72.name());
    System.out.println(new Question72().prefix+new Question72().name);
    System.out.println(Question72.prefix+Question72.getName());
    System.out.println(Question72.getName()+prefix);
    //name不為static
//    System.out.println(prefix+Question72.name);
    //name不為static
//    System.out.println(prefix+name);
  }

}
