/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PActor Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.PActorCall#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see xtext.qactor.qADocker.QADockerPackage#getPActorCall()
 * @model
 * @generated
 */
public interface PActorCall extends PTerm
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(PStruct)
   * @see xtext.qactor.qADocker.QADockerPackage#getPActorCall_Body()
   * @model containment="true"
   * @generated
   */
  PStruct getBody();

  /**
   * Sets the value of the '{@link xtext.qactor.qADocker.PActorCall#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(PStruct value);

} // PActorCall
