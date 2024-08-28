package br.com.alunoonline.repository;

import org.springframework.stereotype.Repository;

@Repository 
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
