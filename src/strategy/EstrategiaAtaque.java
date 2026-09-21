package strategy;

import model.CartaPokemon;

public interface EstrategiaAtaque {
    public int calcularDano(CartaPokemon atacante, CartaPokemon defensor);
}
