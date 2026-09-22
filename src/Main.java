import battle.Ataque;
import model.CartaPokemon;
import model.Pikachu;

public class Main {

    public static void main(String[] args) {

        CartaPokemon atacante = new Pikachu();
        CartaPokemon defensor = new Pikachu();

        Ataque thunderShock = atacante.getAtaques().get(0);

        System.out.println("HP antes: " + defensor.getHP());

        int dano = thunderShock.executar(atacante, defensor);

        System.out.println(
                atacante.getNome()
                        + " usou "
                        + thunderShock.getNome()
        );

        System.out.println("Dano causado: " + dano);

        System.out.println("HP depois: " + defensor.getHP());
    }
}