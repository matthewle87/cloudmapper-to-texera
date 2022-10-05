/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.web.model.jooq.generated.tables.records;


import edu.uci.ics.texera.web.model.jooq.generated.tables.WorkflowSnapshot;
import edu.uci.ics.texera.web.model.jooq.generated.tables.interfaces.IWorkflowSnapshot;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkflowSnapshotRecord extends UpdatableRecordImpl<WorkflowSnapshotRecord> implements Record3<UInteger, UInteger, byte[]>, IWorkflowSnapshot {

    private static final long serialVersionUID = 404107739;

    /**
     * Setter for <code>texera_db.workflow_snapshot.sid</code>.
     */
    @Override
    public void setSid(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>texera_db.workflow_snapshot.sid</code>.
     */
    @Override
    public UInteger getSid() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>texera_db.workflow_snapshot.wid</code>.
     */
    @Override
    public void setWid(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>texera_db.workflow_snapshot.wid</code>.
     */
    @Override
    public UInteger getWid() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>texera_db.workflow_snapshot.snapshot</code>.
     */
    @Override
    public void setSnapshot(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>texera_db.workflow_snapshot.snapshot</code>.
     */
    @Override
    public byte[] getSnapshot() {
        return (byte[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, UInteger, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<UInteger, UInteger, byte[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return WorkflowSnapshot.WORKFLOW_SNAPSHOT.SID;
    }

    @Override
    public Field<UInteger> field2() {
        return WorkflowSnapshot.WORKFLOW_SNAPSHOT.WID;
    }

    @Override
    public Field<byte[]> field3() {
        return WorkflowSnapshot.WORKFLOW_SNAPSHOT.SNAPSHOT;
    }

    @Override
    public UInteger component1() {
        return getSid();
    }

    @Override
    public UInteger component2() {
        return getWid();
    }

    @Override
    public byte[] component3() {
        return getSnapshot();
    }

    @Override
    public UInteger value1() {
        return getSid();
    }

    @Override
    public UInteger value2() {
        return getWid();
    }

    @Override
    public byte[] value3() {
        return getSnapshot();
    }

    @Override
    public WorkflowSnapshotRecord value1(UInteger value) {
        setSid(value);
        return this;
    }

    @Override
    public WorkflowSnapshotRecord value2(UInteger value) {
        setWid(value);
        return this;
    }

    @Override
    public WorkflowSnapshotRecord value3(byte... value) {
        setSnapshot(value);
        return this;
    }

    @Override
    public WorkflowSnapshotRecord values(UInteger value1, UInteger value2, byte[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IWorkflowSnapshot from) {
        setSid(from.getSid());
        setWid(from.getWid());
        setSnapshot(from.getSnapshot());
    }

    @Override
    public <E extends IWorkflowSnapshot> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WorkflowSnapshotRecord
     */
    public WorkflowSnapshotRecord() {
        super(WorkflowSnapshot.WORKFLOW_SNAPSHOT);
    }

    /**
     * Create a detached, initialised WorkflowSnapshotRecord
     */
    public WorkflowSnapshotRecord(UInteger sid, UInteger wid, byte[] snapshot) {
        super(WorkflowSnapshot.WORKFLOW_SNAPSHOT);

        set(0, sid);
        set(1, wid);
        set(2, snapshot);
    }
}
