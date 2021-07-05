class Medicamento implements Solicitacao  {
    String PrincipioAtivo;
    int Custo;

    public Medicamento(String p_ativo, int custo){
        PrincipioAtivo = p_ativo;
        Custo = custo;
    }

    public double custo(){
        return Custo;
    }

    public String toString() {
        return PrincipioAtivo +
                ", " +
                custo();
    }

}
