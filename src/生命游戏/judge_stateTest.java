package 生命游戏;

import static org.junit.Assert.*;

import java.awt.Color;

import javax.swing.JPanel;

import org.junit.Before;
import org.junit.Test;


public class judge_stateTest {
	
	private static judge_state jtest=new judge_state();
	private static Init_data init=new Init_data(); 
	private static set_color color=new set_color();
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testJudge() {
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
		jtest.state_one = init.state; 
		color.state_one = init.state;
        color.jPanel = jPanel;
        color.paint();
		jtest.jPanel = color.jPanel;
		jtest.judge();
		assertEquals(false,jtest.state_one[2][2]);
		assertEquals(true,jtest.state_one[10][2]);
		//fail("尚未实现");
	}

}
