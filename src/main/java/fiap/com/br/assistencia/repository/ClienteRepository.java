package fiap.com.br.assistencia.repository;

import fiap.com.br.assistencia.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente,Long> {

}
