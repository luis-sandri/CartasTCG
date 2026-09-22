import battle.Ataque;
import decorator.Envenenado;
import decorator.Escudo;
import decorator.Queimado;
import model.CartaPokemon;
import model.Charmander;
import model.Pikachu;
import model.Squirtle;

public class Main {

    public static void main(String[] args) {

        // Criação das cartas
        CartaPokemon pikachu = new Pikachu();
        CartaPokemon charmander = new Charmander();
        CartaPokemon squirtle = new Squirtle();

        // Decorators
        pikachu = new Escudo(pikachu, 10);
        charmander = new Envenenado(charmander);
        squirtle = new Queimado(squirtle);

        System.out.println("===== CARTAS =====");

        mostrarCarta(pikachu);
        mostrarCarta(charmander);
        mostrarCarta(squirtle);


        // ==========================
        // TURNO 1
        // ==========================

        System.out.println("\n===== TURNO 1 =====");

        Ataque thunderShock = pikachu.getAtaques().get(0);

        atacar(
                pikachu,
                charmander,
                thunderShock
        );

        System.out.println("\nEfeitos de fim de turno:");

        pikachu.aplicarEfeitoTurno();
        charmander.aplicarEfeitoTurno();
        squirtle.aplicarEfeitoTurno();

        mostrarHP(pikachu);
        mostrarHP(charmander);
        mostrarHP(squirtle);


        // ==========================
        // TURNO 2
        // ==========================

        System.out.println("\n===== TURNO 2 =====");

        Ataque ember = charmander.getAtaques().get(1);

        atacar(
                charmander,
                pikachu,
                ember
        );

        System.out.println("\nEfeitos de fim de turno:");

        pikachu.aplicarEfeitoTurno();
        charmander.aplicarEfeitoTurno();
        squirtle.aplicarEfeitoTurno();

        mostrarHP(pikachu);
        mostrarHP(charmander);
        mostrarHP(squirtle);


        // ==========================
        // TURNO 3
        // ==========================

        System.out.println("\n===== TURNO 3 =====");

        Ataque waterGun = squirtle.getAtaques().get(1);

        atacar(
                squirtle,
                charmander,
                waterGun
        );

        System.out.println("\nEfeitos de fim de turno:");

        pikachu.aplicarEfeitoTurno();
        charmander.aplicarEfeitoTurno();
        squirtle.aplicarEfeitoTurno();

        mostrarHP(pikachu);
        mostrarHP(charmander);
        mostrarHP(squirtle);
    }


    public static void atacar(
            CartaPokemon atacante,
            CartaPokemon defensor,
            Ataque ataque
    ) {

        if (atacante.getHP() <= 0) {
            System.out.println(
                    atacante.getNome() + " não pode atacar."
            );
            return;
        }

        System.out.println(
                atacante.getNome()
                        + " usou "
                        + ataque.getNome()
                        + " em "
                        + defensor.getNome()
        );

        int dano = ataque.executar(
                atacante,
                defensor
        );

        System.out.println(
                "Dano calculado: " + dano
        );

        System.out.println(
                defensor.getNome()
                        + " ficou com "
                        + defensor.getHP()
                        + " HP."
        );
    }


    public static void mostrarCarta(CartaPokemon carta) {

        System.out.println();

        System.out.println(carta.getNome());
        System.out.println("HP: " + carta.getHP());
        System.out.println(carta.getDescricao());

        System.out.println("Ataques:");

        for (Ataque ataque : carta.getAtaques()) {
            System.out.println("- " + ataque.getNome());
        }
    }


    public static void mostrarHP(CartaPokemon carta) {

        System.out.println(
                carta.getNome()
                        + ": "
                        + carta.getHP()
                        + " HP"
        );
    }
}