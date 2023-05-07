package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerPlayerCombatEnd extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.PLAYER_COMBAT_END;

    public WrapperPlayServerPlayerCombatEnd() {
        super(TYPE);
    }

    public WrapperPlayServerPlayerCombatEnd(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'killerId'
     *
     * @return 'killerId'
     */
    public int getKillerId() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'killerId'
     *
     * @param value New value for field 'killerId'
     */
    public void setKillerId(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'duration'
     *
     * @return 'duration'
     */
    public int getDuration() {
        return this.handle.getIntegers().read(1);
    }

    /**
     * Sets the value of field 'duration'
     *
     * @param value New value for field 'duration'
     */
    public void setDuration(int value) {
        this.handle.getIntegers().write(1, value);
    }

}
