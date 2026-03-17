public class ArrayEstatico{
public static void main(String[] args) {

    int [] numeros;
    numeros = new int [8];
    
    int tamanho = 0;

    tamanho = inserirNoFim(numeros, tamanho, 10);
    tamanho = inserirNoFim(numeros, tamanho, 20);
    tamanho = inserirNoFim(numeros, tamanho, 30);
    tamanho = inserirNoFim(numeros, tamanho, 40);
    tamanho = inserirNoFim(numeros, tamanho, 50);
    tamanho = inserirNoFim(numeros, tamanho, 60);
    tamanho = inserirNoFim(numeros, tamanho, 70);
    tamanho = inserirNoFim(numeros, tamanho, 80);
    tamanho = inserirNoFim(numeros, tamanho, 90);

    System.out.println( "Capacidade do array: " + numeros.length);
    System.out.println( "Elemento no indice 1: " + numeros[1]);
    System.out.println( "Elemento no indice 1: " + numeros);
    exibir(numeros, tamanho);
    removerPorIndice(numeros, tamanho, tamanho);

    }   
    public static int inserirNoFim(int[] array,int tamanho, int valor){
        if (tamanho >= array.length){
            System.out.println("Esta cheio: " + valor);
            return tamanho;
       }
       array[tamanho] =  valor;
       return tamanho + 1; 
    }
    public static void exibir (int[] array,int tamanho) {
        for (int i = 0; i < tamanho; i++){
            System.out.println("Indice " + i + "-> " + array [i]);
        }
    }
    public static int removerPorIndice(int[] array,int tamanho, int indice){
        if (tamanho == 0 ) {
            System.out.println("Vazio");
            return tamanho;
        }
        if (indice < 0 || indice >= tamanho){
            System.out.println("Indice invalido");
            return tamanho;
        }
        for (int i = indice; i < tamanho - 1; i ++){
            array[i] = array [i = 1];
    }
    array [tamanho - 1] = 0;
    return tamanho - 1;
  }
}