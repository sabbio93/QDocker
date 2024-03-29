/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.Action#getName <em>Name</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.Action#isUndoable <em>Undoable</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.Action#getMsec <em>Msec</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.Action#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.qactor.qADocker.QADockerPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Undoable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Undoable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Undoable</em>' attribute.
   * @see #setUndoable(boolean)
   * @see xtext.qactor.qADocker.QADockerPackage#getAction_Undoable()
   * @model
   * @generated
   */
  boolean isUndoable();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.Action#isUndoable <em>Undoable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Undoable</em>' attribute.
   * @see #isUndoable()
   * @generated
   */
  void setUndoable(boolean value);

  /**
   * Returns the value of the '<em><b>Msec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msec</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msec</em>' attribute.
   * @see #setMsec(int)
   * @see xtext.qactor.qADocker.QADockerPackage#getAction_Msec()
   * @model
   * @generated
   */
  int getMsec();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.Action#getMsec <em>Msec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msec</em>' attribute.
   * @see #getMsec()
   * @generated
   */
  void setMsec(int value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(PStruct)
   * @see xtext.qactor.qADocker.QADockerPackage#getAction_Arg()
   * @model containment="true"
   * @generated
   */
  PStruct getArg();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.Action#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(PStruct value);

} // Action
