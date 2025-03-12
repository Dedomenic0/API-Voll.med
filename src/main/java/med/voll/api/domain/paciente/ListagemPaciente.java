package med.voll.api.domain.paciente;

public record ListagemPaciente(
        long id,
        String nome,
        String email,
        String cpf
) {
   public ListagemPaciente (Paciente paciente) {
       this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
   }
}
