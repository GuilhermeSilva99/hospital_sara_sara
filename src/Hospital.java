import administracaoPessoas.*;
import espacoFisico.Atendimento;
import espacoFisico.Cirurgia;
import espacoFisico.Espera;
import espacoFisico.Fila;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hospital {
    public static void main(String[] args) {
        //Criando os pacientes
        Paciente guilherme = new Paciente("Guilherme", "12345678999");
        guilherme.anexarSintomas(new ArrayList<>(Arrays.asList("dor de cabeça","dor no corpo")));
        Paciente jose = new Paciente("Jose","14725836933");
        jose.anexarSintomas(new ArrayList<>(Arrays.asList("gripe","dor no corpo")));

        //Iniciando uma fila no hospital
        Fila filaDePacientes = new Fila();
        filaDePacientes.colocarNaFila(guilherme);
        filaDePacientes.colocarNaFila(jose);

        //Criando atendente
        Atendente joao = new Atendente("joao","11111111111");

        //Criando os medicos
        Neuro gabriel = new Neuro("Gabriel","22222222222", "321");
        ClinicoGeral gustavo = new ClinicoGeral("Gustavo","33333333333", "123");
        Cirurgiao geovanio = new Cirurgiao("Geovanio","44444444444", "999");

        //Criando as salas
        Espera salaInicio = new Espera(joao);
        Cirurgia sala01 = new Cirurgia(gabriel);
        Cirurgia sala02 = new Cirurgia(geovanio);
        Atendimento sala03 = new Atendimento(gustavo);

        System.out.println("Hospital Sara Sara");
        System.out.println("Bem vindo aqui nos temos:");
        System.out.println("Salas: ");
        System.out.println(sala03.toString());
        System.out.println(sala02.toString());
        System.out.println(sala01.toString());
        System.out.println(salaInicio.toString());

        System.out.println("\nMédicos: ");
        System.out.println(gabriel.toString());
        System.out.println(gustavo.toString());
        System.out.println(geovanio.toString());

        System.out.println("\nAtentente: ");
        System.out.println(joao.toString());

        System.out.println("\nPacientes: ");
        System.out.println(guilherme.toString());
        System.out.println(jose.toString());

        System.out.println("----------------------------");

        joao.setFila(filaDePacientes);
        joao.iniciarAtendimento();
        System.out.println(geovanio.realizarDiagnostico(guilherme.sintomas()));
        System.out.println(gabriel.realizarDiagnostico(guilherme.sintomas()));
        joao.iniciarAtendimento();
        System.out.println(gustavo.realizarDiagnostico(jose.sintomas()));
        joao.iniciarAtendimento();
        Paciente igor = new Paciente("Igor","456456456444");
        igor.anexarSintomas(new ArrayList<>(Arrays.asList("osso quebrado")));
        filaDePacientes.colocarNaFila(igor);
        joao.iniciarAtendimento();
        System.out.println(geovanio.realizarDiagnostico(igor.sintomas()));

        sala01.reservar(01,02,2023);
        sala02.reservar(02,02,2023);
        sala03.reservar(03,03,2023);
        salaInicio.reservar(05,05,2023);
    }
}