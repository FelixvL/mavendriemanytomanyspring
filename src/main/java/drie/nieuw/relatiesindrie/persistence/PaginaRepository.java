package drie.nieuw.relatiesindrie.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import drie.nieuw.relatiesindrie.model.Pagina;

/*IVO ADDED THIS FILE*/
@Component
public interface PaginaRepository extends CrudRepository<Pagina, Long>  {

}