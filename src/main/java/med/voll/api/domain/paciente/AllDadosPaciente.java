package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.Endereco;

public record AllDadosPaciente (long id, String cpf, String nome, String email, String telefone, Endereco endereco ) {

    public AllDadosPaciente (Paciente paciente) {
        this(paciente.getId(), paciente.getCpf(), paciente.getNome(), paciente.getCpf(), paciente.getTelefone(), paciente.getEndereco());
    }
}
