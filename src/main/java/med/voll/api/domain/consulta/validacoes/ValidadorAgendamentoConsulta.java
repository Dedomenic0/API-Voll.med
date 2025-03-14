package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;


public interface ValidadorAgendamentoConsulta {
    void validar (DadosAgendamentoConsulta dados);
}
