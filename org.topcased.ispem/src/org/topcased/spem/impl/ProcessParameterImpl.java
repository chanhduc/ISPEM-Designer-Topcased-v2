/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.topcased.spem.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.topcased.spem.BreakdownElement;
import org.topcased.spem.Category;
import org.topcased.spem.DescribableElement;
import org.topcased.spem.ExtensibleElement;
import org.topcased.spem.Guidance;
import org.topcased.spem.Kind;
import org.topcased.spem.Metric;
import org.topcased.spem.OptionalityKind;
import org.topcased.spem.PlanningData;
import org.topcased.spem.ProcessElement;
import org.topcased.spem.ProcessKind;
import org.topcased.spem.ProcessPackageableElement;
import org.topcased.spem.ProcessParameter;
import org.topcased.spem.SpemPackage;
import org.topcased.spem.WorkProductUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getPresentationName <em>Presentation Name</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getBriefDescription <em>Brief Description</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getMainDescription <em>Main Description</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getGuidance <em>Guidance</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getMetric <em>Metric</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getChangeDate <em>Change Date</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getChangeDescription <em>Change Description</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getProcessKind <em>Process Kind</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#isHasMultipleOccurrences <em>Has Multiple Occurrences</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#isIsPlanned <em>Is Planned</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getPlanningData <em>Planning Data</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link org.topcased.spem.impl.ProcessParameterImpl#getOptionality <em>Optionality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessParameterImpl extends WorkDefinitionParameterImpl implements ProcessParameter {
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected Kind kind;

	/**
	 * The default value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentationName() <em>Presentation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationName()
	 * @generated
	 * @ordered
	 */
	protected String presentationName = PRESENTATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBriefDescription() <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBriefDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String BRIEF_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBriefDescription() <em>Brief Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBriefDescription()
	 * @generated
	 * @ordered
	 */
	protected String briefDescription = BRIEF_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainDescription() <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainDescription() <em>Main Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainDescription()
	 * @generated
	 * @ordered
	 */
	protected String mainDescription = MAIN_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuidance() <em>Guidance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuidance()
	 * @generated
	 * @ordered
	 */
	protected EList guidance;

	/**
	 * The cached value of the '{@link #getMetric() <em>Metric</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetric()
	 * @generated
	 * @ordered
	 */
	protected EList metric;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList category;

	/**
	 * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected static final String COPYRIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected String copyright = COPYRIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList author;

	/**
	 * The default value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CHANGE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDate() <em>Change Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDate()
	 * @generated
	 * @ordered
	 */
	protected Date changeDate = CHANGE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeDescription() <em>Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangeDescription() <em>Change Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeDescription()
	 * @generated
	 * @ordered
	 */
	protected String changeDescription = CHANGE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

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
	 * The cached value of the '{@link #getProcessKind() <em>Process Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessKind()
	 * @generated
	 * @ordered
	 */
	protected ProcessKind processKind;

	/**
	 * The default value of the '{@link #isHasMultipleOccurrences() <em>Has Multiple Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMultipleOccurrences()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_MULTIPLE_OCCURRENCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasMultipleOccurrences() <em>Has Multiple Occurrences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasMultipleOccurrences()
	 * @generated
	 * @ordered
	 */
	protected boolean hasMultipleOccurrences = HAS_MULTIPLE_OCCURRENCES_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PLANNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPlanned() <em>Is Planned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPlanned()
	 * @generated
	 * @ordered
	 */
	protected boolean isPlanned = IS_PLANNED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlanningData() <em>Planning Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanningData()
	 * @generated
	 * @ordered
	 */
	protected PlanningData planningData;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected WorkProductUse parameterType;

	/**
	 * The default value of the '{@link #getOptionality() <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionality()
	 * @generated
	 * @ordered
	 */
	protected static final OptionalityKind OPTIONALITY_EDEFAULT = OptionalityKind.MANDATORY_LITERAL;

	/**
	 * The cached value of the '{@link #getOptionality() <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionality()
	 * @generated
	 * @ordered
	 */
	protected OptionalityKind optionality = OPTIONALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SpemPackage.Literals.PROCESS_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind getKind() {
		if (kind != null && kind.eIsProxy()) {
			InternalEObject oldKind = (InternalEObject)kind;
			kind = (Kind)eResolveProxy(oldKind);
			if (kind != oldKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.PROCESS_PARAMETER__KIND, oldKind, kind));
			}
		}
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kind basicGetKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(Kind newKind) {
		Kind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresentationName() {
		return presentationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationName(String newPresentationName) {
		String oldPresentationName = presentationName;
		presentationName = newPresentationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__PRESENTATION_NAME, oldPresentationName, presentationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBriefDescription() {
		return briefDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBriefDescription(String newBriefDescription) {
		String oldBriefDescription = briefDescription;
		briefDescription = newBriefDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__BRIEF_DESCRIPTION, oldBriefDescription, briefDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainDescription() {
		return mainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainDescription(String newMainDescription) {
		String oldMainDescription = mainDescription;
		mainDescription = newMainDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__MAIN_DESCRIPTION, oldMainDescription, mainDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getGuidance() {
		if (guidance == null) {
			guidance = new EObjectResolvingEList(Guidance.class, this, SpemPackage.PROCESS_PARAMETER__GUIDANCE);
		}
		return guidance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMetric() {
		if (metric == null) {
			metric = new EObjectResolvingEList(Metric.class, this, SpemPackage.PROCESS_PARAMETER__METRIC);
		}
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCategory() {
		if (category == null) {
			category = new EObjectWithInverseResolvingEList.ManyInverse(Category.class, this, SpemPackage.PROCESS_PARAMETER__CATEGORY, SpemPackage.CATEGORY__CATEGORIZED_ELEMENT);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(String newCopyright) {
		String oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAuthor() {
		if (author == null) {
			author = new EDataTypeUniqueEList(String.class, this, SpemPackage.PROCESS_PARAMETER__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getChangeDate() {
		return changeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeDate(Date newChangeDate) {
		Date oldChangeDate = changeDate;
		changeDate = newChangeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__CHANGE_DATE, oldChangeDate, changeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChangeDescription() {
		return changeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeDescription(String newChangeDescription) {
		String oldChangeDescription = changeDescription;
		changeDescription = newChangeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__CHANGE_DESCRIPTION, oldChangeDescription, changeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessKind getProcessKind() {
		if (processKind != null && processKind.eIsProxy()) {
			InternalEObject oldProcessKind = (InternalEObject)processKind;
			processKind = (ProcessKind)eResolveProxy(oldProcessKind);
			if (processKind != oldProcessKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.PROCESS_PARAMETER__PROCESS_KIND, oldProcessKind, processKind));
			}
		}
		return processKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessKind basicGetProcessKind() {
		return processKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessKind(ProcessKind newProcessKind) {
		ProcessKind oldProcessKind = processKind;
		processKind = newProcessKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__PROCESS_KIND, oldProcessKind, processKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasMultipleOccurrences() {
		return hasMultipleOccurrences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMultipleOccurrences(boolean newHasMultipleOccurrences) {
		boolean oldHasMultipleOccurrences = hasMultipleOccurrences;
		hasMultipleOccurrences = newHasMultipleOccurrences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__HAS_MULTIPLE_OCCURRENCES, oldHasMultipleOccurrences, hasMultipleOccurrences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__IS_OPTIONAL, oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPlanned() {
		return isPlanned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPlanned(boolean newIsPlanned) {
		boolean oldIsPlanned = isPlanned;
		isPlanned = newIsPlanned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__IS_PLANNED, oldIsPlanned, isPlanned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanningData getPlanningData() {
		return planningData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanningData(PlanningData newPlanningData, NotificationChain msgs) {
		PlanningData oldPlanningData = planningData;
		planningData = newPlanningData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__PLANNING_DATA, oldPlanningData, newPlanningData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanningData(PlanningData newPlanningData) {
		if (newPlanningData != planningData) {
			NotificationChain msgs = null;
			if (planningData != null)
				msgs = ((InternalEObject)planningData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpemPackage.PROCESS_PARAMETER__PLANNING_DATA, null, msgs);
			if (newPlanningData != null)
				msgs = ((InternalEObject)newPlanningData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpemPackage.PROCESS_PARAMETER__PLANNING_DATA, null, msgs);
			msgs = basicSetPlanningData(newPlanningData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__PLANNING_DATA, newPlanningData, newPlanningData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductUse getParameterType() {
		if (parameterType != null && parameterType.eIsProxy()) {
			InternalEObject oldParameterType = (InternalEObject)parameterType;
			parameterType = (WorkProductUse)eResolveProxy(oldParameterType);
			if (parameterType != oldParameterType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpemPackage.PROCESS_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
			}
		}
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductUse basicGetParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(WorkProductUse newParameterType) {
		WorkProductUse oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalityKind getOptionality() {
		return optionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionality(OptionalityKind newOptionality) {
		OptionalityKind oldOptionality = optionality;
		optionality = newOptionality == null ? OPTIONALITY_EDEFAULT : newOptionality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpemPackage.PROCESS_PARAMETER__OPTIONALITY, oldOptionality, optionality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.PROCESS_PARAMETER__CATEGORY:
				return ((InternalEList)getCategory()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpemPackage.PROCESS_PARAMETER__CATEGORY:
				return ((InternalEList)getCategory()).basicRemove(otherEnd, msgs);
			case SpemPackage.PROCESS_PARAMETER__PLANNING_DATA:
				return basicSetPlanningData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpemPackage.PROCESS_PARAMETER__KIND:
				if (resolve) return getKind();
				return basicGetKind();
			case SpemPackage.PROCESS_PARAMETER__PRESENTATION_NAME:
				return getPresentationName();
			case SpemPackage.PROCESS_PARAMETER__BRIEF_DESCRIPTION:
				return getBriefDescription();
			case SpemPackage.PROCESS_PARAMETER__MAIN_DESCRIPTION:
				return getMainDescription();
			case SpemPackage.PROCESS_PARAMETER__PURPOSE:
				return getPurpose();
			case SpemPackage.PROCESS_PARAMETER__GUIDANCE:
				return getGuidance();
			case SpemPackage.PROCESS_PARAMETER__METRIC:
				return getMetric();
			case SpemPackage.PROCESS_PARAMETER__CATEGORY:
				return getCategory();
			case SpemPackage.PROCESS_PARAMETER__COPYRIGHT:
				return getCopyright();
			case SpemPackage.PROCESS_PARAMETER__AUTHOR:
				return getAuthor();
			case SpemPackage.PROCESS_PARAMETER__CHANGE_DATE:
				return getChangeDate();
			case SpemPackage.PROCESS_PARAMETER__CHANGE_DESCRIPTION:
				return getChangeDescription();
			case SpemPackage.PROCESS_PARAMETER__VERSION:
				return getVersion();
			case SpemPackage.PROCESS_PARAMETER__NAME:
				return getName();
			case SpemPackage.PROCESS_PARAMETER__PROCESS_KIND:
				if (resolve) return getProcessKind();
				return basicGetProcessKind();
			case SpemPackage.PROCESS_PARAMETER__HAS_MULTIPLE_OCCURRENCES:
				return isHasMultipleOccurrences() ? Boolean.TRUE : Boolean.FALSE;
			case SpemPackage.PROCESS_PARAMETER__IS_OPTIONAL:
				return isIsOptional() ? Boolean.TRUE : Boolean.FALSE;
			case SpemPackage.PROCESS_PARAMETER__IS_PLANNED:
				return isIsPlanned() ? Boolean.TRUE : Boolean.FALSE;
			case SpemPackage.PROCESS_PARAMETER__PLANNING_DATA:
				return getPlanningData();
			case SpemPackage.PROCESS_PARAMETER__PARAMETER_TYPE:
				if (resolve) return getParameterType();
				return basicGetParameterType();
			case SpemPackage.PROCESS_PARAMETER__OPTIONALITY:
				return getOptionality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpemPackage.PROCESS_PARAMETER__KIND:
				setKind((Kind)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__PRESENTATION_NAME:
				setPresentationName((String)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__BRIEF_DESCRIPTION:
				setBriefDescription((String)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__MAIN_DESCRIPTION:
				setMainDescription((String)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__PURPOSE:
				setPurpose((String)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__GUIDANCE:
				getGuidance().clear();
				getGuidance().addAll((Collection)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__METRIC:
				getMetric().clear();
				getMetric().addAll((Collection)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__COPYRIGHT:
				setCopyright((String)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__CHANGE_DATE:
				setChangeDate((Date)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__CHANGE_DESCRIPTION:
				setChangeDescription((String)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__VERSION:
				setVersion((String)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__PROCESS_KIND:
				setProcessKind((ProcessKind)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__HAS_MULTIPLE_OCCURRENCES:
				setHasMultipleOccurrences(((Boolean)newValue).booleanValue());
				return;
			case SpemPackage.PROCESS_PARAMETER__IS_OPTIONAL:
				setIsOptional(((Boolean)newValue).booleanValue());
				return;
			case SpemPackage.PROCESS_PARAMETER__IS_PLANNED:
				setIsPlanned(((Boolean)newValue).booleanValue());
				return;
			case SpemPackage.PROCESS_PARAMETER__PLANNING_DATA:
				setPlanningData((PlanningData)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__PARAMETER_TYPE:
				setParameterType((WorkProductUse)newValue);
				return;
			case SpemPackage.PROCESS_PARAMETER__OPTIONALITY:
				setOptionality((OptionalityKind)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpemPackage.PROCESS_PARAMETER__KIND:
				setKind((Kind)null);
				return;
			case SpemPackage.PROCESS_PARAMETER__PRESENTATION_NAME:
				setPresentationName(PRESENTATION_NAME_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__BRIEF_DESCRIPTION:
				setBriefDescription(BRIEF_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__MAIN_DESCRIPTION:
				setMainDescription(MAIN_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__GUIDANCE:
				getGuidance().clear();
				return;
			case SpemPackage.PROCESS_PARAMETER__METRIC:
				getMetric().clear();
				return;
			case SpemPackage.PROCESS_PARAMETER__CATEGORY:
				getCategory().clear();
				return;
			case SpemPackage.PROCESS_PARAMETER__COPYRIGHT:
				setCopyright(COPYRIGHT_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__AUTHOR:
				getAuthor().clear();
				return;
			case SpemPackage.PROCESS_PARAMETER__CHANGE_DATE:
				setChangeDate(CHANGE_DATE_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__CHANGE_DESCRIPTION:
				setChangeDescription(CHANGE_DESCRIPTION_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__PROCESS_KIND:
				setProcessKind((ProcessKind)null);
				return;
			case SpemPackage.PROCESS_PARAMETER__HAS_MULTIPLE_OCCURRENCES:
				setHasMultipleOccurrences(HAS_MULTIPLE_OCCURRENCES_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__IS_OPTIONAL:
				setIsOptional(IS_OPTIONAL_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__IS_PLANNED:
				setIsPlanned(IS_PLANNED_EDEFAULT);
				return;
			case SpemPackage.PROCESS_PARAMETER__PLANNING_DATA:
				setPlanningData((PlanningData)null);
				return;
			case SpemPackage.PROCESS_PARAMETER__PARAMETER_TYPE:
				setParameterType((WorkProductUse)null);
				return;
			case SpemPackage.PROCESS_PARAMETER__OPTIONALITY:
				setOptionality(OPTIONALITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpemPackage.PROCESS_PARAMETER__KIND:
				return kind != null;
			case SpemPackage.PROCESS_PARAMETER__PRESENTATION_NAME:
				return PRESENTATION_NAME_EDEFAULT == null ? presentationName != null : !PRESENTATION_NAME_EDEFAULT.equals(presentationName);
			case SpemPackage.PROCESS_PARAMETER__BRIEF_DESCRIPTION:
				return BRIEF_DESCRIPTION_EDEFAULT == null ? briefDescription != null : !BRIEF_DESCRIPTION_EDEFAULT.equals(briefDescription);
			case SpemPackage.PROCESS_PARAMETER__MAIN_DESCRIPTION:
				return MAIN_DESCRIPTION_EDEFAULT == null ? mainDescription != null : !MAIN_DESCRIPTION_EDEFAULT.equals(mainDescription);
			case SpemPackage.PROCESS_PARAMETER__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case SpemPackage.PROCESS_PARAMETER__GUIDANCE:
				return guidance != null && !guidance.isEmpty();
			case SpemPackage.PROCESS_PARAMETER__METRIC:
				return metric != null && !metric.isEmpty();
			case SpemPackage.PROCESS_PARAMETER__CATEGORY:
				return category != null && !category.isEmpty();
			case SpemPackage.PROCESS_PARAMETER__COPYRIGHT:
				return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
			case SpemPackage.PROCESS_PARAMETER__AUTHOR:
				return author != null && !author.isEmpty();
			case SpemPackage.PROCESS_PARAMETER__CHANGE_DATE:
				return CHANGE_DATE_EDEFAULT == null ? changeDate != null : !CHANGE_DATE_EDEFAULT.equals(changeDate);
			case SpemPackage.PROCESS_PARAMETER__CHANGE_DESCRIPTION:
				return CHANGE_DESCRIPTION_EDEFAULT == null ? changeDescription != null : !CHANGE_DESCRIPTION_EDEFAULT.equals(changeDescription);
			case SpemPackage.PROCESS_PARAMETER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case SpemPackage.PROCESS_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpemPackage.PROCESS_PARAMETER__PROCESS_KIND:
				return processKind != null;
			case SpemPackage.PROCESS_PARAMETER__HAS_MULTIPLE_OCCURRENCES:
				return hasMultipleOccurrences != HAS_MULTIPLE_OCCURRENCES_EDEFAULT;
			case SpemPackage.PROCESS_PARAMETER__IS_OPTIONAL:
				return isOptional != IS_OPTIONAL_EDEFAULT;
			case SpemPackage.PROCESS_PARAMETER__IS_PLANNED:
				return isPlanned != IS_PLANNED_EDEFAULT;
			case SpemPackage.PROCESS_PARAMETER__PLANNING_DATA:
				return planningData != null;
			case SpemPackage.PROCESS_PARAMETER__PARAMETER_TYPE:
				return parameterType != null;
			case SpemPackage.PROCESS_PARAMETER__OPTIONALITY:
				return optionality != OPTIONALITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == ExtensibleElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.PROCESS_PARAMETER__KIND: return SpemPackage.EXTENSIBLE_ELEMENT__KIND;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.PROCESS_PARAMETER__PRESENTATION_NAME: return SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME;
				case SpemPackage.PROCESS_PARAMETER__BRIEF_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION;
				case SpemPackage.PROCESS_PARAMETER__MAIN_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION;
				case SpemPackage.PROCESS_PARAMETER__PURPOSE: return SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE;
				case SpemPackage.PROCESS_PARAMETER__GUIDANCE: return SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE;
				case SpemPackage.PROCESS_PARAMETER__METRIC: return SpemPackage.DESCRIBABLE_ELEMENT__METRIC;
				case SpemPackage.PROCESS_PARAMETER__CATEGORY: return SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY;
				case SpemPackage.PROCESS_PARAMETER__COPYRIGHT: return SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT;
				case SpemPackage.PROCESS_PARAMETER__AUTHOR: return SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR;
				case SpemPackage.PROCESS_PARAMETER__CHANGE_DATE: return SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE;
				case SpemPackage.PROCESS_PARAMETER__CHANGE_DESCRIPTION: return SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION;
				case SpemPackage.PROCESS_PARAMETER__VERSION: return SpemPackage.DESCRIBABLE_ELEMENT__VERSION;
				default: return -1;
			}
		}
		if (baseClass == ProcessPackageableElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.PROCESS_PARAMETER__NAME: return SpemPackage.PROCESS_PACKAGEABLE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ProcessElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.PROCESS_PARAMETER__PROCESS_KIND: return SpemPackage.PROCESS_ELEMENT__PROCESS_KIND;
				default: return -1;
			}
		}
		if (baseClass == BreakdownElement.class) {
			switch (derivedFeatureID) {
				case SpemPackage.PROCESS_PARAMETER__HAS_MULTIPLE_OCCURRENCES: return SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES;
				case SpemPackage.PROCESS_PARAMETER__IS_OPTIONAL: return SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL;
				case SpemPackage.PROCESS_PARAMETER__IS_PLANNED: return SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED;
				case SpemPackage.PROCESS_PARAMETER__PLANNING_DATA: return SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == ExtensibleElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.EXTENSIBLE_ELEMENT__KIND: return SpemPackage.PROCESS_PARAMETER__KIND;
				default: return -1;
			}
		}
		if (baseClass == DescribableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.DESCRIBABLE_ELEMENT__PRESENTATION_NAME: return SpemPackage.PROCESS_PARAMETER__PRESENTATION_NAME;
				case SpemPackage.DESCRIBABLE_ELEMENT__BRIEF_DESCRIPTION: return SpemPackage.PROCESS_PARAMETER__BRIEF_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__MAIN_DESCRIPTION: return SpemPackage.PROCESS_PARAMETER__MAIN_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__PURPOSE: return SpemPackage.PROCESS_PARAMETER__PURPOSE;
				case SpemPackage.DESCRIBABLE_ELEMENT__GUIDANCE: return SpemPackage.PROCESS_PARAMETER__GUIDANCE;
				case SpemPackage.DESCRIBABLE_ELEMENT__METRIC: return SpemPackage.PROCESS_PARAMETER__METRIC;
				case SpemPackage.DESCRIBABLE_ELEMENT__CATEGORY: return SpemPackage.PROCESS_PARAMETER__CATEGORY;
				case SpemPackage.DESCRIBABLE_ELEMENT__COPYRIGHT: return SpemPackage.PROCESS_PARAMETER__COPYRIGHT;
				case SpemPackage.DESCRIBABLE_ELEMENT__AUTHOR: return SpemPackage.PROCESS_PARAMETER__AUTHOR;
				case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DATE: return SpemPackage.PROCESS_PARAMETER__CHANGE_DATE;
				case SpemPackage.DESCRIBABLE_ELEMENT__CHANGE_DESCRIPTION: return SpemPackage.PROCESS_PARAMETER__CHANGE_DESCRIPTION;
				case SpemPackage.DESCRIBABLE_ELEMENT__VERSION: return SpemPackage.PROCESS_PARAMETER__VERSION;
				default: return -1;
			}
		}
		if (baseClass == ProcessPackageableElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.PROCESS_PACKAGEABLE_ELEMENT__NAME: return SpemPackage.PROCESS_PARAMETER__NAME;
				default: return -1;
			}
		}
		if (baseClass == ProcessElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.PROCESS_ELEMENT__PROCESS_KIND: return SpemPackage.PROCESS_PARAMETER__PROCESS_KIND;
				default: return -1;
			}
		}
		if (baseClass == BreakdownElement.class) {
			switch (baseFeatureID) {
				case SpemPackage.BREAKDOWN_ELEMENT__HAS_MULTIPLE_OCCURRENCES: return SpemPackage.PROCESS_PARAMETER__HAS_MULTIPLE_OCCURRENCES;
				case SpemPackage.BREAKDOWN_ELEMENT__IS_OPTIONAL: return SpemPackage.PROCESS_PARAMETER__IS_OPTIONAL;
				case SpemPackage.BREAKDOWN_ELEMENT__IS_PLANNED: return SpemPackage.PROCESS_PARAMETER__IS_PLANNED;
				case SpemPackage.BREAKDOWN_ELEMENT__PLANNING_DATA: return SpemPackage.PROCESS_PARAMETER__PLANNING_DATA;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (presentationName: ");
		result.append(presentationName);
		result.append(", briefDescription: ");
		result.append(briefDescription);
		result.append(", mainDescription: ");
		result.append(mainDescription);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", copyright: ");
		result.append(copyright);
		result.append(", author: ");
		result.append(author);
		result.append(", changeDate: ");
		result.append(changeDate);
		result.append(", changeDescription: ");
		result.append(changeDescription);
		result.append(", version: ");
		result.append(version);
		result.append(", name: ");
		result.append(name);
		result.append(", hasMultipleOccurrences: ");
		result.append(hasMultipleOccurrences);
		result.append(", isOptional: ");
		result.append(isOptional);
		result.append(", isPlanned: ");
		result.append(isPlanned);
		result.append(", optionality: ");
		result.append(optionality);
		result.append(')');
		return result.toString();
	}

} //ProcessParameterImpl
