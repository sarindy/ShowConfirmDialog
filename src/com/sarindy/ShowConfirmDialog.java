package com.sarindy;

import javax.swing.JOptionPane;

public class ShowConfirmDialog {

	public static void main(String[] args) {
		String[] options = {"abc", "def", "ghi", "jkl"};
		
        //Integer[] options = {1, 3, 5, 7, 9, 11};
        //Double[] options = {3.141, 1.618};
        //Character[] options = {'a', 'b', 'c', 'd'};
        int x = JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array", "Click a button",
        		JOptionPane.OK_OPTION,
        		JOptionPane.INFORMATION_MESSAGE,
        		null, options, options[3]);
        System.out.println(x);
	}

}
