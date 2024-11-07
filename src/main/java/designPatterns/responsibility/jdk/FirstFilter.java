package designPatterns.responsibility.jdk;

public class FirstFilter implements Filter{

    @Override
    public void doFilter(Request req, Response res, FilterChain chain) {
        System.out.println("过滤器1 前置处理");
        chain.doFilter(req,res);
        System.out.println("过滤器1 后置处理");
    }
}
