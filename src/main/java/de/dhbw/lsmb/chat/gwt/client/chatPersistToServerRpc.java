package de.dhbw.lsmb.chat.gwt.client;

import com.vaadin.shared.communication.ServerRpc;

public interface chatPersistToServerRpc extends ServerRpc {
    void persistToServer();
}
