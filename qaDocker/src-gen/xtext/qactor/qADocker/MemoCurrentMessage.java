/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memo Current Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.MemoCurrentMessage#isLastonly <em>Lastonly</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getMemoCurrentMessage()
 * @model
 * @generated
 */
public interface MemoCurrentMessage extends BasicMove
{
  /**
   * Returns the value of the '<em><b>Lastonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lastonly</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lastonly</em>' attribute.
   * @see #setLastonly(boolean)
   * @see xtext.qactor.qADocker.QADockerPackage#getMemoCurrentMessage_Lastonly()
   * @model
   * @generated
   */
  boolean isLastonly();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.MemoCurrentMessage#isLastonly <em>Lastonly</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lastonly</em>' attribute.
   * @see #isLastonly()
   * @generated
   */
  void setLastonly(boolean value);

} // MemoCurrentMessage