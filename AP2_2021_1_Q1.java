import java.util.*;

public class AP2_2021_1_Q1 {
    public static void main(String[] args) {
        Solicitacao sangue = new Exame("Exame de Sangue", 20);
        Solicitacao biopsia = new Cirurgia("Biopsia", 30);
        Tratamento analiseAlergia = new Tratamento();
        analiseAlergia.adicionaSolicitacao(Arrays.asList(sangue, biopsia));
        System.out.println(analiseAlergia);
        Solicitacao anestesia = new Medicamento("Anestesia", 1000);
        Solicitacao septo = new Cirurgia("Correção de Septo", 120);
        Tratamento correcaoSepto = new Tratamento();
        correcaoSepto.adicionaSolicitacao(anestesia);
        correcaoSepto.adicionaSolicitacao(septo);
        System.out.println(correcaoSepto);
        Solicitacao cisto = new Cirurgia("Extração de Cisto", 60);
        Tratamento extracaoCisto = new Tratamento();
        extracaoCisto.adicionaSolicitacao(Arrays.asList(analiseAlergia, anestesia, cisto));
        System.out.println(extracaoCisto);
    }
}
