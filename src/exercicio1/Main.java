package exercicio1;

public class Main {
  public static void main(String[] args) {
    MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

    Aniversariante a1 = new Aniversariante("Marcus", 27, 7);
    Aniversariante a2 = new Aniversariante("Sônia", new DataAniversario(23, 8));

    agenda.adicionar(a1);
    agenda.adicionar(a2);

    System.out.println("Lista de aniversariantes:");
    for (Aniversariante a : agenda.listarTodos()) {
      System.out.println(a);
    }
  }
}
