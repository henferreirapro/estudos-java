import java.util.ArrayList;
import java.util.List;

public class EstruturaForEach {
  public static void main(String[] args) {

    // criando uma lista
    List<String> nomesPessoas = new ArrayList<>();

    // add pessoas a lista
    nomesPessoas.add("Julio");
    nomesPessoas.add("Elen");
    nomesPessoas.add("Henrique");
    
    // usando forEach para mostrar as pessoas
    nomesPessoas.forEach( pessoa -> System.out.println("O nome da pessoa é: " + pessoa + "."));


    System.out.println("\nForEach finalizado!");
  }
  
}
