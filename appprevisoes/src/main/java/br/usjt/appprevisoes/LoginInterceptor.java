package br.usjt.appprevisoes;

public class LoginInterceptor extends HandlerInterceptorAdapter {
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		//pega a sessão
		HttpSession session = request.getSession();
		//se ainda não logou, manda para a página de login
		if (session.getAttribute("usuarioLogado") == null)
			response.sendRedirect("login");
			//se já logou, deixa a requisição passar e chegar no controller
		return true;
	}
}