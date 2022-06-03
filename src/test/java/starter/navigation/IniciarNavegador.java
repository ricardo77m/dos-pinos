package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class IniciarNavegador {

    public static Performable IniciarExpressTesting() {
        return Task.where("{0} abre la pagina principal de Express Dos Pinos",
                Open.browserOn().the(ExpressTesting.class)
        );
    }


}