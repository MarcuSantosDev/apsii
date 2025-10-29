package implementacao_codigo_pato;

public class FlyWithWings implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("Estou voando com minhas asas!");
  }
}