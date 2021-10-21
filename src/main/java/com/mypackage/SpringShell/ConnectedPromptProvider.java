package com.mypackage.SpringShell;

import org.jline.utils.AttributedString;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class ConnectedPromptProvider implements PromptProvider {

    private final CrmService crm;

    public ConnectedPromptProvider(CrmService crm) {
        this.crm = crm;
    }

    @Override
    public AttributedString getPrompt() {
        String msg = String.format("Spring CRM (%s)> ", this.crm.isConnected() ? "connected" : "disconnected");
        return new AttributedString(msg);
    }
}
