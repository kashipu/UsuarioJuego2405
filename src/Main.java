public class Main {
    public static void main(String[] args) {
        UsuarioJuego sergio = new UsuarioJuego("Sergio", "123");
        System.out.println(sergio);
        sergio.subirNivel();
        sergio.subirNivel();
        sergio.subirNivel();
        System.out.println(sergio.getNivel());
    }
}
