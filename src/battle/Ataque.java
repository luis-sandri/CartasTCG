package battle;

import model.CartaPokemon;
import strategy.EstrategiaAtaque;

public class Ataque {

    private String nome;
    private EstrategiaAtaque estrategia;

    public Ataque(String nome, EstrategiaAtaque estrategia) {
        this.nome = nome;
        this.estrategia = estrategia;
    }

    public int executar(CartaPokemon atacante, CartaPokemon defensor) {

        int dano = estrategia.calcularDano(atacante, defensor);

        defensor.receberDano(dano);

        return dano;
    }

    public String getNome() {
        return nome;
    }

    public void setEstrategia(EstrategiaAtaque estrategia) {
        this.estrategia = estrategia;
    }
}