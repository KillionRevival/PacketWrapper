package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;

public class WrapperPlayServerSpawnPosition extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SPAWN_POSITION;

    public WrapperPlayServerSpawnPosition() {
        super(TYPE);
    }

    public WrapperPlayServerSpawnPosition(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'pos'
     *
     * @return 'pos'
     */
    public BlockPosition getPos() {
        return this.handle.getBlockPositionModifier().read(0);
    }

    /**
     * Sets the value of field 'pos'
     *
     * @param value New value for field 'pos'
     */
    public void setPos(BlockPosition value) {
        this.handle.getBlockPositionModifier().write(0, value);
    }

    /**
     * Retrieves the value of field 'angle'
     *
     * @return 'angle'
     */
    public float getAngle() {
        return this.handle.getFloat().read(0);
    }

    /**
     * Sets the value of field 'angle'
     *
     * @param value New value for field 'angle'
     */
    public void setAngle(float value) {
        this.handle.getFloat().write(0, value);
    }

}
