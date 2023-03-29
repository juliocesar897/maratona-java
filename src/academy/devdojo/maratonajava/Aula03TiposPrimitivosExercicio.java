package academy.devdojo.maratonajava;
/*
Prática

Crie váriaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirma que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Julio";
        String endereco = "Rua Catumbi";
        double salario = 500.00;
        String dataRecebimentoSalario = "31/01/2023";
        String relatorio = "Eu "+nome+", morando "+endereco+", confirmo que recebi o salário de "+salario+", na data "+dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}

// DEBUG Ctrl + Shift + F9
