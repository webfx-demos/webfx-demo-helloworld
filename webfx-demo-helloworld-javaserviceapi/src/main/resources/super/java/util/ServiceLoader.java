// File managed by WebFX (DO NOT EDIT MANUALLY)
package java.util;

import java.util.logging.Logger;
import java.util.function.Supplier;

public class ServiceLoader<S> implements Iterable<S> {

    public static <S> ServiceLoader<S> load(Class<S> serviceClass) {
        throw new UnsupportedOperationException("This ServiceLoader mock should never be used at runtime");
    }

    @Override
    public Iterator<S> iterator() {
        throw new UnsupportedOperationException("This ServiceLoader mock should never be used at runtime");
    }
}