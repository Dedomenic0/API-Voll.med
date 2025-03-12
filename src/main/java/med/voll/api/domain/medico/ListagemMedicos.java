package med.voll.api.domain.medico;

public record ListagemMedicos(long id,
                              String nome,
                              String email,
                              String crm,
                              Especialidade especialidade) {

    public ListagemMedicos(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
