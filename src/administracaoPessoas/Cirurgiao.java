package administracaoPessoas;

import java.util.List;

public class Cirurgiao extends Medico{

    public Cirurgiao(String nome, String cpf, String registro){
        super(nome, cpf, registro);
    }
    @Override
    public String realizarDiagnostico(List<String> sintomas) {
        for (int i = 0; i < sintomas.size(); i++) {
            if(sintomas.get(i).equals("osso quebrado")){
                return "Resumo do médico "+getNome()+" cirurgião: paciente será medicado adequadamente";
            }
        }
        return "Resumo do médico "+getNome()+" cirurgião: favor repassar o atendente para outro médico mais capacitado";
    }
}
