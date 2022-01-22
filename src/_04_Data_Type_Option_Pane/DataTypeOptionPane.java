package _04_Data_Type_Option_Pane;

import javax.swing.JOptionPane;

public class DataTypeOptionPane {
    public static void main(String[] args) {

        DataType[] dataTypes;
        dataTypes = DataType.values();
        int chosen = JOptionPane.showOptionDialog(null, "Choose what you want to explore", null, 0, 0, null, dataTypes, dataTypes);
        switch(dataTypes[chosen]) {
        case BYTE : {
        	JOptionPane.showMessageDialog(null, dataTypes[chosen].getBits());
        	break;
        }
        case SHORT : {
        	JOptionPane.showMessageDialog(null, dataTypes[chosen].getBits());
        	break;
        }
        case INT : {
        	JOptionPane.showMessageDialog(null, dataTypes[chosen].getBits());
        	break;
        }
        case LONG  : {
        	JOptionPane.showMessageDialog(null, dataTypes[chosen].getBits());
        	break;
        }
        case FLOAT : {
        	JOptionPane.showMessageDialog(null, dataTypes[chosen].getBits());
        	break;
        }
        case DOUBLE : {
        	JOptionPane.showMessageDialog(null, dataTypes[chosen].getBits());
        	break;
        }
        case CHAR : {
        	JOptionPane.showMessageDialog(null, dataTypes[chosen].getBits());
        	break;
        }
        case BOOLEAN : {
        	JOptionPane.showMessageDialog(null, dataTypes[chosen].getBits());
        	break;
        }
        }
    }
    enum DataType {
    	BYTE(8), SHORT(16), INT(32), LONG(64), FLOAT(32), DOUBLE(64), BOOLEAN(1), CHAR(16);
    	
    	
    	
     private final int bits;
    
 
	private DataType(int bitz) {
    this.bits=bitz;	 
     }
     public int getBits() {
    	 return this.bits;
    	 
     }
    	
    
    }


	
}