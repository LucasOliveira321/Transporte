package br.com.techfive.transporte.usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    @Query(value = """
            SELECT
                *
            FROM 
                usuario
            WHERE
                email = :email
            AND
                senha = :senha           
            """, nativeQuery = true)
    public boolean validaLogin(String email, String senha);
}
