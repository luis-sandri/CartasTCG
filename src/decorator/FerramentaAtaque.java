package decorator;

import model.CartaPokemon;

public class FerramentaAtaque extends CartaPokemonDecorator {

    public FerramentaAtaque(CartaPokemon carta) {
        super(carta);
    }

    @Override
    public int getAtaque() {
        return carta.getAtaque() + 10;
    }

    @Override
    public String getDescricao() {
        return carta.getDescricao() + " + Ferramenta de battle.Ataque";
    }
}