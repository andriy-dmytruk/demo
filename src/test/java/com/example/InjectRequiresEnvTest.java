package com.example;

import io.micronaut.context.annotation.Requires;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.junit.jupiter.api.Test;

@MicronautTest(environments = "my-env")
public class InjectRequiresEnvTest {
    @Inject
    MyClass myClass;

    @Requires(env = "my-env")
    @Singleton
    static class MyClass {}

    @Test
    void testWorks() {

    }
}
