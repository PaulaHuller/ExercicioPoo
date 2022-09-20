package pooExercicio5;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int maiorIdade = 0;
        String pessoaMaisVelha = "";

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa("Joao", 15);
        Pessoa pessoa1 = new Pessoa("Leandro", 21);
        Pessoa pessoa2 = new Pessoa("Paulo", 17);
        Pessoa pessoa3 = new Pessoa("Jessica", 18);

        pessoas.add(pessoa);
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);


        System.out.println(pessoas);



        // Descobrir o mais velho
        for(int i = 0; i < pessoas.size(); ++i){

            if(pessoa.idade > maiorIdade ){
                maiorIdade = pessoa.idade;
                pessoaMaisVelha = pessoa.nome;

            } else if(pessoa1.idade > maiorIdade ) {
                maiorIdade = pessoa1.idade;
                pessoaMaisVelha = pessoa1.nome;

            } else if (pessoa2.idade > maiorIdade ){
                maiorIdade = pessoa2.idade;
                pessoaMaisVelha = pessoa2.nome;

            }else if (pessoa3.idade > maiorIdade ) {
                maiorIdade = pessoa3.idade;
                pessoaMaisVelha = pessoa3.nome;

            }

        }



        System.out.println(String.format("A pessoa mais velha é %s com %s anos de idade", pessoaMaisVelha, maiorIdade));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=");
        // Remover pessoa da lista

        List<Pessoa> maisVelho = new ArrayList<>();
        if (pessoa.pessoasMaiorIdade() == true){
            maisVelho.add(pessoa);
        }else if(pessoa1.pessoasMaiorIdade() == true){
            maisVelho.add(pessoa1);
        }else if(pessoa2.pessoasMaiorIdade() == true){
            maisVelho.add(pessoa2);
        }else if(pessoa3.pessoasMaiorIdade() == true){
            maisVelho.add(pessoa3);
        }
        System.out.println(maisVelho);




    }
}

/*
*
* else if(pessoa.idade < 18){
                pessoas.remove(0);

            }else if(pessoa1.idade < 18){
                pessoas.remove(1);

            }else if(pessoa2.idade < 18){
                pessoas.remove(2);

            }else if(pessoa3.idade < 18){
                pessoas.remove(3);
            }
            *
            *
            * */