package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.InternalStructure;
import com.comphenix.protocol.events.PacketContainer;

import java.util.List;

public class WrapperPlayServerCommands extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.COMMANDS;

    public WrapperPlayServerCommands() {
        super(TYPE);
    }

    public WrapperPlayServerCommands(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'rootIndex'
     *
     * @return 'rootIndex'
     */
    public int getRootIndex() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'rootIndex'
     *
     * @param value New value for field 'rootIndex'
     */
    public void setRootIndex(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'entries'
     *
     * @return 'entries'
     */
    public List<InternalStructure> getEntries() {
        return this.handle.getLists(InternalStructure.getConverter()).read(0); // TODO: Multiple modifier have been found for type interface java.util.List Generic type: [class net.minecraft.network.protocol.game.ClientboundCommandsPacket$Entry]
    }

    /**
     * Sets the value of field 'entries'
     *
     * @param value New value for field 'entries'
     */
    public void setEntries(List<InternalStructure> value) {
        this.handle.getLists(InternalStructure.getConverter()).write(0, value);
    }

}
