package 生命游戏;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Init_dataTest {
   private static Init_data initdata=new Init_data();

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testInit_one() {
		boolean [][] expection=new boolean[30][30] ;
		for(int i=0;i<30;i++) {
			for(int j=0;j<30;j++) {
				expection[i][j]=false;
			}
		}
        //L
		expection[9][3] = true;
		expection[10][3] = true;
		expection[11][3] = true;
		expection[12][3] = true;
        expection[13][3] = true;
        expection[14][3] = true;
        expection[14][4] = true;
        expection[14][5] = true;

        //O
        expection[9][8] = true;
        expection[10][7] = true;
        expection[11][7] = true;
        expection[12][7] = true;
        expection[13][7] = true;
        expection[14][8] = true;
        expection[10][9] = true;
        expection[11][9] = true;
        expection[12][9] = true;
        expection[13][9] = true;
        
        //V
        expection[9][11] = true;
        expection[10][12] = true;
        expection[11][13] = true;
        expection[12][14] = true;
        expection[13][15] = true;
        expection[14][16] = true;
        expection[13][17] = true;
        expection[12][18] = true;
        expection[11][19] = true;
        expection[10][20] = true;
        expection[9][21] = true;
        
        //E
        expection[9][23] = true;
        expection[9][24] = true;
        expection[9][25] = true;
        expection[9][26] = true;
        expection[10][23] = true;
        expection[11][23] = true;
        expection[12][23] = true;
        expection[12][24] = true;
        expection[12][25] = true;
        expection[12][26] = true;
        expection[13][23] = true;
        expection[14][23] = true;
        expection[15][23] = true;
        expection[15][24] = true;
        expection[15][25] = true;
        expection[15][26] = true;
		initdata.init_one();
		assertArrayEquals(expection,initdata.state);
		//fail("尚未实现");
	}

}
