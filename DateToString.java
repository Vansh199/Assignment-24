import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateToString {
public static void main(String[] args) {
LocalDate date = LocalDate.of(2023, 4, 28);
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
String formattedDate = date.format(formatter);
System.out.println("Formatted Date: " + formattedDate);
}
}
