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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xtext.qactor.qADocker.Action;
import xtext.qactor.qADocker.Context;
import xtext.qactor.qADocker.Data;
import xtext.qactor.qADocker.Plan;
import xtext.qactor.qADocker.QADockerPackage;
import xtext.qactor.qADocker.QActor;
import xtext.qactor.qADocker.Rule;
import xtext.qactor.qADocker.WindowColor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QActor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.qactor.qADocker.impl.QActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.QActorImpl#getContext <em>Context</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.QActorImpl#isEnv <em>Env</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.QActorImpl#getColor <em>Color</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.QActorImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.QActorImpl#getData <em>Data</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.QActorImpl#getAction <em>Action</em>}</li>
 *   <li>{@link xtext.qactor.qADocker.impl.QActorImpl#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QActorImpl extends MinimalEObjectImpl.Container implements QActor
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected Context context;

  /**
   * The default value of the '{@link #isEnv() <em>Env</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnv()
   * @generated
   * @ordered
   */
  protected static final boolean ENV_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnv() <em>Env</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnv()
   * @generated
   * @ordered
   */
  protected boolean env = ENV_EDEFAULT;

  /**
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final WindowColor COLOR_EDEFAULT = WindowColor.WHITE;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected WindowColor color = COLOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRules()
   * @generated
   * @ordered
   */
  protected EList<Rule> rules;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected EList<Data> data;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected EList<Action> action;

  /**
   * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
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
  protected QActorImpl()
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
    return QADockerPackage.Literals.QACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.QACTOR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context getContext()
  {
    if (context != null && context.eIsProxy())
    {
      InternalEObject oldContext = (InternalEObject)context;
      context = (Context)eResolveProxy(oldContext);
      if (context != oldContext)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, QADockerPackage.QACTOR__CONTEXT, oldContext, context));
      }
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context basicGetContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(Context newContext)
  {
    Context oldContext = context;
    context = newContext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.QACTOR__CONTEXT, oldContext, context));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnv()
  {
    return env;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnv(boolean newEnv)
  {
    boolean oldEnv = env;
    env = newEnv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.QACTOR__ENV, oldEnv, env));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WindowColor getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(WindowColor newColor)
  {
    WindowColor oldColor = color;
    color = newColor == null ? COLOR_EDEFAULT : newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QADockerPackage.QACTOR__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rule> getRules()
  {
    if (rules == null)
    {
      rules = new EObjectContainmentEList<Rule>(Rule.class, this, QADockerPackage.QACTOR__RULES);
    }
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Data> getData()
  {
    if (data == null)
    {
      data = new EObjectContainmentEList<Data>(Data.class, this, QADockerPackage.QACTOR__DATA);
    }
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getAction()
  {
    if (action == null)
    {
      action = new EObjectContainmentEList<Action>(Action.class, this, QADockerPackage.QACTOR__ACTION);
    }
    return action;
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
      plans = new EObjectContainmentEList<Plan>(Plan.class, this, QADockerPackage.QACTOR__PLANS);
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
      case QADockerPackage.QACTOR__RULES:
        return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
      case QADockerPackage.QACTOR__DATA:
        return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
      case QADockerPackage.QACTOR__ACTION:
        return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
      case QADockerPackage.QACTOR__PLANS:
        return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
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
      case QADockerPackage.QACTOR__NAME:
        return getName();
      case QADockerPackage.QACTOR__CONTEXT:
        if (resolve) return getContext();
        return basicGetContext();
      case QADockerPackage.QACTOR__ENV:
        return isEnv();
      case QADockerPackage.QACTOR__COLOR:
        return getColor();
      case QADockerPackage.QACTOR__RULES:
        return getRules();
      case QADockerPackage.QACTOR__DATA:
        return getData();
      case QADockerPackage.QACTOR__ACTION:
        return getAction();
      case QADockerPackage.QACTOR__PLANS:
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
      case QADockerPackage.QACTOR__NAME:
        setName((String)newValue);
        return;
      case QADockerPackage.QACTOR__CONTEXT:
        setContext((Context)newValue);
        return;
      case QADockerPackage.QACTOR__ENV:
        setEnv((Boolean)newValue);
        return;
      case QADockerPackage.QACTOR__COLOR:
        setColor((WindowColor)newValue);
        return;
      case QADockerPackage.QACTOR__RULES:
        getRules().clear();
        getRules().addAll((Collection<? extends Rule>)newValue);
        return;
      case QADockerPackage.QACTOR__DATA:
        getData().clear();
        getData().addAll((Collection<? extends Data>)newValue);
        return;
      case QADockerPackage.QACTOR__ACTION:
        getAction().clear();
        getAction().addAll((Collection<? extends Action>)newValue);
        return;
      case QADockerPackage.QACTOR__PLANS:
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
      case QADockerPackage.QACTOR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QADockerPackage.QACTOR__CONTEXT:
        setContext((Context)null);
        return;
      case QADockerPackage.QACTOR__ENV:
        setEnv(ENV_EDEFAULT);
        return;
      case QADockerPackage.QACTOR__COLOR:
        setColor(COLOR_EDEFAULT);
        return;
      case QADockerPackage.QACTOR__RULES:
        getRules().clear();
        return;
      case QADockerPackage.QACTOR__DATA:
        getData().clear();
        return;
      case QADockerPackage.QACTOR__ACTION:
        getAction().clear();
        return;
      case QADockerPackage.QACTOR__PLANS:
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
      case QADockerPackage.QACTOR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QADockerPackage.QACTOR__CONTEXT:
        return context != null;
      case QADockerPackage.QACTOR__ENV:
        return env != ENV_EDEFAULT;
      case QADockerPackage.QACTOR__COLOR:
        return color != COLOR_EDEFAULT;
      case QADockerPackage.QACTOR__RULES:
        return rules != null && !rules.isEmpty();
      case QADockerPackage.QACTOR__DATA:
        return data != null && !data.isEmpty();
      case QADockerPackage.QACTOR__ACTION:
        return action != null && !action.isEmpty();
      case QADockerPackage.QACTOR__PLANS:
        return plans != null && !plans.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", env: ");
    result.append(env);
    result.append(", color: ");
    result.append(color);
    result.append(')');
    return result.toString();
  }

} //QActorImpl
