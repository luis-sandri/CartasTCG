package strategy;

import model.CartaPokemon;

public class DanoPorHP implements EstrategiaAtaque {

    @Override
    public int calcularDano(CartaPokemon atacante, CartaPokemon defensor) {
        return atacante.getAtaque() + (atacante.getHP() / 10);
    }
}