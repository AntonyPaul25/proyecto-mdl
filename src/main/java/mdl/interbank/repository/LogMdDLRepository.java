package mdl.interbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mdl.interbank.entity.LogMDL;

@Repository
public interface LogMdDLRepository extends JpaRepository<LogMDL, Long> {

}
