/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reply To Caller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.ReplyToCaller#getMsgref <em>Msgref</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.ReplyToCaller#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getReplyToCaller()
 * @model
 * @generated
 */
public interface ReplyToCaller extends MessageMove
{
  /**
   * Returns the value of the '<em><b>Msgref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Msgref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msgref</em>' reference.
   * @see #setMsgref(Message)
   * @see xtext.qactor.qADocker.QADockerPackage#getReplyToCaller_Msgref()
   * @model
   * @generated
   */
  Message getMsgref();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.ReplyToCaller#getMsgref <em>Msgref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Msgref</em>' reference.
   * @see #getMsgref()
   * @generated
   */
  void setMsgref(Message value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' containment reference.
   * @see #setVal(PHead)
   * @see xtext.qactor.qADocker.QADockerPackage#getReplyToCaller_Val()
   * @model containment="true"
   * @generated
   */
  PHead getVal();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.ReplyToCaller#getVal <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' containment reference.
   * @see #getVal()
   * @generated
   */
  void setVal(PHead value);

} // ReplyToCaller
