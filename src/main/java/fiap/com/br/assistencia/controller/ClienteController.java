package fiap.com.br.assistencia.controller;

import fiap.com.br.assistencia.service.ClienteService;
import fiap.com.br.assistencia.web.dto.ClienteRequest;
import fiap.com.br.assistencia.web.dto.ClienteResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")//nome na url

public class ClienteController {

    private final ClienteService service;



    public ClienteController(ClienteService service) {
        this.service = service;
    }

    //metodos

    @PostMapping("/salvar")
    //ClienteResponse nao tem a senha, ClienteResponse tem
    public ClienteResponse salvar(@RequestBody ClienteRequest dto){
        return service.salvar(dto);

    }
}
