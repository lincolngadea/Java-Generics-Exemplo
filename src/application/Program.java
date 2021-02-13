package application;

import service.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        Se alterarmos o Tipo do objeto para String a aplicação só receberá
        dados de String, e assim caracteriza-se um Genérics
        Permitem que **Classes, interfaces e objetos,** possam ser parametrizados por tipo.
         */
        PrintService<Integer> ps = new PrintService<>();

        System.out.println("How many values?");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
