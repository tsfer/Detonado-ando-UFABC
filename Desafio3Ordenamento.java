/*
 * Algoritmos de ordenação são muito comuns em computação. Eles são
utilizados, por exemplo, para mostrar a sua lista de músicas em ordem
de preferência ou ainda para listar os vídeos do YouTube por número de
exibições. Um dos mais simples algoritmos de ordenação utiliza vetores
para armazenar os elementos a serem ordenados e trabalha através da
troca de posições entre elementos adjacentes que estão fora de ordem. Por
exemplo, imagine que o seu programa receba o seguinte vetor de inteiros
(9, 5, 2, 3, 1). A saída desejada é então: (1, 2, 3, 5, 9). Para
chegar a este ponto, o algoritmo varre o vetor N − 1 vezes comparando
os elementos adjacentes, v[i] e v[i + 1] e efetuando a troca entre eles caso
não estejam em ordem crescente, ou seja, se v[i + 1] < v[i].
 */
package desafio3ordenamento;

import java.util.Random;

/**
 *
 * @author tsfer
 */
public class Desafio3Ordenamento {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        int nJogadas = 15;
        int qtd = 0;
        int[] sorteados = new int[nJogadas];
// SorteIO
        while (qtd < nJogadas) {
            
            // Sem o +1 não funciona ;)
            int candidato = rand.nextInt(25) + 1;
          
            
            
            //Lembrar de Excluir os repetidos... 
            
            boolean repetido = false;
            for (int i = 0; i < qtd && !repetido; i++) {
                repetido = sorteados[i] == candidato;
            }
            if (!repetido) {
                sorteados[qtd++] = candidato;
            }
        }

    //Imprimir
        for (int i = 0; i < nJogadas; i++) {
            System.out.print(sorteados[i] +  " ");
        }
        System.out.println();

    }
        
    //Fim amiguinho
    
    
}
