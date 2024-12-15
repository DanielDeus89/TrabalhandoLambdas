package atividade06;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> names =  Arrays.asList("Lucas","Maria","João","Daniel");
        names.sort(String::compareTo);
        System.out.println(names);
    }
}
