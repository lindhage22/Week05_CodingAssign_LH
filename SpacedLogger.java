package week05Logger;

import java.util.Date;


public class SpacedLogger implements Logger{

			@Override
		public void log(String message) {
			Date date = new Date();
			for (int i = 0; i< message.length(); i++) {
				System.out.print(message.charAt(i)+ " ");
			}
			
		}
			
		@Override
		public void error(String errorMessage) {
				Date date = new Date();
				System.out.println(date.toString() + "***" + (errorMessage) + ":"  + "***");
				for (int i = 0; i< errorMessage.length(); i++) {
					System.out.println(errorMessage.charAt (i)+ " ");
				}
		

		}

		@Override
		public void close() {
			System.out.println("close");
}
}
