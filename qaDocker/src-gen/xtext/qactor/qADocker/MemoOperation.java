/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memo Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.MemoOperation#getRule <em>Rule</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.MemoOperation#getActor <em>Actor</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.MemoOperation#getDoMemo <em>Do Memo</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getMemoOperation()
 * @model
 * @generated
 */
public interface MemoOperation extends EventHandlerOperation
{
  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(MemoRule)
   * @see xtext.qactor.qADocker.QADockerPackage#getMemoOperation_Rule()
   * @model containment="true"
   * @generated
   */
  MemoRule getRule();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.MemoOperation#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(MemoRule value);

  /**
   * Returns the value of the '<em><b>Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor</em>' reference.
   * @see #setActor(QActor)
   * @see xtext.qactor.qADocker.QADockerPackage#getMemoOperation_Actor()
   * @model
   * @generated
   */
  QActor getActor();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.MemoOperation#getActor <em>Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actor</em>' reference.
   * @see #getActor()
   * @generated
   */
  void setActor(QActor value);

  /**
   * Returns the value of the '<em><b>Do Memo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Do Memo</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Do Memo</em>' containment reference.
   * @see #setDoMemo(MemoCurrentEvent)
   * @see xtext.qactor.qADocker.QADockerPackage#getMemoOperation_DoMemo()
   * @model containment="true"
   * @generated
   */
  MemoCurrentEvent getDoMemo();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.MemoOperation#getDoMemo <em>Do Memo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Do Memo</em>' containment reference.
   * @see #getDoMemo()
   * @generated
   */
  void setDoMemo(MemoCurrentEvent value);

} // MemoOperation
