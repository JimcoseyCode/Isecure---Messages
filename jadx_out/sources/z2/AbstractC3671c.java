package z2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.RunnableC1960b;
import com.facebook.drawee.drawable.q;
import j3.C2768b;
import r2.AbstractC3251a;

/* JADX INFO: renamed from: z2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3671c {
    public static Drawable a(Context context, TypedArray typedArray, int i10) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    private static e b(C3670b c3670b) {
        if (c3670b.s() == null) {
            c3670b.J(new e());
        }
        return c3670b.s();
    }

    public static q c(TypedArray typedArray, int i10) {
        switch (typedArray.getInt(i10, -2)) {
            case -1:
                return null;
            case 0:
                return q.f19807a;
            case 1:
                return q.f19810d;
            case 2:
                return q.f19811e;
            case 3:
                return q.f19812f;
            case 4:
                return q.f19813g;
            case 5:
                return q.f19814h;
            case 6:
                return q.f19815i;
            case 7:
                return q.f19816j;
            case 8:
                return q.f19817k;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static C3670b d(Context context, AttributeSet attributeSet) throws Throwable {
        if (C2768b.d()) {
            C2768b.a("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        C3670b c3670bE = e(new C3670b(context.getResources()), context, attributeSet);
        if (C2768b.d()) {
            C2768b.b();
        }
        return c3670bE;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01c6 A[PHI: r1 r2 r3
      0x01c6: PHI (r1v18 boolean) = (r1v14 boolean), (r1v20 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r2v13 boolean) = (r2v10 boolean), (r2v15 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3670b e(C3670b c3670b, Context context, AttributeSet attributeSet) throws Throwable {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC3251a.f31872a);
            try {
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                int integer = 0;
                int i12 = 0;
                boolean z15 = true;
                boolean z16 = true;
                boolean z17 = true;
                boolean z18 = true;
                boolean z19 = true;
                boolean z20 = true;
                boolean z21 = true;
                boolean z22 = true;
                int dimensionPixelSize = 0;
                while (i12 < indexCount) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i12);
                        if (index == AbstractC3251a.f31873b) {
                            c3670b.v(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31879h) {
                            c3670b.C(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31881j) {
                            c3670b.E(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31883l) {
                            c3670b.F(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31875d) {
                            c3670b.y(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == AbstractC3251a.f31870D) {
                            c3670b.x(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                        } else if (index == AbstractC3251a.f31880i) {
                            c3670b.D(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31885n) {
                            c3670b.H(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31886o) {
                            c3670b.I(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31876e) {
                            c3670b.z(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31877f) {
                            c3670b.A(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31884m) {
                            c3670b.G(c(typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31882k) {
                            integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                        } else if (index == AbstractC3251a.f31874c) {
                            c3670b.w(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31878g) {
                            c3670b.B(a(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == AbstractC3251a.f31887p) {
                            b(c3670b).t(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        } else if (index == AbstractC3251a.f31897z) {
                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                        } else {
                            int i13 = dimensionPixelSize;
                            if (index == AbstractC3251a.f31893v) {
                                z15 = typedArrayObtainStyledAttributes.getBoolean(index, z15);
                            } else if (index == AbstractC3251a.f31894w) {
                                z17 = typedArrayObtainStyledAttributes.getBoolean(index, z17);
                            } else if (index == AbstractC3251a.f31889r) {
                                z21 = typedArrayObtainStyledAttributes.getBoolean(index, z21);
                            } else if (index == AbstractC3251a.f31890s) {
                                z19 = typedArrayObtainStyledAttributes.getBoolean(index, z19);
                            } else if (index == AbstractC3251a.f31895x) {
                                z16 = typedArrayObtainStyledAttributes.getBoolean(index, z16);
                            } else if (index == AbstractC3251a.f31892u) {
                                z18 = typedArrayObtainStyledAttributes.getBoolean(index, z18);
                            } else if (index == AbstractC3251a.f31891t) {
                                z22 = typedArrayObtainStyledAttributes.getBoolean(index, z22);
                            } else if (index == AbstractC3251a.f31888q) {
                                z20 = typedArrayObtainStyledAttributes.getBoolean(index, z20);
                            } else if (index == AbstractC3251a.f31896y) {
                                dimensionPixelSize = i13;
                                b(c3670b).q(typedArrayObtainStyledAttributes.getColor(index, 0));
                            } else {
                                dimensionPixelSize = i13;
                                if (index == AbstractC3251a.f31869C) {
                                    b(c3670b).n(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                } else if (index == AbstractC3251a.f31867A) {
                                    b(c3670b).m(typedArrayObtainStyledAttributes.getColor(index, 0));
                                } else {
                                    if (index == AbstractC3251a.f31868B) {
                                        b(c3670b).r(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    }
                                    i12++;
                                    context2 = context;
                                }
                            }
                            dimensionPixelSize = i13;
                        }
                        i12++;
                        context2 = context;
                    } catch (Throwable th) {
                        th = th;
                        typedArrayObtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                boolean z23 = false;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z14 = z15 && z18;
                    z10 = z17 && z16;
                    z11 = z19 && z22;
                    if (z21 && z20) {
                        z23 = true;
                    }
                    z13 = z23;
                    i10 = integer;
                    z12 = z14;
                    i11 = dimensionPixelSize;
                } else {
                    z14 = z15 && z16;
                    z10 = z17 && z18;
                    z11 = z19 && z20;
                    if (z21 && z22) {
                    }
                    z13 = z23;
                    i10 = integer;
                    z12 = z14;
                    i11 = dimensionPixelSize;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            z10 = true;
            i10 = 0;
            z11 = true;
            z12 = true;
            z13 = true;
            i11 = 0;
        }
        if (c3670b.n() != null && i10 > 0) {
            c3670b.F(new RunnableC1960b(c3670b.n(), i10));
        }
        if (i11 > 0) {
            b(c3670b).o(z12 ? i11 : 0.0f, z10 ? i11 : 0.0f, z11 ? i11 : 0.0f, z13 ? i11 : 0.0f);
        }
        return c3670b;
    }
}
