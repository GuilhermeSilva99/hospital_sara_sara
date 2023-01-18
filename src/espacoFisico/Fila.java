package espacoFisico;

import administracaoPessoas.Paciente;

import java.util.ArrayList;
import java.util.List;

public class Fila {

    private List<Paciente> listaDePacientes;
    private Integer proximoIndexDaFila;
    public Fila(){
        this.listaDePacientes = new ArrayList<>();
        this.proximoIndexDaFila = 0;
    }

    public void colocarNaFila(Paciente paciente){
        this.listaDePacientes.add(paciente);
    }

    public List<Paciente> getListaDePacientes() {
        return listaDePacientes;
    }

    public Integer getProximoIndexDaFila() {
        return proximoIndexDaFila;
    }

    public void setProximoIndexDaFila(Integer proximoDaFila) {
        this.proximoIndexDaFila = proximoDaFila;
    }
}
