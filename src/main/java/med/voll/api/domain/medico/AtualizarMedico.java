package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record AtualizarMedico(
        @NotNull
        long id,
        String telefone,
        String nome,
        DadosEndereco endereco
) {
}
