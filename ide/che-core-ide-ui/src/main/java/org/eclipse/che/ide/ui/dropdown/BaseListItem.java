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
package org.eclipse.che.ide.ui.dropdown;

/**
 * Base implementation of {@link DropDownListItem} which represents some value in a {@link DropDownList}.
 *
 * @param <T>
 *         type of the value that this item represents
 */
public class BaseListItem<T> implements DropDownListItem {

    private final T value;

    /**
     * Creates a new item that represents the given {@code value}.
     *
     * @param value
     *         value to represent in a {@link DropDownList}.
     */
    public BaseListItem(T value) {
        this.value = value;
    }

    /**
     * Returns the represented value.
     *
     * @return value this item represents
     */
    public T getValue() {
        return value;
    }
}
