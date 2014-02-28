package org.jboss.ide.eclipse.as.ui.bot.test.eap6x;

import org.jboss.ide.eclipse.as.reddeer.server.requirement.ServerReqOperator;
import org.jboss.ide.eclipse.as.reddeer.server.requirement.ServerReqState;
import org.jboss.ide.eclipse.as.reddeer.server.requirement.ServerReqType;
import org.jboss.ide.eclipse.as.reddeer.server.requirement.ServerRequirement.JBossServer;
import org.jboss.ide.eclipse.as.ui.bot.test.template.DeployJSPProjectTemplate;

@JBossServer(state=ServerReqState.RUNNING, type=ServerReqType.EAP, version="6.1", operator=ServerReqOperator.GREATER_OR_EQUAL)
public class DeployJSPProjectEAP6xServer extends DeployJSPProjectTemplate {

	@Override
	protected String getConsoleMessage() {
		return "Register web context: /" + PROJECT_NAME;
	}

}
