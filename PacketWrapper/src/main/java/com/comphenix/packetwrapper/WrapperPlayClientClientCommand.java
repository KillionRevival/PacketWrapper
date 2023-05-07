package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.ClientCommand;

public class WrapperPlayClientClientCommand extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.CLIENT_COMMAND;

    public WrapperPlayClientClientCommand() {
        super(TYPE);
    }

    public WrapperPlayClientClientCommand(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'action'
     *
     * @return 'action'
     */
    public ClientCommand getAction() {
        return this.handle.getClientCommands().read(0);
    }

    /**
     * Sets the value of field 'action'
     *
     * @param value New value for field 'action'
     */
    public void setAction(ClientCommand value) {
        this.handle.getClientCommands().write(0, value);
    }

}
