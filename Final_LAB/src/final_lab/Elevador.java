package final_lab;

import java.util.Stack;

public class Elevador implements ControlAscensor {
    private int pisoActual;
    private Stack<Llamada> llamadas;

    public Elevador() {
        pisoActual = 1;
        llamadas = new Stack<>();
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
                System.out.println("Subiendo al piso " + destino);
                pisoActual = destino;
            } else if (destino < pisoActual) {
                System.out.println("Bajando al piso " + destino);
                pisoActual = destino;
            }

            System.out.println("Llegaste al piso " + pisoActual);
        }
    }
}
