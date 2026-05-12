public class Main {

    public static void main(String[] args) {

        FlyingHero heroiVoador = new FlyingHero("SkyMaster", 90, 100);

        StrongHero heroiForte = new StrongHero("Titan", 95, 120);

        SpeedHero heroiRapido = new SpeedHero("FlashBolt", 85, 90);

        // FlyingHero
        System.out.println("=== HERÓI VOADOR ===");
        heroiVoador.atacar();
        heroiVoador.defender();
        heroiVoador.usarHabilidadeEspecial();

        System.out.println();

        // StrongHero
        System.out.println("=== HERÓI FORTE ===");
        heroiForte.atacar();
        heroiForte.defender();
        heroiForte.usarHabilidadeEspecial();

        System.out.println();

        // SpeedHero
        System.out.println("=== HERÓI VELOZ ===");
        heroiRapido.atacar();
        heroiRapido.defender();
        heroiRapido.usarHabilidadeEspecial();
    }
}