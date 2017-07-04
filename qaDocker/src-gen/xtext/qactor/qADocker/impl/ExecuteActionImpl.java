/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.qactor.qADocker.Action;
import xtext.qactor.qADocker.ExecuteAction;
import xtext.qactor.qADocker.PHead;
import xtext.qactor.qADocker.QADockerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.impl.ExecuteActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.ExecuteActionImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.ExecuteActionImpl#getSentence <em>Sentence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteActionImpl extends ActionMoveImpl implements ExecuteAction
{
  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected PHead arg;

  /**
   * The cached value of the '{@link #getSentence() <em>Sentence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSentence()
   * @generated
   * @ordered
   */
  protected PHead sentence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecuteActionImpl()
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
    return QADockerPackage.Literals.EXECUTE_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (Action)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QADockerPackage.EXECUTE_ACTION__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.EXECUTE_ACTION__ACTION, oldAction, action));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PHead getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArg(PHead newArg, NotificationChain msgs)
  {
    PHead oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QADockerPackage.EXECUTE_ACTION__ARG, oldArg, newArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(PHead newArg)
  {
    if (newArg != arg)
    {
      NotificationChain msgs = null;
      if (arg != null)
        msgs = ((InternalEObject)arg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.EXECUTE_ACTION__ARG, null, msgs);
      if (newArg != null)
        msgs = ((InternalEObject)newArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.EXECUTE_ACTION__ARG, null, msgs);
      msgs = basicSetArg(newArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.EXECUTE_ACTION__ARG, newArg, newArg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PHead getSentence()
  {
    return sentence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSentence(PHead newSentence, NotificationChain msgs)
  {
    PHead oldSentence = sentence;
    sentence = newSentence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QADockerPackage.EXECUTE_ACTION__SENTENCE, oldSentence, newSentence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSentence(PHead newSentence)
  {
    if (newSentence != sentence)
    {
      NotificationChain msgs = null;
      if (sentence != null)
        msgs = ((InternalEObject)sentence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.EXECUTE_ACTION__SENTENCE, null, msgs);
      if (newSentence != null)
        msgs = ((InternalEObject)newSentence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.EXECUTE_ACTION__SENTENCE, null, msgs);
      msgs = basicSetSentence(newSentence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.EXECUTE_ACTION__SENTENCE, newSentence, newSentence));
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
      case QADockerPackage.EXECUTE_ACTION__ARG:
        return basicSetArg(null, msgs);
      case QADockerPackage.EXECUTE_ACTION__SENTENCE:
        return basicSetSentence(null, msgs);
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
      case QADockerPackage.EXECUTE_ACTION__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
      case QADockerPackage.EXECUTE_ACTION__ARG:
        return getArg();
      case QADockerPackage.EXECUTE_ACTION__SENTENCE:
        return getSentence();
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
      case QADockerPackage.EXECUTE_ACTION__ACTION:
        setAction((Action)newValue);
        return;
      case QADockerPackage.EXECUTE_ACTION__ARG:
        setArg((PHead)newValue);
        return;
      case QADockerPackage.EXECUTE_ACTION__SENTENCE:
        setSentence((PHead)newValue);
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
      case QADockerPackage.EXECUTE_ACTION__ACTION:
        setAction((Action)null);
        return;
      case QADockerPackage.EXECUTE_ACTION__ARG:
        setArg((PHead)null);
        return;
      case QADockerPackage.EXECUTE_ACTION__SENTENCE:
        setSentence((PHead)null);
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
      case QADockerPackage.EXECUTE_ACTION__ACTION:
        return action != null;
      case QADockerPackage.EXECUTE_ACTION__ARG:
        return arg != null;
      case QADockerPackage.EXECUTE_ACTION__SENTENCE:
        return sentence != null;
    }
    return super.eIsSet(featureID);
  }

} //ExecuteActionImpl
