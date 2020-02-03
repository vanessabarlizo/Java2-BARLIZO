import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing04
{
	public static void main(String []args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		int length = 1;
		int num;
		terminal.enterPrivateMode();
		for(int num1=1;num1<=20;num1=num1+2){
			num = (length/2)+(length%2);
			for(int a=1;a<=length;a=a+1){
				terminal.setCursorPosition(11-a,num1);
				if(11-a <= 10-length+num){
					terminal.putCharacter('X');
				}else{
					terminal.putCharacter('Y');
				}
			}
			length++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
