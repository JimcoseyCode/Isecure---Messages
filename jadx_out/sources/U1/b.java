package U1;

import U1.g;
import U1.k;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.progressbar.ProgressBarContainerView;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f10794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f10795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10796c = false;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10798b;

        static {
            int[] iArr = new int[j.values().length];
            f10798b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10798b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10798b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10798b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10798b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10798b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10798b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10798b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10798b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10798b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10798b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10798b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10798b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10798b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10798b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10798b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10798b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10798b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10798b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10798b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10798b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10798b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10798b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f10798b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f10797a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f10797a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f10797a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: U1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class C0112b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f10800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f10801c;

        C0112b(String str, c cVar, String str2) {
            this.f10799a = str;
            this.f10800b = cVar;
            this.f10801c = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends k.i {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10807a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f10808b;

            a(int i10, int i11) {
                this.f10807a = i10;
                this.f10808b = i11;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", PointerEventHelper.POINTER_TYPE_UNKNOWN));
        }

        private int C(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        private a D() {
            U1.c cVarC;
            a aVar;
            if (h()) {
                return null;
            }
            int i10 = this.f11336b;
            if (!f('(')) {
                return null;
            }
            A();
            int i11 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i12 = (!f('+') && f('-')) ? -1 : 1;
                    U1.c cVarC2 = U1.c.c(this.f11335a, this.f11336b, this.f11337c, false);
                    if (cVarC2 != null) {
                        this.f11336b = cVarC2.a();
                    }
                    if (f('n') || f('N')) {
                        if (cVarC2 == null) {
                            cVarC2 = new U1.c(1L, this.f11336b);
                        }
                        A();
                        boolean zF = f('+');
                        if (!zF && (zF = f('-'))) {
                            i11 = -1;
                        }
                        if (zF) {
                            A();
                            cVarC = U1.c.c(this.f11335a, this.f11336b, this.f11337c, false);
                            if (cVarC == null) {
                                this.f11336b = i10;
                                return null;
                            }
                            this.f11336b = cVarC.a();
                            int i13 = i11;
                            i11 = i12;
                            i12 = i13;
                        } else {
                            int i14 = i11;
                            i11 = i12;
                            i12 = i14;
                            cVarC = null;
                        }
                    } else {
                        cVarC = cVarC2;
                        cVarC2 = null;
                    }
                    aVar = new a(cVarC2 == null ? 0 : i11 * cVarC2.d(), cVarC != null ? i12 * cVarC.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.f11336b = i10;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String strQ = q();
            return strQ != null ? strQ : H();
        }

        private List G() {
            if (h()) {
                return null;
            }
            int i10 = this.f11336b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String strH = H();
                if (strH == null) {
                    this.f11336b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strH);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.f11336b = i10;
            return null;
        }

        private List K() {
            List list;
            List list2;
            if (h()) {
                return null;
            }
            int i10 = this.f11336b;
            if (!f('(')) {
                return null;
            }
            A();
            List listL = L();
            if (listL == null) {
                this.f11336b = i10;
                return null;
            }
            if (!f(')')) {
                this.f11336b = i10;
                return null;
            }
            Iterator it = listL.iterator();
            while (it.hasNext() && (list = ((s) it.next()).f10866a) != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext() && (list2 = ((t) it2.next()).f10871d) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((g) it3.next()) instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return listL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List L() {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        private void O(s sVar, t tVar) throws U1.a {
            g gVar;
            g hVar;
            g gVar2;
            String strH = H();
            if (strH == null) {
                throw new U1.a("Invalid pseudo class");
            }
            j jVarH = j.h(strH);
            a aVar = null;
            switch (a.f10798b[jVarH.ordinal()]) {
                case 1:
                    g hVar2 = new h(0, 1, true, false, null);
                    sVar.b();
                    gVar2 = hVar2;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 2:
                    g hVar3 = new h(0, 1, false, false, null);
                    sVar.b();
                    gVar = hVar3;
                    tVar.b(gVar);
                    return;
                case 3:
                    g mVar = new m(false, null);
                    sVar.b();
                    gVar = mVar;
                    tVar.b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.f10869b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 5:
                    g hVar4 = new h(0, 1, false, true, tVar.f10869b);
                    sVar.b();
                    gVar = hVar4;
                    tVar.b(gVar);
                    return;
                case 6:
                    g mVar2 = new m(true, tVar.f10869b);
                    sVar.b();
                    gVar = mVar2;
                    tVar.b(gVar);
                    return;
                case 7:
                    g nVar = new n(aVar);
                    sVar.b();
                    gVar = nVar;
                    tVar.b(gVar);
                    return;
                case 8:
                    g iVar = new i(aVar);
                    sVar.b();
                    gVar = iVar;
                    tVar.b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z10 = jVarH == j.nth_child || jVarH == j.nth_of_type;
                    boolean z11 = jVarH == j.nth_of_type || jVarH == j.nth_last_of_type;
                    a aVarD = D();
                    if (aVarD == null) {
                        throw new U1.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    hVar = new h(aVarD.f10807a, aVarD.f10808b, z10, z11, tVar.f10869b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    List listK = K();
                    if (listK == null) {
                        throw new U1.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    k kVar = new k(listK);
                    sVar.f10867b = kVar.b();
                    gVar2 = kVar;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    g oVar = new o(aVar);
                    sVar.b();
                    gVar = oVar;
                    tVar.b(gVar);
                    return;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    G();
                    g lVar = new l(strH);
                    sVar.b();
                    gVar = lVar;
                    tVar.b(gVar);
                    return;
                case 16:
                case 17:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                    g lVar2 = new l(strH);
                    sVar.b();
                    gVar = lVar2;
                    tVar.b(gVar);
                    return;
                default:
                    throw new U1.a("Unsupported pseudo class: " + strH);
            }
        }

        private int P() {
            int i10;
            if (h()) {
                return this.f11336b;
            }
            int i11 = this.f11336b;
            int iCharAt = this.f11335a.charAt(i11);
            if (iCharAt == 45) {
                iCharAt = a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i10 = i11;
            } else {
                int iA = a();
                while (true) {
                    if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                        break;
                    }
                    iA = a();
                }
                i10 = this.f11336b;
            }
            this.f11336b = i11;
            return i10;
        }

        String F() {
            int iC;
            if (h()) {
                return null;
            }
            char cCharAt = this.f11335a.charAt(this.f11336b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            this.f11336b++;
            int iIntValue = l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = l().intValue();
                        } else {
                            int iC2 = C(iIntValue);
                            if (iC2 != -1) {
                                for (int i10 = 1; i10 <= 5 && (iC = C((iIntValue = l().intValue()))) != -1; i10++) {
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb.append((char) iC2);
                            }
                        }
                    }
                }
                sb.append((char) iIntValue);
                iIntValue = l().intValue();
            }
            return sb.toString();
        }

        String H() {
            int iP = P();
            int i10 = this.f11336b;
            if (iP == i10) {
                return null;
            }
            String strSubstring = this.f11335a.substring(i10, iP);
            this.f11336b = iP;
            return strSubstring;
        }

        String I() {
            char cCharAt;
            int iC;
            StringBuilder sb = new StringBuilder();
            while (!h() && (cCharAt = this.f11335a.charAt(this.f11336b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f11336b++;
                if (cCharAt == '\\') {
                    if (!h()) {
                        String str = this.f11335a;
                        int i10 = this.f11336b;
                        this.f11336b = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iC2 = C(cCharAt);
                            if (iC2 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (iC = C(this.f11335a.charAt(this.f11336b))) != -1; i11++) {
                                    this.f11336b++;
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb.append((char) iC2);
                            }
                        }
                    }
                }
                sb.append(cCharAt);
            }
            if (sb.length() == 0) {
                return null;
            }
            return sb.toString();
        }

        String J() {
            if (h()) {
                return null;
            }
            int i10 = this.f11336b;
            int iCharAt = this.f11335a.charAt(i10);
            int i11 = i10;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !j(iCharAt)) {
                if (!k(iCharAt)) {
                    i11 = this.f11336b + 1;
                }
                iCharAt = a();
            }
            if (this.f11336b > i10) {
                return this.f11335a.substring(i10, i11);
            }
            this.f11336b = i10;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        boolean M(s sVar) throws U1.a {
            e eVar;
            t tVar;
            String strE;
            if (h()) {
                return false;
            }
            int i10 = this.f11336b;
            if (sVar.f()) {
                eVar = null;
            } else if (f('>')) {
                eVar = e.CHILD;
                A();
            } else if (f('+')) {
                eVar = e.FOLLOWS;
                A();
            }
            if (f('*')) {
                tVar = new t(eVar, null);
            } else {
                String strH = H();
                if (strH != null) {
                    t tVar2 = new t(eVar, strH);
                    sVar.c();
                    tVar = tVar2;
                } else {
                    tVar = null;
                }
            }
            while (!h()) {
                if (!f('.')) {
                    if (!f('#')) {
                        if (!f('[')) {
                            if (!f(':')) {
                                break;
                            }
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            O(sVar, tVar);
                        } else {
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            A();
                            String strH2 = H();
                            if (strH2 == null) {
                                throw new U1.a("Invalid attribute simpleSelectors");
                            }
                            A();
                            c cVar = f('=') ? c.EQUALS : g("~=") ? c.INCLUDES : g("|=") ? c.DASHMATCH : null;
                            if (cVar != null) {
                                A();
                                strE = E();
                                if (strE == null) {
                                    throw new U1.a("Invalid attribute simpleSelectors");
                                }
                                A();
                            } else {
                                strE = null;
                            }
                            if (!f(']')) {
                                throw new U1.a("Invalid attribute simpleSelectors");
                            }
                            if (cVar == null) {
                                cVar = c.EXISTS;
                            }
                            tVar.a(strH2, cVar, strE);
                            sVar.b();
                        }
                    } else {
                        if (tVar == null) {
                            tVar = new t(eVar, null);
                        }
                        String strH3 = H();
                        if (strH3 == null) {
                            throw new U1.a("Invalid \"#id\" simpleSelectors");
                        }
                        tVar.a("id", c.EQUALS, strH3);
                        sVar.d();
                    }
                } else {
                    if (tVar == null) {
                        tVar = new t(eVar, null);
                    }
                    String strH4 = H();
                    if (strH4 == null) {
                        throw new U1.a("Invalid \".class\" simpleSelectors");
                    }
                    tVar.a("class", c.EQUALS, strH4);
                    sVar.b();
                }
            }
            if (tVar != null) {
                sVar.a(tVar);
                return true;
            }
            this.f11336b = i10;
            return false;
        }

        String N() {
            if (h()) {
                return null;
            }
            int i10 = this.f11336b;
            if (!g("url(")) {
                return null;
            }
            A();
            String strF = F();
            if (strF == null) {
                strF = I();
            }
            if (strF == null) {
                this.f11336b = i10;
                return null;
            }
            A();
            if (h() || g(")")) {
                return strF;
            }
            this.f11336b = i10;
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface g {
        boolean a(q qVar, g.L l10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f10827c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f10828d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10829e;

        h(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f10825a = i10;
            this.f10826b = i11;
            this.f10827c = z10;
            this.f10828d = z11;
            this.f10829e = str;
        }

        @Override // U1.b.g
        public boolean a(q qVar, g.L l10) {
            int i10;
            int i11;
            String strO = (this.f10828d && this.f10829e == null) ? l10.o() : this.f10829e;
            g.J j10 = l10.f11026b;
            if (j10 != null) {
                Iterator it = j10.b().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    g.L l11 = (g.L) ((g.N) it.next());
                    if (l11 == l10) {
                        i10 = i11;
                    }
                    if (strO == null || l11.o().equals(strO)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f10827c ? i10 + 1 : i11 - i10;
            int i13 = this.f10825a;
            if (i13 == 0) {
                return i12 == this.f10826b;
            }
            int i14 = this.f10826b;
            return (i12 - i14) % i13 == 0 && (Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.f10826b) == Integer.signum(this.f10825a));
        }

        public String toString() {
            String str = this.f10827c ? PointerEventHelper.POINTER_TYPE_UNKNOWN : "last-";
            return this.f10828d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f10825a), Integer.valueOf(this.f10826b), this.f10829e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f10825a), Integer.valueOf(this.f10826b));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class i implements g {
        private i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // U1.b.g
        public boolean a(q qVar, g.L l10) {
            return !(l10 instanceof g.J) || ((g.J) l10).b().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final Map f10835F = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    f10835F.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j h(String str) {
            j jVar = (j) f10835F.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f10857a;

        k(List list) {
            this.f10857a = list;
        }

        @Override // U1.b.g
        public boolean a(q qVar, g.L l10) {
            Iterator it = this.f10857a.iterator();
            while (it.hasNext()) {
                if (b.l(qVar, (s) it.next(), l10)) {
                    return false;
                }
            }
            return true;
        }

        int b() {
            Iterator it = this.f10857a.iterator();
            int i10 = androidx.customview.widget.a.INVALID_ID;
            while (it.hasNext()) {
                int i11 = ((s) it.next()).f10867b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f10857a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10858a;

        l(String str) {
            this.f10858a = str;
        }

        @Override // U1.b.g
        public boolean a(q qVar, g.L l10) {
            return false;
        }

        public String toString() {
            return this.f10858a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10860b;

        public m(boolean z10, String str) {
            this.f10859a = z10;
            this.f10860b = str;
        }

        @Override // U1.b.g
        public boolean a(q qVar, g.L l10) {
            int i10;
            String strO = (this.f10859a && this.f10860b == null) ? l10.o() : this.f10860b;
            g.J j10 = l10.f11026b;
            if (j10 != null) {
                Iterator it = j10.b().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    g.L l11 = (g.L) ((g.N) it.next());
                    if (strO == null || l11.o().equals(strO)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f10859a ? String.format("only-of-type <%s>", this.f10860b) : String.format("only-child", new Object[0]);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class n implements g {
        private n() {
        }

        @Override // U1.b.g
        public boolean a(q qVar, g.L l10) {
            return l10.f11026b == null;
        }

        public String toString() {
            return "root";
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class o implements g {
        private o() {
        }

        @Override // U1.b.g
        public boolean a(q qVar, g.L l10) {
            return qVar != null && l10 == qVar.f10864a;
        }

        public String toString() {
            return "target";
        }

        /* synthetic */ o(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f10861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g.E f10862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        u f10863c;

        p(s sVar, g.E e10, u uVar) {
            this.f10861a = sVar;
            this.f10862b = e10;
            this.f10863c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f10861a) + " {...} (src=" + this.f10863c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g.L f10864a;

        q() {
        }

        public String toString() {
            g.L l10 = this.f10864a;
            return l10 != null ? String.format("<%s id=\"%s\">", l10.o(), this.f10864a.f11016c) : PointerEventHelper.POINTER_TYPE_UNKNOWN;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f10865a = null;

        r() {
        }

        void a(p pVar) {
            if (this.f10865a == null) {
                this.f10865a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f10865a.size(); i10++) {
                if (((p) this.f10865a.get(i10)).f10861a.f10867b > pVar.f10861a.f10867b) {
                    this.f10865a.add(i10, pVar);
                    return;
                }
            }
            this.f10865a.add(pVar);
        }

        void b(r rVar) {
            if (rVar.f10865a == null) {
                return;
            }
            if (this.f10865a == null) {
                this.f10865a = new ArrayList(rVar.f10865a.size());
            }
            Iterator it = rVar.f10865a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        List c() {
            return this.f10865a;
        }

        boolean d() {
            List list = this.f10865a;
            return list == null || list.isEmpty();
        }

        void e(u uVar) {
            List list = this.f10865a;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((p) it.next()).f10863c == uVar) {
                    it.remove();
                }
            }
        }

        int f() {
            List list = this.f10865a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f10865a == null) {
                return PointerEventHelper.POINTER_TYPE_UNKNOWN;
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f10865a.iterator();
            while (it.hasNext()) {
                sb.append(((p) it.next()).toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f10868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f10869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f10870c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List f10871d = null;

        t(e eVar, String str) {
            this.f10868a = null;
            this.f10869b = null;
            this.f10868a = eVar == null ? e.DESCENDANT : eVar;
            this.f10869b = str;
        }

        void a(String str, c cVar, String str2) {
            if (this.f10870c == null) {
                this.f10870c = new ArrayList();
            }
            this.f10870c.add(new C0112b(str, cVar, str2));
        }

        void b(g gVar) {
            if (this.f10871d == null) {
                this.f10871d = new ArrayList();
            }
            this.f10871d.add(gVar);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            e eVar = this.f10868a;
            if (eVar == e.CHILD) {
                sb.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb.append("+ ");
            }
            String str = this.f10869b;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            List<C0112b> list = this.f10870c;
            if (list != null) {
                for (C0112b c0112b : list) {
                    sb.append('[');
                    sb.append(c0112b.f10799a);
                    int i10 = a.f10797a[c0112b.f10800b.ordinal()];
                    if (i10 == 1) {
                        sb.append('=');
                        sb.append(c0112b.f10801c);
                    } else if (i10 == 2) {
                        sb.append("~=");
                        sb.append(c0112b.f10801c);
                    } else if (i10 == 3) {
                        sb.append("|=");
                        sb.append(c0112b.f10801c);
                    }
                    sb.append(']');
                }
            }
            List<g> list2 = this.f10871d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb.append(':');
                    sb.append(gVar);
                }
            }
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum u {
        Document,
        RenderOptions
    }

    b(f fVar, u uVar) {
        this.f10794a = fVar;
        this.f10795b = uVar;
    }

    private static int a(List list, int i10, g.L l10) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = list.get(i10);
        g.J j10 = l10.f11026b;
        if (obj != j10) {
            return -1;
        }
        Iterator it = j10.b().iterator();
        while (it.hasNext()) {
            if (((g.N) it.next()) == l10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    private static boolean c(List list, f fVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    private void e(r rVar, d dVar) throws U1.a {
        String strH = dVar.H();
        dVar.A();
        if (strH == null) {
            throw new U1.a("Invalid '@' rule");
        }
        if (!this.f10796c && strH.equals("media")) {
            List listH = h(dVar);
            if (!dVar.f('{')) {
                throw new U1.a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(listH, this.f10794a)) {
                this.f10796c = true;
                rVar.b(j(dVar));
                this.f10796c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new U1.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f10796c || !strH.equals("import")) {
            p("Ignoring @%s rule", strH);
            o(dVar);
        } else {
            String strN = dVar.N();
            if (strN == null) {
                strN = dVar.F();
            }
            if (strN == null) {
                throw new U1.a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new U1.a("Invalid @media rule: expected '}' at end of rule set");
            }
            U1.g.k();
        }
        dVar.A();
    }

    public static List f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String strR = dVar.r();
            if (strR != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strR);
                dVar.A();
            }
        }
        return arrayList;
    }

    private g.E g(d dVar) throws U1.a {
        g.E e10 = new g.E();
        do {
            String strH = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new U1.a("Expected ':'");
            }
            dVar.A();
            String strJ = dVar.J();
            if (strJ == null) {
                throw new U1.a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new U1.a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            U1.k.S0(e10, strH, strJ);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e10;
    }

    private static List h(d dVar) {
        String strW;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (strW = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(strW));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(r rVar, d dVar) throws U1.a {
        List listL = dVar.L();
        if (listL == null || listL.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new U1.a("Malformed rule block: expected '{'");
        }
        dVar.A();
        g.E eG = g(dVar);
        dVar.A();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), eG, this.f10795b));
        }
        return true;
    }

    private r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (U1.a e10) {
                e10.getMessage();
                return rVar;
            }
        }
        return rVar;
    }

    private static boolean k(q qVar, s sVar, int i10, List list, int i11, g.L l10) {
        t tVarE = sVar.e(i10);
        if (!n(qVar, tVarE, list, i11, l10)) {
            return false;
        }
        e eVar = tVarE.f10868a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11);
        }
        int iA = a(list, i11, l10);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (g.L) l10.f11026b.b().get(iA - 1));
    }

    static boolean l(q qVar, s sVar, g.L l10) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l10.f11026b; obj != null; obj = ((g.N) obj).f11026b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l10) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l10);
    }

    private static boolean m(q qVar, s sVar, int i10, List list, int i11) {
        t tVarE = sVar.e(i10);
        g.L l10 = (g.L) list.get(i11);
        if (!n(qVar, tVarE, list, i11, l10)) {
            return false;
        }
        e eVar = tVarE.f10868a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11 - 1);
        }
        int iA = a(list, i11, l10);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (g.L) l10.f11026b.b().get(iA - 1));
    }

    private static boolean n(q qVar, t tVar, List list, int i10, g.L l10) {
        List list2;
        String str = tVar.f10869b;
        if (str != null && !str.equals(l10.o().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0112b> list3 = tVar.f10870c;
        if (list3 != null) {
            for (C0112b c0112b : list3) {
                String str2 = c0112b.f10799a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0112b.f10801c.equals(l10.f11016c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l10.f11020g) == null || !list2.contains(c0112b.f10801c)) {
                    return false;
                }
            }
        }
        List list4 = tVar.f10871d;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).a(qVar, l10)) {
                return false;
            }
        }
        return true;
    }

    private void o(d dVar) {
        int i10 = 0;
        while (!dVar.h()) {
            int iIntValue = dVar.l().intValue();
            if (iIntValue == 59 && i10 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i10++;
            } else if (iIntValue == 125 && i10 > 0 && i10 - 1 == 0) {
                return;
            }
        }
    }

    private static void p(String str, Object... objArr) {
        String.format(str, objArr);
    }

    r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List f10866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10867b;

        private s() {
            this.f10866a = null;
            this.f10867b = 0;
        }

        void a(t tVar) {
            if (this.f10866a == null) {
                this.f10866a = new ArrayList();
            }
            this.f10866a.add(tVar);
        }

        void b() {
            this.f10867b += ProgressBarContainerView.MAX_PROGRESS;
        }

        void c() {
            this.f10867b++;
        }

        void d() {
            this.f10867b += 1000000;
        }

        t e(int i10) {
            return (t) this.f10866a.get(i10);
        }

        boolean f() {
            List list = this.f10866a;
            return list == null || list.isEmpty();
        }

        int g() {
            List list = this.f10866a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f10866a.iterator();
            while (it.hasNext()) {
                sb.append((t) it.next());
                sb.append(' ');
            }
            sb.append('[');
            sb.append(this.f10867b);
            sb.append(']');
            return sb.toString();
        }

        /* synthetic */ s(a aVar) {
            this();
        }
    }
}
