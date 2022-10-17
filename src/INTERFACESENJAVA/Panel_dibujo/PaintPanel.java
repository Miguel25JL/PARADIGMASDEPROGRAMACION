package INTERFACESENJAVA.Panel_dibujo;

// Fig. 12.34: PaintPanel.java
// Adapter class that used to implement event handlers.
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PaintPanel extends JPanel
{
    // list Point references
    private final ArrayList<Point> points = new ArrayList<>();

    // set up GUI and register mouse event handler
    public PaintPanel()
    {
        // handle mouse move event on frame
        addMouseMotionListener(
                new MouseMotionAdapter() // anonymous inner class
                {
                    // stores drag coordinates and redraws
                    @Override
                    public void mouseDragged(MouseEvent event)
                    {
                        points.add(event.getPoint());
                        repaint(); // redraw JFrame
                    }
                }
        );
    }

    // draws ovals in a 4 x 4 bounding box, at the locations specified in the window
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); // clears drawing area

        // draw all the points
        for (Point point : points)
            g.fillOval(point.x, point.y, 4, 4);
    }
} // end class PaintPanel