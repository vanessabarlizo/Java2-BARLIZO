import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing07
{
	public static void main(String []args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		int length = 1;
		int num;
		char[] msg = {'M','e','r','r','y'};
		char[] msg2 = {'C','h','i','s','t','m','a','s'};
		terminal.enterPrivateMode();
		for(int i=1;i<=20;i=i+2){
			num = (length/2)+(length%2);
			for(int j=1;j<=length;j=j+1){
				terminal.setCursorPosition(11-j,i);
				if(11-j <= 10-length+num){
					terminal.putCharacter('X');
				}else{
					terminal.putCharacter('Y');
				}
			}
			for(int j=1;j<=length;j=j+1){
				terminal.setCursorPosition(9+j,i);
				if(11-j <= 10-length+num){
					terminal.putCharacter('X');
				}else{
					terminal.putCharacter('Y');
				}
			} 
			if(i <= 17){
				terminal.setCursorPosition(10,i+1);
				terminal.putCharacter('|');		
				terminal.setCursorPosition(10-length,i+1);
				terminal.putCharacter('/');
				terminal.setCursorPosition(10+length,i+1);
				terminal.putCharacter('\\');
				if(length-1 <= 4){
					terminal.setCursorPosition(23+length,10);
					terminal.putCharacter(msg[length-1]);
				}
				if(length-1 <= 7){
					terminal.setCursorPosition(27+length,11);
					terminal.putCharacter(msg2[length-1]);
				}
			}
			length++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}
