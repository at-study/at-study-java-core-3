package lections.lesson4;

public class SqlConnection {

    private static SqlConnection instance;

    private boolean isConnected = false;

    public static SqlConnection getInstance() {
        // Ленивая инициализация:
        if (instance == null) {
            instance = new SqlConnection();
        }
        return instance;
    }

    private SqlConnection() {
    }

    private void connect() {
        isConnected = true;
        System.out.println("Подключились к БД");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Отключились от БД");
    }

    public void executeQuery(String query) {
        if (!isConnected) {
            connect();
        }
        System.out.println("Выполнен запрос к БД: " + query);
    }




}
