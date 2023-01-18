package administracaoPessoas;

import java.util.List;

public final class Neuro extends Medico{

    public Neuro(String nome, String cpf, String registro){
        super(nome, cpf, registro);
    }
    @Override
    public String realizarDiagnostico(List<String> sintomas) {
        for (int i = 0; i < sintomas.size(); i++) {
            if(sintomas.get(i).equals("dor de cabeça")){
                return "Resumo do médico "+getNome()+" neuro: paciente será medicado adequadamente";
            }
        }
        return "Resumo do médico "+getNome()+" neuro: favor repassar o atendente para outro médico mais capacitado";
    }
}
