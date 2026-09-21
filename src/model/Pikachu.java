package model;

public class Pikachu implements CartaPokemon {

    private String nome;
    private int hp;
    private int ataque;

    public Pikachu() {
        this.nome = "Pikachu";
        this.hp = 70;
        this.ataque = 30;
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
    public int getAtaque() {
        return ataque;
    }

    @Override
    public String getDescricao() {
        return "Pikachu - Pokémon do tipo Elétrico";
    }
}