package fabrica_ingredientes.fabrica;

import fabrica_ingredientes.ingredientes.*;

public class FabricaChicago implements FabricaIngredientes {
  public Massa criarMassa() {
    return new MassaGrossa();
  }

  public Molho criarMolho() {
    return new MolhoTomateProfundo();
  }

  public Queijo criarQueijo() {
    return new QueijoMucarela();
  }
}
