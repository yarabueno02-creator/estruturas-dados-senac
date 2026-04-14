package Recursividade;

public class Recursividade {

    public static int somaRecursiva(int n){
        if (n <= 0 ){
            return 0;
    }
    return n + somaRecursiva ( n - 1 );
    }
    public static int somaIterativa(int n){
        int soma = 0;
        for (int i = 1; i <= n; i++){
            soma += 1;
        }
        return soma;
    }
    public static void main(String[] args) {

        System.out.println(somaIterativa(5));
        System.out.println(somaRecursiva(5));
    }
}

