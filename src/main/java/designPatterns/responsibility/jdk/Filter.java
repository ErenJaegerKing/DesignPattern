package designPatterns.responsibility.jdk;

public interface Filter {
    public void doFilter(Request req, Response res, FilterChain chain);
}
