import java.io.*;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.nio.file.Paths;
import java.nio.file.Path;

public class Logger {
	
	private static Logger sharedInstance = null;
	private Timestamp timestamp;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private Path currentPath;
	private Path filePath;
	
	private String getFileName(){
		currentPath = Paths.get(System.getProperty("user.dir"));
		filePath = Paths.get(currentPath.toString(), "log", "SystemLog.txt");
		return filePath.toString();
	}
	private final String logFile = getFileName();
	private BufferedWriter writer;
	
	
	
	private Logger() {
		try {
			writer = new BufferedWriter(new FileWriter(logFile, true));
			timestamp = new Timestamp(System.currentTimeMillis());	
		} catch (IOException e) {	}
	}
	
	
	public static synchronized Logger getInstance(){
		if(sharedInstance == null)
			sharedInstance = new Logger();
		return sharedInstance;
	}
	
	
	public void logFile (String log ) {
		try{
			System.out.println(sdf.format(timestamp)+" Log: "+log);
			writer.write(sdf.format(timestamp)+" Log: "+log+"\n");
			writer.close();
		}catch(IOException e){
			System.out.println(sdf.format(timestamp)+" Error: Error creating a log."+e);
		}
	}
}