package vjezbeS06D04;

import java.awt.*;
import javax.swing.*;

public class Tree extends JPanel {
	private static final long serialVersionUID = -3568460118473583467L;
	private int count;
    
    private void draw(Graphics2D g, int n, int x, int y) {
        if (n == 0) {
            return;
        }
        else {
            int angle = 35;
            int length = 50;
            count++;

            g.drawLine(x, y, x, y - length); // trunk
            g.setColor(Color.RED);
            g.drawString(String.valueOf(count), x + 2, y - (length / 2));
            g.setColor(Color.BLACK);

            g.rotate(Math.toRadians(-angle), x, y - length); // left
                                                                     // branch
            draw(g, n - 1, x, y - length);
            g.rotate(Math.toRadians(angle), x, y - length);

            g.rotate(Math.toRadians(angle), x, y - length); // right
                                                                    // branch
            draw(g, n - 1, x, y - length);
            g.rotate(Math.toRadians(-angle), x, y - length);

        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        count = 0;
        
        Graphics2D gg = (Graphics2D) g;
        gg.setFont(gg.getFont().deriveFont(Font.BOLD, 16f));
        gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        draw(gg, 3, getWidth() / 2, getHeight() / 2);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tree tree = new Tree();
                tree.setPreferredSize(new Dimension(500, 500));

                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(tree);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}