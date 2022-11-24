package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.*;

public class AppTest
{
    @Test
    public void shouldAnswerWithTrue() {
        var myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));

        App.main(new String[]{});

        assertThat(myOut.toString()).isEqualTo("Hello World!");
    }
}
