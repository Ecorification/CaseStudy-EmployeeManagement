/**
 */
package ecore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecore.RootContainer#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 *
 * @see ecore.EcorePackage#getRootContainer()
 * @model
 * @generated
 */
public interface RootContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Contained Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Elements</em>' containment reference list.
	 * @see ecore.EcorePackage#getRootContainer_ContainedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContainedElements();

} // RootContainer
