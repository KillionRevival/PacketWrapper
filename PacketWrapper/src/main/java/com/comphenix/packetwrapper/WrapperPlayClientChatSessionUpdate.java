package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedRemoteChatSessionData;

public class WrapperPlayClientChatSessionUpdate extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.CHAT_SESSION_UPDATE;

    public WrapperPlayClientChatSessionUpdate() {
        super(TYPE);
    }

    public WrapperPlayClientChatSessionUpdate(PacketContainer packet) {
        super(packet, TYPE);
    }

    public WrappedRemoteChatSessionData getChatSession() {
        return this.handle.getRemoteChatSessionData().read(0);
    }

    public void setChatSession(WrappedRemoteChatSessionData value) {
        this.handle.getRemoteChatSessionData().write(0, value);
    }


}
