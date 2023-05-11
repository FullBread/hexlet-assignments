package exercise;

import java.util.List;

public class App {
    public static Long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(address -> address.endsWith("gmail.com")
                        || address.endsWith("yandex.ru")
                        || address.endsWith("hotmail.com"))
                .count();
    }
}
