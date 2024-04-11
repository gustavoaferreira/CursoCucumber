package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AprenderCucumber {

	@Given("que criei o arquivo corretamente")
	public void que_criei_o_arquivo_corretamente() {

	}

	@When("executa-lo")
	public void executa_lo() {

	}

	@Then("a especificacao deve finalizar com sucesso")
	public void a_especificacao_deve_finalizar_com_sucesso() {

	}
	
	private int contador = 0;
	
	@Given("que o valor do contador e (\\d+)$")
	public void que_o_valor_do_contador(Integer int1) {
	    contador = int1;
	}

	@When("eu incrementar em (\\d+)$")
	public void eu_incrementar_em(Integer int1) {
	    contador = contador + int1;
	}

	@Then("o valor do contador sera (\\d+)$")
	public void o_valor_do_contador_ser(Integer int1) {
	    Assert.assertEquals(int1.doubleValue(), Double.valueOf(contador));
	}
}
