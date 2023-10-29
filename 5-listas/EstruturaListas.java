import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * EstruturaListas
 */
public class EstruturaListas {

  public static void main(String[] args) {
    
    // Primeira forma de Criar a lista
    List<String> nomesPessoas = new ArrayList<>();

    // add nomes a lista com comando .add( )
    nomesPessoas.add("Henrique");
    nomesPessoas.add("Nobara");
    nomesPessoas.add("Itadori");
    nomesPessoas.add("Mei Mei");


    // Segunda forma de criar uma lista
    String[] nomePersonagens = { // Criando um array com strings
      "Suguru Geto",
      "Nanami", 
      "Gostoso do Pai do Megumi Toji Fushiguro"
    };

    // Transformando o array em uma lista com o comando .asList
    List<String> listaPersonagens = new ArrayList<>(
      Arrays.asList(nomePersonagens));

    
    // Acessando as listas
    nomesPessoas.forEach( pessoa ->
    System.out.println("O nome da pessoa é: " + pessoa + "."));

    listaPersonagens.forEach( personagem ->
    System.out.printf("O nome do Personagem é: %s. \n", personagem));

  }
}
