package ocpjp;

public class Question53 {

  public void foo() throws FooException {
    throw new FooException();
  }
}

//FooException不為RuntimeError
//必為checked
//可拋出FooException或子類別
class FooException extends Exception {

}
