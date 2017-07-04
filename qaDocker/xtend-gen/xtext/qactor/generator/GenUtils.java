package xtext.qactor.generator;

import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class GenUtils {
  public final static String rootDir = "../";
  
  public final static String logo = "/* Generato da ARA ISS Unibo */ ";
  
  public static IFileSystemAccess curFsa;
  
  public static IFileSystemAccess setFsa(final IFileSystemAccess fsa) {
    return GenUtils.curFsa = fsa;
  }
  
  public static void genFileInDir(final String name, final String suffix, final CharSequence contents) {
    String fName = ((name + ".") + suffix);
    GenUtils.curFsa.generateFile(fName, contents);
  }
  
  public static String applicationDirName(final String name) {
    return ("it/unibo/" + name);
  }
  
  public static String applicationPackageName(final String name) {
    return ("it.unibo." + name);
  }
  
  public static String genLogo() {
    return "//Generato da ISS Unibo";
  }
  
  public static void genFile(final String packageName, final String name, final String suffix, final CharSequence contents) {
    String _replace = packageName.replace(".", "/");
    String _plus = (_replace + "/");
    String _plus_1 = (_plus + name);
    String _plus_2 = (_plus_1 + ".");
    String fName = (_plus_2 + suffix);
    GenUtils.curFsa.generateFile(fName, contents);
  }
  
  public static void genFileDir(final String dir, final String packageName, final String name, final String suffix, final CharSequence contents) {
    String sysName = packageName.replace(".", "/");
    String fName = (dir + "/");
    int _length = sysName.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      String _fName = fName;
      fName = (_fName + (sysName + "/"));
    }
    String _fName_1 = fName;
    fName = (_fName_1 + name);
    int _length_1 = suffix.length();
    boolean _greaterThan_1 = (_length_1 > 0);
    if (_greaterThan_1) {
      String _fName_2 = fName;
      fName = (_fName_2 + ("." + suffix));
    }
    GenUtils.curFsa.generateFile(fName, contents);
  }
}
