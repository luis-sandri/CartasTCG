package battle;

import model.CartaPokemon;
import strategy.EstrategiaAtaque;

public class Ataque {
    String nome;
    EstrategiaAtaque estrategia;

    public Ataque(String nome, EstrategiaAtaque estrategia) {
        this.nome = nome;
        this.estrategia = estrategia;
    }

    public int executar(CartaPokemon atacante, CartaPokemon defensor) {
        return estrategia.calcularDano(atacante, defensor);
    }

    public void setEstrategia(EstrategiaAtaque estrategia) {
        this.estrategia = estrategia;
    }
}