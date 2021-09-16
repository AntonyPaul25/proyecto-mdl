package mdl.interbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mdl.interbank.entity.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, Long> {

	public Rating findByCodigounico(String codigounico);

}
