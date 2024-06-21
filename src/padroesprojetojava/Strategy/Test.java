package padroesprojetojava.Strategy;

public class Test {

    public static void main(String[] args) {
        
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();

        robo.setComportamento(agressivo);

        robo.mover();

        robo.setComportamento(defensivo);

        robo.mover();
    }

}
