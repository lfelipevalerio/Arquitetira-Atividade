package br.usjt.previsoesV2;

import javax.servlet.http.*;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {

		HttpSession session = request.getSession();

		if (session.getAttribute("usuarioLogado") == null)
			response.sendRedirect("login");
		return true;
	}
}