package mdl.interbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mdl.interbank.entity.EstadoFinanciero;

@Repository
public interface EstadoFinancieroRepository extends JpaRepository<EstadoFinanciero, Long> {

	public List<EstadoFinanciero> findByCodigounico(String codigounico);

}
