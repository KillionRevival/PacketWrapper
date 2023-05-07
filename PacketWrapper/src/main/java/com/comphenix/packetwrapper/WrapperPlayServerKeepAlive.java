package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerKeepAlive extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.KEEP_ALIVE;

    public WrapperPlayServerKeepAlive() {
        super(TYPE);
    }

    public WrapperPlayServerKeepAlive(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'id'
     *
     * @return 'id'
     */
    public long getId() {
        return this.handle.getLongs().read(0);
    }

    /**
     * Sets the value of field 'id'
     *
     * @param value New value for field 'id'
     */
    public void setId(long value) {
        this.handle.getLongs().write(0, value);
    }

}
