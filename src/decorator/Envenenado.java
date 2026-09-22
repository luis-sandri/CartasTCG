package decorator;

import model.CartaPokemon;

public class Envenenado extends CartaPokemonDecorator {

    public Envenenado(CartaPokemon carta) {
        super(carta);
    }

    @Override
    public String getDescricao() {
        return carta.getDescricao() + " + Envenenado";
    }
}