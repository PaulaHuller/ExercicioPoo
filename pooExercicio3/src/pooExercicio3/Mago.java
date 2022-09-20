package pooExercicio3;


import java.util.ArrayList;
import java.util.Random;

public class Mago extends Personagem {

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    public ArrayList getMagia() {
        return magia;
    }

    public void setMagia(ArrayList magia) {
        this.magia = magia;
    }

    ArrayList magia = new ArrayList();

    @Override
    public void lvlUp() {
        super.lvlUp();
        mana += 5;
        inteligencia += 5;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(String.format("Parabéns você acaba de upar seu personagem %s. Esses são os atribulos atualizados:\nVida: %s\nMana: %s\nXp: %s\nInteligencia: %s\nForça: %s\nLevel: %s ",nome, vida, mana, xp, inteligencia, forca, level));
    }

    public void attack() {
        Random random = new Random();
        int valorAleatorio = random.nextInt(300);
        int forcaDeAtaque = (inteligencia * level) + valorAleatorio;
        System.out.println(String.format("%s acabou de atacar e a força de seu ataque foi %s",nome , forcaDeAtaque));
    }


}
