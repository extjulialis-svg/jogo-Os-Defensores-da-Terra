public class SuperHero {

    String nome;
    int nivelPoder;
    int saude;

    // Construtor
    public SuperHero(String nome, int nivelPoder, int saude) {
        this.nome = nome;
        this.nivelPoder = nivelPoder;
        this.saude = saude;
    }

    // Método atacar
    public void atacar() {
        System.out.println(nome + " realizou um ataque padrão!");
    }

    // Método defender
    public void defender() {
        System.out.println(nome + " está se defendendo!");
    }

    // Método habilidade especial
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou uma habilidade especial básica!");
    }
}