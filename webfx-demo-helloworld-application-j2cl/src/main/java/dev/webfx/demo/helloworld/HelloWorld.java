package dev.webfx.demo.helloworld;

import dev.webfx.demo.helloworld.console.Console;
import elemental2.dom.DomGlobal;
import org.treblereel.j2cl.processors.annotations.GWT3EntryPoint;

public class HelloWorld {

    @GWT3EntryPoint
    public void entryPoint() {
        Console.log("Hello world!");
    }

}
