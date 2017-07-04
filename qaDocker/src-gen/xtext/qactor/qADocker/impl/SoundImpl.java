/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.qactor.qADocker.AnswerEvent;
import xtext.qactor.qADocker.MoveFile;
import xtext.qactor.qADocker.QADockerPackage;
import xtext.qactor.qADocker.Sound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.impl.SoundImpl#getSrcfile <em>Srcfile</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.SoundImpl#getAnswerEvent <em>Answer Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoundImpl extends ExtensionMoveImpl implements Sound
{
  /**
   * The cached value of the '{@link #getSrcfile() <em>Srcfile</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcfile()
   * @generated
   * @ordered
   */
  protected MoveFile srcfile;

  /**
   * The cached value of the '{@link #getAnswerEvent() <em>Answer Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswerEvent()
   * @generated
   * @ordered
   */
  protected AnswerEvent answerEvent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SoundImpl()
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
    return QADockerPackage.Literals.SOUND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoveFile getSrcfile()
  {
    return srcfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSrcfile(MoveFile newSrcfile, NotificationChain msgs)
  {
    MoveFile oldSrcfile = srcfile;
    srcfile = newSrcfile;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QADockerPackage.SOUND__SRCFILE, oldSrcfile, newSrcfile);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrcfile(MoveFile newSrcfile)
  {
    if (newSrcfile != srcfile)
    {
      NotificationChain msgs = null;
      if (srcfile != null)
        msgs = ((InternalEObject)srcfile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.SOUND__SRCFILE, null, msgs);
      if (newSrcfile != null)
        msgs = ((InternalEObject)newSrcfile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.SOUND__SRCFILE, null, msgs);
      msgs = basicSetSrcfile(newSrcfile, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.SOUND__SRCFILE, newSrcfile, newSrcfile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnswerEvent getAnswerEvent()
  {
    return answerEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnswerEvent(AnswerEvent newAnswerEvent, NotificationChain msgs)
  {
    AnswerEvent oldAnswerEvent = answerEvent;
    answerEvent = newAnswerEvent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QADockerPackage.SOUND__ANSWER_EVENT, oldAnswerEvent, newAnswerEvent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnswerEvent(AnswerEvent newAnswerEvent)
  {
    if (newAnswerEvent != answerEvent)
    {
      NotificationChain msgs = null;
      if (answerEvent != null)
        msgs = ((InternalEObject)answerEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.SOUND__ANSWER_EVENT, null, msgs);
      if (newAnswerEvent != null)
        msgs = ((InternalEObject)newAnswerEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.SOUND__ANSWER_EVENT, null, msgs);
      msgs = basicSetAnswerEvent(newAnswerEvent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.SOUND__ANSWER_EVENT, newAnswerEvent, newAnswerEvent));
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
      case QADockerPackage.SOUND__SRCFILE:
        return basicSetSrcfile(null, msgs);
      case QADockerPackage.SOUND__ANSWER_EVENT:
        return basicSetAnswerEvent(null, msgs);
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
      case QADockerPackage.SOUND__SRCFILE:
        return getSrcfile();
      case QADockerPackage.SOUND__ANSWER_EVENT:
        return getAnswerEvent();
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
      case QADockerPackage.SOUND__SRCFILE:
        setSrcfile((MoveFile)newValue);
        return;
      case QADockerPackage.SOUND__ANSWER_EVENT:
        setAnswerEvent((AnswerEvent)newValue);
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
      case QADockerPackage.SOUND__SRCFILE:
        setSrcfile((MoveFile)null);
        return;
      case QADockerPackage.SOUND__ANSWER_EVENT:
        setAnswerEvent((AnswerEvent)null);
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
      case QADockerPackage.SOUND__SRCFILE:
        return srcfile != null;
      case QADockerPackage.SOUND__ANSWER_EVENT:
        return answerEvent != null;
    }
    return super.eIsSet(featureID);
  }

} //SoundImpl