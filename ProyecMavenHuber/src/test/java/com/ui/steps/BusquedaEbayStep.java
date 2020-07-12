package com.ui.steps;

import com.ui.driver.BaseDriver;
import com.ui.pages.BusquedaEbayPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BusquedaEbayStep extends BaseDriver {

    BusquedaEbayPage busqueda_ebay = new BusquedaEbayPage(driver);

    @Given("ingreso a la web de {string}")
    public void ingreso_a_la_web_de(String url) {
        busqueda_ebay.go_url(url);
    }

    @When("realice la busquedad de  {string}")
    public void realice_la_busquedad_de(String producto) {
        busqueda_ebay.buscarProducto(producto);
    }

    @When("elijo la talla {int}")
    public void elijo_la_talla(int talla) throws InterruptedException{
        busqueda_ebay.elegirTalla();
    }

    @When("elijo la marca {string}")
    public void elijo_la_marca(String string) {

    }

    @Then("visualizo los resultados")
    public void visualizo_los_resultados() {

    }

    @Then("obtengo el precio")
    public void obtengo_el_precio() {

    }
}
