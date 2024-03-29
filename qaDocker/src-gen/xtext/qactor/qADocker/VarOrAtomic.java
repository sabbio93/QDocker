/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Or Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.VarOrAtomic#getVar <em>Var</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.VarOrAtomic#getConst <em>Const</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getVarOrAtomic()
 * @model
 * @generated
 */
public interface VarOrAtomic extends EObject
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
   * @see xtext.qactor.qADocker.QADockerPackage#getVarOrAtomic_Var()
   * @model containment="true"
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.VarOrAtomic#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

  /**
   * Returns the value of the '<em><b>Const</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' containment reference.
   * @see #setConst(PAtomic)
   * @see xtext.qactor.qADocker.QADockerPackage#getVarOrAtomic_Const()
   * @model containment="true"
   * @generated
   */
  PAtomic getConst();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.VarOrAtomic#getConst <em>Const</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' containment reference.
   * @see #getConst()
   * @generated
   */
  void setConst(PAtomic value);

} // VarOrAtomic
