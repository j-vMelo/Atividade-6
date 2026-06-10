public class ValidadorUsuario {

        public static boolean validarNome(String nome) {
            return nome != null && nome.length() >= 3 && nome.length() <= 20;
        }

        public static boolean validarEmail(String email) {
            return email != null && email.contains("@") && email.contains(".");
        }

        public static boolean validarSenha(String senha) {
            if (senha == null || senha.length() < 3) return false;

            boolean temLetra = senha.matches(".*[a-zA-Z].*");
            boolean temNumero = senha.matches(".*\\d.*");

            return temLetra && temNumero;
        }
    }
