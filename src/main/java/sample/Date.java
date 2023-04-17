package sample;

import com.company.DateTimeUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {
    @FXML
    TextField d1;
    @FXML
    TextField d11;
    @FXML
    TextField d111;
    @FXML
    TextField d2;
    @FXML
    TextField d21;
    @FXML
    TextField d211;
    @FXML
    TextField d3;
    @FXML
    TextField d4;
    @FXML
    TextField r25;
    @FXML
    TextField n1;
    @FXML
    TextField n2;
    @FXML
    TextField v1;
    @FXML
    TextField v11;
    @FXML
    Button r1;
    @FXML
    Button r11;
    @FXML
    Button r111;
    @FXML
    void initialize(){
        r1.setOnAction(event -> {
            try {
                int date0 = Integer.parseInt(d1.getText());
                int date21 = Integer.parseInt(d11.getText());
                int date3 = Integer.parseInt(d111.getText());
                int date4 = Integer.parseInt(d2.getText());
                int date5 = Integer.parseInt(d21.getText());
                int date6 = Integer.parseInt(d211.getText());
                LocalDate date1 = LocalDate.of(date0, date21, date3);
                LocalDate date2 = LocalDate.of(date4, date5, date6);
                d3.setText(String.valueOf(DateTimeUtils.getDurationBetweenDates(date1, date2).toDays())); // 364
            }catch (Exception e){
                System.out.println(e);
            }
            // Пример использования функции для определения, является ли год високосным:
            int year = 2024;
            System.out.println(DateTimeUtils.isLeapYear(year)); // true

            // Пример использования функции для нахождения времени суток:
            LocalTime time = LocalTime.of(10, 30);
            System.out.println(DateTimeUtils.getTimeOfDay(time)); // утро

            // Пример использования функции для форматирования даты и времени:
            LocalDateTime dateTime = LocalDateTime.now();
            System.out.println(DateTimeUtils.formatDateTime(dateTime, "dd.MM.yyyy HH:mm:ss")); // 01.01.2022 12:00:00
        });
        r11.setOnAction(event -> {

         try {

             // Пример использования функции для определения, является ли год високосным:
             int year = Integer.parseInt(r25.getText());
             d4.setText(String.valueOf(DateTimeUtils.isLeapYear(year))); // true

             // Пример использования функции для нахождения времени суток:
             LocalTime time = LocalTime.of(10, 30);
             System.out.println(DateTimeUtils.getTimeOfDay(time)); // утро

             // Пример использования функции для форматирования даты и времени:
             LocalDateTime dateTime = LocalDateTime.now();
             System.out.println(DateTimeUtils.formatDateTime(dateTime, "dd.MM.yyyy HH:mm:ss")); // 01.01.2022 12:00:00
         } catch (Exception e){
                System.out.println(e);
            }
        });
        r111.setOnAction(event -> {
            try {
            int d1= Integer.parseInt(n1.getText());
            int d2= Integer.parseInt(n2.getText());
            // Пример использования функции для нахождения времени суток:
            LocalTime time = LocalTime.of(d1, d2);
            v1.setText(DateTimeUtils.getTimeOfDay(time)); // утро

            // Пример использования функции для форматирования даты и времени:
            LocalDateTime dateTime = LocalDateTime.now();
           v11.setText(DateTimeUtils.formatDateTime(dateTime, "dd.MM.yyyy HH:mm:ss")); // 01.01.2022 12:00:00
            } catch (Exception e){
                System.out.println(e);
            }
        });
    }
}
