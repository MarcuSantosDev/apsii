package implementacao_codigo_pato;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Pato não consegue fazer Quack");
  }
}