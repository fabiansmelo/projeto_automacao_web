$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Compras.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    }
  ],
  "line": 3,
  "name": "Adicionar itens ao carrinho",
  "description": "",
  "id": "adicionar-itens-ao-carrinho",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@TesteCompras"
    }
  ]
});
formatter.before({
  "duration": 1660741100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Contexto"
});
formatter.step({
  "line": 6,
  "name": "que o usuario esteja logado no sistema",
  "keyword": "Dado "
});
formatter.match({
  "location": "ComprasSteps.que_o_usuario_esteja_logado_no_sistema()"
});
formatter.result({
  "duration": 1311987100,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Adicionar um item ao carrinho de compras",
  "description": "",
  "id": "adicionar-itens-ao-carrinho;adicionar-um-item-ao-carrinho-de-compras",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 9,
  "name": "o usuario clica no botao Add To Cart",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "o sistema devera validar que os itens foram adicionados ao carrinho",
  "keyword": "Entao "
});
formatter.match({
  "location": "ComprasSteps.o_usuario_clica_no_botao_Add_To_Cart()"
});
formatter.result({
  "duration": 45910300,
  "status": "passed"
});
formatter.match({
  "location": "ComprasSteps.o_sistema_devera_validar_que_os_itens_foram_adicionados_ao_carrinho()"
});
formatter.result({
  "duration": 42898100,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[2]\u003e but was:\u003c[1]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat pageobjects.ComprasPage.validarQuantidade(ComprasPage.java:36)\r\n\tat stepdefinitions.ComprasSteps.o_sistema_devera_validar_que_os_itens_foram_adicionados_ao_carrinho(ComprasSteps.java:32)\r\n\tat ✽.Entao o sistema devera validar que os itens foram adicionados ao carrinho(Features/Compras.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 580796300,
  "status": "passed"
});
});