package h5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import h5.l;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f28435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l f28436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[][] f28437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l[] f28438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final p f28439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final p f28440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final p f28441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final p f28442h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f28443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f28444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[][] f28445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l[] f28446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p f28447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p f28448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f28449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private p f28450h;

        private boolean k(int i10, int i11) {
            return (i11 | i10) == i10;
        }

        private void l(int i10, int i11) {
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f28445c, 0, iArr, 0, i10);
            this.f28445c = iArr;
            l[] lVarArr = new l[i11];
            System.arraycopy(this.f28446d, 0, lVarArr, 0, i10);
            this.f28446d = lVarArr;
        }

        private void m() {
            this.f28444b = new l();
            this.f28445c = new int[10][];
            this.f28446d = new l[10];
        }

        public b i(int[] iArr, l lVar) {
            int i10 = this.f28443a;
            if (i10 == 0 || iArr.length == 0) {
                this.f28444b = lVar;
            }
            if (i10 >= this.f28445c.length) {
                l(i10, i10 + 10);
            }
            int[][] iArr2 = this.f28445c;
            int i11 = this.f28443a;
            iArr2[i11] = iArr;
            this.f28446d[i11] = lVar;
            this.f28443a = i11 + 1;
            return this;
        }

        public q j() {
            if (this.f28443a == 0) {
                return null;
            }
            return new q(this);
        }

        public b n(p pVar, int i10) {
            if (k(i10, 1)) {
                this.f28447e = pVar;
            }
            if (k(i10, 2)) {
                this.f28448f = pVar;
            }
            if (k(i10, 4)) {
                this.f28449g = pVar;
            }
            if (k(i10, 8)) {
                this.f28450h = pVar;
            }
            return this;
        }

        public b(q qVar) {
            int i10 = qVar.f28435a;
            this.f28443a = i10;
            this.f28444b = qVar.f28436b;
            int[][] iArr = qVar.f28437c;
            int[][] iArr2 = new int[iArr.length][];
            this.f28445c = iArr2;
            this.f28446d = new l[qVar.f28438d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(qVar.f28438d, 0, this.f28446d, 0, this.f28443a);
            this.f28447e = qVar.f28439e;
            this.f28448f = qVar.f28440f;
            this.f28449g = qVar.f28441g;
            this.f28450h = qVar.f28442h;
        }

        public b(l lVar) {
            m();
            i(StateSet.WILD_CARD, lVar);
        }

        private b(Context context, int i10) {
            int next;
            m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            q.g(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
                } catch (Throwable th) {
                    if (xml != null) {
                        try {
                            xml.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                m();
            }
        }
    }

    public static q b(Context context, TypedArray typedArray, int i10) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).j();
        }
        return null;
    }

    private int e(int[] iArr) {
        int[][] iArr2 = this.f28437c;
        for (int i10 = 0; i10 < this.f28435a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, Q4.k.f9846z3) : theme.obtainStyledAttributes(attributeSet, Q4.k.f9846z3, 0, 0);
                l lVarM = l.b(context, typedArrayObtainAttributes.getResourceId(Q4.k.f9432A3, 0), typedArrayObtainAttributes.getResourceId(Q4.k.f9440B3, 0)).m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != Q4.a.f9094B0 && attributeNameResource != Q4.a.f9096C0) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                bVar.i(StateSet.trimStateSet(iArr, i10), lVarM);
            }
        }
    }

    public static int h(int i10) {
        int i11 = i10 & 5;
        return ((i10 & 10) >> 1) | (i11 << 1);
    }

    public l c(boolean z10) {
        if (!z10 || (this.f28439e == null && this.f28440f == null && this.f28441g == null && this.f28442h == null)) {
            return this.f28436b;
        }
        l.b bVarW = this.f28436b.w();
        p pVar = this.f28439e;
        if (pVar != null) {
            bVarW.E(pVar.e());
        }
        p pVar2 = this.f28440f;
        if (pVar2 != null) {
            bVarW.J(pVar2.e());
        }
        p pVar3 = this.f28441g;
        if (pVar3 != null) {
            bVarW.v(pVar3.e());
        }
        p pVar4 = this.f28442h;
        if (pVar4 != null) {
            bVarW.z(pVar4.e());
        }
        return bVarW.m();
    }

    protected l d(int[] iArr) {
        int iE = e(iArr);
        if (iE < 0) {
            iE = e(StateSet.WILD_CARD);
        }
        if (this.f28439e == null && this.f28440f == null && this.f28441g == null && this.f28442h == null) {
            return this.f28438d[iE];
        }
        l.b bVarW = this.f28438d[iE].w();
        p pVar = this.f28439e;
        if (pVar != null) {
            bVarW.E(pVar.d(iArr));
        }
        p pVar2 = this.f28440f;
        if (pVar2 != null) {
            bVarW.J(pVar2.d(iArr));
        }
        p pVar3 = this.f28441g;
        if (pVar3 != null) {
            bVarW.v(pVar3.d(iArr));
        }
        p pVar4 = this.f28442h;
        if (pVar4 != null) {
            bVarW.z(pVar4.d(iArr));
        }
        return bVarW.m();
    }

    public boolean f() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        return this.f28435a > 1 || ((pVar = this.f28439e) != null && pVar.h()) || (((pVar2 = this.f28440f) != null && pVar2.h()) || (((pVar3 = this.f28441g) != null && pVar3.h()) || ((pVar4 = this.f28442h) != null && pVar4.h())));
    }

    public b i() {
        return new b(this);
    }

    private q(b bVar) {
        this.f28435a = bVar.f28443a;
        this.f28436b = bVar.f28444b;
        this.f28437c = bVar.f28445c;
        this.f28438d = bVar.f28446d;
        this.f28439e = bVar.f28447e;
        this.f28440f = bVar.f28448f;
        this.f28441g = bVar.f28449g;
        this.f28442h = bVar.f28450h;
    }
}
