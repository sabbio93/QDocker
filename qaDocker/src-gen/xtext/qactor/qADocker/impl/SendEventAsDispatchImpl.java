/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.qactor.qADocker.Message;
import xtext.qactor.qADocker.QADockerPackage;
import xtext.qactor.qADocker.QActor;
import xtext.qactor.qADocker.SendEventAsDispatch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Event As Dispatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.impl.SendEventAsDispatchImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.SendEventAsDispatchImpl#getMsgref <em>Msgref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendEventAsDispatchImpl extends EventHandlerOperationImpl implements SendEventAsDispatch
{
  /**
   * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActor()
   * @generated
   * @ordered
   */
  protected QActor actor;

  /**
   * The cached value of the '{@link #getMsgref() <em>Msgref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMsgref()
   * @generated
   * @ordered
   */
  protected Message msgref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SendEventAsDispatchImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QADockerPackage.Literals.SEND_EVENT_AS_DISPATCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QActor getActor()
  {
    if (actor != null && actor.eIsProxy())
    {
      InternalEObject oldActor = (InternalEObject)actor;
      actor = (QActor)eResolveProxy(oldActor);
      if (actor != oldActor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QADockerPackage.SEND_EVENT_AS_DISPATCH__ACTOR, oldActor, actor));
      }
    }
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QActor basicGetActor()
  {
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActor(QActor newActor)
  {
    QActor oldActor = actor;
    actor = newActor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.SEND_EVENT_AS_DISPATCH__ACTOR, oldActor, actor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getMsgref()
  {
    if (msgref != null && msgref.eIsProxy())
    {
      InternalEObject oldMsgref = (InternalEObject)msgref;
      msgref = (Message)eResolveProxy(oldMsgref);
      if (msgref != oldMsgref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QADockerPackage.SEND_EVENT_AS_DISPATCH__MSGREF, oldMsgref, msgref));
      }
    }
    return msgref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message basicGetMsgref()
  {
    return msgref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMsgref(Message newMsgref)
  {
    Message oldMsgref = msgref;
    msgref = newMsgref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.SEND_EVENT_AS_DISPATCH__MSGREF, oldMsgref, msgref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QADockerPackage.SEND_EVENT_AS_DISPATCH__ACTOR:
        if (resolve) return getActor();
        return basicGetActor();
      case QADockerPackage.SEND_EVENT_AS_DISPATCH__MSGREF:
        if (resolve) return getMsgref();
        return basicGetMsgref();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QADockerPackage.SEND_EVENT_AS_DISPATCH__ACTOR:
        setActor((QActor)newValue);
        return;
      case QADockerPackage.SEND_EVENT_AS_DISPATCH__MSGREF:
        setMsgref((Message)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QADockerPackage.SEND_EVENT_AS_DISPATCH__ACTOR:
        setActor((QActor)null);
        return;
      case QADockerPackage.SEND_EVENT_AS_DISPATCH__MSGREF:
        setMsgref((Message)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QADockerPackage.SEND_EVENT_AS_DISPATCH__ACTOR:
        return actor != null;
      case QADockerPackage.SEND_EVENT_AS_DISPATCH__MSGREF:
        return msgref != null;
    }
    return super.eIsSet(featureID);
  }

} //SendEventAsDispatchImpl
