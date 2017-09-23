package org.sample.jsf.client.view.util.faces.composite.a4q;

import org.richfaces.component.UICommandButton;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UINamingContainer;
import javax.faces.context.FacesContext;
import java.io.IOException;

@FacesComponent(value = "org.sample.jsf.client.view.util.faces.composite.a4q.UICompositeButton")
public class UICompositeButton extends UICommandButton implements NamingContainer {

    /**
     * For binding the command button.
     */
    private UICommandButton commandButton;

    public UICommandButton getCommandButton() {
        return commandButton;
    }

    public void setCommandButton(UICommandButton commandButton) {
        this.commandButton = commandButton;
    }

    @Override
    public String getFamily() {
        return UINamingContainer.COMPONENT_FAMILY;
    }

    @Override
    public void encodeBegin(final FacesContext context) throws IOException {
        encodeButton(context);
        super.encodeBegin(context);
    }

    /**
     * Render the beginning of the command button to the response contained in
     * the specified FacesContext.
     * 
     * @param context
     *            the context.
     * @throws IOException
     *             exception.
     */
    private void encodeButton(final FacesContext context) throws IOException {
        getCommandButton().setActionExpression(getActionExpression());
        getCommandButton().setBypassUpdates(isBypassUpdates());
        getCommandButton().setData(getData());
        getCommandButton().setDisabled(isDisabled());
        getCommandButton().setExecute(getExecute());
        getCommandButton().setImmediate(isImmediate());
        getCommandButton().setLimitRender(isLimitRender());
        getCommandButton().setOnbeforedomupdate(getOnbeforedomupdate());
        getCommandButton().setOnbegin(getOnbegin());
        getCommandButton().setOndblclick(getOndblclick());
        getCommandButton().setOnkeydown(getOnkeydown());
        getCommandButton().setOnkeypress(getOnkeypress());
        getCommandButton().setOnkeyup(getOnkeyup());
        getCommandButton().setOnmousedown(getOnmousedown());
        getCommandButton().setOnmousemove(getOnmousemove());
        getCommandButton().setOnmouseout(getOnmouseout());
        getCommandButton().setOnmouseover(getOnmouseover());
        getCommandButton().setOnmouseup(getOnmouseup());
        getCommandButton().setRender(getRender());
        getCommandButton().setStatus(getStatus());
        getCommandButton().setTitle(getTitle());
        getCommandButton().setTransient(isTransient());
        getCommandButton().setType(getType());
        getCommandButton().setValue(getValue());
        getCommandButton().encodeChildren(context);
    }

}
