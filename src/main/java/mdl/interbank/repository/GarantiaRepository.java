package mdl.interbank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mdl.interbank.entity.Garantia;

@Repository
public interface GarantiaRepository extends JpaRepository<Garantia, Long> {

	public List<Garantia> findByCodeid(String codeid);

}
