package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
@Component
public class ValidadorHorario implements ValidadorAgendamentoConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();
        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SATURDAY);
        var horaDeAbertura = dataConsulta.getHour() < 7;
        var horaDeFechamento = dataConsulta.getHour() > 18;
        if (domingo || horaDeAbertura || horaDeFechamento) {
            throw new ValidacaoException("Consulta fora do horário de funcionamento");
        }

    }

}
