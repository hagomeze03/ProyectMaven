package com.ui.run;

import com.ui.driver.BaseDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/Features/BusquedaProductoEbay.feature"},
        glue = { "com.ui.steps" },
        tags = {"not @tag", "@tag1"},
        plugin = {"json:target/cucumber-reports/Cucumber.json" },
        monochrome = true)

public class RunProyect {
    static BaseDriver bd = new BaseDriver();

    @BeforeClass
    public static void iniciarDriver() throws Exception {
        bd.inicializarDriver();
        Thread.sleep(5000);
    }

    @AfterClass
    public static void cerrarDriver() {
        bd.finalizarDriver();
    }

}