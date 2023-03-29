package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria juvenil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 12;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else  {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}

//Variaveis locais precisam ser inicializadas se não o código vai falhar
