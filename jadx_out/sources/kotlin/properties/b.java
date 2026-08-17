package kotlin.properties;

import C7.k;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements d {
    private Object value;

    public b(Object obj) {
        this.value = obj;
    }

    protected void afterChange(k property, Object obj, Object obj2) {
        AbstractC2855l.g(property, "property");
    }

    protected boolean beforeChange(k property, Object obj, Object obj2) {
        AbstractC2855l.g(property, "property");
        return true;
    }

    @Override // kotlin.properties.d, kotlin.properties.c
    public Object getValue(Object obj, k property) {
        AbstractC2855l.g(property, "property");
        return this.value;
    }

    @Override // kotlin.properties.d
    public void setValue(Object obj, k property, Object obj2) {
        AbstractC2855l.g(property, "property");
        Object obj3 = this.value;
        if (beforeChange(property, obj3, obj2)) {
            this.value = obj2;
            afterChange(property, obj3, obj2);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
