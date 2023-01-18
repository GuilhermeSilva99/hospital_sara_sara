package administracaoPessoas;

import java.util.List;

public class ClinicoGeral extends Medico{

    public ClinicoGeral(String nome, String cpf, String registro){
        super(nome, cpf, registro);
    }
    @Override
    public String realizarDiagnostico(List<String> sintomas) {
        String stringSintomas = "";
        for (int i = 0; i < sintomas.size(); i++) {
            stringSintomas+=sintomas.get(i)+", ";
        }
         return "Resumo do médico "+getNome()+" clinico geral: paciente com os sintomas: "+stringSintomas+"será medicado e encaminhado para um especialista";
    }
}
