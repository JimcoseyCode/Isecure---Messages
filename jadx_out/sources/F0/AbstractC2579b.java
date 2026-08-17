package f0;

import F.InterfaceC0515w0;
import F.v1;
import Z.AbstractC1562a;
import Z.r;
import android.util.Range;
import android.util.Rational;
import c0.AbstractC1834a;
import com.facebook.react.uimanager.events.PointerEventHelper;
import f0.AbstractC2582e;
import g0.AbstractC2635a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: f0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2579b {
    public static /* synthetic */ int a(int i10, Integer num, Integer num2) {
        int iAbs = Math.abs(num.intValue() - i10) - Math.abs(num2.intValue() - i10);
        return (int) (iAbs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(iAbs));
    }

    public static AbstractC2635a b(AbstractC2582e abstractC2582e, v1 v1Var, AbstractC1834a abstractC1834a, AbstractC1562a abstractC1562a) {
        InterfaceC0515w0.a aVarD = abstractC2582e.d();
        return (AbstractC2635a) (aVarD != null ? new C2580c(abstractC2582e.a(), abstractC2582e.b(), v1Var, abstractC1562a, abstractC1834a, aVarD) : new C2581d(abstractC2582e.a(), abstractC2582e.b(), v1Var, abstractC1562a, abstractC1834a)).get();
    }

    public static AbstractC2582e c(r rVar, b0.i iVar) {
        InterfaceC0515w0.a aVarJ;
        String strE = r.e(rVar.c());
        int iF = r.f(rVar.c());
        if (iVar == null || iVar.j() == null) {
            aVarJ = null;
        } else {
            aVarJ = iVar.j();
            String strE2 = aVarJ.e();
            int iF2 = aVarJ.f();
            if (Objects.equals(strE2, "audio/none")) {
                AbstractC3583h0.a("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + strE + "(profile: " + iF + ")]");
            } else if (rVar.c() == -1) {
                AbstractC3583h0.a("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + strE2 + "(profile: " + iF2 + ")]");
                strE = strE2;
                iF = iF2;
            } else if (Objects.equals(strE, strE2) && iF == iF2) {
                AbstractC3583h0.a("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + strE2 + "(profile: " + iF + ")]");
                strE = strE2;
            } else {
                AbstractC3583h0.a("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + strE2 + "(profile: " + iF2 + "), chosen mime type: " + strE + "(profile: " + iF + ")]");
            }
            aVarJ = null;
        }
        AbstractC2582e.a aVar = (AbstractC2582e.a) AbstractC2582e.c(strE).a(iF);
        if (aVarJ != null) {
            aVar.c(aVarJ);
        }
        return aVar.b();
    }

    public static AbstractC1834a d(AbstractC2582e abstractC2582e, AbstractC1562a abstractC1562a, Rational rational) {
        InterfaceC0515w0.a aVarD = abstractC2582e.d();
        return (AbstractC1834a) (aVarD != null ? new C2583f(abstractC1562a, aVarD, rational) : new C2584g(abstractC1562a, rational)).get();
    }

    static int e(AbstractC1562a abstractC1562a) {
        int iE = abstractC1562a.e();
        if (iE == -1) {
            AbstractC3583h0.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        AbstractC3583h0.a("AudioConfigUtil", "Using provided AUDIO source: " + iE);
        return iE;
    }

    static int f(AbstractC1562a abstractC1562a) {
        int iF = abstractC1562a.f();
        if (iF == -1) {
            AbstractC3583h0.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        AbstractC3583h0.a("AudioConfigUtil", "Using provided AUDIO source format: " + iF);
        return iF;
    }

    static C2587j g(Range range, int i10, int i11, int i12, Rational rational) {
        int i13;
        int iC;
        if (rational == null) {
            i13 = i(range, i11, i12, i10);
            iC = i13;
        } else {
            Range rangeCreate = AbstractC1562a.f13325b;
            if (!range.equals(rangeCreate)) {
                rangeCreate = Range.create(Integer.valueOf(AbstractC2588k.b(((Integer) range.getLower()).intValue(), rational)), Integer.valueOf(AbstractC2588k.b(((Integer) range.getUpper()).intValue(), rational)));
            }
            i13 = i(rangeCreate, i11, i12, AbstractC2588k.b(i10, rational));
            iC = AbstractC2588k.c(i13, rational);
        }
        AbstractC3583h0.a("AudioConfigUtil", String.format(Locale.ENGLISH, "Resolved capture/encode sample rate %dHz/%dHz, [target sample rate range: %s, target sample rate: %d, channel count: %d, source format: %d, capture to encode sample rate ratio: %s]", Integer.valueOf(i13), Integer.valueOf(iC), range, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), rational));
        return new C2587j(i13, iC);
    }

    static int h(int i10, int i11, int i12, int i13, int i14, Range range) {
        int iDoubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue());
        String str = AbstractC3583h0.f("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(iDoubleValue)) : PointerEventHelper.POINTER_TYPE_UNKNOWN;
        if (!AbstractC1562a.f13324a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (AbstractC3583h0.f("AudioConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        AbstractC3583h0.a("AudioConfigUtil", str);
        return iDoubleValue;
    }

    static int i(Range range, int i10, int i11, final int i12) {
        ArrayList arrayList = null;
        int i13 = 0;
        int iIntValue = i12;
        while (true) {
            if (!range.contains(Integer.valueOf(iIntValue))) {
                AbstractC3583h0.a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not in target range " + range);
            } else {
                if (c0.n.o(iIntValue, i10, i11)) {
                    return iIntValue;
                }
                AbstractC3583h0.a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not supported by audio source with channel count " + i10 + " and source format " + i11);
            }
            if (arrayList == null) {
                AbstractC3583h0.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i12 + "Hz");
                arrayList = new ArrayList(AbstractC1834a.f18700a);
                Collections.sort(arrayList, new Comparator() { // from class: f0.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return AbstractC2579b.a(i12, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i13 >= arrayList.size()) {
                AbstractC3583h0.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            iIntValue = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }
}
