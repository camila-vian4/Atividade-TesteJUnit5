package org.projeto;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidacaoSenhaServiceTest {
    private ValidarSenha service =
            new ValidarSenha();

    @Test
    // CT01
    public void deveAceitarSenhaValida() {
        String senha = "Java@12345";
        boolean resultado =
                service.validarSenha(senha);
        assertTrue(resultado);
    }

    @Test
    // CT02
    public void deveRejeitarSenhaMenorQue10Caracteres() {
        String senha = "Java@1234";
        boolean resultado =
                service.validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    // CT03
    public void deveRejeitarSenhaMaiorQue12Caracteres() {
        String senha = "Java@12345678";
        boolean resultado =
                service.validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    // CT04
    public void deveRejeitarSenhaMaiorSemNumero() {
        String senha = "Java@Testes";
        boolean resultado =
                service.validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    // CT05
    public void deveRejeitarSenhaSemLetra() {
        String senha = "123456@789";
        boolean resultado =
                service.validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    // CT06
    public void deveRejeitarSenhaSemEspecial() {
        String senha = "Java123456";
        boolean resultado = service.validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    // CT07
    public void deveRejeitarSenhaNula() {
        String senha = null;
        boolean resultado =
                service.validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    // CT08
    public void deveRejeitarSenhaVazia() {
        String senha = "";
        boolean resultado =
                service.validarSenha(senha);
        assertFalse(resultado);
    }

    @Test
    // CT09
    public void deveAceitarSenhaComExatamente10Caracteres() {
        String senha = "Java@12345";
        boolean resultado = service.validarSenha(senha);
        assertTrue(resultado);
    }

    @Test
    // CT10
    public void deveAceitarSenhaComExatamente12Caracteres() {
        String senha = "Java@1234567";
        boolean resultado = service.validarSenha(senha);
        assertTrue(resultado);
    }

}