/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Msg Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.MsgSwitch#getMessage <em>Message</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.MsgSwitch#getMsg <em>Msg</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.MsgSwitch#getMove <em>Move</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getMsgSwitch()
 * @model
 * @generated
 */
public interface MsgSwitch extends MessageMove
{
  /**
   * Returns the value of the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' reference.
   * @see #setMessage(Message)
   * @see xtext.qactor.qADocker.QADockerPackage#getMsgSwitch_Message()
   * @model
   * @generated
   */
  Message getMessage();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.MsgSwitch#getMessage <em>Message</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(Message value);

  /**
   * Returns the value of the '<em><b>Msg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg</em>' containment reference.
   * @see #setMsg(PHead)
   * @see xtext.qactor.qADocker.QADockerPackage#getMsgSwitch_Msg()
   * @model containment="true"
   * @generated
   */
  PHead getMsg();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.MsgSwitch#getMsg <em>Msg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msg</em>' containment reference.
   * @see #getMsg()
   * @generated
   */
  void setMsg(PHead value);

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
   * @see xtext.qactor.qADocker.QADockerPackage#getMsgSwitch_Move()
   * @model containment="true"
   * @generated
   */
  Move getMove();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.MsgSwitch#getMove <em>Move</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Move</em>' containment reference.
   * @see #getMove()
   * @generated
   */
  void setMove(Move value);

} // MsgSwitch
