package administracaoPessoas;

import espacoFisico.Fila;

public final class Atendente extends Funcionario{

    private Fila fila;
    public Atendente(String nome, String cpf){
        super(nome, cpf);
        this.fila = null;
    }

    public void iniciarAtendimento(){
        if(fila != null && fila.getProximoIndexDaFila() == 0){
            System.out.println("Iniciando atendimento");
        }
        if(fila != null
                && !fila.getListaDePacientes().isEmpty()
                && fila.getListaDePacientes().size() > fila.getProximoIndexDaFila()){
            System.out.println("Paciente: "+fila.getListaDePacientes().get(fila.getProximoIndexDaFila()).getNome()+" em atendimento");
            fila.setProximoIndexDaFila(fila.getProximoIndexDaFila()+1);
        }else {
            System.out.println("Lista vazia");
        }
    }

    public void setFila(Fila fila) {
        this.fila = fila;
    }
}
