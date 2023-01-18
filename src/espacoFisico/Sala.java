package espacoFisico;

import administracaoPessoas.Funcionario;

public class Sala {

    private Funcionario funcionario;

    public Sala(Funcionario funcionario){
        this.funcionario = funcionario;
    }

    public final void reservar(int dia, int mes, int ano){
        System.out.println("Sala reservada no dia: "+dia+" mês: "+mes+" ano:"+ano);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
}
