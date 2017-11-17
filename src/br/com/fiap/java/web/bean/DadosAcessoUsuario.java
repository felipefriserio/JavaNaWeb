package br.com.fiap.java.web.bean;

public class DadosAcessoUsuario {

	private String dataPrimeiroAcesso;
	private String dataUltimoAcesso;
	
	public String getDataPrimeiroAcesso() {
		return dataPrimeiroAcesso;
	}
	public void setDataPrimeiroAcesso(String dataPrimeiroAcesso) {
		this.dataPrimeiroAcesso = dataPrimeiroAcesso;
	}
	public String getDataUltimoAcesso() {
		return dataUltimoAcesso;
	}
	public void setDataUltimoAcesso(String dataUltimoAcesso) {
		this.dataUltimoAcesso = dataUltimoAcesso;
	}
}
