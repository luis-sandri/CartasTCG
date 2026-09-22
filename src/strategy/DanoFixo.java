package strategy;

import model.CartaPokemon;

public class DanoFixo implements EstrategiaAtaque {

    private int dano;

    public DanoFixo(int dano) {
        this.dano = dano;
    }

    @Override
    public int calcularDano(CartaPokemon atacante, CartaPokemon defensor) {
        return dano;
    }
}