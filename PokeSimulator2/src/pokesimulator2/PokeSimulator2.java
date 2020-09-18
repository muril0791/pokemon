package pokesimulator2;

public class PokeSimulator2 {

    public static void main(String[] args) {
        //Instanciar um novo objeto
        Pokemon meuPokemon = new Pokemon("Bulbassaur", "terra", 20);
        Pokemon outroPokemon = new Pokemon("Charmander", "Agua", 20);
        Batalha batalha1 = new Batalha();

        meuPokemon.calculaAtributos();
        outroPokemon.calculaAtributos();

        batalha1.meuPokemon(meuPokemon.nome, meuPokemon.getHP());
        batalha1.outroPokemon(outroPokemon.nome, outroPokemon.getHP());

        batalha1.start();

    }

}
