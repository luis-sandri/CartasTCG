package decorator;

import model.CartaPokemon;

public class Escudo extends CartaPokemonDecorator {

    private int reducaoDano;

    public Escudo(CartaPokemon carta, int reducaoDano) {
        super(carta);
        this.reducaoDano = reducaoDano;
    }

    @Override
    public void receberDano(int dano) {

        int danoReduzido = dano - reducaoDano;

        if (danoReduzido < 0) {
            danoReduzido = 0;
        }

        carta.receberDano(danoReduzido);
    }

    @Override
    public String getDescricao() {
        return carta.getDescricao()
                + " + Escudo (-" + reducaoDano + " de dano recebido)";
    }
}