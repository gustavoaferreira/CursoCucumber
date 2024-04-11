package steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
	
	Date entrega = new Date();
	
	@Given("que a entrega e dia (\\d+)/(\\d+)/(\\d+)$")
	public void que_a_entrega_e_dia(Integer dia, Integer mes, Integer ano) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@When("a entrega atrasa em (\\d+) (dia|dias|mes|meses)$")
	public void a_entrega_atrasa_em_dias(Integer int1, String tempo) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if(tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, int1);
		}
		if(tempo.equals("meses")) {
			cal.add(Calendar.MONTH, int1);
		}
		entrega = cal.getTime();
	}

	@Then("a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void a_entrega_sera_efetuada_em(String data) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);
	}
}
