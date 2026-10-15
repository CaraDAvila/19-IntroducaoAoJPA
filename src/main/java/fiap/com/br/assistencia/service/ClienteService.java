package fiap.com.br.assistencia.service;

import fiap.com.br.assistencia.domain.Cliente;
import fiap.com.br.assistencia.mapper.ClienteMapper;
import fiap.com.br.assistencia.repository.ClienteRepository;
import fiap.com.br.assistencia.web.dto.ClienteRequest;
import fiap.com.br.assistencia.web.dto.ClienteResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository repo;
    private final ClienteMapper map;



    public ClienteService(ClienteRepository repo, ClienteMapper map) {
        this.repo = repo;
        this.map = map;
    }

    //metodos
    @Transactional //faz uma transacao no banco de dados
    public ClienteResponse salvar(ClienteRequest dto) {
        Cliente cliente =map.paraEntidade(dto);

        Cliente aux=
                repo.save(cliente);
        return map.paraResposta(aux);
    }
}
