package fiap.com.br.assistencia.service;

import fiap.com.br.assistencia.domain.Cliente;
import fiap.com.br.assistencia.mapper.ClienteMapper;
import fiap.com.br.assistencia.repository.ClienteRepository;
import fiap.com.br.assistencia.web.dto.ClienteRequest;
import fiap.com.br.assistencia.web.dto.ClienteResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

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
        Cliente cliente = map.paraEntidade(dto);

        Cliente aux = repo.save(cliente);
        return map.paraResposta(aux);
    }

    public ClienteResponse pesquisar(Long id) {
        Cliente cliente = repo.findById(id).orElseThrow();
        return map.paraResposta(cliente);
    }

    public List<ClienteResponse> listar() {
        return repo.findAll().stream().
                map(cliente -> map.paraResposta(cliente)).
                toList();
    }

    public List<ClienteResponse> listarPorId(Long id) {
        return repo.findById(id).stream().
                map(cliente -> map.paraResposta(cliente)).
                toList();
    }

}