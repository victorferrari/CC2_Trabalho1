package trabalho1;

import java.util.LinkedList;
import java.util.List;

public class PilhaDeTabelas {

    private static LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }


    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }

    public boolean existeTipoVar(String tipoVar) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeTipoVar(tipoVar)) {
                return true;
            }
        }
        return false;
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
    }

    public List getTodasTabelas() {
        return pilha;
    }
}
