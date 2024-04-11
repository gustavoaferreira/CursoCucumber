package steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
	    Assert.assertEquals(Double.valueOf(int1), Double.valueOf(contador));
	}
	
	Date entrega = new Date();
	
	@Given("que a entrega e dia {data}")
	public void que_a_entrega_e_dia(Date data) {
		entrega = data;
		System.out.println(entrega);
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
	
	@Given("que o ticket( especial)? e (A.\\d{3})$")
	public void queOTicketEAF(String tipo, String arg1) {
	    
	}
	@Given("que o valor da passagem e R\\$ (\\d+),(\\d+)$")
	public void queOValorDaPassagemER$(Integer int1, int arg2) {
	    
	}
	@Given("que o nome do passageiro e \"(.{5,20})\"$")
	public void queONomeDoPassageiroE(String arg1) {
	    
	}
	@Given("que o telefone do passageiro e (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiro(String telefone) {

	}
	@When("criar os steps")
	public void criarOsSteps() {

	}
	@Then("o teste vai funcionar")
	public void oTesteVaiFuncionar() {

	}


}
