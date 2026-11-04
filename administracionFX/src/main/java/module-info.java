module org.example.administracionfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    opens org.example.administracionfx to javafx.fxml;
    opens org.example.administracionfx.model to org.hibernate.orm.core;
    exports org.example.administracionfx;
}