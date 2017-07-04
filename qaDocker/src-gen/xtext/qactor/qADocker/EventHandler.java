/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.EventHandler#getName <em>Name</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.EventHandler#getEvents <em>Events</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.EventHandler#isPrint <em>Print</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.EventHandler#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getEventHandler()
 * @model
 * @generated
 */
public interface EventHandler extends EObject
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
   * @see xtext.qactor.qADocker.QADockerPackage#getEventHandler_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.EventHandler#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Events</b></em>' reference list.
   * The list contents are of type {@link xtext.qactor.qADocker.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' reference list.
   * @see xtext.qactor.qADocker.QADockerPackage#getEventHandler_Events()
   * @model
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Print</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Print</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Print</em>' attribute.
   * @see #setPrint(boolean)
   * @see xtext.qactor.qADocker.QADockerPackage#getEventHandler_Print()
   * @model
   * @generated
   */
  boolean isPrint();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.EventHandler#isPrint <em>Print</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Print</em>' attribute.
   * @see #isPrint()
   * @generated
   */
  void setPrint(boolean value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(EventHandlerBody)
   * @see xtext.qactor.qADocker.QADockerPackage#getEventHandler_Body()
   * @model containment="true"
   * @generated
   */
  EventHandlerBody getBody();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.EventHandler#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(EventHandlerBody value);

} // EventHandler
