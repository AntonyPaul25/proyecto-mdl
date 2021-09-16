package mdl.interbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mdl.interbank.entity.Parametro;

@Repository
public interface ParametroRepository extends JpaRepository<Parametro, Long> {

	public List<Parametro> findByAgrupadorAndEstadoOrderByOrden(String agrupador, boolean estado);

}
