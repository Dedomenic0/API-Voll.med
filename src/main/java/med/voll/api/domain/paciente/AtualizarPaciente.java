package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record AtualizarPaciente(

        @NotNull
        long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
