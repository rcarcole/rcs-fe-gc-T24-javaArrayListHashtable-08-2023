package Ex03_Milestone03;

public class Excepciones {
    public static class PlatoNoExisteException extends Exception {
        public PlatoNoExisteException(String mensaje) {
            super(mensaje);
        }
    }

    public static class RespuestaInvalidaException extends Exception {
        public RespuestaInvalidaException(String mensaje) {
            super(mensaje);
        }
    }

    public static class TipoInvalidoException extends Exception {
        public TipoInvalidoException(String mensaje) {
            super(mensaje);
        }
    }
}
