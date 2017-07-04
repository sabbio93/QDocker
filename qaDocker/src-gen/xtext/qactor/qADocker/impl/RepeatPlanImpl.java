/**
 * generated by Xtext 2.10.0
 */
package xtext.qactor.qADocker.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import xtext.qactor.qADocker.QADockerPackage;
import xtext.qactor.qADocker.RepeatPlan;
import xtext.qactor.qADocker.VarOrInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeat Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.impl.RepeatPlanImpl#getNiter <em>Niter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatPlanImpl extends PlanMoveImpl implements RepeatPlan
{
  /**
   * The cached value of the '{@link #getNiter() <em>Niter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNiter()
   * @generated
   * @ordered
   */
  protected VarOrInt niter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepeatPlanImpl()
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
    return QADockerPackage.Literals.REPEAT_PLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarOrInt getNiter()
  {
    return niter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNiter(VarOrInt newNiter, NotificationChain msgs)
  {
    VarOrInt oldNiter = niter;
    niter = newNiter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QADockerPackage.REPEAT_PLAN__NITER, oldNiter, newNiter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNiter(VarOrInt newNiter)
  {
    if (newNiter != niter)
    {
      NotificationChain msgs = null;
      if (niter != null)
        msgs = ((InternalEObject)niter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.REPEAT_PLAN__NITER, null, msgs);
      if (newNiter != null)
        msgs = ((InternalEObject)newNiter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QADockerPackage.REPEAT_PLAN__NITER, null, msgs);
      msgs = basicSetNiter(newNiter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.REPEAT_PLAN__NITER, newNiter, newNiter));
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
      case QADockerPackage.REPEAT_PLAN__NITER:
        return basicSetNiter(null, msgs);
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
      case QADockerPackage.REPEAT_PLAN__NITER:
        return getNiter();
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
      case QADockerPackage.REPEAT_PLAN__NITER:
        setNiter((VarOrInt)newValue);
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
      case QADockerPackage.REPEAT_PLAN__NITER:
        setNiter((VarOrInt)null);
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
      case QADockerPackage.REPEAT_PLAN__NITER:
        return niter != null;
    }
    return super.eIsSet(featureID);
  }

} //RepeatPlanImpl
