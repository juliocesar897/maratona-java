package academy.devdojo.maratonajava;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double,float,char,byte,short,long,boolean
        int idade = (int) 100000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";


        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println("char"+caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é "+nome);
    }
}

//tecla de atalho psvm + ENTER = public static void main(String[] args)

//Crtl + Shift + F10 para executar o codigo

//Tipos Primitivos = São os tipos que vão guardar em memoria um valor simples
//int, double,float,char,byte,short,long,boolean

/*Sintaxe do java
Para Criar uma variavel
1 - Coloca o Tipo
2 - Depois o nome
Ex: int idadeDoPai (Atenção ao tamnho das letras)
 */

// Com exceção do tipo boolean todos os outros são numéricos

//tabelinha do tamamnho das variaveis (ver no note)

//Ctrl + D = duplicar linha

// Tipo char - Tabela Ascii -- converte numero em texto (ver no note)

// Tabela Unicode (ver no note)

// String é uma classe

//sout + enter atalho para System.out.print