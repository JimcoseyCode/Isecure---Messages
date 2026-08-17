package expo.modules.kotlin.traits;

import C7.d;
import android.graphics.Bitmap;
import com.facebook.react.uimanager.events.PointerEventHelper;
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
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import i7.C2735B;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\rB\u001d\b\u0001\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/traits/SavableTrait;", "InputType", "Lexpo/modules/kotlin/traits/Trait;", "exportImpl", "Lkotlin/Function1;", "Lexpo/modules/kotlin/AppContext;", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getExportImpl", "()Lkotlin/jvm/functions/Function1;", "export", "appContext", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SavableTrait<InputType> implements Trait<InputType> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Function1 exportImpl;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\r\u001a\u00020\f\"\u0006\b\u0001\u0010\u0004\u0018\u0001\"\u0006\b\u0002\u0010\u0005\u0018\u00012\u0006\u0010\u0007\u001a\u00020\u00062 \b\u0004\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\n0\bH\u0081\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ8\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0010\b\u0001\u0010\u0011\u0018\u0001*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lexpo/modules/kotlin/traits/SavableTrait$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "InputType", "OptionType", "Lexpo/modules/kotlin/AppContext;", "appContext", "Lkotlin/Function3;", "Ljava/io/File;", "Li7/B;", "saveToFile", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "createImplementation", "(Lexpo/modules/kotlin/AppContext;Lw7/o;)Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "Lexpo/modules/kotlin/sharedobjects/SharedRef;", "Landroid/graphics/Bitmap;", "T", "LC7/d;", "klass", "Lexpo/modules/kotlin/traits/SavableTrait;", "create", "(LC7/d;)Lexpo/modules/kotlin/traits/SavableTrait;", "SavableBitmapOptions", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/traits/SavableTrait$Companion$SavableBitmapOptions;", "Lexpo/modules/kotlin/records/Record;", "compression", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(I)V", "getCompression", "()I", "component1", "copy", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "toString", PointerEventHelper.POINTER_TYPE_UNKNOWN, "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SavableBitmapOptions implements Record {
            private final int compression;

            public SavableBitmapOptions() {
                this(0, 1, null);
            }

            public static /* synthetic */ SavableBitmapOptions copy$default(SavableBitmapOptions savableBitmapOptions, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = savableBitmapOptions.compression;
                }
                return savableBitmapOptions.copy(i10);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final int getCompression() {
                return this.compression;
            }

            public final SavableBitmapOptions copy(int compression) {
                return new SavableBitmapOptions(compression);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SavableBitmapOptions) && this.compression == ((SavableBitmapOptions) other).compression;
            }

            public final int getCompression() {
                return this.compression;
            }

            public int hashCode() {
                return Integer.hashCode(this.compression);
            }

            public String toString() {
                return "SavableBitmapOptions(compression=" + this.compression + ")";
            }

            public SavableBitmapOptions(int i10) {
                this.compression = i10;
            }

            public /* synthetic */ SavableBitmapOptions(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? 100 : i10);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SavableTrait create$default(Companion companion, d klass, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                AbstractC2855l.m(4, "T");
                klass = D.b(SharedRef.class);
            }
            AbstractC2855l.g(klass, "klass");
            AbstractC2855l.l();
            return new SavableTrait(SavableTrait$Companion$create$1.INSTANCE);
        }

        public final /* synthetic */ <T extends SharedRef<Bitmap>> SavableTrait<T> create(d klass) {
            AbstractC2855l.g(klass, "klass");
            AbstractC2855l.l();
            return new SavableTrait<>(SavableTrait$Companion$create$1.INSTANCE);
        }

        public final /* synthetic */ <InputType, OptionType> ObjectDefinitionData createImplementation(AppContext appContext, final o saveToFile) {
            AbstractC2855l.g(appContext, "appContext");
            AbstractC2855l.g(saveToFile, "saveToFile");
            final WeakReference weakReferenceWeak = UtilsKt.weak(appContext);
            ObjectDefinitionBuilder objectDefinitionBuilder = new ObjectDefinitionBuilder(null, 1, null);
            TypeConverterProvider converters = objectDefinitionBuilder.getConverters();
            AbstractC2855l.m(4, "InputType");
            AbstractC2855l.m(4, "OptionType");
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            AbstractC2855l.m(4, "InputType");
            d dVarB = D.b(Object.class);
            AbstractC2855l.m(3, "InputType");
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType == null) {
                AbstractC2855l.l();
                AbstractC2855l.l();
                SavableTrait$Companion$createImplementation$$inlined$apply$lambda$1 savableTrait$Companion$createImplementation$$inlined$apply$lambda$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$$inlined$apply$lambda$1
                    @Override // w7.InterfaceC3487a
                    public final C7.o invoke() {
                        AbstractC2855l.m(6, "InputType");
                        return null;
                    }
                };
                AbstractC2855l.m(4, "InputType");
                d dVarB2 = D.b(Object.class);
                AbstractC2855l.m(3, "InputType");
                anyType = new AnyType(new LazyKType(dVarB2, false, savableTrait$Companion$createImplementation$$inlined$apply$lambda$1), converters);
            }
            AbstractC2855l.m(4, "OptionType");
            d dVarB3 = D.b(Object.class);
            AbstractC2855l.m(3, "OptionType");
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
            if (anyType2 == null) {
                AbstractC2855l.l();
                AbstractC2855l.l();
                SavableTrait$Companion$createImplementation$$inlined$apply$lambda$2 savableTrait$Companion$createImplementation$$inlined$apply$lambda$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$$inlined$apply$lambda$2
                    @Override // w7.InterfaceC3487a
                    public final C7.o invoke() {
                        AbstractC2855l.m(6, "OptionType");
                        return null;
                    }
                };
                AbstractC2855l.m(4, "OptionType");
                d dVarB4 = D.b(Object.class);
                AbstractC2855l.m(3, "OptionType");
                anyType2 = new AnyType(new LazyKType(dVarB4, false, savableTrait$Companion$createImplementation$$inlined$apply$lambda$2), converters);
            }
            AnyType[] anyTypeArr = {anyType, anyType2};
            AbstractC2855l.l();
            Function1 function1 = new Function1() { // from class: expo.modules.kotlin.traits.SavableTrait$Companion$createImplementation$lambda$1$$inlined$AsyncFunction$3
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
                    saveToFile.invoke(file, obj, obj2);
                    return C2735B.f28704a;
                }
            };
            objectDefinitionBuilder.getAsyncFunctions().put("saveAsync", AbstractC2855l.b(C2735B.class, Integer.TYPE) ? new IntAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Double.TYPE) ? new DoubleAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, Float.TYPE) ? new FloatAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : AbstractC2855l.b(C2735B.class, String.class) ? new StringAsyncFunctionComponent("saveAsync", anyTypeArr, function1) : new UntypedAsyncFunctionComponent("saveAsync", anyTypeArr, function1));
            return objectDefinitionBuilder.buildObject();
        }

        private Companion() {
        }
    }

    public SavableTrait(Function1 exportImpl) {
        AbstractC2855l.g(exportImpl, "exportImpl");
        this.exportImpl = exportImpl;
    }

    @Override // expo.modules.kotlin.traits.Trait
    public ObjectDefinitionData export(AppContext appContext) {
        AbstractC2855l.g(appContext, "appContext");
        return (ObjectDefinitionData) this.exportImpl.invoke(appContext);
    }

    public final Function1 getExportImpl() {
        return this.exportImpl;
    }
}
