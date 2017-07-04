/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import xtext.qactor.qADocker.Message;
import xtext.qactor.qADocker.MsgSelect;
import xtext.qactor.qADocker.Plan;
import xtext.qactor.qADocker.QADockerPackage;
import xtext.qactor.qADocker.TimeLimit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Msg Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.impl.MsgSelectImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.MsgSelectImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.MsgSelectImpl#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MsgSelectImpl extends MessageMoveImpl implements MsgSelect
{
  /**
   * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuration()
   * @generated
   * @ordered
   */
  protected TimeLimit duration;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> messages;

  /**
   * The cached value of the '{@link #getPlans() <em>Plans</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlans()
   * @generated
   * @ordered
   */
  protected EList<Plan> plans;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MsgSelectImpl()
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
    return QADockerPackage.Literals.MSG_SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeLimit getDuration()
  {
    return duration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDuration(TimeLimit newDuration, NotificationChain msgs)
  {
    TimeLimit oldDuration = duration;
    duration = newDuration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QADockerPackage.MSG_SELECT__DURATION, oldDuration, newDuration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuration(TimeLimit newDuration)
  {
    if (newDuration != duration)
    {
      NotificationChain msgs = null;
      if (duration != null)
        msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.MSG_SELECT__DURATION, null, msgs);
      if (newDuration != null)
        msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.MSG_SELECT__DURATION, null, msgs);
      msgs = basicSetDuration(newDuration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.MSG_SELECT__DURATION, newDuration, newDuration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Message> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectResolvingEList<Message>(Message.class, this, QADockerPackage.MSG_SELECT__MESSAGES);
    }
    return messages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Plan> getPlans()
  {
    if (plans == null)
    {
      plans = new EObjectResolvingEList<Plan>(Plan.class, this, QADockerPackage.MSG_SELECT__PLANS);
    }
    return plans;
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
      case QADockerPackage.MSG_SELECT__DURATION:
        return basicSetDuration(null, msgs);
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
      case QADockerPackage.MSG_SELECT__DURATION:
        return getDuration();
      case QADockerPackage.MSG_SELECT__MESSAGES:
        return getMessages();
      case QADockerPackage.MSG_SELECT__PLANS:
        return getPlans();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QADockerPackage.MSG_SELECT__DURATION:
        setDuration((TimeLimit)newValue);
        return;
      case QADockerPackage.MSG_SELECT__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends Message>)newValue);
        return;
      case QADockerPackage.MSG_SELECT__PLANS:
        getPlans().clear();
        getPlans().addAll((Collection<? extends Plan>)newValue);
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
      case QADockerPackage.MSG_SELECT__DURATION:
        setDuration((TimeLimit)null);
        return;
      case QADockerPackage.MSG_SELECT__MESSAGES:
        getMessages().clear();
        return;
      case QADockerPackage.MSG_SELECT__PLANS:
        getPlans().clear();
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
      case QADockerPackage.MSG_SELECT__DURATION:
        return duration != null;
      case QADockerPackage.MSG_SELECT__MESSAGES:
        return messages != null && !messages.isEmpty();
      case QADockerPackage.MSG_SELECT__PLANS:
        return plans != null && !plans.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MsgSelectImpl
