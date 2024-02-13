package dev.webfx.demo.helloworld.console.spi.impl;

import dev.webfx.demo.helloworld.console.spi.ConsoleProvider;
import elemental2.dom.DomGlobal;

/**
 * @author Bruno Salmon
 */
public class GwtJ2clConsoleProvider implements ConsoleProvider {

    @Override
    public void log(String message) {
        DomGlobal.console.log(message);
    }
}
