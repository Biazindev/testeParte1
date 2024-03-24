package br.com.tbiazin.teste;


import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class TarefaStreamLambdaTeste {

    @Test
    public void testFiltrarMulheres() {
        List<String> pessoas = Stream.of(
                "João, m",
                "Pedro, m",
                "Lucas, m",
                "Miguel, m",
                "Gabriel, m",
                "Ana, f",
                "Mariana, f",
                "Julia, f",
                "Maria, f",
                "Camila, f"
        ).collect(Collectors.toList());

        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.split(", ")[1].equalsIgnoreCase("f"))
                .collect(Collectors.toList());

        mulheres.forEach(nome -> assertEquals("f", nome.split(", ")[1]));
    }
}
