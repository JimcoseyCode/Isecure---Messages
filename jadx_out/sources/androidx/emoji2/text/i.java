package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f.j f17127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f17128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f.e f17129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f17130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f17131e;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f17132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f.j f17133b;

        b(r rVar, f.j jVar) {
            this.f17132a = rVar;
            this.f17133b = jVar;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean a(CharSequence charSequence, int i10, int i11, p pVar) {
            if (pVar.k()) {
                return true;
            }
            if (this.f17132a == null) {
                this.f17132a = new r(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f17132a.setSpan(this.f17133b.a(pVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.i.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r getResult() {
            return this.f17132a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface c {
        boolean a(CharSequence charSequence, int i10, int i11, p pVar);

        Object getResult();
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17135a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final n.a f17136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n.a f17137c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private n.a f17138d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f17139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f17140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f17141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f17142h;

        e(n.a aVar, boolean z10, int[] iArr) {
            this.f17136b = aVar;
            this.f17137c = aVar;
            this.f17141g = z10;
            this.f17142h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f17135a = 1;
            this.f17137c = this.f17136b;
            this.f17140f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f17137c.b().j() || d(this.f17139e)) {
                return true;
            }
            if (this.f17141g) {
                if (this.f17142h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f17142h, this.f17137c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            n.a aVarA = this.f17137c.a(i10);
            int iG = 2;
            if (this.f17135a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f17135a = 2;
                    this.f17137c = aVarA;
                    this.f17140f = 1;
                }
            } else if (aVarA != null) {
                this.f17137c = aVarA;
                this.f17140f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f17137c.b() != null) {
                    iG = 3;
                    if (this.f17140f != 1 || h()) {
                        this.f17138d = this.f17137c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f17139e = i10;
            return iG;
        }

        p b() {
            return this.f17137c.b();
        }

        p c() {
            return this.f17138d.b();
        }

        boolean e() {
            if (this.f17135a != 2 || this.f17137c.b() == null) {
                return false;
            }
            return this.f17140f > 1 || h();
        }
    }

    i(n nVar, f.j jVar, f.e eVar, boolean z10, int[] iArr, Set set) {
        this.f17127a = jVar;
        this.f17128b = nVar;
        this.f17129c = eVar;
        this.f17130d = z10;
        this.f17131e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        j[] jVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (jVarArr = (j[]) editable.getSpans(selectionStart, selectionEnd, j.class)) != null && jVarArr.length > 0) {
            for (j jVar : jVarArr) {
                int spanStart = editable.getSpanStart(jVar);
                int spanEnd = editable.getSpanEnd(jVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            j[] jVarArr = (j[]) editable.getSpans(iMax, iMin, j.class);
            if (jVarArr != null && jVarArr.length > 0) {
                for (j jVar : jVarArr) {
                    int spanStart = editable.getSpanStart(jVar);
                    int spanEnd = editable.getSpanEnd(jVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i10, int i11, p pVar) {
        if (pVar.d() == 0) {
            pVar.m(this.f17129c.a(charSequence, i10, i11, pVar.h()));
        }
        return pVar.d() == 2;
    }

    private static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private Object i(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c cVar) {
        int iCharCount;
        e eVar = new e(this.f17128b.f(), this.f17130d, this.f17131e);
        int i13 = 0;
        boolean zA = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (i10 < i11 && i13 < i12 && zA) {
                int iA = eVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA == 3) {
                    if (z10 || !d(charSequence, iCharCount, i10, eVar.c())) {
                        zA = cVar.a(charSequence, iCharCount, i10, eVar.c());
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (eVar.e() && i13 < i12 && zA && (z10 || !d(charSequence, iCharCount, i10, eVar.b()))) {
            cVar.a(charSequence, iCharCount, i10, eVar.b());
        }
        return cVar.getResult();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:35:0x0069, B:44:0x0085, B:19:0x0031), top: B:66:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    CharSequence h(CharSequence charSequence, int i10, int i11, int i12, boolean z10) throws Throwable {
        r rVar;
        CharSequence charSequence2;
        Throwable th;
        int i13;
        int i14;
        o oVar;
        j[] jVarArr;
        boolean z11 = charSequence instanceof o;
        if (z11) {
            ((o) charSequence).a();
        }
        if (z11) {
            rVar = new r((Spannable) charSequence);
            if (rVar != null) {
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14) {
            }
            return charSequence2;
        }
        try {
            if (!(charSequence instanceof Spannable)) {
                rVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, j.class) > i11) ? null : new r(charSequence);
                if (rVar != null) {
                    while (i < r5) {
                    }
                }
                i13 = i10;
                i14 = i11;
                if (i13 == i14) {
                    charSequence2 = charSequence;
                    if (z11) {
                    }
                }
                return charSequence2;
            }
            try {
                rVar = new r((Spannable) charSequence);
                if (rVar != null && (jVarArr = (j[]) rVar.getSpans(i10, i11, j.class)) != null && jVarArr.length > 0) {
                    for (j jVar : jVarArr) {
                        int spanStart = rVar.getSpanStart(jVar);
                        int spanEnd = rVar.getSpanEnd(jVar);
                        if (spanStart != i11) {
                            rVar.removeSpan(jVar);
                        }
                        i10 = Math.min(spanStart, i10);
                        i11 = Math.max(spanEnd, i11);
                    }
                }
                i13 = i10;
                i14 = i11;
                if (i13 == i14 || i13 >= charSequence.length()) {
                    charSequence2 = charSequence;
                    if (z11) {
                        return charSequence2;
                    }
                    oVar = (o) charSequence2;
                } else {
                    if (i12 != Integer.MAX_VALUE && rVar != null) {
                        i12 -= ((j[]) rVar.getSpans(0, rVar.length(), j.class)).length;
                    }
                    charSequence2 = charSequence;
                    try {
                        r rVar2 = (r) i(charSequence2, i13, i14, i12, z10, new b(rVar, this.f17127a));
                        if (rVar2 == null) {
                            if (z11) {
                                oVar = (o) charSequence2;
                            }
                            return charSequence2;
                        }
                        Spannable spannableB = rVar2.b();
                        if (z11) {
                            ((o) charSequence2).d();
                        }
                        return spannableB;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!z11) {
                        }
                    }
                }
                oVar.d();
                return charSequence2;
            } catch (Throwable th3) {
                th = th3;
                charSequence2 = charSequence;
                th = th;
                if (!z11) {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z11) {
            throw th;
        }
        ((o) charSequence2).d();
        throw th;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17134a;

        d(String str) {
            this.f17134a = str;
        }

        @Override // androidx.emoji2.text.i.c
        public boolean a(CharSequence charSequence, int i10, int i11, p pVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f17134a)) {
                return true;
            }
            pVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.i.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d getResult() {
            return this;
        }
    }
}
