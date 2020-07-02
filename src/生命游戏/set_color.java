/*
         涂色类
          根据state[][]中各个表格的状态进行涂色
           死为白色，活为黑色
 */

package 生命游戏;
import java.awt.Color;
import javax.swing.JPanel;

public class set_color {
    static boolean [][] state_one=new boolean[30][30];
    static JPanel[][] jPanel=new JPanel[31][31];
    //初始化类
    public set_color(boolean [][] state,JPanel[][] jpanel_one)
    {
        state_one = state;
        jPanel = jpanel_one;
    }
    public set_color() {
		// TODO 自动生成的构造函数存根
	}
	//设置颜色
    public static void paint()
    { 
        //循环判断状态设置颜色
        for(int i=1;i<state_one.length;i++)
        {
            for(int j=1;j<state_one[i].length;j++)
            {
                if (state_one[i][j]) {
                    jPanel[i][j].setBackground(Color.red);
                }
                else if(state_one[i][j]==false)
                {
                    jPanel[i][j].setBackground(Color.white);
                }
            }
        }
    }
}