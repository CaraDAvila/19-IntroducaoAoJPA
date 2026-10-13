package fiap.com.br.assistencia.web.dto;

public record ClienteResponse(
        Long id,
        String nome,
        String email,
        Long telefone
){}
