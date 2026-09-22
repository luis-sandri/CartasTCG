package model;

import battle.Ataque;
import java.util.List;

public interface CartaPokemon {

    String getNome();

    int getHP();

    String getDescricao();

    List<Ataque> getAtaques();

    void receberDano(int dano);

    void aplicarEfeitoTurno();
}