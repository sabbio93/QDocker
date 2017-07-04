/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.Reaction#getAlarms <em>Alarms</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getReaction()
 * @model
 * @generated
 */
public interface Reaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Alarms</b></em>' containment reference list.
   * The list contents are of type {@link xtext.qactor.qADocker.AlarmEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alarms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alarms</em>' containment reference list.
   * @see xtext.qactor.qADocker.QADockerPackage#getReaction_Alarms()
   * @model containment="true"
   * @generated
   */
  EList<AlarmEvent> getAlarms();

} // Reaction