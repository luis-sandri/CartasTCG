import battle.Ataque;
import model.CartaPokemon;
import model.Pikachu;
import strategy.DanoFixo;
import strategy.DanoPorHP;
import strategy.DanoPorMoeda;

public class Main {

    public static void main(String[] args) {

        CartaPokemon pikachu = new Pikachu();
        CartaPokemon defensor = new Pikachu();

        Ataque ataqueFixo = new Ataque(
                "Thunder Shock",
                new DanoFixo(30)
        );

        Ataque ataquePorHP = new Ataque(
                "Ataque por HP",
                new DanoPorHP()
        );

        Ataque ataquePorMoeda = new Ataque(
                "Ataque por Moeda",
                new DanoPorMoeda(40)
        );

        System.out.println("Pokémon atacante: " + pikachu.getNome());
        System.out.println("HP: " + pikachu.getHP());

        System.out.println();

        System.out.println(
                ataqueFixo.getNome()
                        + " causou "
                        + ataqueFixo.executar(pikachu, defensor)
                        + " de dano."
        );

        System.out.println(
                ataquePorHP.getNome()
                        + " causou "
                        + ataquePorHP.executar(pikachu, defensor)
                        + " de dano."
        );

        System.out.println(
                ataquePorMoeda.getNome()
                        + " causou "
                        + ataquePorMoeda.executar(pikachu, defensor)
                        + " de dano."
        );
    }
}