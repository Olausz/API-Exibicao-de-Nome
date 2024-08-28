package br.com.alunoonline.model;


import jakarta.persistence.Entity;
import lombok.Data;
Import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Aluno  implements Serializable {

    @Id 
    @GenerateValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String cpf;
}
