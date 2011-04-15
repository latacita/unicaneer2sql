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

import EER.diagram.part.Eer2sqlVisualIDRegistry;

/**
 * @generated
 */
public class Eer2sqlEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Eer2sqlVisualIDRegistry.getVisualID(view)) {

			case ProjectEditPart.VISUAL_ID:
				return new ProjectEditPart(view);

			case WeakEntityEditPart.VISUAL_ID:
				return new WeakEntityEditPart(view);

			case WeakEntityNameEditPart.VISUAL_ID:
				return new WeakEntityNameEditPart(view);

			case EnumerationTypeEditPart.VISUAL_ID:
				return new EnumerationTypeEditPart(view);

			case EnumerationTypeNameEditPart.VISUAL_ID:
				return new EnumerationTypeNameEditPart(view);

			case GeneralizationEditPart.VISUAL_ID:
				return new GeneralizationEditPart(view);

			case GeneralizationNameEditPart.VISUAL_ID:
				return new GeneralizationNameEditPart(view);

			case MemberCollectionEditPart.VISUAL_ID:
				return new MemberCollectionEditPart(view);

			case MemberCollectionNameEditPart.VISUAL_ID:
				return new MemberCollectionNameEditPart(view);

			case PrimitiveTypeEditPart.VISUAL_ID:
				return new PrimitiveTypeEditPart(view);

			case PrimitiveTypeNameEditPart.VISUAL_ID:
				return new PrimitiveTypeNameEditPart(view);

			case CompositeComponentEditPart.VISUAL_ID:
				return new CompositeComponentEditPart(view);

			case CompositeComponentNameEditPart.VISUAL_ID:
				return new CompositeComponentNameEditPart(view);

			case DependencyRelationshipEditPart.VISUAL_ID:
				return new DependencyRelationshipEditPart(view);

			case DependencyRelationshipNameEditPart.VISUAL_ID:
				return new DependencyRelationshipNameEditPart(view);

			case RelationshipEditPart.VISUAL_ID:
				return new RelationshipEditPart(view);

			case RelationshipNameEditPart.VISUAL_ID:
				return new RelationshipNameEditPart(view);

			case GeneralizationRelationshipEditPart.VISUAL_ID:
				return new GeneralizationRelationshipEditPart(view);

			case ExclusionEditPart.VISUAL_ID:
				return new ExclusionEditPart(view);

			case CandidateKeyEditPart.VISUAL_ID:
				return new CandidateKeyEditPart(view);

			case SingleAttributeEditPart.VISUAL_ID:
				return new SingleAttributeEditPart(view);

			case SpecializationRelationshipEditPart.VISUAL_ID:
				return new SpecializationRelationshipEditPart(view);

			case DependencyRelationship2EditPart.VISUAL_ID:
				return new DependencyRelationship2EditPart(view);

			case CompositeAttributeEditPart.VISUAL_ID:
				return new CompositeAttributeEditPart(view);

			case ParticipantEditPart.VISUAL_ID:
				return new ParticipantEditPart(view);

			case AggregationParticipantEditPart.VISUAL_ID:
				return new AggregationParticipantEditPart(view);

			case EnumeratedLiteralEditPart.VISUAL_ID:
				return new EnumeratedLiteralEditPart(view);

			case InclusionEditPart.VISUAL_ID:
				return new InclusionEditPart(view);

			case GeneralizationParentEditPart.VISUAL_ID:
				return new GeneralizationParentEditPart(view);

			case AggregationSourceEditPart.VISUAL_ID:
				return new AggregationSourceEditPart(view);

			case EntityPrimaryKeyEditPart.VISUAL_ID:
				return new EntityPrimaryKeyEditPart(view);

			case GeneralizationChildsEditPart.VISUAL_ID:
				return new GeneralizationChildsEditPart(view);

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
