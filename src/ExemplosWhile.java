import java.util.concurrent.ThreadLocalRandom;

public class ExemplosWhile {
    
    public static void main(String[] args) {
        
        double mesada = 50.0;

        while(mesada > 0){

            double valorDoce = valorAleatorio();

                if (valorDoce > mesada)
                valorDoce = mesada;  // se for true, essa op garante que o valor do doce não passo do valor da mesada.

                System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho ");
                mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println(" Joaozinho gastou toda a sua mesada em doces");
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
