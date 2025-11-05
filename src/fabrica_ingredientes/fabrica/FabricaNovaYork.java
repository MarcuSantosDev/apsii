package fabrica_ingredientes.fabrica;

import fabrica_ingredientes.ingredientes.*;

public class FabricaNovaYork implements FabricaIngredientes {
  public Massa criarMassa() {
    return new MassaFina();
  }

  public Molho criarMolho() {
    return new MolhoMarinara();
  }

  public Queijo criarQueijo() {
    return new QueijoRalado();
  }
}
