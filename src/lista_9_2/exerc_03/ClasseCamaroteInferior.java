package lista_9_2.exerc_03;

public class ClasseCamaroteInferior extends ClasseVip {

	private String localizacaoIngresso;

	
	public ClasseCamaroteInferior() {
		super();
	}

	public ClasseCamaroteInferior(double valor, double valorAdicionalVip, String localizacaoIngresso ) {
		super(valor, valorAdicionalVip);
		this.localizacaoIngresso = localizacaoIngresso;
	}

	public String imprimeLocalizacao() {
		return "Localização: " + this.localizacaoIngresso;
	}

	public String getLocalizacaoIngresso() {
		return localizacaoIngresso;
	}

	public void setLocalizacaoIngresso(String localizacaoIngresso) {
		this.localizacaoIngresso = localizacaoIngresso;
	}

}
