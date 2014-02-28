package org.jboss.ide.eclipse.as.ui.bot.test.as50;

import org.jboss.ide.eclipse.as.reddeer.server.requirement.ServerReqState;
import org.jboss.ide.eclipse.as.reddeer.server.requirement.ServerReqType;
import org.jboss.ide.eclipse.as.reddeer.server.requirement.ServerRequirement.JBossServer;
import org.jboss.ide.eclipse.as.ui.bot.test.template.DeployJSPProjectTemplate;

/**
 * @see DeployJSPProjectTemplate
 * @author Lucia Jelinkova
 *
 */
@JBossServer(state=ServerReqState.RUNNING, type=ServerReqType.AS, version="5.0")
public class DeployJSPProjectAS50Server extends DeployJSPProjectTemplate {

	@Override
	protected String getConsoleMessage() {
		return "deploy, ctxPath=/" + PROJECT_NAME;
	}
}
