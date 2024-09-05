import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeGUI {

    private TextField nameField;
    private TextField codeField;
    private TextField designationField;
    private TextField salaryField;

    
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Employee Database");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Create labels
        Label nameLabel = new Label("Name:");
        Label codeLabel = new Label("Code:");
        Label designationLabel = new Label("Designation:");
        Label salaryLabel = new Label("Salary:");

        // Create text fields
        nameField = new TextField();
        codeField = new TextField();
        designationField = new TextField();
        salaryField = new TextField();

        // Create save button
        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> saveEmployee());

        // Add components to the grid pane
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(codeLabel, 0, 1);
        gridPane.add(codeField, 1, 1);
        gridPane.add(designationLabel, 0, 2);
        gridPane.add(designationField, 1, 2);
        gridPane.add(salaryLabel, 0, 3);
        gridPane.add(salaryField, 1, 3);
        gridPane.add(saveButton, 1, 4);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void saveEmployee() {
        String name = nameField.getText();
        String code = codeField.getText();
        String designation = designationField.getText();
        double salary = Double.parseDouble(salaryField.getText());

        // Insert the employee data into the database using JDBC
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/employee_db", "username", "password");
             PreparedStatement statement = connection.prepareStatement("INSERT INTO employees (name, code, designation, salary) VALUES (?, ?, ?, ?)")) {
            statement.setString(1, name);
            statement.setString(2, code);
            statement.setString(3, designation);
            statement.setDouble(4, salary);

            statement.executeUpdate();
            System.out.println("Employee data saved successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
