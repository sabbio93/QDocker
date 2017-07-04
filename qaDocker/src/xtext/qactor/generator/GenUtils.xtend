package xtext.qactor.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class GenUtils {
//	public var static siteDir = "../sites/"
	public static final val rootDir = "../"
	public static final val logo = "/* Generato da ARA ISS Unibo */ "

	public static IFileSystemAccess curFsa
	
	def static setFsa(IFileSystemAccess fsa) {
		curFsa = fsa
	}

	def static genFileInDir(String name, String suffix, CharSequence contents) {
		var fName = name + "." + suffix
		curFsa.generateFile(fName, contents)
	}

	def static applicationDirName(String name) {
		"it/unibo/" + name
	}

	def static applicationPackageName(String name) {
		"it.unibo." + name
	}

	def static String genLogo() {
		"//Generato da ISS Unibo"
	}

	def static genFile(String packageName, String name, String suffix, CharSequence contents) {
		var fName = packageName.replace(".", "/") + "/" + name + "." + suffix
		curFsa.generateFile(fName, contents)
	}

	// dir (e.g. "../src") is the source 	
	def static genFileDir(String dir, String packageName, String name, String suffix, CharSequence contents) {
		var sysName = packageName.replace(".", "/")
		var fName = dir + "/"
		if (sysName.length > 0)
			fName += sysName + "/"
		fName += name
		if (suffix.length > 0)
			fName += "." + suffix
		// println("genFileDir " + fName);
		curFsa.generateFile(fName, contents)
	}

}
