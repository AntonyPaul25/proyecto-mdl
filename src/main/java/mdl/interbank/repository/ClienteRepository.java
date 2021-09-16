package mdl.interbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mdl.interbank.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query("select c from Cliente c where c.codigounico like %:pCodigoUnico% OR c.numerodocumento like %:pNumerodocumento% OR c.razonsocial like %:pRazonocial%  ")
	public List<Cliente> filtrar(@Param("pCodigoUnico") String pCodigoUnico,
			@Param("pNumerodocumento") String pNumerodocumento, @Param("pRazonocial") String pRazonocial);

}
