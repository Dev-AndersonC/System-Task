public class Aula_func {
    public static void main(String[] args) throws Exception {
        soma();
        String nome = "Anderson";
        saudacao(nome);
    }

    public static void soma() {
        int x, y;
        x = 10;
        y = 2;
        System.out.println(x + y);
    }
    public static void saudacao(String nome) {
        System.out.println("Hello, " + nome);
    }
}
