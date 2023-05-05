package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedGameProfile;

public class WrapperLoginServerSuccess extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Login.Server.SUCCESS;

    public WrapperLoginServerSuccess() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperLoginServerSuccess(PacketContainer packet) {
        super(packet, TYPE);
    }

    public WrappedGameProfile getGameProfile() {
        return this.handle.getGameProfiles().read(0);
    }

    public void setGameProfile(WrappedGameProfile value) {
        this.handle.getGameProfiles().write(0, value);
    }


}
