/*
 * generated by Xtext 2.10.0
 */
package xtext.qactor.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractQADockerValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(xtext.qactor.qADocker.QADockerPackage.eINSTANCE);
		return result;
	}
	
}
