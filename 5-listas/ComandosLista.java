import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComandosLista {
  public static void main(String[] args) {
    // Criando a lista
    List<String> nomesAnimes = new ArrayList<>();


    // add nomes a lista com comando .add( )
    nomesAnimes.add("Jujutsu Kaisen");
    nomesAnimes.add("Boku no Pico");
    nomesAnimes.add("Kimetsu no Yaiba");
    nomesAnimes.add("Ataque dos Titans loucos");


    // Removendo item da lista
    nomesAnimes.remove(3); //remove o primeiro item


    // Vendo a quantidade de elementos de uma lista com o .size( )
    System.out.println("A quantidade de itens da lista é: " + nomesAnimes.size());

    
    // Ordenando uma lista com o Collections.sort( )
    Collections.sort(nomesAnimes); // Comando para ordernar a lista
    System.out.println("A lista ordenada: " + nomesAnimes);


    // acessando a lista
    nomesAnimes.forEach( nome -> 
    System.out.printf("O nome do anime é: %s.\n", nome));

  }
}
