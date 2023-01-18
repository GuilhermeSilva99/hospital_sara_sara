package espacoFisico;

import administracaoPessoas.Medico;

public class Cirurgia extends Sala{

    public Cirurgia(Medico medico){
        super(medico);
    }

    @Override
    public String toString() {
        return "Sala de cirurgia, médico responsável:"+getFuncionario().getNome();
    }
}
