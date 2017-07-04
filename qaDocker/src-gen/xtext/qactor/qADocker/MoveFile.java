/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.MoveFile#getFname <em>Fname</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getMoveFile()
 * @model
 * @generated
 */
public interface MoveFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Fname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fname</em>' containment reference.
   * @see #setFname(VarOrString)
   * @see xtext.qactor.qADocker.QADockerPackage#getMoveFile_Fname()
   * @model containment="true"
   * @generated
   */
  VarOrString getFname();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.MoveFile#getFname <em>Fname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fname</em>' containment reference.
   * @see #getFname()
   * @generated
   */
  void setFname(VarOrString value);

} // MoveFile
