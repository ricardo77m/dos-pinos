package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.pagesObjects.HomeExpressPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductosTasks implements Task {
    public static Performable agregarProductos() {
        return instrumented(AgregarProductosTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeExpressPageElements.SECCIONGRANJA),
                Click.on(HomeExpressPageElements.PRODUCTO1)
        );

    }
}
