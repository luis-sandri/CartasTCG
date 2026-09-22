package model;

import battle.Ataque;
import strategy.DanoFixo;
import strategy.DanoPorHP;

import java.util.ArrayList;
import java.util.List;

public class Squirtle implements CartaPokemon {

    private String nome;
    private int hp;
    private List<Ataque> ataques;

    public Squirtle() {
        this.nome = "Squirtle";
        this.hp = 70;
        this.ataques = new ArrayList<>();

        ataques.add(
                new Ataque(
                        "Tackle",
                        new DanoFixo(20)
                )
        );

        ataques.add(
                new Ataque(
                        "Water Gun",
                        new DanoPorHP()
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
        return "Squirtle - Pokémon do tipo Água";
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