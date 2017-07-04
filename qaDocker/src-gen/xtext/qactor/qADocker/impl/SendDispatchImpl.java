/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.qactor.qADocker.Message;
import xtext.qactor.qADocker.PHead;
import xtext.qactor.qADocker.QADockerPackage;
import xtext.qactor.qADocker.SendDispatch;
import xtext.qactor.qADocker.VarOrQactor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Dispatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.impl.SendDispatchImpl#getDest <em>Dest</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.SendDispatchImpl#getMsgref <em>Msgref</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.SendDispatchImpl#getVal <em>Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendDispatchImpl extends MessageMoveImpl implements SendDispatch
{
  /**
   * The cached value of the '{@link #getDest() <em>Dest</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDest()
   * @generated
   * @ordered
   */
  protected VarOrQactor dest;

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
   * The cached value of the '{@link #getVal() <em>Val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected PHead val;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SendDispatchImpl()
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
    return QADockerPackage.Literals.SEND_DISPATCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarOrQactor getDest()
  {
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDest(VarOrQactor newDest, NotificationChain msgs)
  {
    VarOrQactor oldDest = dest;
    dest = newDest;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QADockerPackage.SEND_DISPATCH__DEST, oldDest, newDest);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDest(VarOrQactor newDest)
  {
    if (newDest != dest)
    {
      NotificationChain msgs = null;
      if (dest != null)
        msgs = ((InternalEObject)dest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.SEND_DISPATCH__DEST, null, msgs);
      if (newDest != null)
        msgs = ((InternalEObject)newDest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.SEND_DISPATCH__DEST, null, msgs);
      msgs = basicSetDest(newDest, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.SEND_DISPATCH__DEST, newDest, newDest));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QADockerPackage.SEND_DISPATCH__MSGREF, oldMsgref, msgref));
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
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.SEND_DISPATCH__MSGREF, oldMsgref, msgref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PHead getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal(PHead newVal, NotificationChain msgs)
  {
    PHead oldVal = val;
    val = newVal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QADockerPackage.SEND_DISPATCH__VAL, oldVal, newVal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(PHead newVal)
  {
    if (newVal != val)
    {
      NotificationChain msgs = null;
      if (val != null)
        msgs = ((InternalEObject)val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.SEND_DISPATCH__VAL, null, msgs);
      if (newVal != null)
        msgs = ((InternalEObject)newVal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.SEND_DISPATCH__VAL, null, msgs);
      msgs = basicSetVal(newVal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.SEND_DISPATCH__VAL, newVal, newVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QADockerPackage.SEND_DISPATCH__DEST:
        return basicSetDest(null, msgs);
      case QADockerPackage.SEND_DISPATCH__VAL:
        return basicSetVal(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case QADockerPackage.SEND_DISPATCH__DEST:
        return getDest();
      case QADockerPackage.SEND_DISPATCH__MSGREF:
        if (resolve) return getMsgref();
        return basicGetMsgref();
      case QADockerPackage.SEND_DISPATCH__VAL:
        return getVal();
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
      case QADockerPackage.SEND_DISPATCH__DEST:
        setDest((VarOrQactor)newValue);
        return;
      case QADockerPackage.SEND_DISPATCH__MSGREF:
        setMsgref((Message)newValue);
        return;
      case QADockerPackage.SEND_DISPATCH__VAL:
        setVal((PHead)newValue);
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
      case QADockerPackage.SEND_DISPATCH__DEST:
        setDest((VarOrQactor)null);
        return;
      case QADockerPackage.SEND_DISPATCH__MSGREF:
        setMsgref((Message)null);
        return;
      case QADockerPackage.SEND_DISPATCH__VAL:
        setVal((PHead)null);
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
      case QADockerPackage.SEND_DISPATCH__DEST:
        return dest != null;
      case QADockerPackage.SEND_DISPATCH__MSGREF:
        return msgref != null;
      case QADockerPackage.SEND_DISPATCH__VAL:
        return val != null;
    }
    return super.eIsSet(featureID);
  }

} //SendDispatchImpl