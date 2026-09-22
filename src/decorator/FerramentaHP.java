package decorator;

import model.CartaPokemon;

public class FerramentaHP extends CartaPokemonDecorator {

    private int bonusHP;

    public FerramentaHP(CartaPokemon carta, int bonusHP) {
        super(carta);
        this.bonusHP = bonusHP;
    }

    @Override
    public int getHP() {
        return carta.getHP() + bonusHP;
    }

    @Override
    public String getDescricao() {
        return carta.getDescricao()
                + " + Ferramenta Pokémon (+" + bonusHP + " HP)";
    }
}