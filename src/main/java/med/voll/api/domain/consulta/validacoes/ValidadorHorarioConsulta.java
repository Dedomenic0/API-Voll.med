package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioConsulta implements ValidadorAgendamentoConsulta {

    public void validar (DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferencaMinutos = Duration.between(agora, dataConsulta).toMinutes();
        System.out.println(dataConsulta);

        if(diferencaMinutos < 30) {
            throw new ValidacaoException("Consultas devem ser agendadas com 30min de antecedencia");
        }
    }
}
