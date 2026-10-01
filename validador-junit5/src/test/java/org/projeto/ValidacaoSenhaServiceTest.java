package org.projeto;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidacaoSenhaServiceTest {
    private ValidarSenha service =
            new ValidarSenha();

    @Test
    public void deveAceitarSenhaValida() {
        String senha = "Java@1234";
        boolean resultado =
                service.validarSenha(senha);
        assertTrue(resultado);
    }
}
