/*
 * 初始化细胞状态类为love形状，一个大写的LOVE
 */
package 生命游戏;

import java.util.Random;

public class Init_data{
    static boolean[][] state=new boolean[30][30];
    public Init_data(boolean[][] state_one)
    {
        state = state_one;
    }

    public Init_data() {
		// TODO 自动生成的构造函数存根
	}
    
	public void init_one()
    {
        for(int i=1;i<state.length;i++)
        {
            for(int j=1;j<state[i].length-1;j++)
            {
                state[i][j] = false;
            }
        }
        
        //LOVE
        //L
        state[9][3] = true;
        state[10][3] = true;
        state[11][3] = true;
        state[12][3] = true;
        state[13][3] = true;
        state[14][3] = true;
        state[14][4] = true;
        state[14][5] = true;

        //O
        state[9][8] = true;
        state[10][7] = true;
        state[11][7] = true;
        state[12][7] = true;
        state[13][7] = true;
        state[14][8] = true;
        state[10][9] = true;
        state[11][9] = true;
        state[12][9] = true;
        state[13][9] = true;
        
        //V
        state[9][11] = true;
        state[10][12] = true;
        state[11][13] = true;
        state[12][14] = true;
        state[13][15] = true;
        state[14][16] = true;
        state[13][17] = true;
        state[12][18] = true;
        state[11][19] = true;
        state[10][20] = true;
        state[9][21] = true;
        
        //E
        state[9][23] = true;
        state[9][24] = true;
        state[9][25] = true;
        state[9][26] = true;
        state[10][23] = true;
        state[11][23] = true;
        state[12][23] = true;
        state[12][24] = true;
        state[12][25] = true;
        state[12][26] = true;
        state[13][23] = true;
        state[14][23] = true;
        state[15][23] = true;
        state[15][24] = true;
        state[15][25] = true;
        state[15][26] = true;
    }

}

