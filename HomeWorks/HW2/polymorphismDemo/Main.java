package polymorphismDemo;

public class Main {
     
	public static void main(String[] args) {
	
	//BaseLogger[] loggers = new BaseLogger[] {
	//new FileLogger() , new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()
	//};
	
	//for (BaseLogger logger : loggers) {
		//logger.log ("Log message");
	//}
		CustomerManager customerManager = new CustomerManager (new FileLogger());
		customerManager.add();
  }
}
