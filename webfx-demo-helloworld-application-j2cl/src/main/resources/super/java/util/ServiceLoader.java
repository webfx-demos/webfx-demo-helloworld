// File managed by WebFX (DO NOT EDIT MANUALLY)
package java.util;

import java.util.Iterator;
import java.util.logging.Logger;
import java.util.function.Supplier;

public class ServiceLoader<S> implements Iterable<S> {

    public static <S> ServiceLoader<S> load(Class<S> serviceClass) {
        switch (serviceClass.getName()) {
            case "dev.webfx.demo.helloworld.console.spi.ConsoleProvider": return new ServiceLoader<S>(dev.webfx.demo.helloworld.console.spi.impl.GwtJ2clConsoleProvider::new);

            // UNKNOWN SPI
            default:
                Logger.getLogger(ServiceLoader.class.getName()).warning("Unknown " + serviceClass + " SPI - returning no provider");
                return new ServiceLoader<S>();
        }
    }

    private final Supplier[] factories;

    public ServiceLoader(Supplier... factories) {
        this.factories = factories;
    }

    public Iterator<S> iterator() {
        return new Iterator<S>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < factories.length;
            }

            @Override
            public S next() {
                return (S) factories[index++].get();
            }
        };
    }
}