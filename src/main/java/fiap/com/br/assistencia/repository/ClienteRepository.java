package fiap.com.br.assistencia.repository;

import fiap.com.br.assistencia.domain.Cliente;
import fiap.com.br.assistencia.web.dto.ClienteRequest;
import fiap.com.br.assistencia.web.dto.ClienteResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository <Cliente,Long> {
    //public redundante por ser interface
    public Optional <Cliente> findClienteByEmail(String email);
}
