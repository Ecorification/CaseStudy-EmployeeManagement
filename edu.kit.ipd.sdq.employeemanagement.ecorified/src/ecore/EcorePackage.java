/**
 */
package ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ecore.EcoreFactory
 * @model kind="package"
 * @generated
 */
public interface EcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "edu.kit.ipd.sdq.employeemanagement/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcorePackage eINSTANCE = ecore.impl.EcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link ecore.impl.RootContainerImpl <em>Root Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecore.impl.RootContainerImpl
	 * @see ecore.impl.EcorePackageImpl#getRootContainer()
	 * @generated
	 */
	int ROOT_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTAINER__CONTAINED_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Root Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_CONTAINER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ecore.RootContainer <em>Root Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Container</em>'.
	 * @see ecore.RootContainer
	 * @generated
	 */
	EClass getRootContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link ecore.RootContainer#getContainedElements <em>Contained Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
	 * @see ecore.RootContainer#getContainedElements()
	 * @see #getRootContainer()
	 * @generated
	 */
	EReference getRootContainer_ContainedElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreFactory getEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ecore.impl.RootContainerImpl <em>Root Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecore.impl.RootContainerImpl
		 * @see ecore.impl.EcorePackageImpl#getRootContainer()
		 * @generated
		 */
		EClass ROOT_CONTAINER = eINSTANCE.getRootContainer();

		/**
		 * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT_CONTAINER__CONTAINED_ELEMENTS = eINSTANCE.getRootContainer_ContainedElements();

	}

} //EcorePackage
