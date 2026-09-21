package strategy;

import model.CartaPokemon;

public interface EstrategiaAtaque {

    int calcularDano(
            CartaPokemon atacante,
            CartaPokemon defensor
    );
}