/*
         判断状态类
         算法：
         根据游戏规则判断中心细胞的下一步演化规则，并将状态计入state_one[][]中。
   nCount:周围活细胞的个数
 */
package 生命游戏;
import java.awt.Color;
import javax.swing.JPanel;

public class judge_state {
    static boolean [][] state_one=new boolean[30][30];
    JPanel[][] jPanel=new JPanel[30][30];
    //初始化类
    public judge_state(boolean [][] state,JPanel[][] jpanel_one)
    {
        state_one = state;
        jPanel = jpanel_one;
    }
    
    public judge_state() {
		// TODO 自动生成的构造函数存根
	}

	//判断中心生命的状态并更新
    public void judge() {
    //public int judge() {
    	//
    	//int life=0;
    	//
        for (int i = 1; i < state_one.length - 1; i++) {
            for (int j = 1; j < state_one[i].length - 1; j++) {
                //循环判断中心生命周围的各个点的状态
                int nCount = 0;
                if (jPanel[i - 1][j - 1].getBackground() == Color.red) {
                    nCount++;
                }
                if (jPanel[i - 1][j].getBackground() == Color.red) {
                    nCount++;
                }
                if (jPanel[i - 1][j + 1].getBackground() == Color.red) {
                    nCount++;
                }
                if (jPanel[i][j - 1].getBackground() == Color.red) {
                    nCount++;
                }
                if (jPanel[i][j + 1].getBackground() == Color.red) {
                    nCount++;
                }
                if (jPanel[i + 1][j - 1].getBackground() == Color.red) {
                    nCount++;
                }
                if (jPanel[i + 1][j].getBackground() == Color.red) {
                    nCount++;
                }
                if (jPanel[i + 1][j + 1].getBackground() == Color.red) {
                    nCount++;
                }
                if (nCount==3) {
                	/*
                	System.out.print(i);
                	System.out.print(" ");
                	System.out.println(j);
                	*/
                    state_one[i][j] = true;
                   // life++;
                }
                else if (nCount == 2) {
                    state_one[i][j] = state_one[i][j];
                    //
                    //if(state_one[i][j]==true)
                    //life++;
                    //
                }
                else 
                    state_one[i][j] = false;
                
           }
       }
       //return life;
    }
}