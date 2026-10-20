package fiap.com.br.assistencia.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "JAVA_CLIENTE")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_CLIENTE")
    private Long id; //chave primária

    @Column(name="NOME",nullable = false,length = 120)
    private String nome;

    @Column(name="EMAIL",nullable = false, length = 120, unique = true)
    private String email;

    @Column(name="TELEFONE",nullable = true,length = 13)
    private Long telefone;

    @Column(name="SENHA", nullable = false, length = 512)
    private String senha;


}
