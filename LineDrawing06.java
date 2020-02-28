import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing06
{
	public static void main(String []args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		int length = 1;
		int num;
		terminal.enterPrivateMode();
		for(int i=1;i<=20;i=i+2){
			num = (length/2)+(length%2);
			for(int a=1;a<=length;a=a+1){
				terminal.setCursorPosition(11-a,i);
				if(11-a <= 10-length+num){
					terminal.putCharacter('X');
				}else{
					terminal.putCharacter('Y');
				}
			}
			for (int k = 1;k<=17 ;k=k+2) {
				terminal.setCursorPosition(10,k+1);
				terminal.putCharacter('|');
			}
			length++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
