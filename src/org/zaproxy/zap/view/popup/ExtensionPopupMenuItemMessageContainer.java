/*
 * Zed Attack Proxy (ZAP) and its related class files.
 * 
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 * 
 * Copyright 2014 The ZAP Development Team
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.zap.view.popup;

import java.awt.Component;

import org.parosproxy.paros.extension.ExtensionPopupMenuItem;
import org.zaproxy.zap.view.messagecontainer.MessageContainer;

/**
 * An {@code ExtensionPopupMenuItem} that, by default, is enable for all the {@code MessageContainer} invokers and not enable
 * for any {@code Component}.
 * 
 * @since 2.3.0
 */
public class ExtensionPopupMenuItemMessageContainer extends ExtensionPopupMenuItem {

    private static final long serialVersionUID = 5123729066062943072L;

    public ExtensionPopupMenuItemMessageContainer() {
        super();
    }

    public ExtensionPopupMenuItemMessageContainer(String text) {
        super(text);
    }

    /**
     * By default, the pop up menu item is not enable for any invoker {@code Component}.
     */
    @Override
    public boolean isEnableForComponent(Component invoker) {
        return false;
    }

    /**
     * By default, the pop up menu item button is enabled and it is enable for all invokers.
     */
    @Override
    public boolean isEnableForMessageContainer(MessageContainer<?> invoker) {
        return true;
    }

}
