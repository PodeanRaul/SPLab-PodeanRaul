package ro.uvt.info.lab1sp;

import jakarta.servlet.*;
        import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1)
public class RequestLoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        System.out.println("[LoggingFilter] Inainte de procesare cerere: " + req.getMethod() + " " + req.getRequestURI());

        // Trimite cererea mai departe pe lant (Chain of Responsibility)
        chain.doFilter(request, response);

        System.out.println("[LoggingFilter] Dupa procesare cerere: status " + res.getStatus());
    }
}