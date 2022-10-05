/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.web.model.jooq.generated.tables.pojos;


import edu.uci.ics.texera.web.model.jooq.generated.tables.interfaces.IWorkflowSnapshot;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkflowSnapshot implements IWorkflowSnapshot {

    private static final long serialVersionUID = -1406228466;

    private UInteger sid;
    private UInteger wid;
    private byte[]   snapshot;

    public WorkflowSnapshot() {}

    public WorkflowSnapshot(IWorkflowSnapshot value) {
        this.sid = value.getSid();
        this.wid = value.getWid();
        this.snapshot = value.getSnapshot();
    }

    public WorkflowSnapshot(
        UInteger sid,
        UInteger wid,
        byte[]   snapshot
    ) {
        this.sid = sid;
        this.wid = wid;
        this.snapshot = snapshot;
    }

    @Override
    public UInteger getSid() {
        return this.sid;
    }

    @Override
    public void setSid(UInteger sid) {
        this.sid = sid;
    }

    @Override
    public UInteger getWid() {
        return this.wid;
    }

    @Override
    public void setWid(UInteger wid) {
        this.wid = wid;
    }

    @Override
    public byte[] getSnapshot() {
        return this.snapshot;
    }

    @Override
    public void setSnapshot(byte... snapshot) {
        this.snapshot = snapshot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WorkflowSnapshot (");

        sb.append(sid);
        sb.append(", ").append(wid);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
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
}
