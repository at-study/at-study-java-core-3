package lections.lesson10.logs_task;

import java.time.LocalDateTime;

public class LogRecord {
    private String host;
    private String user;
    private LocalDateTime timeStamp;
    private RequestInfo requestInfo;
    private int statusCode;
    private int size;
    private String referrer;
    private String userAgent;

    public LogRecord(String host, String user, LocalDateTime timeStamp, RequestInfo requestInfo, int statusCode, int size, String referrer, String userAgent) {
        this.host = host;
        this.user = user;
        this.timeStamp = timeStamp;
        this.requestInfo = requestInfo;
        this.statusCode = statusCode;
        this.size = size;
        this.referrer = referrer;
        this.userAgent = userAgent;
    }
}
