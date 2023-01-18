package administracaoPessoas;

import java.util.List;

public abstract class Medico extends Funcionario{

    private String registro;
    public Medico(String nome, String cpf, String registro){
        super(nome,cpf);
        this.registro = registro;
    }
    public abstract String realizarDiagnostico(List<String> sintomas);

    public String getRegistro() {
        return registro;
    }

    @Override
    public String toString() {
        return "Médico| Nome: "+getNome()+" registro: "+getRegistro();
    }
}
