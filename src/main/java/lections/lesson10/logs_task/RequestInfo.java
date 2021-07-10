package lections.lesson10.logs_task;

public class RequestInfo {
    private HttpMethod method;
    private String url;
    private String protocol;

    public RequestInfo(HttpMethod method, String url, String protocol) {
        this.method = method;
        this.url = url;
        this.protocol = protocol;
    }
}
