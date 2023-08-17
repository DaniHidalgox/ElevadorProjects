package final_lab;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Elevador implements ControlAscensor {
    private int pisoActual;
    private Stack<Llamada> llamadas;

    public Elevador() {
        pisoActual = 1;
        llamadas = new Stack<>();
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    public Stack<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(Stack<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    @Override
    public void atenderLlamada(Llamada llamada) {
        llamadas.push(llamada);
    }

    @Override
    public void mover() {
        if (!llamadas.isEmpty()) {
            Llamada llamada = llamadas.pop();
            int destino = llamada.getPisoDestino();

            if (destino > pisoActual) {
                JOptionPane.showMessageDialog(null, "Subiendo al piso " + destino);
                pisoActual = destino;
            } else if (destino < pisoActual) {
                JOptionPane.showMessageDialog(null, "Bajando al piso " + destino);
                pisoActual = destino;
            }

            JOptionPane.showMessageDialog(null, "Llegaste al piso " + pisoActual);
        }
    }
}
