import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("Ferrari"));
        listaCarro.add(new Carro("Mercedes"));
        listaCarro.add(new Carro("Porshe"));

        System.out.println(listaCarro.contains(new Carro("Ferrari")));
        System.out.println(new Carro("Ferrari").hashCode());

    }
}
