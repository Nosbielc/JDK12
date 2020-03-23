public class Main {

    public static void main(String[] args) {
        novosMetodosString();
    }

    private static void novosMetodosString() {

        String indent = "Olá\nMundo!".indent(3);
        System.out.println(indent);

        String transform = "Olá".transform(s -> s + ", Mundo!");

        System.out.println(transform);

        transform = "olá"
                .transform(s -> s + ", mundo!")
                .transform(String::toUpperCase);

        System.out.println(transform);

    }

}
