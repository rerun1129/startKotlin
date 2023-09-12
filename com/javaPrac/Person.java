package javaPrac;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class Person {
    private final String name;

    public Person ( String name ) { this.name = name; }

    public String name ( ) { return name; }

    public String getName ( ) {
        return name;
    }

    @Override
    public String toString ( ) {
        return "Person[" +
                "name=" + name + ']';
    }
}
