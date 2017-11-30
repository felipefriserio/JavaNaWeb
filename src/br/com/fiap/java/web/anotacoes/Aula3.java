package br.com.fiap.java.web.anotacoes;

public class Aula3 {
	
		/*
		 * TIOBE
		 * https://www.tiobe.com/tiobe-index/
		 * Site que mostra usagem das linguagens
		 * 
		 * 
		 * -- Revisao
		 * Servlet  = Request / Response
		 * Filter   = Intercepta/Filtra requisicoes/ chamadas
		 * Listener = - Permitem monitorar e reagir a eventos relacionados com o ciclo de vida dos seguintes objetos: 
		 * 		1- Contexto(variavel compartilhada para toda app, todos usuarios) 
		 * 		2- Sessao(variaveis que pertencem a um determinado usuario)
		 * 		3- Request (soh existe durante a request) 
		 * 
		 * 	O container Web pode ser configurado para notificar listeners quando
		 *		• Contexto é inicializado ou destruído;
		 *		• Sessão é passivada ou ativada;
		 *		• Request é criado ou destruído;
		 *		• Atributos são adicionados ou removidos
		 *
		 *
		 *	 Exemplos de utilização de listeners:
		 *		• Inicializar um pool de conexões com BD quando iniciar o
		 *		contexto;
	 	 *		• Quando inicializa-se uma sessão, obtém conexão do pool e
		 *		devolve quando fechar a sessão;
		 *		• Quando o contexto é removido, as conexões são fechadas e
		 *		o pool é destruído;
		 *		• Monitorar atributos gravados na sessão, possivelmente
		 *		para medir ou limitar uso de memória;
		 *		• Inicialização / remoção de cache
		 *		• etc;
		 * 
		 * JSP		= Parecido com PHP, nada mais que uma jsp que eh transformada em servlet, rodada no lado do servidor
		 * 				
		 * 			Diretivas	- cabecalho
		 * 			declaracoes -
		 *  
		 *  				
		 * 			expressoes - dentro doGet() doPost(); 	
		 * 			scriptlet   - dentro doGet() doPost(); 
		 * 
		 * 			comentario, acao, custom tag 
		 * 
		 * 
		 * MVC
		 * 	M - Regra de negocio
		 * 	V - O que mostra pro usuario / tela/ apresentacao
		 *  C - Tratativa, quem cuida dessa tarefa, trata os eventos
		 *  
		 *   
		 *   JSF
		 *   - Framework baseado em componentes
		 *   - JSF eh uma especificacao em que diversas empresas implementam
		 *   
		 *    
		 *    Arquivo xhtml: pagina web 100% XML 
		 *    facets = parte visual (xhtml) 
		 * */
		
}

