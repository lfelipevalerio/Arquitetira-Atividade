package br.usjt.hellospringboot;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Bean
	public Calculadora getCalcudora() {
		return new Calculadora();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/",
				"/fazerLogin");
	}
}