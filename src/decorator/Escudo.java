package decorator;

import model.CartaPokemon;

public class Escudo extends CartaPokemonDecorator {

    private int bonusHP;

    public Escudo(CartaPokemon carta, int bonusHP) {
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
                + " + Escudo Pokémon (+" + bonusHP + " HP)";
    }
}