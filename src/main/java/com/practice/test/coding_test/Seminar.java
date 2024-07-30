package com.practice.test.coding_test;

import java.util.Date;

class Seminar {
    private Date start, end;

    public Seminar(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}
