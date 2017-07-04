package xtext.qactor.generator;
 

import static java.nio.file.StandardCopyOption.*;
import java.io.*;
import java.net.*;
import java.nio.charset.*;
import java.nio.file.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.generator.*;

public class Utils {
	
	public static String readFile(String path){	//"/tmp/foo"
		Charset charset = Charset.forName("UTF-8");
		Path file = Paths.get(path);
		String outS = "";
		try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		    	outS += line +"\n";
		        System.out.println(line);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}		
		return outS;
	}
	
	public static void copyFile(Path source, Path target ){
		try {
			Files.copy(source, target, REPLACE_EXISTING);
		} catch (IOException e) {
 			e.printStackTrace();
		}
	}
	public static void copyFile(String sourcePath, String targetPath ){
		copyFile( Paths.get(sourcePath),  Paths.get(targetPath));  
	}
	
/*
 * GENERATE FILES in the user workspace
 */
	
	public static void getUri(String fName)  {
		URI furi =  ((IFileSystemAccessExtension2) GenUtils.curFsa).getURI(fName );
 		System.out.println(" *** getUri:" + furi + " for fName=" + fName );		
	}
	public static String readFilePlugin(String fName)  {
		String outS = "";  
 		try {
  			URL url = new URL( "platform:/plugin/it.unibo.xtext.doc.site/userResources/"+fName );
			System.out.println(" *** url:" + url + " for fName=" + fName );
			InputStream inputStream = url.openConnection().getInputStream();
//			System.out.println(" *** inputStream:" + inputStream );
			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
		    String inputLine;		 
		    while ((inputLine = in.readLine()) != null) {
//		        System.out.println(inputLine);
		        outS += inputLine +"\n";
		    }		 
		    in.close();		
		} catch (Exception e) {
 			e.printStackTrace();
		}	
 		System.out.println(" ........ "+ outS );
 		return outS;
	}
	
	
	public static boolean existFile(String fName){
		try {
  			URI furi =  ((IFileSystemAccessExtension2) GenUtils.curFsa).getURI(fName );
 			URL furl = new URL( ""+furi );
//   			System.out.println(" *** furl=" + furl  );
//  		    InputStream inputStream = 
  		    		furl.openConnection().getInputStream();
  			System.out.println(" *** exists:" + fName );
			return true;
		} catch ( Exception e) {
			System.out.println(" *** DOES NOT exist: " + fName);
			return false;
		}
	}

	public static void main(String[] args){
		String userDir = System.getProperty("user.dir");
		String sourcePathStr = (userDir+"/src/it/unibo/resources/a.txt").replace("\\", "/");
		System.out.println( "copying ... "+ sourcePathStr );
//		String targetPathStr = (userDir+"/srcMore/it/unibo/resources/a.txt").replace("\\", "/");
//		copyFile( sourcePathStr, targetPathStr );
		String s = readFile( sourcePathStr );
		System.out.println( "s="+ s );
	}
}
