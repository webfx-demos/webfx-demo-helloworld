// File managed by WebFX (DO NOT EDIT MANUALLY)

module webfx.demo.helloworld.application {

    // Direct dependencies modules
    requires javafx.graphics;

    // Exported packages
    exports dev.webfx.demo.helloworld;

    // Provided services
    provides javafx.application.Application with dev.webfx.demo.helloworld.HelloWorldApplication;

}