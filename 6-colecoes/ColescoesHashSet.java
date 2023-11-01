import java.util.HashSet;
import java.util.Set;

/**
 * ColescoesHashSet
 */
public class ColescoesHashSet {

  public static void main(String[] args) {

    // Criando uma estrutura de HashSet
    Set<Integer> numeros = new HashSet<>();


    // Add itens ao HashSet
    numeros.add(10);
    numeros.add(2);
    numeros.add(14);
    numeros.add(14);
    numeros.add(15);

    // Verificando o tamanho do hashSet
    System.out.println("O tamanho do HashSet é: " + numeros.size());

    // Removendo um item da lista
    numeros.remove(15);

    // visualizando os elementos do HashSet com For
    for(Integer elemento : numeros) {
      System.out.printf("O Elemento é: %d. \n", elemento);

    }

    // Verificando se existe um número no HashSet com o .contains
    System.out.printf("O número 15 existe? %s.", numeros.contains(15));

  }
}
