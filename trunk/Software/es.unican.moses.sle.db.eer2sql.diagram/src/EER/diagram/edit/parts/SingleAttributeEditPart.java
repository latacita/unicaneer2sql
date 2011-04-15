package EER.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import EER.diagram.edit.policies.SingleAttributeItemSemanticEditPolicy;

/**
 * @generated
 */
public class SingleAttributeEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public SingleAttributeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SingleAttributeItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new SingleAttributeFigure();
	}

	/**
	 * @generated
	 */
	public SingleAttributeFigure getPrimaryShape() {
		return (SingleAttributeFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SingleAttributeFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSingleAttributeNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSingleAttributeNullableFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSingleAttributeDerivateFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureSingleAttributeMultiplicityFigure;

		/**
		 * @generated
		 */
		public SingleAttributeFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSingleAttributeNameFigure = new WrappingLabel();
			fFigureSingleAttributeNameFigure.setText("<...>");

			this.add(fFigureSingleAttributeNameFigure);

			fFigureSingleAttributeNullableFigure = new WrappingLabel();
			fFigureSingleAttributeNullableFigure.setText("<...>");

			this.add(fFigureSingleAttributeNullableFigure);

			fFigureSingleAttributeDerivateFigure = new WrappingLabel();
			fFigureSingleAttributeDerivateFigure.setText("<...>");

			this.add(fFigureSingleAttributeDerivateFigure);

			fFigureSingleAttributeMultiplicityFigure = new WrappingLabel();
			fFigureSingleAttributeMultiplicityFigure.setText("<...>");

			this.add(fFigureSingleAttributeMultiplicityFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSingleAttributeNameFigure() {
			return fFigureSingleAttributeNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSingleAttributeNullableFigure() {
			return fFigureSingleAttributeNullableFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSingleAttributeDerivateFigure() {
			return fFigureSingleAttributeDerivateFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSingleAttributeMultiplicityFigure() {
			return fFigureSingleAttributeMultiplicityFigure;
		}

	}

}
