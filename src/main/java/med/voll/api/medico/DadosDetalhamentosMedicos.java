package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record DadosDetalhamentosMedicos(Long id , String nome , String email , String crm , Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentosMedicos(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade(), medico.getEndereco());
    }

}
