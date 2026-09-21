package decorator;

import model.CartaPokemon;

public abstract class CartaPokemonDecorator implements CartaPokemon {

    protected CartaPokemon carta;

    public CartaPokemonDecorator(CartaPokemon carta) {
        this.carta = carta;
    }

    @Override
    public String getNome() {
        return carta.getNome();
    }

    @Override
    public int getHP() {
        return carta.getHP();
    }

    @Override
    public int getAtaque() {
        return carta.getAtaque();
    }

    @Override
    public String getDescricao() {
        return carta.getDescricao();
    }
}