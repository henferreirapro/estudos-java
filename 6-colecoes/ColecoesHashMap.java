import java.util.HashMap;
import java.util.Map;

public class ColecoesHashMap {
  public static void main(String[] args) {
    // Criando uma estrutura de HashMap
    Map<String, Integer> notasAlunos = new HashMap<>();

    // Passando valor para nossa estrutura
    notasAlunos.put("Henrique", 7);
    notasAlunos.put("Elias", 8);
    notasAlunos.put("Graves", 10);

    // Passando a chave para recuperar a nota do aluno
    var nota = notasAlunos.get("Graves");
    int segundaNota = notasAlunos.get("Elias");


    // Mostrando no console
    System.out.printf("A nota do aluno é: %d. \n", nota);

    System.out.println("O aluno que teve a segunda melhor nota é: " + segundaNota);

    // Usando For para mostrar dos alunos
    for(Map.Entry<String, Integer> entrada : notasAlunos.entrySet()) {
      String nome = entrada.getKey(); // Recebendo o nome do aluno
      Integer notaAluno = entrada.getValue(); // Recebendo a nota do aluno

      // mostrando a nota formatada
      System.out.printf("A nota do aluno %s é: %d. \n", nome, notaAluno);

      /* Formatação doi print
       * %s recebe stings.
       * %d recebe integer.
      */
    }

  }  
}
