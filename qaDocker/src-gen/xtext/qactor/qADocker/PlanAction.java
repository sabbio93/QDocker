/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.PlanAction#getGuard <em>Guard</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.PlanAction#getMove <em>Move</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.PlanAction#getReact <em>React</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.PlanAction#getElsemove <em>Elsemove</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.PlanAction#getElsereact <em>Elsereact</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getPlanAction()
 * @model
 * @generated
 */
public interface PlanAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Guard)
   * @see xtext.qactor.qADocker.QADockerPackage#getPlanAction_Guard()
   * @model containment="true"
   * @generated
   */
  Guard getGuard();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.PlanAction#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Guard value);

  /**
   * Returns the value of the '<em><b>Move</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Move</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Move</em>' containment reference.
   * @see #setMove(Move)
   * @see xtext.qactor.qADocker.QADockerPackage#getPlanAction_Move()
   * @model containment="true"
   * @generated
   */
  Move getMove();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.PlanAction#getMove <em>Move</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Move</em>' containment reference.
   * @see #getMove()
   * @generated
   */
  void setMove(Move value);

  /**
   * Returns the value of the '<em><b>React</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>React</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>React</em>' containment reference.
   * @see #setReact(Reaction)
   * @see xtext.qactor.qADocker.QADockerPackage#getPlanAction_React()
   * @model containment="true"
   * @generated
   */
  Reaction getReact();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.PlanAction#getReact <em>React</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>React</em>' containment reference.
   * @see #getReact()
   * @generated
   */
  void setReact(Reaction value);

  /**
   * Returns the value of the '<em><b>Elsemove</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsemove</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsemove</em>' containment reference.
   * @see #setElsemove(Move)
   * @see xtext.qactor.qADocker.QADockerPackage#getPlanAction_Elsemove()
   * @model containment="true"
   * @generated
   */
  Move getElsemove();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.PlanAction#getElsemove <em>Elsemove</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsemove</em>' containment reference.
   * @see #getElsemove()
   * @generated
   */
  void setElsemove(Move value);

  /**
   * Returns the value of the '<em><b>Elsereact</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elsereact</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elsereact</em>' containment reference.
   * @see #setElsereact(Reaction)
   * @see xtext.qactor.qADocker.QADockerPackage#getPlanAction_Elsereact()
   * @model containment="true"
   * @generated
   */
  Reaction getElsereact();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.PlanAction#getElsereact <em>Elsereact</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elsereact</em>' containment reference.
   * @see #getElsereact()
   * @generated
   */
  void setElsereact(Reaction value);

} // PlanAction
