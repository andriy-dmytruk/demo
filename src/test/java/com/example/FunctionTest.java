package com.example;
import com.fnproject.fn.testing.FnTestingRule;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Requires;
import io.micronaut.core.type.Argument;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@MicronautTest(environments = "my-env")
@Property(name = "my-property", value = "my-value")
class FunctionTest {
    @Inject
    ApplicationContext context;

    @Test
    void testProperty() {
        assertTrue(context.getProperty("my-property", String.class).isPresent());
        assertEquals("my-value", context.getProperty("my-property", String.class).get());
    }

    @Test
    void testEnvironment() {
        assertTrue(context.getEnvironment().getActiveNames().contains("my-env"));
    }
}
