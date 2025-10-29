package implementacao_codigo_pato;

public class FlyNoWay implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Eu não posso voar.");
  }
}