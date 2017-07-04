/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QActor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.QActor#getName <em>Name</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.QActor#getContext <em>Context</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.QActor#isEnv <em>Env</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.QActor#getColor <em>Color</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.QActor#getRules <em>Rules</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.QActor#getData <em>Data</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.QActor#getAction <em>Action</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.QActor#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getQActor()
 * @model
 * @generated
 */
public interface QActor extends EObject
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
   * @see xtext.qactor.qADocker.QADockerPackage#getQActor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.QActor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Context</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' reference.
   * @see #setContext(Context)
   * @see xtext.qactor.qADocker.QADockerPackage#getQActor_Context()
   * @model
   * @generated
   */
  Context getContext();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.QActor#getContext <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' reference.
   * @see #getContext()
   * @generated
   */
  void setContext(Context value);

  /**
   * Returns the value of the '<em><b>Env</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Env</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Env</em>' attribute.
   * @see #setEnv(boolean)
   * @see xtext.qactor.qADocker.QADockerPackage#getQActor_Env()
   * @model
   * @generated
   */
  boolean isEnv();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.QActor#isEnv <em>Env</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Env</em>' attribute.
   * @see #isEnv()
   * @generated
   */
  void setEnv(boolean value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.qactor.qADocker.WindowColor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see xtext.qactor.qADocker.WindowColor
   * @see #setColor(WindowColor)
   * @see xtext.qactor.qADocker.QADockerPackage#getQActor_Color()
   * @model
   * @generated
   */
  WindowColor getColor();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.QActor#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see xtext.qactor.qADocker.WindowColor
   * @see #getColor()
   * @generated
   */
  void setColor(WindowColor value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link xtext.qactor.qADocker.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see xtext.qactor.qADocker.QADockerPackage#getQActor_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference list.
   * The list contents are of type {@link xtext.qactor.qADocker.Data}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference list.
   * @see xtext.qactor.qADocker.QADockerPackage#getQActor_Data()
   * @model containment="true"
   * @generated
   */
  EList<Data> getData();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link xtext.qactor.qADocker.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see xtext.qactor.qADocker.QADockerPackage#getQActor_Action()
   * @model containment="true"
   * @generated
   */
  EList<Action> getAction();

  /**
   * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
   * The list contents are of type {@link xtext.qactor.qADocker.Plan}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plans</em>' containment reference list.
   * @see xtext.qactor.qADocker.QADockerPackage#getQActor_Plans()
   * @model containment="true"
   * @generated
   */
  EList<Plan> getPlans();

} // QActor