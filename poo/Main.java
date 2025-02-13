import java.util.Scanner;
import models.Pessoa;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa("Marta", 25, "marta@gmail.com");

        pessoa.setNome("José");

          System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());
        
    }
}
