package fiap.com.br.assistencia.mapper;

import fiap.com.br.assistencia.domain.Cliente;
import fiap.com.br.assistencia.web.dto.ClienteRequest;
import fiap.com.br.assistencia.web.dto.ClienteResponse;
import org.springframework.stereotype.Component;

@Component//Ducktape on an airplane Dont Ask Me

public class ClienteMapper {
    public Cliente paraEntidade (ClienteRequest dto){
        Cliente cliente = new Cliente();
        cliente.setNome(dto.nome());
        cliente.setEmail(dto.email());
        cliente.setTelefone(dto.telefone());
        cliente.setSenha(dto.senha());

        return cliente;
    }

    public ClienteResponse paraResposta(Cliente cliente){
        return new ClienteResponse(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getTelefone());
    }

}
