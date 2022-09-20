package pooExercicio5;
public class Pessoa {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    int idade;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome;
    }

    public boolean pessoasMaiorIdade(){
        if (idade >= 18) {
            return true;

        } else {
            return false;
        }
    }
}