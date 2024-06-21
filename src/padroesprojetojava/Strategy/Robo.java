package padroesprojetojava.Strategy;

public class Robo {

    private Comportamento comportamento;

    //o bloco abaixo define um método em Java que atribui o comportamento que o robo irá executar.
    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
        
    }

    public void mover() {
        comportamento.mover();
    }

}
