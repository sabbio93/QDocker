/*
 * generated by Xtext 2.10.0
 */
package xtext.qactor.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class QADockerAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("xtext/qactor/parser/antlr/internal/InternalQADocker.tokens");
	}
}
