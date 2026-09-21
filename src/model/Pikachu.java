package model;

public class Pikachu implements CartaPokemon {

    private String nome;
    private int hp;

    public Pikachu() {
        this.nome = "Pikachu";
        this.hp = 70;
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
}