/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.web.model.jooq.generated.tables.records;


import edu.uci.ics.texera.web.model.jooq.generated.enums.ClusterStatus;
import edu.uci.ics.texera.web.model.jooq.generated.tables.Cluster;
import edu.uci.ics.texera.web.model.jooq.generated.tables.interfaces.ICluster;

import java.sql.Timestamp;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClusterRecord extends UpdatableRecordImpl<ClusterRecord> implements Record7<Integer, String, UInteger, String, Integer, Timestamp, ClusterStatus>, ICluster {

    private static final long serialVersionUID = 2126947239;

    /**
     * Setter for <code>texera_db.cluster.cid</code>.
     */
    @Override
    public void setCid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>texera_db.cluster.cid</code>.
     */
    @Override
    public Integer getCid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>texera_db.cluster.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>texera_db.cluster.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>texera_db.cluster.owner_id</code>.
     */
    @Override
    public void setOwnerId(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>texera_db.cluster.owner_id</code>.
     */
    @Override
    public UInteger getOwnerId() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>texera_db.cluster.machine_type</code>.
     */
    @Override
    public void setMachineType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>texera_db.cluster.machine_type</code>.
     */
    @Override
    public String getMachineType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>texera_db.cluster.number_of_machines</code>.
     */
    @Override
    public void setNumberOfMachines(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>texera_db.cluster.number_of_machines</code>.
     */
    @Override
    public Integer getNumberOfMachines() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>texera_db.cluster.creation_time</code>.
     */
    @Override
    public void setCreationTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>texera_db.cluster.creation_time</code>.
     */
    @Override
    public Timestamp getCreationTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>texera_db.cluster.status</code>.
     */
    @Override
    public void setStatus(ClusterStatus value) {
        set(6, value);
    }

    /**
     * Getter for <code>texera_db.cluster.status</code>.
     */
    @Override
    public ClusterStatus getStatus() {
        return (ClusterStatus) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, UInteger, String, Integer, Timestamp, ClusterStatus> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, UInteger, String, Integer, Timestamp, ClusterStatus> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Cluster.CLUSTER.CID;
    }

    @Override
    public Field<String> field2() {
        return Cluster.CLUSTER.NAME;
    }

    @Override
    public Field<UInteger> field3() {
        return Cluster.CLUSTER.OWNER_ID;
    }

    @Override
    public Field<String> field4() {
        return Cluster.CLUSTER.MACHINE_TYPE;
    }

    @Override
    public Field<Integer> field5() {
        return Cluster.CLUSTER.NUMBER_OF_MACHINES;
    }

    @Override
    public Field<Timestamp> field6() {
        return Cluster.CLUSTER.CREATION_TIME;
    }

    @Override
    public Field<ClusterStatus> field7() {
        return Cluster.CLUSTER.STATUS;
    }

    @Override
    public Integer component1() {
        return getCid();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public UInteger component3() {
        return getOwnerId();
    }

    @Override
    public String component4() {
        return getMachineType();
    }

    @Override
    public Integer component5() {
        return getNumberOfMachines();
    }

    @Override
    public Timestamp component6() {
        return getCreationTime();
    }

    @Override
    public ClusterStatus component7() {
        return getStatus();
    }

    @Override
    public Integer value1() {
        return getCid();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public UInteger value3() {
        return getOwnerId();
    }

    @Override
    public String value4() {
        return getMachineType();
    }

    @Override
    public Integer value5() {
        return getNumberOfMachines();
    }

    @Override
    public Timestamp value6() {
        return getCreationTime();
    }

    @Override
    public ClusterStatus value7() {
        return getStatus();
    }

    @Override
    public ClusterRecord value1(Integer value) {
        setCid(value);
        return this;
    }

    @Override
    public ClusterRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ClusterRecord value3(UInteger value) {
        setOwnerId(value);
        return this;
    }

    @Override
    public ClusterRecord value4(String value) {
        setMachineType(value);
        return this;
    }

    @Override
    public ClusterRecord value5(Integer value) {
        setNumberOfMachines(value);
        return this;
    }

    @Override
    public ClusterRecord value6(Timestamp value) {
        setCreationTime(value);
        return this;
    }

    @Override
    public ClusterRecord value7(ClusterStatus value) {
        setStatus(value);
        return this;
    }

    @Override
    public ClusterRecord values(Integer value1, String value2, UInteger value3, String value4, Integer value5, Timestamp value6, ClusterStatus value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ICluster from) {
        setCid(from.getCid());
        setName(from.getName());
        setOwnerId(from.getOwnerId());
        setMachineType(from.getMachineType());
        setNumberOfMachines(from.getNumberOfMachines());
        setCreationTime(from.getCreationTime());
        setStatus(from.getStatus());
    }

    @Override
    public <E extends ICluster> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClusterRecord
     */
    public ClusterRecord() {
        super(Cluster.CLUSTER);
    }

    /**
     * Create a detached, initialised ClusterRecord
     */
    public ClusterRecord(Integer cid, String name, UInteger ownerId, String machineType, Integer numberOfMachines, Timestamp creationTime, ClusterStatus status) {
        super(Cluster.CLUSTER);

        set(0, cid);
        set(1, name);
        set(2, ownerId);
        set(3, machineType);
        set(4, numberOfMachines);
        set(5, creationTime);
        set(6, status);
    }
}
