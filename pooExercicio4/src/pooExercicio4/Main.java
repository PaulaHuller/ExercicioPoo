package pooExercicio4;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int maiorIdade = 0;
        String pessoaMaisVelha = "";

        List<Pessoa> pessoas = new ArrayList<>( );

        Pessoa pessoa = new Pessoa("Joao", 15);
        Pessoa pessoa1 = new Pessoa("Leandro", 21);
        Pessoa pessoa2 = new Pessoa("Paulo", 17);
        Pessoa pessoa3 = new Pessoa("Jessica", 18);

        pessoas.add(pessoa);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        for(Pessoa p : pessoas){
            if(pessoa.idade > maiorIdade ){
                maiorIdade = pessoa.idade;
                pessoaMaisVelha = pessoa.nome;
            } else if(pessoa1.idade > maiorIdade ) {
                maiorIdade = pessoa1.idade;
                pessoaMaisVelha = pessoa1.nome;
            } else if (pessoa2.idade > maiorIdade ){
                maiorIdade = pessoa2.idade;
                pessoaMaisVelha = pessoa2.nome;
            }else if (pessoa3.idade > maiorIdade ){
                maiorIdade = pessoa3.idade;
                pessoaMaisVelha = pessoa3.nome;
            }
        }
        System.out.println(String.format("A pessoa mais velha é %s com %s anos de idade", pessoaMaisVelha, maiorIdade));



    }
}