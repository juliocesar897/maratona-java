package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
double salario = 45000;
double taxa;

if(salario <= 34712){
    taxa = 9.70;
}else if (salario >= 34713 && salario <= 68507){
    taxa = 37.35;
}else {
    taxa = 49.50;
}
        System.out.println(salario*taxa/100);
    }
}
