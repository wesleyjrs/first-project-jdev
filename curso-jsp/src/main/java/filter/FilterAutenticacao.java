package filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import connection.SingleConnectionBanco;

@WebFilter(urlPatterns = {"/principal/*"})/*intercepta todas requisições que vierem do projeto ou mapeamento*/
public class FilterAutenticacao implements Filter {
	
	private static Connection connection;

    public FilterAutenticacao() {
    	
    }
    
    /*encerra os processos quando o servidor é parado
     * encerraprocessos de conexao com o banco*/
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*intercepta as requisiçoes quando o servidor é parado
	 *tudo que fizer no sistema vai fazerpor aki
	 *validação de autenticação
	 *dar commit e rollback de transações do banco
	 *Validar e fazer redirecionamento de paginas
	 * */

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		try {
			HttpServletRequest req = (HttpServletRequest) request;
			HttpSession session = req.getSession();
			
			String usuarioLogado = (String) session.getAttribute("usuario");
			
			String urlParaAutenticar  = req.getServletPath();/*url que esta sendo acessada*/
			
			/*validar se esta logado senao redireciona para a pagina de login*/
			
			if(usuarioLogado == null  && !urlParaAutenticar.equalsIgnoreCase("principal/ServletLogin")) {
				
				RequestDispatcher redireciona = request.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar);
				request.setAttribute("msg", "Por favor, realiza o login!");
				redireciona.forward(request, response);
				return;/*para a execução e redireciona para o login*/
			}else {
	
				chain.doFilter(request, response);
			}
			
			connection.commit();
			
		}catch (Exception e) {
			e.printStackTrace();
			
			RequestDispatcher redirecionar = request.getRequestDispatcher("/erro.jsp");
			request.setAttribute("msg", e.getLocalizedMessage());
			redirecionar.forward(request, response);
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

	
	/*inicia processos ou recursos quando o servidor é startado
	 * inicia a conexao com o banco
	 * */
	public void init(FilterConfig fConfig) throws ServletException {
		connection = SingleConnectionBanco.getConnection();
	}

}
