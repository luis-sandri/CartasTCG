import model.CartaPokemon;
import model.Pikachu;
import strategy.DanoFixo;

public class Main {
    public static void main(String[] args) {

        CartaPokemon pikachu = new Pikachu();

        System.out.println(pikachu.getNome());
        System.out.println("HP: " + pikachu.getHP());
        System.out.println("Ataque: " + pikachu.getAtaque());

        DanoFixo danoFixo = new DanoFixo();

        int dano = danoFixo.calcularDano(pikachu, pikachu);

        System.out.println("Dano causado: " + dano);
    }
}