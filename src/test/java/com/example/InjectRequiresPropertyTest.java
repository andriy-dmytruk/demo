package com.example;

import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Requires;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.junit.jupiter.api.Test;

@MicronautTest
@Property(name = "my-property", value = "my-value")
public class InjectRequiresPropertyTest {
    @Inject
    MyClass myClass;

    @Requires(property = "my-property", value = "my-value")
    @Singleton
    static class MyClass {}

    @Test
    void testWorks() {

    }
}
