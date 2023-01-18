package espacoFisico;

import administracaoPessoas.Atendente;

public final class Espera extends Sala{

    public Espera(Atendente atendente){
        super(atendente);
    }

    @Override
    public String toString() {
        return "Sala de espera, atendente responsável:"+getFuncionario().getNome();
    }
}
