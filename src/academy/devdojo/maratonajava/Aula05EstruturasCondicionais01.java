package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        }else {
            System.out.println("Não Autorizado a comprar bebida alcoolica");
        }
        if (!isAutorizadoComprarBebida == false)
            System.out.println("Não Autorizado a comprar bebida alcoolica");

        boolean c = true;
        if (c == false) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }

}
