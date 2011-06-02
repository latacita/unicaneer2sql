package EER.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import EER.diagram.edit.policies.EERmodelTextSelectionEditPolicy;
import EER.diagram.edit.policies.WeakEntityItemSemanticEditPolicy;
import EER.diagram.part.EERmodelVisualIDRegistry;
import EER.diagram.providers.EERmodelElementTypes;

/**
 * @generated
 */
public class WeakEntityEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2009;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public WeakEntityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new WeakEntityItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new EERmodelTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new WeakEntityFigure();
	}

	/**
	 * @generated
	 */
	public WeakEntityFigure getPrimaryShape() {
		return (WeakEntityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WeakEntityNameEditPart) {
			((WeakEntityNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureWeakEntityNameFigure());
			return true;
		}
		if (childEditPart instanceof WeakEntityWeakEntityAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureWeakEntityAttributesFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((WeakEntityWeakEntityAttributesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WeakEntityNameEditPart) {
			return true;
		}
		if (childEditPart instanceof WeakEntityWeakEntityAttributesCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureWeakEntityAttributesFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((WeakEntityWeakEntityAttributesCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof WeakEntityWeakEntityAttributesCompartmentEditPart) {
			return getPrimaryShape().getFigureWeakEntityAttributesFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(EERmodelVisualIDRegistry
				.getType(WeakEntityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(EERmodelElementTypes.GeneralizationRelationship_4005);
		types.add(EERmodelElementTypes.SpecializationRelationship_4007);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof GeneralizationEditPart) {
			types.add(EERmodelElementTypes.GeneralizationRelationship_4005);
		}
		if (targetEditPart instanceof GeneralizationEditPart) {
			types.add(EERmodelElementTypes.SpecializationRelationship_4007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EERmodelElementTypes.GeneralizationRelationship_4005) {
			types.add(EERmodelElementTypes.Generalization_2011);
		} else if (relationshipType == EERmodelElementTypes.SpecializationRelationship_4007) {
			types.add(EERmodelElementTypes.Generalization_2011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(EERmodelElementTypes.AggregationParticipant_4002);
		types.add(EERmodelElementTypes.AggregationParticipant_4006);
		types.add(EERmodelElementTypes.Participant_4001);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == EERmodelElementTypes.AggregationParticipant_4002) {
			types.add(EERmodelElementTypes.CompositeComponent_2013);
			types.add(EERmodelElementTypes.MemberCollection_2014);
		} else if (relationshipType == EERmodelElementTypes.AggregationParticipant_4006) {
			types.add(EERmodelElementTypes.CompositeComponent_2013);
			types.add(EERmodelElementTypes.MemberCollection_2014);
		} else if (relationshipType == EERmodelElementTypes.Participant_4001) {
			types.add(EERmodelElementTypes.Relationship_2007);
			types.add(EERmodelElementTypes.DependencyRelationship_2010);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == EERmodelElementTypes.CandidateKey_3005) {
				return getChildBySemanticHint(EERmodelVisualIDRegistry
						.getType(WeakEntityWeakEntityAttributesCompartmentEditPart.VISUAL_ID));
			}
			if (type == EERmodelElementTypes.SingleAttribute_3001) {
				return getChildBySemanticHint(EERmodelVisualIDRegistry
						.getType(WeakEntityWeakEntityAttributesCompartmentEditPart.VISUAL_ID));
			}
			if (type == EERmodelElementTypes.CompositeAttribute_3002) {
				return getChildBySemanticHint(EERmodelVisualIDRegistry
						.getType(WeakEntityWeakEntityAttributesCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class WeakEntityFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureWeakEntityNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureWeakEntityAttributesFigure;

		/**
		 * @generated
		 */
		public WeakEntityFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(THIS_BACK);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(2),
					getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureWeakEntityNameFigure = new WrappingLabel();
			fFigureWeakEntityNameFigure.setText("<...>");

			fFigureWeakEntityNameFigure.setBorder(new MarginBorder(getMapMode()
					.DPtoLP(10), getMapMode().DPtoLP(10), getMapMode().DPtoLP(
					10), getMapMode().DPtoLP(10)));

			this.add(fFigureWeakEntityNameFigure);

			fFigureWeakEntityAttributesFigure = new RectangleFigure();
			fFigureWeakEntityAttributesFigure.setOutline(false);
			fFigureWeakEntityAttributesFigure.setLineWidth(0);
			fFigureWeakEntityAttributesFigure.setLineStyle(Graphics.LINE_DASH);
			fFigureWeakEntityAttributesFigure
					.setBackgroundColor(FFIGUREWEAKENTITYATTRIBUTESFIGURE_BACK);

			this.add(fFigureWeakEntityAttributesFigure);
			fFigureWeakEntityAttributesFigure
					.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureWeakEntityNameFigure() {
			return fFigureWeakEntityNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureWeakEntityAttributesFigure() {
			return fFigureWeakEntityAttributesFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 240, 240, 240);

	/**
	 * @generated
	 */
	static final Color FFIGUREWEAKENTITYATTRIBUTESFIGURE_BACK = new Color(null,
			240, 240, 240);

}
