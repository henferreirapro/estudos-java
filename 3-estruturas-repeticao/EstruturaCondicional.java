

public class EstruturaCondicional {
  public static void main(String[] args) {
    int idadePessoa = 17;
    String nomePessoa = "Henrique";

    if (idadePessoa >= 18) {
      System.out.println("Olá " + nomePessoa + ", você é maior de idade");

    } else if (idadePessoa > 15) {
      System.out.println(nomePessoa + " não é maior de idade, más esta proximo dos 18 anos.");

    } else {
      System.out.println(nomePessoa + " tem menos de 18 anos.");
      
    }
  }
}
