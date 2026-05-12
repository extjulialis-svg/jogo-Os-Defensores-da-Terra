public class SpeedHero extends SuperHero {

    public SpeedHero(String nome, int nivelPoder, int saude) {
        super(nome, nivelPoder, saude);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " realizou um ataque ultra-rápido!");
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou a habilidade Velocidade Relâmpago!");
    }
}