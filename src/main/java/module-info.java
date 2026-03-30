module org.example.prueba_selenium_venta {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.common;
    requires org.seleniumhq.selenium.api;
    requires org.seleniumhq.selenium.chrome_driver;


    opens org.example.prueba_selenium_venta to javafx.fxml;
    exports org.example.prueba_selenium_venta;
}