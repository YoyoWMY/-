/*
         Ϳɫ��
          ����state[][]�и�������״̬����Ϳɫ
           ��Ϊ��ɫ����Ϊ��ɫ
 */

package ������Ϸ;
import java.awt.Color;
import javax.swing.JPanel;

public class set_color {
    static boolean [][] state_one=new boolean[30][30];
    static JPanel[][] jPanel=new JPanel[31][31];
    //��ʼ����
    public set_color(boolean [][] state,JPanel[][] jpanel_one)
    {
        state_one = state;
        jPanel = jpanel_one;
    }
    public set_color() {
		// TODO �Զ����ɵĹ��캯�����
	}
	//������ɫ
    public static void paint()
    { 
        //ѭ���ж�״̬������ɫ
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