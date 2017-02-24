/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.ide.command.toolbar.commands;

import org.eclipse.che.api.core.model.machine.Machine;
import org.eclipse.che.commons.annotation.Nullable;
import org.eclipse.che.ide.api.command.CommandGoal;
import org.eclipse.che.ide.api.command.ContextualCommand;
import org.eclipse.che.ide.api.mvp.View;

import java.util.List;
import java.util.Map;

/**
 *
 */
public interface ExecuteCommandView extends View<ExecuteCommandView.ActionDelegate> {

    /** Set commands grouped by goals for displaying in the view. */
    void setCommands(Map<CommandGoal, List<ContextualCommand>> commands);

    interface ActionDelegate {

        /** Called when running a command is requested. */
        void onCommandExecute(ContextualCommand command, @Nullable Machine machine);
    }
}
