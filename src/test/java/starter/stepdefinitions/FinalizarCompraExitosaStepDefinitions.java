package starter.stepdefinitions;

import starter.tasks.AgregarProductosTasks;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.IniciarNavegador;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class FinalizarCompraExitosaStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) desea realizar una compra en Express Dos Pinos")
    public void juan_desea_realizar_una_compra_en_Express_Dos_Pinos(String name){
        this.name = name;
    }

    @When("ingresa a la pagina web de Express")
    public void ingresa_a_la_pagina_web_de_Express(){
        theActorCalled(name).attemptsTo(
                IniciarNavegador.IniciarExpressTesting());
    }
    @When("ingresa productos al carrito de compras")
    public void ingresa_productos_al_carrito_de_compras() {
        theActorCalled(name).attemptsTo(
                AgregarProductosTasks.agregarProductos()
        );
    }

    @When("ingresa los datos correctos para finalizar la compra")
    public void ingresa_los_datos_correctos_para_finalizar_la_compra() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("hace clic en el boton Realizar Pago")
    public void hace_clic_en_el_boton_Realizar_Pago() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("es redireccionado a la pantalla de informacion de pago")
    public void es_redireccionado_a_la_pantalla_de_informacion_de_pago() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
