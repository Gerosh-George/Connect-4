import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetPanel {
    public JPanel Main = new JPanel();
    private JButton reset = new JButton("Reset");
    private JButton resize = new JButton("Resize");

    public ResetPanel() {
        reset.setBackground(Color.BLACK);
        reset.setOpaque(true);
        reset.setBorderPainted(false);
        reset.setForeground(Color.WHITE);
        reset.setFocusable(false);
        resize.setBackground(Color.BLACK);
        resize.setOpaque(true);
        resize.setBorderPainted(false);
        resize.setForeground(Color.WHITE);
        resize.setFocusable(false);
        Main.setBackground(Color.lightGray);
        Main.add(reset);
        Main.add(resize);
    }

    public void listen_for_action(C4 g) {
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.reset();
            }
        });
        resize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                g.setSize(655, 589);
            }
        });

    }
}