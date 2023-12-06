package drie.nieuw.relatiesindrie.persistence;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import drie.nieuw.relatiesindrie.model.PaginaPerLijst;
import jakarta.transaction.Transactional;

public interface PaginaPerLijstRepository extends CrudRepository<PaginaPerLijst, Long> {
	// deze call is afhankelijk van de NAMEN van de database fields
	Iterable<PaginaPerLijst> findPaginasByLijst_idOrderByVolgordeAsc(int lijst_id);

	// WAAROM WERKT DIT NIET ??
	/*
	@Modifying 
	@Query(value = "DELETE FROM pagina_per_lijst p WHERE p.lijst_id=:lijst_id AND p.pagina_id=:pagina_id", nativeQuery = true)
	Iterable<PaginaPerLijst> removePaginaFromLijst(@Param("lijst_id") int lijst_id, @Param("pagina_id") int pagina_id);
	*/
	
	//@Query(value = "DELETE FROM pagina_per_lijst p WHERE p.lijst_id=:lijst_id'", nativeQuery = true)
	//void deletePaginasByLijst_id(@Param("lijst_id") int lijstid);
	
	@Transactional
	@Modifying
	void deletePaginasByLijst_id(int lijstid);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM pagina_per_lijst WHERE lijst_id = :lijst_id AND pagina_id = :pagina_id", nativeQuery = true)
	void removePaginaFromLijst(@Param("lijst_id") int lijst_id, @Param("pagina_id") int pagina_id);
}
