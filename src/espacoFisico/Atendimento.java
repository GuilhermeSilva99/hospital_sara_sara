package espacoFisico;

import administracaoPessoas.Medico;

public class Atendimento extends Sala{

    public Atendimento(Medico medico){
        super(medico);
    }

    @Override
    public String toString() {
        return "Sala de atendimento, médico responsável:"+getFuncionario().getNome();
    }
}
