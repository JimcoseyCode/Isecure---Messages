package F7;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: F7.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C0523a0 implements Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function2 f2021g;

    public C0523a0(Function2 function2) {
        this.f2021g = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return AbstractC0529d0.C(this.f2021g, obj, obj2);
    }
}
