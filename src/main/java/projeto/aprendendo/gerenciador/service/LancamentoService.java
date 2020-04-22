package projeto.aprendendo.gerenciador.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import projeto.aprendendo.gerenciador.model.entity.Lancamento;
import projeto.aprendendo.gerenciador.model.entity.StatusLancamento;

public interface LancamentoService {
	Lancamento salvar(Lancamento lancamento);
	
	Lancamento atualizar(Lancamento lancamento);
	
	void deletar(Lancamento lancamento);
	
	List<Lancamento> buscar( Lancamento lancamentoFiltro );
	
	void atualizarStatus(Lancamento lancamento, StatusLancamento status);
	
	void validar(Lancamento lancamento);
	
	Optional<Lancamento> obterPorId(Long id);
	
	BigDecimal obterSaldoPorUsuario(Long id);
}
