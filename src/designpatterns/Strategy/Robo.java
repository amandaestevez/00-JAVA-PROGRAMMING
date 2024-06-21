package designpatterns.Strategy;

public class Robo {

    private Comportamento comportamento;

    /**
     * The code block below defines a method in Java that assigns the behavior
     * that the robot will execute.
     */

    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
        
    }

    public void mover() {
        comportamento.mover();
    }

}
