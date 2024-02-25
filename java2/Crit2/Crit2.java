import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.Period;

public class Crit2 extends JFrame implements ActionListener {
    private JTextField yearField, monthField, dayField;
    private JButton calculateButton;
    private JLabel ageLabel;

    public Crit2() {
        setTitle("Age Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        yearField = new JTextField(4);
        monthField = new JTextField(2);
        dayField = new JTextField(2);
        calculateButton = new JButton("Calculate");
        ageLabel = new JLabel("");

        calculateButton.addActionListener(this);

        panel.add(new JLabel("Year:"));
        panel.add(yearField);
        panel.add(new JLabel("Month:"));
        panel.add(monthField);
        panel.add(new JLabel("Day:"));
        panel.add(dayField);
        panel.add(calculateButton);
        panel.add(ageLabel);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            int year = Integer.parseInt(yearField.getText());
            int month = Integer.parseInt(monthField.getText());
            int day = Integer.parseInt(dayField.getText());

            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();
            Period age = Period.between(birthDate, currentDate);

            ageLabel.setText("Age: " + age.getYears() + " years");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Crit2 app = new Crit2();
            app.setVisible(true);
        });
    }
}