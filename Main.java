package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    arvorebinaria a =new arvorebinaria();
    int op=0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1- Inserir um numero.");
            System.out.println("2- Verificar número.");
            System.out.println("3- Verificar In Ordem.");
            System.out.println("4- Verificar Pós Ordem.");
            System.out.println("5 - Veridicar Pré Ordem.");
            System.out.println("6 - Remover número \n");
            op=scan.nextInt();
            if (op==1){
                int num=0;
                System.out.println("Digite o numero.");
                num=scan.nextInt();
                a.inserir(num);

            }
            if (op==2){
                int num=0;
                System.out.println("Digite o numero que procura.");
                num=scan.nextInt();
                a.localizar(a,num);
            }
            if (op==3){
                a.InOrdem();
            }
            if (op==4){
                a.PosOrdem();
            }
            if (op==5){
                a.PreOrdem();
            }
            if (op==6){
                a = arvorebinaria.remover(a, scan.nextInt());
                a.InOrdem();
            }


        }while(op!=0);
    }
}