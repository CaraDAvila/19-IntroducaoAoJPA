package fiap.com.br.assistencia.controller;

import fiap.com.br.assistencia.service.ClienteService;
import fiap.com.br.assistencia.web.dto.ClienteRequest;
import fiap.com.br.assistencia.web.dto.ClienteResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/pesquisar/{id}")
    public ClienteResponse pesquisar (@PathVariable Long id){
        return service.pesquisar(id);
    }

    @GetMapping ("/listar")
    public List<ClienteResponse> listar(){
        return service.listar();
    }

    @GetMapping ("/listarId")
    public List<ClienteResponse> listarId(@PathVariable Long id){
        return service.listarPorId(id);
    }

    @DeleteMapping ("/remover/{id}")
    public void remover (@PathVariable Long id){service.remover(id);}

    @PutMapping ("/atualizar/{id}")
    public ClienteResponse atualizar (@PathVariable Long id,@RequestBody ClienteRequest dto){return service.atualizar(id,dto);}

    @GetMapping ("/pesquisar-email/{email}")
    public ClienteResponse pesquisarEmail (@PathVariable String email){return service.pesquisarPorEmail(email);}


}
