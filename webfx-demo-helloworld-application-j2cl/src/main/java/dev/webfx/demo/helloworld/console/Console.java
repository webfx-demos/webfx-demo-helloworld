package dev.webfx.demo.helloworld.console;

import dev.webfx.demo.helloworld.console.spi.ConsoleProvider;

import java.util.ServiceLoader;

/**
 * @author Bruno Salmon
 */
public final class Console {

    private static final ConsoleProvider PROVIDER = ServiceLoader.load(ConsoleProvider.class).iterator().next();

    public static void log(String message) {
        PROVIDER.log(message);
    }

}
