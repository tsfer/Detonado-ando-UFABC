/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2.ano.passado;

import java.util.Scanner;

/**
 *
 * @author tsfer
 */
public class P2AnoPassado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner leia=new Scanner (System.in);
 
int N;
float mediaA=0;
float somaA=0;
int maiorA=0, menorA=0;

        System.out.println("Digite N: ");
        N=leia.nextInt();
        
int A [][]=new int [N][N];
int B [][]=new int [N][N];

//lendo a matriz A
for (int l=0;l<N;l++)
{
for (int c=0;c<N;c++)
{
    System.out.println("Digite o elemento "+ l+", "+c+" da matriz A: ");
    A [l][c]=leia.nextInt();
}
}

//Calcular a média da matriz A= Somar todos os elementos de a e dividir por n de elementos=(N*N)
for (int l=0;l<N;l++)
{
for (int c=0;c<N;c++)
{
   somaA= A [l][c]+somaA;
   mediaA=somaA/(N*N);
}
}

// maior elemento de A
for (int l=0;l<N;l++)
{
for (int c=0;c<N;c++)
{
   if (A[l][c]>A[0][0])
   {
       maiorA=A[l][c];
   }
}
}
        System.out.println("Maior é "+maiorA);
//menor elemento de A
for (int l=0;l<N;l++)
{
for (int c=0;c<N;c++)
{
   if (A[l][c]>A[0][0])
   {
       maiorA=A[l][c];
   }
}
}
//
for(int i=0;i<N;i++)
{
    for (int j=0;j<N;j++)
    {
        if (A[i][j]>mediaA)
        {
            B[i][j]=maiorA;
        }
    else//fica igual ao elemento de A
        {
            B[i][j]=A[i][j];
        }
    }
}
                                                                                                                                                                                 
// Na matriz B entram todos os elementos que forem maiores que a média dos elementos da matrix a  os elementos da matriz
ImprimeMatriz(A);
ImprimeMatriz(B);

}// fim do main
    public static void ImprimeMatriz (int M[][]){
        
        for(int l=0;l<M.length;l++)
        {
            for(int c=0;c<M.length;c++)
            {
                System.out.print(" "+M[l][c]);
            }
            System.out.println(" ");
        }
    
       
    }
}