package pooExercicio3;


import java.util.ArrayList;
import java.util.Random;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public ArrayList getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(ArrayList magia) {
        this.habilidade = magia;
    }

    ArrayList habilidade = new ArrayList();


    @Override
    public void lvlUp() {
        super.lvlUp();
        vida += 5;
        forca += 5;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(String.format("Parabéns você acaba de upar seu personagem %s. Esses são os atribulos atualizados:\nVida: %s\nMana: %s\nXp: %s\nInteligencia: %s\nForça: %s\nLevel: %s ", nome, vida, mana, xp, inteligencia, forca, level));
    }

    public void attack() {
        Random random = new Random();
        int valorAleatorio = random.nextInt(300);
        int forcaDeAtaque = (forca * level) + valorAleatorio;
        System.out.println(String.format("%s acabou de atacar e a força de seu ataque foi %s", nome, forcaDeAtaque));
    }
}