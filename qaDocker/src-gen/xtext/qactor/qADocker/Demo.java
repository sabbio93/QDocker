/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.Demo#getGoal <em>Goal</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.Demo#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getDemo()
 * @model
 * @generated
 */
public interface Demo extends ActionMove
{
  /**
   * Returns the value of the '<em><b>Goal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal</em>' containment reference.
   * @see #setGoal(PHead)
   * @see xtext.qactor.qADocker.QADockerPackage#getDemo_Goal()
   * @model containment="true"
   * @generated
   */
  PHead getGoal();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.Demo#getGoal <em>Goal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal</em>' containment reference.
   * @see #getGoal()
   * @generated
   */
  void setGoal(PHead value);

  /**
   * Returns the value of the '<em><b>Plan</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plan</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plan</em>' reference.
   * @see #setPlan(Plan)
   * @see xtext.qactor.qADocker.QADockerPackage#getDemo_Plan()
   * @model
   * @generated
   */
  Plan getPlan();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.Demo#getPlan <em>Plan</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plan</em>' reference.
   * @see #getPlan()
   * @generated
   */
  void setPlan(Plan value);

} // Demo
