package 生命游戏;

import static org.junit.Assert.*;

import java.awt.Color;

import javax.swing.JPanel;

import org.junit.Before;
import org.junit.Test;

public class set_colorTest {
	private static set_color colortest=new set_color();
	private static Init_data init=new Init_data(); 
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPaint() {
		init.init_one();
		JPanel[][] jPanel=new JPanel[31][31];
		for(int i=0;i<30;i++)
        {
            for(int j=0;j<30;j++)
            {
                jPanel[i][j] = new JPanel();
                jPanel[i][j].setBackground(Color.white);

            }
        }
        colortest.state_one = init.state;
        colortest.jPanel = jPanel;
        set_color.paint();
        assertSame(Color.red,jPanel[9][23].getBackground());
        assertSame(Color.white,jPanel[9][4].getBackground());
		//fail("尚未实现");
	}

}
