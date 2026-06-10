import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuarioTest {

  @Test
    void nomeValido() {
        assertTrue(ValidadorUsuario.validarNome("João"));
    }

    @Test
    void nomeMuitoCurto() {
        assertFalse(ValidadorUsuario.validarNome("Jv"));
    }

    @Test
    void nomeMuitoLongo() {
        assertFalse(ValidadorUsuario.validarNome("NomeMuitoGrandeComMaisDe20Caracteres"));
    }

    @Test
    void nomeNulo() {
        assertFalse(ValidadorUsuario.validarNome(null));
    }

    @Test
    void emailValido() {
        assertTrue(ValidadorUsuario.validarEmail("teste@email.com"));
    }

    @Test
    void emailSemArroba() {
        assertFalse(ValidadorUsuario.validarEmail("testeemail.com"));
    }

    @Test
    void emailSemDominio() {
        assertFalse(ValidadorUsuario.validarEmail("teste@"));
    }

    @Test
    void emailNulo() {
        assertFalse(ValidadorUsuario.validarEmail(null));
    }

    @Test
    void senhaValida() {
        assertTrue(ValidadorUsuario.validarSenha("abc123"));
    }

    @Test
    void senhaMuitoCurta() {
        assertFalse(ValidadorUsuario.validarSenha("a1"));
    }

    @Test
    void senhaSemNumeros() {
        assertFalse(ValidadorUsuario.validarSenha("abcdef"));
    }

    @Test
    void senhaSemLetras() {
        assertFalse(ValidadorUsuario.validarSenha("123456"));
    }

    @Test
    void senhaNula() {
        assertFalse(ValidadorUsuario.validarSenha(null));
    }
}
