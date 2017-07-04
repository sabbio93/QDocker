package xtext.qactor.generator

import xtext.qactor.qADocker.QActorSystemSpec
import xtext.qactor.qADocker.Context

class GenDocker {
	def doGenerate(QActorSystemSpec system, String progName) {
		for (Context c : system.context){
			if (!c.standalone) {
				val jar = progName + "-1.0.jar"
				val zipDir = "./"
				val zip = GenUtils.applicationPackageName(c.name) + ".Main" + c.name.toFirstUpper + "-1.0.zip"
				GenUtils.genFileDir(GenUtils.rootDir + "/docker/" + c.name, "", "Dockerfile", "", '''FROM java
RUN ["apt-get","install","unzip","-y"]
COPY ["«zipDir»«zip»","./"]
RUN ["unzip","./«zip»","-d","./"]
EXPOSE -P "«c.ip.port»"
CMD ["java","-jar","./«zip.substring(0,zip.lastIndexOf('.'))»/«jar»"]''')// «»
			}
		}
	}
}
