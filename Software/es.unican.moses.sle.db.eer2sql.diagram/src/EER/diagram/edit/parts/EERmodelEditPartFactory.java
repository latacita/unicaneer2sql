package EER.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import EER.diagram.part.EERmodelVisualIDRegistry;

/**
 * @generated
 */
public class EERmodelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (EERmodelVisualIDRegistry.getVisualID(view)) {

			case ProjectEditPart.VISUAL_ID:
				return new ProjectEditPart(view);

			case WeakEntityEditPart.VISUAL_ID:
				return new WeakEntityEditPart(view);

			case WeakEntityNameEditPart.VISUAL_ID:
				return new WeakEntityNameEditPart(view);

			case EntityEditPart.VISUAL_ID:
				return new EntityEditPart(view);

			case EntityNameEditPart.VISUAL_ID:
				return new EntityNameEditPart(view);

			case RelationshipEditPart.VISUAL_ID:
				return new RelationshipEditPart(view);

			case RelationshipNameEditPart.VISUAL_ID:
				return new RelationshipNameEditPart(view);

			case DependencyRelationshipEditPart.VISUAL_ID:
				return new DependencyRelationshipEditPart(view);

			case DependencyRelationshipTypeEditPart.VISUAL_ID:
				return new DependencyRelationshipTypeEditPart(view);

			case DependencyRelationshipNameEditPart.VISUAL_ID:
				return new DependencyRelationshipNameEditPart(view);

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case PrimitiveTypeEditPart.VISUAL_ID:
				return new PrimitiveTypeEditPart(view);

			case PrimitiveTypeNameEditPart.VISUAL_ID:
				return new PrimitiveTypeNameEditPart(view);

			case EnumerationTypeEditPart.VISUAL_ID:
				return new EnumerationTypeEditPart(view);

			case EnumerationTypeNameEditPart.VISUAL_ID:
				return new EnumerationTypeNameEditPart(view);

			case AggregationEditPart.VISUAL_ID:
				return new AggregationEditPart(view);

			case CandidateKeyEditPart.VISUAL_ID:
				return new CandidateKeyEditPart(view);

			case SingleAttributeEditPart.VISUAL_ID:
				return new SingleAttributeEditPart(view);

			case CompositeAttributeEditPart.VISUAL_ID:
				return new CompositeAttributeEditPart(view);

			case CompositeAttributeNameEditPart.VISUAL_ID:
				return new CompositeAttributeNameEditPart(view);

			case SingleAttribute4EditPart.VISUAL_ID:
				return new SingleAttribute4EditPart(view);

			case CandidateKey2EditPart.VISUAL_ID:
				return new CandidateKey2EditPart(view);

			case SingleAttribute2EditPart.VISUAL_ID:
				return new SingleAttribute2EditPart(view);

			case CompositeAttribute2EditPart.VISUAL_ID:
				return new CompositeAttribute2EditPart(view);

			case CompositeAttributeName2EditPart.VISUAL_ID:
				return new CompositeAttributeName2EditPart(view);

			case SingleAttribute5EditPart.VISUAL_ID:
				return new SingleAttribute5EditPart(view);

			case SingleAttribute3EditPart.VISUAL_ID:
				return new SingleAttribute3EditPart(view);

			case CompositeAttribute3EditPart.VISUAL_ID:
				return new CompositeAttribute3EditPart(view);

			case EnumeratedLiteralEditPart.VISUAL_ID:
				return new EnumeratedLiteralEditPart(view);

			case WeakEntityWeakEntityAttributesCompartmentEditPart.VISUAL_ID:
				return new WeakEntityWeakEntityAttributesCompartmentEditPart(
						view);

			case CompositeAttributeCompositeAttributeCompartment2EditPart.VISUAL_ID:
				return new CompositeAttributeCompositeAttributeCompartment2EditPart(
						view);

			case EntityEntityAttributesCompartmentEditPart.VISUAL_ID:
				return new EntityEntityAttributesCompartmentEditPart(view);

			case CompositeAttributeCompositeAttributeCompartmentEditPart.VISUAL_ID:
				return new CompositeAttributeCompositeAttributeCompartmentEditPart(
						view);

			case EnumerationTypeEnumerationTypeCompartmentEditPart.VISUAL_ID:
				return new EnumerationTypeEnumerationTypeCompartmentEditPart(
						view);

			case AggregationParticipantEditPart.VISUAL_ID:
				return new AggregationParticipantEditPart(view);

			case AggregationParticipantLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new AggregationParticipantLowerBoundUpperBoundEditPart(
						view);

			case ParticipantEditPart.VISUAL_ID:
				return new ParticipantEditPart(view);

			case ParticipantRoleEditPart.VISUAL_ID:
				return new ParticipantRoleEditPart(view);

			case ParticipantLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new ParticipantLowerBoundUpperBoundEditPart(view);

			case GeneralizationRelationshipEditPart.VISUAL_ID:
				return new GeneralizationRelationshipEditPart(view);

			case SpecializationRelationshipEditPart.VISUAL_ID:
				return new SpecializationRelationshipEditPart(view);

			case InclusionEditPart.VISUAL_ID:
				return new InclusionEditPart(view);

			case ExclusionEditPart.VISUAL_ID:
				return new ExclusionEditPart(view);

			case ExclusiveEditPart.VISUAL_ID:
				return new ExclusiveEditPart(view);

			case InclusivenessEditPart.VISUAL_ID:
				return new InclusivenessEditPart(view);

			case InclusivenessLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new InclusivenessLowerBoundUpperBoundEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
