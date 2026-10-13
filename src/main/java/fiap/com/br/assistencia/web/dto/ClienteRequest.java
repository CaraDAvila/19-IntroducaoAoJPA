package fiap.com.br.assistencia.web.dto;

public record ClienteRequest(
   String nome,
   String email,
   Long telefone,
   String senha
){}
