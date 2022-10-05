/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.web.model.jooq.generated.tables.pojos;


import edu.uci.ics.texera.web.model.jooq.generated.tables.interfaces.IWorkflowExecutions;

import java.sql.Timestamp;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WorkflowExecutions implements IWorkflowExecutions {

    private static final long serialVersionUID = -1647312266;

    private UInteger  eid;
    private UInteger  vid;
    private Byte      status;
    private String    result;
    private Timestamp startingTime;
    private Timestamp lastUpdateTime;
    private Byte      bookmarked;
    private String    name;
    private UInteger  uid;
    private UInteger  sid;

    public WorkflowExecutions() {}

    public WorkflowExecutions(IWorkflowExecutions value) {
        this.eid = value.getEid();
        this.vid = value.getVid();
        this.status = value.getStatus();
        this.result = value.getResult();
        this.startingTime = value.getStartingTime();
        this.lastUpdateTime = value.getLastUpdateTime();
        this.bookmarked = value.getBookmarked();
        this.name = value.getName();
        this.uid = value.getUid();
        this.sid = value.getSid();
    }

    public WorkflowExecutions(
        UInteger  eid,
        UInteger  vid,
        Byte      status,
        String    result,
        Timestamp startingTime,
        Timestamp lastUpdateTime,
        Byte      bookmarked,
        String    name,
        UInteger  uid,
        UInteger  sid
    ) {
        this.eid = eid;
        this.vid = vid;
        this.status = status;
        this.result = result;
        this.startingTime = startingTime;
        this.lastUpdateTime = lastUpdateTime;
        this.bookmarked = bookmarked;
        this.name = name;
        this.uid = uid;
        this.sid = sid;
    }

    @Override
    public UInteger getEid() {
        return this.eid;
    }

    @Override
    public void setEid(UInteger eid) {
        this.eid = eid;
    }

    @Override
    public UInteger getVid() {
        return this.vid;
    }

    @Override
    public void setVid(UInteger vid) {
        this.vid = vid;
    }

    @Override
    public Byte getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String getResult() {
        return this.result;
    }

    @Override
    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public Timestamp getStartingTime() {
        return this.startingTime;
    }

    @Override
    public void setStartingTime(Timestamp startingTime) {
        this.startingTime = startingTime;
    }

    @Override
    public Timestamp getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    @Override
    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Override
    public Byte getBookmarked() {
        return this.bookmarked;
    }

    @Override
    public void setBookmarked(Byte bookmarked) {
        this.bookmarked = bookmarked;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public UInteger getUid() {
        return this.uid;
    }

    @Override
    public void setUid(UInteger uid) {
        this.uid = uid;
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
    public String toString() {
        StringBuilder sb = new StringBuilder("WorkflowExecutions (");

        sb.append(eid);
        sb.append(", ").append(vid);
        sb.append(", ").append(status);
        sb.append(", ").append(result);
        sb.append(", ").append(startingTime);
        sb.append(", ").append(lastUpdateTime);
        sb.append(", ").append(bookmarked);
        sb.append(", ").append(name);
        sb.append(", ").append(uid);
        sb.append(", ").append(sid);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IWorkflowExecutions from) {
        setEid(from.getEid());
        setVid(from.getVid());
        setStatus(from.getStatus());
        setResult(from.getResult());
        setStartingTime(from.getStartingTime());
        setLastUpdateTime(from.getLastUpdateTime());
        setBookmarked(from.getBookmarked());
        setName(from.getName());
        setUid(from.getUid());
        setSid(from.getSid());
    }

    @Override
    public <E extends IWorkflowExecutions> E into(E into) {
        into.from(this);
        return into;
    }
}
