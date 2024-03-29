/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Or PStruct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.VarOrPStruct#getVar <em>Var</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.VarOrPStruct#getPsrtuct <em>Psrtuct</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getVarOrPStruct()
 * @model
 * @generated
 */
public interface VarOrPStruct extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(Variable)
   * @see xtext.qactor.qADocker.QADockerPackage#getVarOrPStruct_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.VarOrPStruct#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>Psrtuct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Psrtuct</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Psrtuct</em>' containment reference.
   * @see #setPsrtuct(PStruct)
   * @see xtext.qactor.qADocker.QADockerPackage#getVarOrPStruct_Psrtuct()
   * @model containment="true"
   * @generated
   */
  PStruct getPsrtuct();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.VarOrPStruct#getPsrtuct <em>Psrtuct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Psrtuct</em>' containment reference.
   * @see #getPsrtuct()
   * @generated
   */
  void setPsrtuct(PStruct value);

} // VarOrPStruct
