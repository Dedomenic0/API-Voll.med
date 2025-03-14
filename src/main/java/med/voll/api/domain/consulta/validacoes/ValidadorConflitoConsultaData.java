package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorConflitoConsultaData implements ValidadorAgendamentoConsulta{
    @Autowired
    private ConsultaRepository repository;
    public void validar(DadosAgendamentoConsulta dados) {
        var medicoDataConflito = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());

        if (medicoDataConflito) {
            throw new ValidacaoException("Ja passue uma consulta para esse medico no mesmo horário");
        }
    }
}
