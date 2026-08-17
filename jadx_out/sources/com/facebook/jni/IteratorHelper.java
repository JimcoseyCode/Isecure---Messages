package com.facebook.jni;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class IteratorHelper {
    private Object mElement;
    private final Iterator mIterator;

    public IteratorHelper(Iterator it) {
        this.mIterator = it;
    }

    boolean hasNext() {
        if (this.mIterator.hasNext()) {
            this.mElement = this.mIterator.next();
            return true;
        }
        this.mElement = null;
        return false;
    }

    public IteratorHelper(Iterable iterable) {
        this.mIterator = iterable.iterator();
    }
}
