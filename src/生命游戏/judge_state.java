/*
         �ж�״̬��
         �㷨��
         ������Ϸ�����ж�����ϸ������һ���ݻ����򣬲���״̬����state_one[][]�С�
   nCount:��Χ��ϸ���ĸ���
 */
package ������Ϸ;
import java.awt.Color;
import javax.swing.JPanel;

public class judge_state {
    static boolean [][] state_one=new boolean[30][30];
    JPanel[][] jPanel=new JPanel[30][30];
    //��ʼ����
    public judge_state(boolean [][] state,JPanel[][] jpanel_one)
    {
        state_one = state;
        jPanel = jpanel_one;
    }
    
    public judge_state() {
		// TODO �Զ����ɵĹ��캯�����
	}

	//�ж�����������״̬������
    public void judge() {
    //public int judge() {
    	//
    	//int life=0;
    	//
        for (int i = 1; i < state_one.length - 1; i++) {
            for (int j = 1; j < state_one[i].length - 1; j++) {
                //ѭ���ж�����������Χ�ĸ������״̬
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