/*
         ����
         ������Ϸ��ʼ���
 */
package ������Ϸ;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class startGame extends Thread{
    static startGame start;
    static Init_data init_data;
    static judge_state judge;
    static set_color set_color;
    static gameframe frame;
    //���ϸ��״̬
    static boolean[][] state_one;
    static JPanel[][] jPanel;
    //��ʼ��GUI����
    public startGame(int row,int col)
    {
        state_one = new boolean[row][col];
        frame = new gameframe(row,col);
        jPanel = frame.jPanel;
    }
    
    //������
    public static void main(String[] args)
    {
            //������Ϸ����
            start = new startGame(30,30);
            init_data = new Init_data(state_one);
            judge = new judge_state(state_one, jPanel);
            set_color = new set_color(state_one, jPanel);
    }
}