import java.util.Stack;

public class Pilhainvertida {


    public static String inverterPalavras(String frase) {
        StringBuilder resultado = new StringBuilder();
        String[] palavras = frase.split(" ");

        for (String palavra : palavras) {
            resultado.append(inverterPalavraComPilha(palavra)).append(" ");
        }

        return resultado.toString().trim();
    }


    private static String inverterPalavraComPilha(String palavra) {
        Stack<Character> pilha = new Stack<>();


        for (char c : palavra.toCharArray()) {
            pilha.push(c);
        }


        StringBuilder palavraInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }

        return palavraInvertida.toString();
    }

    public static void main(String[] args) {
        // Exemplo 1
        String exemplo1 = "UM CIENTISTA DA COMPUTACAO E UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVEM RESOLVER OS PROBLEMAS LOGICAMENTE";
        System.out.println("Exemplo 1 Original: " + exemplo1);
        System.out.println("Exemplo 1 Processado: " + inverterPalavras(exemplo1));

        // Exemplo 2
        String exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E O OGOLÓNCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OÃS SO SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED .SAIOG";
        System.out.println("\nExemplo 2 Original: " + exemplo2);
        System.out.println("Exemplo 2 Processado: " + inverterPalavras(exemplo2));
    }
}

