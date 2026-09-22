package decorator;

import battle.Ataque;
import model.CartaPokemon;

import java.util.List;

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
    public String getDescricao() {
        return carta.getDescricao();
    }

    @Override
    public List<Ataque> getAtaques() {
        return carta.getAtaques();
    }
}