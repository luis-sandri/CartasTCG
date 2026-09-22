package decorator;

import model.CartaPokemon;

public class Queimado extends CartaPokemonDecorator {

    private int danoQueimadura;

    public Queimado(CartaPokemon carta) {
        super(carta);
        this.danoQueimadura = 20;
    }

    @Override
    public String getDescricao() {
        return carta.getDescricao() + " + Queimado";
    }

    @Override
    public void aplicarEfeitoTurno() {

        carta.receberDano(danoQueimadura);

        carta.aplicarEfeitoTurno();
    }
}