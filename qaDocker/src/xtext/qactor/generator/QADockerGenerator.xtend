/*
 * generated by Xtext 2.10.0
 */
package xtext.qactor.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import xtext.qactor.qADocker.QActorSystemSpec

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class QADockerGenerator extends AbstractGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		println("generazione Docker iniziata")
		GenUtils.setFsa(fsa)
		val pr=fsa.readTextFile(GenUtils.rootDir+".project").toString;
		val i=pr.indexOf("<name>");
		val f=pr.indexOf("</name>");
		val nome=pr.substring(i+6,f)
		val iter = resource.allContents.filter(QActorSystemSpec)
		while (iter.hasNext){
			val sis = iter.next
			//GenUtils.genFileDir(GenUtils.siteDir + sys.name, "", "Dockerfile", "", sys.name)
			new GenDocker().doGenerate(sis,nome)
			println("Docker generati per "+sis.name)
		}
		println("Docker salvati in "+fsa.getURI(".").toFileString)
	}
}
