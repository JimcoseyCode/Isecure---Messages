package expo.modules.kotlin.traits;

import C7.d;
import C7.o;
import android.graphics.Bitmap;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.UtilsKt;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.objects.ObjectDefinitionBuilder;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.traits.SavableTrait;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.C2735B;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class SavableTrait$Companion$create$1 implements Function1 {
    public static final SavableTrait$Companion$create$1 INSTANCE = new SavableTrait$Companion$create$1();

    @Override // kotlin.jvm.functions.Function1
    public final ObjectDefinitionData invoke(AppContext appContext) {
        AbstractC2855l.g(appContext, "appContext");
        SavableTrait.Companion companion = SavableTrait.INSTANCE;
        final WeakReference weakReferenceWeak = UtilsKt.weak(appContext);
        ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
        TypeConverterProvider converters = objectDefinitionBuilder.getConverters();
        AbstractC2855l.m(4, "T");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "T");
        d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "T");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$1 savableTrait$Companion$create$1$invoke$$inlined$createImplementation$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "T");
                    return null;
                }
            };
            AbstractC2855l.m(4, "T");
            d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "T");
            anyType = new AnyType(new LazyKType(dVarB2, false, savableTrait$Companion$create$1$invoke$$inlined$createImplementation$1), converters);
        }
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(SavableTrait.Companion.SavableBitmapOptions.class), Boolean.FALSE));
        if (anyType2 == null) {
            anyType2 = new AnyType(new LazyKType(D.b(SavableTrait.Companion.SavableBitmapOptions.class), false, new InterfaceC3487a() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(SavableTrait.Companion.SavableBitmapOptions.class);
                }
            }), converters);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        AbstractC2855l.l();
        Function1 function1 = new Function1() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$create$1$invoke$$inlined$createImplementation$3
            @Override // kotlin.jvm.functions.Function1
            public final C2735B invoke(Object[] objArr) throws IOException, Exceptions.AppContextLost {
                AbstractC2855l.g(objArr, "<destruct>");
                Object obj = objArr[0];
                Object obj2 = objArr[1];
                AppContext appContext2 = (AppContext) weakReferenceWeak.get();
                if (appContext2 == null) {
                    throw new Exceptions.AppContextLost();
                }
                File file = new File(appContext2.getCacheDirectory(), UUID.randomUUID().toString());
                file.createNewFile();
                SharedRef sharedRef = (SharedRef) obj;
                sharedRef.getAppContext();
                ((Bitmap) sharedRef.getRef()).compress(Bitmap.CompressFormat.PNG, ((SavableTrait.Companion.SavableBitmapOptions) obj2).getCompression(), new FileOutputStream(file));
                return C2735B.f28704a;
            }
        };
        objectDefinitionBuilder.getAsyncFunctions().put("saveAsync", AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("saveAsync", anyTypeArr, function1));
        return objectDefinitionBuilder.buildObject();
    }
}
