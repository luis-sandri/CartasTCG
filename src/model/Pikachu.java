package model;

import battle.Ataque;
import strategy.DanoFixo;
import strategy.DanoPorHP;

import java.util.ArrayList;
import java.util.List;

public class Pikachu implements CartaPokemon {

    private String nome;
    private int hp;
    private List<Ataque> ataques;

    public Pikachu() {
        this.nome = "Pikachu";
        this.hp = 70;
        this.ataques = new ArrayList<>();

        ataques.add(
                new Ataque(
                        "Thunder Shock",
                        new DanoFixo(30)
                )
        );

        ataques.add(
                new Ataque(
                        "Electro Ball",
                        new DanoPorHP())
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
        return "Pikachu - Pokémon do tipo Elétrico";
    }

    @Override
    public List<Ataque> getAtaques() {
        return ataques;
    }

}