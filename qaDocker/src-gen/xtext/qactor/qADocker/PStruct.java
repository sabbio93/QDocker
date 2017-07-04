/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PStruct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.PStruct#getFunctor <em>Functor</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.PStruct#getMsgArg <em>Msg Arg</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getPStruct()
 * @model
 * @generated
 */
public interface PStruct extends PHead, PTerm
{
  /**
   * Returns the value of the '<em><b>Functor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functor</em>' attribute.
   * @see #setFunctor(String)
   * @see xtext.qactor.qADocker.QADockerPackage#getPStruct_Functor()
   * @model
   * @generated
   */
  String getFunctor();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.PStruct#getFunctor <em>Functor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Functor</em>' attribute.
   * @see #getFunctor()
   * @generated
   */
  void setFunctor(String value);

  /**
   * Returns the value of the '<em><b>Msg Arg</b></em>' containment reference list.
   * The list contents are of type {@link xtext.qactor.qADocker.PTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg Arg</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg Arg</em>' containment reference list.
   * @see xtext.qactor.qADocker.QADockerPackage#getPStruct_MsgArg()
   * @model containment="true"
   * @generated
   */
  EList<PTerm> getMsgArg();

} // PStruct