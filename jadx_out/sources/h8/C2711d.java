package h8;

import f8.o;
import f8.p;
import i7.C2750m;
import i7.C2756s;
import j7.AbstractC2800q;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: h8.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2711d implements InterfaceC2710c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f28560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f28561b;

    /* JADX INFO: renamed from: h8.d$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28562a;

        static {
            int[] iArr = new int[o.c.EnumC0278c.values().length];
            try {
                iArr[o.c.EnumC0278c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.c.EnumC0278c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.c.EnumC0278c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28562a = iArr;
        }
    }

    public C2711d(p strings, o qualifiedNames) {
        AbstractC2855l.g(strings, "strings");
        AbstractC2855l.g(qualifiedNames, "qualifiedNames");
        this.f28560a = strings;
        this.f28561b = qualifiedNames;
    }

    private final C2756s c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            o.c cVarU = this.f28561b.u(i10);
            String strU = this.f28560a.u(cVarU.y());
            o.c.EnumC0278c enumC0278cW = cVarU.w();
            AbstractC2855l.d(enumC0278cW);
            int i11 = a.f28562a[enumC0278cW.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(strU);
            } else if (i11 == 2) {
                linkedList.addFirst(strU);
            } else {
                if (i11 != 3) {
                    throw new C2750m();
                }
                linkedList2.addFirst(strU);
                z10 = true;
            }
            i10 = cVarU.x();
        }
        return new C2756s(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // h8.InterfaceC2710c
    public String a(int i10) {
        C2756s c2756sC = c(i10);
        List list = (List) c2756sC.a();
        String strO0 = AbstractC2800q.o0((List) c2756sC.b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strO0;
        }
        return AbstractC2800q.o0(list, "/", null, null, 0, null, null, 62, null) + '/' + strO0;
    }

    @Override // h8.InterfaceC2710c
    public boolean b(int i10) {
        return ((Boolean) c(i10).f()).booleanValue();
    }

    @Override // h8.InterfaceC2710c
    public String getString(int i10) {
        String strU = this.f28560a.u(i10);
        AbstractC2855l.f(strU, "getString(...)");
        return strU;
    }
}
