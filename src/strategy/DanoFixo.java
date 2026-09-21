package strategy;

import model.CartaPokemon;

public class DanoFixo implements EstrategiaAtaque {
    @Override
    public int calcularDano(CartaPokemon atacante, CartaPokemon defensor) {
        return 30;
    }
}
