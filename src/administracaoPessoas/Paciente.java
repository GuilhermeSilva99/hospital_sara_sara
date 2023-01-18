package administracaoPessoas;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa{
    private List<String> listaDeSintomas;
    public Paciente(String nome, String cpf){
        super(nome, cpf);
        this.listaDeSintomas = new ArrayList<>();
    }
    public void anexarSintomas(List<String> sintomas){
        this.listaDeSintomas = sintomas;
    }
    public final List<String> sintomas(){
        return this.listaDeSintomas;
    }
}
