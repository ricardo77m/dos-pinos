Feature: Finalizar Compra Exitosa en Express

  @datos @exitosos
  Scenario: Finalizar Compra Exitosa en Express
    Given Juan desea realizar una compra en Express Dos Pinos
    When ingresa a la pagina web de Express
    And ingresa productos al carrito de compras
    And ingresa los datos correctos para finalizar la compra
    And hace clic en el boton Realizar Pago
    Then es redireccionado a la pantalla de informacion de pago