package model;

import battle.Ataque;
import strategy.DanoFixo;
import strategy.DanoPorMoeda;

import java.util.ArrayList;
import java.util.List;

public class Charmander implements CartaPokemon {

    private String nome;
    private int hp;
    private List<Ataque> ataques;

    public Charmander() {
        this.nome = "Charmander";
        this.hp = 60;
        this.ataques = new ArrayList<>();

        ataques.add(
                new Ataque(
                        "Scratch",
                        new DanoFixo(20)
                )
        );

        ataques.add(
                new Ataque(
                        "Ember",
                        new DanoPorMoeda(40)
                )
        );
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getHP() {
        return hp;
    }

    @Override
    public String getDescricao() {
        return "Charmander - Pokémon do tipo Fogo";
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }

    @Override
    public void receberDano(int dano) {
        this.hp -= dano;

        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    @Override
    public void aplicarEfeitoTurno() {
    }
}