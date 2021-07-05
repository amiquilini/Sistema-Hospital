import java.util.*;

class ComparadorCusto implements Comparator<Solicitacao> { // para ordenar os elementos de uma lista por ordem descrescente de custo

    public int compare(Solicitacao sol1, Solicitacao sol2) {
        int valor;
        if (sol1.custo() > sol2.custo()){
            valor = -1;
        } else if (sol1.custo() < sol2.custo()){
            valor = 1;
        } else {valor = 0;}

        return valor;
    }
}
