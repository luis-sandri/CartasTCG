package strategy;

import model.CartaPokemon;
import java.util.Random;

public class DanoPorMoeda implements EstrategiaAtaque {

    private int dano;
    private Random random;

    public DanoPorMoeda(int dano) {
        this.dano = dano;
        this.random = new Random();
    }

    @Override
    public int calcularDano(CartaPokemon atacante, CartaPokemon defensor) {

        boolean cara = random.nextBoolean();

        if (cara) {
            return dano;
        }

        return 0;
    }
}