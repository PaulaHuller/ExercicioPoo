package pooExercicio3;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Mago maluquinho = new Mago("Maluquinho", 100, 80, 0, 12, 40, 0);
        maluquinho.lvlUp();

        Guerreiro fortudo = new Guerreiro("Fortudo", 100, 80, 0,12,40,0);
        fortudo.lvlUp();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        maluquinho.attack();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        fortudo.attack();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
        ArrayList pesonagensCriados = new ArrayList();
        pesonagensCriados.add(maluquinho.nome);
        pesonagensCriados.add(fortudo.nome);
        pesonagensCriados.forEach(System.out::println);
    }
}