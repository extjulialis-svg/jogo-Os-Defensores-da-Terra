public class StrongHero extends SuperHero {

    public StrongHero(String nome, int nivelPoder, int saude) {
        super(nome, nivelPoder, saude);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " atacou com força bruta!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou o Golpe Sísmico!");
    }
}