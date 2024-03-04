import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Crit3 extends JFrame{
    JPanel panel = new JPanel(new FlowLayout());

    JTextField textField = new JTextField(10); 

    JButton button1 = new JButton("Print the day and time into the text box");
    JButton button2 = new JButton("Save the text in the text box to log.txt");
    JButton button3 = new JButton("Change the frame to a color of green");
    JButton button4 = new JButton("Exit");
    Random random = new Random();

    public Crit3() {
        panel.add(textField); 

        panel.add(button1);  
        panel.add(button2);  
        panel.add(button3);  
        panel.add(button4);  

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printDateTime();
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                writeToFile();
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeFrameColorToGreen();
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(panel);
        setTitle("Button Actions");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

   private void printDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        textField.setText(formattedDateTime);
    }

    private void writeToFile() {
        String content = textField.getText();
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
            writer.println(content);
            JOptionPane.showMessageDialog(this, "Text saved to log.txt", "Save to File", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error writing to file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void changeFrameColorToGreen() {
        float hue = random.nextFloat();
        Color color = Color.getHSBColor(hue, 0.7f, 0.7f);
        panel.setBackground(color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Crit3();
            }
        });
    }
}