//package edu.ascending.training.car.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebFilter(filterName = "corsFilter", urlPatterns = {"/*"}, dispatcherTypes = {DispatcherType.REQUEST})
//public class CorsFilter implements Filter {
//    /**
//     * Default constructor.
//     */
//    public CorsFilter() {
//        // TODO Auto-generated constructor stub
//    }
//
//    /**
//     * @see Filter#destroy()
//     */
//    public void destroy() {
//        // TODO Auto-generated method stub
//    }
//
//    /**
//     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
//     */
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
//            throws IOException, ServletException {
//
//        HttpServletRequest request = (HttpServletRequest) servletRequest;
//        System.out.println("CORSFilter HTTP Request: " + request.getMethod());
//
//        // Authorize (allow) all domains to consume the content
//        ((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Origin", "http://local.ascendingdc.com:3000");
//        ((HttpServletResponse) servletResponse).addHeader("Access-Control-Allow-Methods","GET, OPTIONS, HEAD, PUT, POST");
//
//        HttpServletResponse resp = (HttpServletResponse) servletResponse;
//
//        // For HTTP OPTIONS verb/method reply with ACCEPTED status code -- per CORS handshake
//        if (request.getMethod().equals("OPTIONS")) {
//            resp.setStatus(HttpServletResponse.SC_ACCEPTED);
//            return;
//        }
//
//        // pass the request along the filter chain
//        chain.doFilter(request, servletResponse);
//    }
//
//    /**
//     * @see Filter#init(FilterConfig)
//     */
//    public void init(FilterConfig fConfig) throws ServletException {
//        // TODO Auto-generated method stub
//    }
//}
