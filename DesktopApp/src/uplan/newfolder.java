package uplan;
import java.io.File;

public class newfolder {
	  
	public static void main(String[] args){	
		File file=new File("H:\\U plan");
		File comFile=new File("H:\\U plan\\Backup");//���Ĭ��·����û��Backup�ļ��У��򴴽�·�����ļ��У�����Backup����
		File oldFile=new File("H:\\U plan\\Old Backup");
		File usbFile=new File("I:\\Backup");
		if(!file.exists()) {
			file.mkdir();		
		}else if(!comFile.exists() | !usbFile.exists() | !oldFile.exists()) {			
		comFile.mkdir();
		usbFile.mkdir();
		oldFile.mkdir();
		}
	}
	
}
