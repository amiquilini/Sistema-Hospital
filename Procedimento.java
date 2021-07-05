class Procedimento implements Solicitacao { // Exame e Cirurgia herdam de Procedimento, pois a única coisa que muda é o custo/minuto
    String Nome;
    int Tempo;
    double Custo;

    public Procedimento(String nome, int tempo) {
        Nome = nome;
        Tempo = tempo;
    }

    public double custo() {
        return this.Custo * Tempo;
    }

    public String toString() {
        return Nome +
                ", " +
                custo();
    }
}
