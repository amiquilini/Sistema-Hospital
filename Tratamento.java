import java.util.*;

class Tratamento implements Solicitacao {
    static int prox_tratamento = 0;
    int codigo;
    List<Solicitacao> ListaSolicitacoes;

    public Tratamento(){
        ListaSolicitacoes = new ArrayList<>();
        codigo = prox_tratamento++;
    }

    public void adicionaSolicitacao(Solicitacao solicitacoes){ // uso de sobrecarga para receber argumentos diferentes conforme necessário (solicitação única ou lista de solicitações)
        ListaSolicitacoes.add(solicitacoes);
    }
    public void adicionaSolicitacao(List<Solicitacao> solicitacoes){
        for(Solicitacao sol : solicitacoes){
            ListaSolicitacoes.add(sol);
        }
    }

    public String toString() {
        ComparadorCusto comparadorCusto = new ComparadorCusto(); // instancia o comparador customizado para ordenar as solicitações por maior custo usando o método sort
        Collections.sort(ListaSolicitacoes, comparadorCusto);

        String lista = "";
        for (Solicitacao sol : ListaSolicitacoes){
            lista += sol + "\n";
        }

        return "Tratamento " + this.codigo +" {\n" +
                lista +
                '}';
    }

    public double custo(){
        double custoTotal = 0;
        for(Solicitacao sol : ListaSolicitacoes){
            custoTotal += sol.custo();
        }
        return custoTotal;
    }
}
