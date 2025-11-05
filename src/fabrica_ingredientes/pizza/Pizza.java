package fabrica_ingredientes.pizza;

import fabrica_ingredientes.ingredientes.*;
import fabrica_ingredientes.fabrica.FabricaIngredientes;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
  private Massa massa;
  private Molho molho;
  private Queijo queijo;
  private List<String> extras = new ArrayList<>();
  private String sabor;

  public Pizza(String sabor, FabricaIngredientes fabrica) {
    this.sabor = sabor.toLowerCase();
    montarPizza(fabrica);
  }

  private void montarPizza(FabricaIngredientes fabrica) {
    // Ingredientes padrão da fábrica
    massa = fabrica.criarMassa();
    molho = fabrica.criarMolho();
    queijo = fabrica.criarQueijo();

    // Ingredientes extras dependendo do sabor
    switch (sabor) {
      case "calabresa":
        extras.add(new Calabresa().getTipo());
        break;
      case "pepperoni":
        extras.add(new Pepperoni().getTipo());
        break;
      case "queijo":
        break;
      default:
        System.out.println("Sabor não reconhecido, usando padrão.");
        break;
    }
  }

  public void mostrarIngredientes() {
    System.out.println("Pizza de " + sabor + ":");
    System.out.println("- " + massa.getTipo());
    System.out.println("- " + molho.getTipo());
    System.out.println("- " + queijo.getTipo());
    for (String extra : extras) {
      System.out.println("- " + extra);
    }
  }
}
