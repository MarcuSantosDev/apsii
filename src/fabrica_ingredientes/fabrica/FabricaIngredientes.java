package fabrica_ingredientes.fabrica;

import fabrica_ingredientes.ingredientes.Massa;
import fabrica_ingredientes.ingredientes.Molho;
import fabrica_ingredientes.ingredientes.Queijo;

public interface FabricaIngredientes {
  Massa criarMassa();

  Molho criarMolho();

  Queijo criarQueijo();
}
