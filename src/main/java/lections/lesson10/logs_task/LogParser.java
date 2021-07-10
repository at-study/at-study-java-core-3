package lections.lesson10.logs_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LogParser {

    public static List<LogRecord> parseLogs(String path) throws IOException {
        List<String> content = Files.readAllLines(Paths.get(path));
        List<LogRecord> records = new ArrayList<>();
        for (String logLine : content) {
            LogRecord record = makeLogRecord(logLine);
            records.add(record);
        }
        return records;
    }

    private static LogRecord makeLogRecord(String line) {
        String[] lineSplit = line.split(" ");
        String host = lineSplit[0];
        String user = lineSplit[1];
        LocalDateTime time = LocalDateTime.parse(
                lineSplit[2],
                DateTimeFormatter.ofPattern("'['dd/MMM/yyyy:HH:mm:ss']'", Locale.ENGLISH)
        );
        HttpMethod method = HttpMethod.valueOf(lineSplit[3].replace("\"", ""));
        String url = lineSplit[4];
        String protocol = lineSplit[5].replace("\"", "");
        int statusCode = Integer.parseInt(lineSplit[6]);
        int size = Integer.parseInt(lineSplit[7]);
        String referrer = lineSplit[8].replace("\"", "");
        String userAgent = lineSplit[9] + lineSplit[10] + lineSplit[11] + lineSplit[12];

        RequestInfo requestInfo = new RequestInfo(method, url, protocol);
        LogRecord record = new LogRecord(host, user, time, requestInfo, statusCode, size, referrer, userAgent);
        return record;
    }
}
