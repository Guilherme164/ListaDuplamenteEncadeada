/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Guilherme
 */
public class Program {
    public static void main(String[] args) {
        Lista li = new Lista();
     
       int i;
        
	System.out.println("Bem vindo ao sistema de lista;");        

    	Scanner leitor = new Scanner(System.in);
       do{
        
        System.out.println("1-Adicionar o primeiro da lista;");
        System.out.println("2-Adicionar em ao final da lista;");
        System.out.println("3-Adicionar em uma posição da lista;");
        System.out.println("4-Remover item da lista pelo indice;");
        System.out.println("5-Remover inicio da lista;");
        System.out.println("6-Remover final da lista;");
        System.out.println("7-Exibe toda a lista;");
        System.out.println("8-Exibe um item da lista;");
        System.out.println("0-sair;");
        int num = leitor.nextInt();
        i = num;
        switch(num) {
        case 1: 
                System.out.println("Informe o nome e o proximo item da lista");
                String x = leitor.next();
                li.addFirst(x);
                li.imprimirTodos();
                break;
         case 2:
               System.out.println("Adicionar ao final da lista:");
               String y = leitor.next();
               li.append(y);
               li.imprimirTodos();
                break;
            
        case 3:
             System.out.println("Adicionar em uma posição da lista, digite o nome do item:");
             String z = leitor.next();
             li.imprimirTodos();
             System.out.println("Qual posição deseja?");
             int c = leitor.nextInt();
             li.addEmPosicao(z, c);
             li.imprimirTodos();
            break;
            
        case 4:
            System.out.println("Remover item da lista pelo indice");
            li.imprimirTodos();
            System.out.println("Qual item deseja remover?");
            int a = leitor.nextInt();
            li.removerEmPosicao(a);
            li.imprimirTodos();
            break;
        case 5:
            System.out.println("Voce optou por remover o item do inicio da lista");
            li.removeInicio();
            System.out.println("Item removido com sucesso:");
            li.imprimirTodos();
            break;
        case 6:
            System.out.println("Voce optou por remover o item do final da lista.");
            li.removeFinal();
            System.out.println("Item removido com sucesso:");
            li.imprimirTodos();
            break;
        case 7:
            System.out.println("Lista:");
            li.imprimirTodos();
            break;
        case 8:
            li.imprimirTodos();
            System.out.println("Qual indice deseja imprimir?");
            int t = leitor.nextInt();
            li.imprimirApenasUm(t);
            break;
        default:
            System.out.println("Este indice do menu não exite!");
         }
           
        } while(i!=0);
       System.out.println("LISTA CONCRETA:");
       li.imprimirTodos();
    } 
}
