package decorator;

import model.CartaPokemon;

public class Envenenado extends CartaPokemonDecorator {

    private int danoVeneno;

    public Envenenado(CartaPokemon carta) {
        super(carta);
        this.danoVeneno = 10;
    }

    @Override
    public String getDescricao() {
        return carta.getDescricao() + " + Envenenado";
    }

    @Override
    public void aplicarEfeitoTurno() {
        carta.receberDano(danoVeneno);

        carta.aplicarEfeitoTurno();
    }
}