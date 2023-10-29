import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AcessandoListas {
  public static void main(String[] args) {
    String[] nomePersonagens = {
      "Suguru Geto",
      "Nanami", 
      "Gostoso do Pai do Megumi Toji Fushiguro"
    };
    List<String> listaPersonagens = new ArrayList<>(Arrays.asList(nomePersonagens));


    // Buscando um item da lista pelo indice com o comando .get( )
    System.out.println(listaPersonagens.get(1));

    // acessando a lista usando For
    for(String personagem : listaPersonagens) {
      System.out.println("O personagem é: " + personagem + ".");
    }


    // acessando a lista usando ForEach
    listaPersonagens.forEach( nome ->
    System.out.printf("O nome do Personagem é: %s. \n", nome));


  }
}
