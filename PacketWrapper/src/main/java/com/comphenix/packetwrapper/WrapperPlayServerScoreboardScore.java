package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.ScoreboardAction;

public class WrapperPlayServerScoreboardScore extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SCOREBOARD_SCORE;

    public WrapperPlayServerScoreboardScore() {
        super(TYPE);
    }

    public WrapperPlayServerScoreboardScore(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'owner'
     *
     * @return 'owner'
     */
    public String getOwner() {
        return this.handle.getStrings().read(0);
    }

    /**
     * Sets the value of field 'owner'
     *
     * @param value New value for field 'owner'
     */
    public void setOwner(String value) {
        this.handle.getStrings().write(0, value);
    }

    /**
     * Retrieves the value of field 'objectiveName'
     *
     * @return 'objectiveName'
     */
    public String getObjectiveName() {
        return this.handle.getStrings().read(1);
    }

    /**
     * Sets the value of field 'objectiveName'
     *
     * @param value New value for field 'objectiveName'
     */
    public void setObjectiveName(String value) {
        this.handle.getStrings().write(1, value);
    }

    /**
     * Retrieves the value of field 'score'
     *
     * @return 'score'
     */
    public int getScore() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'score'
     *
     * @param value New value for field 'score'
     */
    public void setScore(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'method'
     *
     * @return 'method'
     */
    public ScoreboardAction getMethod() {
        return this.handle.getScoreboardActions().read(0);
    }

    /**
     * Sets the value of field 'method'
     *
     * @param value New value for field 'method'
     */
    public void setMethod(ScoreboardAction value) {
        this.handle.getScoreboardActions().write(0, value);
    }

}
