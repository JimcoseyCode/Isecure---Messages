package expo.modules.filesystem;

import C7.d;
import C7.o;
import C7.q;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.ConstantComponentBuilder;
import expo.modules.kotlin.objects.PropertyComponentBuilder;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.services.FilePermissionService;
import expo.modules.kotlin.typedarray.TypedArray;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.notifications.service.NotificationsService;
import i7.C2735B;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0017R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/filesystem/FileSystemModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemModule extends Module {
    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.AppContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.AppContextLost();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        String str;
        Class cls2;
        Class cls3;
        Class cls4;
        String str2;
        Class cls5;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        Class cls6;
        AsyncFunctionComponent intAsyncFunctionComponent;
        AsyncFunctionComponent intAsyncFunctionComponent2;
        AsyncFunctionComponent intAsyncFunctionComponent3;
        ClassComponentBuilder classComponentBuilder;
        Class cls7;
        Class cls8;
        ClassComponentBuilder classComponentBuilder2;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("FileSystem");
            ConstantComponentBuilder constantComponentBuilder = new ConstantComponentBuilder("documentDirectory");
            constantComponentBuilder.setGetter(new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Constant$1
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return Uri.fromFile(this.this$0.getContext().getFilesDir()) + "/";
                }
            });
            moduleDefinitionBuilder2.getConstants().put("documentDirectory", constantComponentBuilder);
            ConstantComponentBuilder constantComponentBuilder2 = new ConstantComponentBuilder("cacheDirectory");
            constantComponentBuilder2.setGetter(new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Constant$2
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return Uri.fromFile(this.this$0.getContext().getCacheDir()) + "/";
                }
            });
            moduleDefinitionBuilder2.getConstants().put("cacheDirectory", constantComponentBuilder2);
            ConstantComponentBuilder constantComponentBuilder3 = new ConstantComponentBuilder("bundleDirectory");
            constantComponentBuilder3.setGetter(new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Constant$3
                @Override // w7.InterfaceC3487a
                public final String invoke() {
                    return "asset://";
                }
            });
            moduleDefinitionBuilder2.getConstants().put("bundleDirectory", constantComponentBuilder3);
            PropertyComponentBuilder propertyComponentBuilder = new PropertyComponentBuilder("totalDiskSpace");
            AnyType[] anyTypeArr = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(D.b(Long.class));
            if (returnType == null) {
                returnType = new ReturnType(D.b(Long.class));
                cls = FileSystemFileHandle.class;
                returnTypeProvider.getTypes().put(D.b(Long.class), returnType);
            } else {
                cls = FileSystemFileHandle.class;
            }
            propertyComponentBuilder.setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Long.valueOf(new File(this.this$0.getContext().getFilesDir().getPath()).getTotalSpace());
                }
            }));
            moduleDefinitionBuilder2.getProperties().put("totalDiskSpace", propertyComponentBuilder);
            PropertyComponentBuilder propertyComponentBuilder2 = new PropertyComponentBuilder("availableDiskSpace");
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnType returnType2 = returnTypeProvider.getTypes().get(D.b(Long.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(Long.class));
                returnTypeProvider.getTypes().put(D.b(Long.class), returnType2);
            }
            propertyComponentBuilder2.setGetter(new SyncFunctionComponent("get", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Long.valueOf(new File(this.this$0.getContext().getFilesDir().getPath()).getFreeSpace());
                }
            }));
            moduleDefinitionBuilder2.getProperties().put("availableDiskSpace", propertyComponentBuilder2);
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = moduleDefinitionBuilder2.AsyncFunction("downloadFileAsync");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            d dVarB = D.b(URI.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, bool));
            if (anyType == null) {
                cls2 = FileSystemDirectory.class;
                cls3 = Long.class;
                str = "get";
                anyType = new AnyType(new LazyKType(D.b(URI.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(URI.class);
                    }
                }), converters);
            } else {
                str = "get";
                cls2 = FileSystemDirectory.class;
                cls3 = Long.class;
            }
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(D.b(FileSystemPath.class), bool));
            if (anyType2 == null) {
                cls4 = String.class;
                anyType2 = new AnyType(new LazyKType(D.b(FileSystemPath.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemPath.class);
                    }
                }), converters);
            } else {
                cls4 = String.class;
            }
            d dVarB2 = D.b(DownloadOptions.class);
            Boolean bool2 = Boolean.TRUE;
            AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool2));
            if (anyType3 == null) {
                cls5 = FileSystemFile.class;
                str2 = "info";
                anyType3 = new AnyType(new LazyKType(D.b(DownloadOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(DownloadOptions.class);
                    }
                }), converters);
            } else {
                str2 = "info";
                cls5 = FileSystemFile.class;
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new FileSystemModule$definition$lambda$62$$inlined$Coroutine$4(null)));
            C c10 = new C();
            moduleDefinitionBuilder2.RegisterActivityContracts(new FileSystemModule$definition$1$7(c10, this, null));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = moduleDefinitionBuilder2.AsyncFunction("pickDirectoryAsync");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters2 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Uri.class), bool2));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(D.b(Uri.class), true, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Uri.class);
                    }
                }), converters2);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType4}, new FileSystemModule$definition$lambda$62$$inlined$Coroutine$6(null, c10)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction3 = moduleDefinitionBuilder2.AsyncFunction("pickFileAsync");
            String name3 = asyncFunctionBuilderAsyncFunction3.getName();
            TypeConverterProvider converters3 = asyncFunctionBuilderAsyncFunction3.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Uri.class), bool2));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(D.b(Uri.class), true, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Uri.class);
                    }
                }), converters3);
            }
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool2));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(D.b(cls4), true, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Coroutine$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters3);
            }
            asyncFunctionBuilderAsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(name3, new AnyType[]{anyType5, anyType6}, new FileSystemModule$definition$lambda$62$$inlined$Coroutine$9(null, c10)));
            TypeConverterProvider converters4 = moduleDefinitionBuilder2.getConverters();
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(URI.class), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(D.b(URI.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(URI.class);
                    }
                }), converters4);
            }
            AnyType[] anyTypeArr3 = {anyType7};
            ReturnType returnType3 = returnTypeProvider.getTypes().get(D.b(PathInfo.class));
            if (returnType3 == null) {
                returnType3 = new ReturnType(D.b(PathInfo.class));
                returnTypeProvider.getTypes().put(D.b(PathInfo.class), returnType3);
            }
            String str3 = str2;
            moduleDefinitionBuilder2.getSyncFunctions().put(str3, new SyncFunctionComponent(str3, anyTypeArr3, returnType3, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Function$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws Exceptions.ReactContextLost {
                    AbstractC2855l.g(objArr, "<destruct>");
                    File file = new File((URI) objArr[0]);
                    FilePermissionService filePermission = this.this$0.getAppContext().getFilePermission();
                    Context reactContext = this.this$0.getAppContext().getReactContext();
                    if (reactContext == null) {
                        throw new Exceptions.ReactContextLost();
                    }
                    String path = file.getPath();
                    AbstractC2855l.f(path, "getPath(...)");
                    return (filePermission.getPathPermissions(reactContext, path).contains(FilePermissionService.Permission.READ) && file.exists()) ? new PathInfo(file.exists(), Boolean.valueOf(file.isDirectory())) : new PathInfo(false, null);
                }
            }));
            d dVarB3 = D.b(cls5);
            Module module = moduleDefinitionBuilder2.getModule();
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext = module.getAppContext();
            String simpleName = AbstractC3430a.b(dVarB3).getSimpleName();
            AbstractC2855l.f(simpleName, "getSimpleName(...)");
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            ClassComponentBuilder classComponentBuilder3 = new ClassComponentBuilder(appContext, simpleName, dVarB3, anyType8 == null ? new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Class$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(FileSystemFile.class);
                }
            }), null) : anyType8, moduleDefinitionBuilder2.getConverters());
            TypeConverterProvider converters5 = classComponentBuilder3.getConverters();
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Uri.class), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(D.b(Uri.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Constructor$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Uri.class);
                    }
                }), converters5);
            }
            AnyType[] anyTypeArr4 = {anyType9};
            ReturnType returnType4 = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType4 == null) {
                returnType4 = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType4);
            }
            classComponentBuilder3.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr4, returnType4, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return new FileSystemFile((Uri) objArr[0]);
                }
            }));
            TypeConverterProvider converters6 = classComponentBuilder3.getConverters();
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters6);
            }
            AnyType[] anyTypeArr5 = {anyType10};
            ReturnType returnType5 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType5 == null) {
                returnType5 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType5);
            }
            classComponentBuilder3.getSyncFunctions().put("delete", new SyncFunctionComponent("delete", anyTypeArr5, returnType5, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws UnableToDeleteException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemFile) objArr[0]).delete();
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters7 = classComponentBuilder3.getConverters();
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters7);
            }
            AnyType[] anyTypeArr6 = {anyType11};
            ReturnType returnType6 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType6 == null) {
                returnType6 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType6);
            }
            classComponentBuilder3.getSyncFunctions().put("validatePath", new SyncFunctionComponent("validatePath", anyTypeArr6, returnType6, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemFile) objArr[0]).validatePath();
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters8 = classComponentBuilder3.getConverters();
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters8);
            }
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CreateOptions.class), bool2));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(D.b(CreateOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(CreateOptions.class);
                    }
                }), converters8);
            }
            AnyType[] anyTypeArr7 = {anyType12, anyType13};
            ReturnType returnType7 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType7 == null) {
                returnType7 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType7);
            }
            classComponentBuilder3.getSyncFunctions().put("create", new SyncFunctionComponent("create", anyTypeArr7, returnType7, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws InvalidTypeFileException, UnableToCreateException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    CreateOptions createOptions = (CreateOptions) objArr[1];
                    FileSystemFile fileSystemFile = (FileSystemFile) obj;
                    if (createOptions == null) {
                        createOptions = new CreateOptions(false, false, false, 7, null);
                    }
                    fileSystemFile.create(createOptions);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters9 = classComponentBuilder3.getConverters();
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters9);
            }
            AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Either.class), bool));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(D.b(Either.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$9
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.q(Either.class, aVar.d(D.o(String.class)), aVar.d(D.o(TypedArray.class)));
                    }
                }), converters9);
            }
            AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(D.b(WriteOptions.class), bool2));
            if (anyType16 == null) {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                anyType16 = new AnyType(new LazyKType(D.b(WriteOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$10
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(WriteOptions.class);
                    }
                }), converters9);
            } else {
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
            }
            AnyType[] anyTypeArr8 = {anyType14, anyType15, anyType16};
            ReturnType returnType8 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType8 == null) {
                returnType8 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType8);
            }
            classComponentBuilder3.getSyncFunctions().put("write", new SyncFunctionComponent("write", anyTypeArr8, returnType8, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws InvalidTypeFileException, IOException, UnableToCreateException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    WriteOptions writeOptions = (WriteOptions) objArr[2];
                    Either either = (Either) obj2;
                    FileSystemFile fileSystemFile = (FileSystemFile) obj;
                    boolean append = writeOptions != null ? writeOptions.getAppend() : false;
                    if (either.isFirstType(D.b(String.class))) {
                        String str4 = (String) either.getFirstType(D.b(String.class));
                        if ((writeOptions != null ? writeOptions.getEncoding() : null) == EncodingType.BASE64) {
                            byte[] bArrDecode = Base64.decode(str4, 0);
                            AbstractC2855l.f(bArrDecode, "decode(...)");
                            fileSystemFile.write(bArrDecode, append);
                        } else {
                            fileSystemFile.write(str4, append);
                        }
                    }
                    if (either.isSecondType(D.b(TypedArray.class))) {
                        fileSystemFile.write((TypedArray) either.getSecondType(D.b(TypedArray.class)), append);
                    }
                    return C2735B.f28704a;
                }
            }));
            Class cls9 = cls5;
            if (AbstractC2855l.b(cls9, Promise.class)) {
                intAsyncFunctionComponent = new AsyncFunctionWithPromiseComponent(ReactTextInputShadowNode.PROP_TEXT, new AnyType[0], new Function2() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws InvalidTypeFileException, IOException {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        ((FileSystemFile) promise).text();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws InvalidTypeFileException, IOException {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
                cls6 = cls4;
            } else {
                TypeConverterProvider converters10 = classComponentBuilder3.getConverters();
                AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool));
                if (anyType17 == null) {
                    anyType17 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$AsyncFunction$2
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(FileSystemFile.class);
                        }
                    }), converters10);
                }
                AnyType[] anyTypeArr9 = {anyType17};
                Function1 function1 = new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        return ((FileSystemFile) objArr[0]).text();
                    }
                };
                cls6 = cls4;
                intAsyncFunctionComponent = AbstractC2855l.b(cls6, Integer.TYPE) ? new IntAsyncFunctionComponent(ReactTextInputShadowNode.PROP_TEXT, anyTypeArr9, function1) : AbstractC2855l.b(cls6, Boolean.TYPE) ? new BoolAsyncFunctionComponent(ReactTextInputShadowNode.PROP_TEXT, anyTypeArr9, function1) : AbstractC2855l.b(cls6, Double.TYPE) ? new DoubleAsyncFunctionComponent(ReactTextInputShadowNode.PROP_TEXT, anyTypeArr9, function1) : AbstractC2855l.b(cls6, Float.TYPE) ? new FloatAsyncFunctionComponent(ReactTextInputShadowNode.PROP_TEXT, anyTypeArr9, function1) : AbstractC2855l.b(cls6, cls6) ? new StringAsyncFunctionComponent(ReactTextInputShadowNode.PROP_TEXT, anyTypeArr9, function1) : new UntypedAsyncFunctionComponent(ReactTextInputShadowNode.PROP_TEXT, anyTypeArr9, function1);
            }
            classComponentBuilder3.getAsyncFunctions().put(ReactTextInputShadowNode.PROP_TEXT, intAsyncFunctionComponent);
            TypeConverterProvider converters11 = classComponentBuilder3.getConverters();
            AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$12
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters11);
            }
            AnyType[] anyTypeArr10 = {anyType18};
            ReturnType returnType9 = returnTypeProvider.getTypes().get(D.b(cls6));
            if (returnType9 == null) {
                returnType9 = new ReturnType(D.b(cls6));
                returnTypeProvider.getTypes().put(D.b(cls6), returnType9);
            }
            classComponentBuilder3.getSyncFunctions().put("textSync", new SyncFunctionComponent("textSync", anyTypeArr10, returnType9, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((FileSystemFile) objArr[0]).text();
                }
            }));
            if (AbstractC2855l.b(cls9, Promise.class)) {
                intAsyncFunctionComponent2 = new AsyncFunctionWithPromiseComponent("base64", new AnyType[0], new Function2() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$AsyncFunction$4
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws InvalidTypeFileException, IOException {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        ((FileSystemFile) promise).base64();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws InvalidTypeFileException, IOException {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters12 = classComponentBuilder3.getConverters();
                AnyType anyType19 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool));
                if (anyType19 == null) {
                    anyType19 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$AsyncFunction$5
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(FileSystemFile.class);
                        }
                    }), converters12);
                }
                AnyType[] anyTypeArr11 = {anyType19};
                Function1 function12 = new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$AsyncFunction$6
                    @Override // kotlin.jvm.functions.Function1
                    public final String invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        return ((FileSystemFile) objArr[0]).base64();
                    }
                };
                intAsyncFunctionComponent2 = AbstractC2855l.b(cls6, Integer.TYPE) ? new IntAsyncFunctionComponent("base64", anyTypeArr11, function12) : AbstractC2855l.b(cls6, Boolean.TYPE) ? new BoolAsyncFunctionComponent("base64", anyTypeArr11, function12) : AbstractC2855l.b(cls6, Double.TYPE) ? new DoubleAsyncFunctionComponent("base64", anyTypeArr11, function12) : AbstractC2855l.b(cls6, Float.TYPE) ? new FloatAsyncFunctionComponent("base64", anyTypeArr11, function12) : AbstractC2855l.b(cls6, cls6) ? new StringAsyncFunctionComponent("base64", anyTypeArr11, function12) : new UntypedAsyncFunctionComponent("base64", anyTypeArr11, function12);
            }
            classComponentBuilder3.getAsyncFunctions().put("base64", intAsyncFunctionComponent2);
            TypeConverterProvider converters13 = classComponentBuilder3.getConverters();
            AnyType anyType20 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool));
            if (anyType20 == null) {
                anyType20 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$14
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters13);
            }
            AnyType[] anyTypeArr12 = {anyType20};
            ReturnType returnType10 = returnTypeProvider.getTypes().get(D.b(cls6));
            if (returnType10 == null) {
                returnType10 = new ReturnType(D.b(cls6));
                returnTypeProvider.getTypes().put(D.b(cls6), returnType10);
            }
            classComponentBuilder3.getSyncFunctions().put("base64Sync", new SyncFunctionComponent("base64Sync", anyTypeArr12, returnType10, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((FileSystemFile) objArr[0]).base64();
                }
            }));
            if (AbstractC2855l.b(cls9, Promise.class)) {
                intAsyncFunctionComponent3 = new AsyncFunctionWithPromiseComponent("bytes", new AnyType[0], new Function2() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$AsyncFunction$7
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void invoke(Object[] objArr, Promise promise) throws InvalidTypeFileException, IOException {
                        AbstractC2855l.g(objArr, "<unused var>");
                        AbstractC2855l.g(promise, "promise");
                        ((FileSystemFile) promise).bytes();
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws InvalidTypeFileException, IOException {
                        invoke((Object[]) obj, (Promise) obj2);
                        return C2735B.f28704a;
                    }
                });
            } else {
                TypeConverterProvider converters14 = classComponentBuilder3.getConverters();
                AnyType anyType21 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool));
                if (anyType21 == null) {
                    anyType21 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$AsyncFunction$8
                        @Override // w7.InterfaceC3487a
                        public final o invoke() {
                            return D.o(FileSystemFile.class);
                        }
                    }), converters14);
                }
                AnyType[] anyTypeArr13 = {anyType21};
                Function1 function13 = new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$AsyncFunction$9
                    @Override // kotlin.jvm.functions.Function1
                    public final byte[] invoke(Object[] objArr) {
                        AbstractC2855l.g(objArr, "<destruct>");
                        return ((FileSystemFile) objArr[0]).bytes();
                    }
                };
                intAsyncFunctionComponent3 = AbstractC2855l.b(byte[].class, Integer.TYPE) ? new IntAsyncFunctionComponent("bytes", anyTypeArr13, function13) : AbstractC2855l.b(byte[].class, Boolean.TYPE) ? new BoolAsyncFunctionComponent("bytes", anyTypeArr13, function13) : AbstractC2855l.b(byte[].class, Double.TYPE) ? new DoubleAsyncFunctionComponent("bytes", anyTypeArr13, function13) : AbstractC2855l.b(byte[].class, Float.TYPE) ? new FloatAsyncFunctionComponent("bytes", anyTypeArr13, function13) : AbstractC2855l.b(byte[].class, cls6) ? new StringAsyncFunctionComponent("bytes", anyTypeArr13, function13) : new UntypedAsyncFunctionComponent("bytes", anyTypeArr13, function13);
            }
            classComponentBuilder3.getAsyncFunctions().put("bytes", intAsyncFunctionComponent3);
            TypeConverterProvider converters15 = classComponentBuilder3.getConverters();
            AnyType anyType22 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool));
            if (anyType22 == null) {
                classComponentBuilder = classComponentBuilder3;
                anyType22 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$16
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters15);
            } else {
                classComponentBuilder = classComponentBuilder3;
            }
            AnyType[] anyTypeArr14 = {anyType22};
            ReturnType returnType11 = returnTypeProvider.getTypes().get(D.b(byte[].class));
            if (returnType11 == null) {
                returnType11 = new ReturnType(D.b(byte[].class));
                returnTypeProvider.getTypes().put(D.b(byte[].class), returnType11);
            }
            classComponentBuilder.getSyncFunctions().put("bytesSync", new SyncFunctionComponent("bytesSync", anyTypeArr14, returnType11, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((FileSystemFile) objArr[0]).bytes();
                }
            }));
            TypeConverterProvider converters16 = classComponentBuilder.getConverters();
            AnyType anyType23 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool));
            if (anyType23 == null) {
                anyType23 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$18
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters16);
            }
            AnyType anyType24 = anyTypeProvider.getTypesMap().get(new Pair(D.b(InfoOptions.class), bool2));
            if (anyType24 == null) {
                anyType24 = new AnyType(new LazyKType(D.b(InfoOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$19
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(InfoOptions.class);
                    }
                }), converters16);
            }
            AnyType[] anyTypeArr15 = {anyType23, anyType24};
            ReturnType returnType12 = returnTypeProvider.getTypes().get(D.b(FileInfo.class));
            if (returnType12 == null) {
                returnType12 = new ReturnType(D.b(FileInfo.class));
                returnTypeProvider.getTypes().put(D.b(FileInfo.class), returnType12);
            }
            classComponentBuilder.getSyncFunctions().put(str3, new SyncFunctionComponent(str3, anyTypeArr15, returnType12, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((FileSystemFile) objArr[0]).info((InfoOptions) objArr[1]);
                }
            }));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "exists");
            AnyType[] anyTypeArr16 = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
            ReturnType returnType13 = returnTypeProvider.getTypes().get(D.b(Boolean.class));
            if (returnType13 == null) {
                returnType13 = new ReturnType(D.b(Boolean.class));
                returnTypeProvider.getTypes().put(D.b(Boolean.class), returnType13);
            }
            String str4 = str;
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(str4, anyTypeArr16, returnType13, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Boolean.valueOf(((FileSystemFile) it[0]).getExists());
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder.getProperties().put("exists", propertyComponentBuilderWithThis);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "modificationTime");
            AnyType[] anyTypeArr17 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
            ReturnType returnType14 = returnTypeProvider.getTypes().get(D.b(cls3));
            if (returnType14 == null) {
                returnType14 = new ReturnType(D.b(cls3));
                returnTypeProvider.getTypes().put(D.b(cls3), returnType14);
            }
            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(str4, anyTypeArr17, returnType14, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((FileSystemFile) it[0]).getModificationTime();
                }
            });
            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
            syncFunctionComponent2.setCanTakeOwner(true);
            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
            classComponentBuilder.getProperties().put("modificationTime", propertyComponentBuilderWithThis2);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis3 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "creationTime");
            AnyType[] anyTypeArr18 = {new AnyType(propertyComponentBuilderWithThis3.getThisType(), null, 2, null)};
            ReturnType returnType15 = returnTypeProvider.getTypes().get(D.b(cls3));
            if (returnType15 == null) {
                returnType15 = new ReturnType(D.b(cls3));
                returnTypeProvider.getTypes().put(D.b(cls3), returnType15);
            }
            SyncFunctionComponent syncFunctionComponent3 = new SyncFunctionComponent(str4, anyTypeArr18, returnType15, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Property$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((FileSystemFile) it[0]).getCreationTime();
                }
            });
            syncFunctionComponent3.setOwnerType(propertyComponentBuilderWithThis3.getThisType());
            syncFunctionComponent3.setCanTakeOwner(true);
            propertyComponentBuilderWithThis3.setGetter(syncFunctionComponent3);
            classComponentBuilder.getProperties().put("creationTime", propertyComponentBuilderWithThis3);
            TypeConverterProvider converters17 = classComponentBuilder.getConverters();
            AnyType anyType25 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls9), bool));
            if (anyType25 == null) {
                cls7 = cls9;
                anyType25 = new AnyType(new LazyKType(D.b(cls9), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$21
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters17);
            } else {
                cls7 = cls9;
            }
            AnyType anyType26 = anyTypeProvider.getTypesMap().get(new Pair(D.b(FileSystemPath.class), bool));
            if (anyType26 == null) {
                cls8 = byte[].class;
                anyType26 = new AnyType(new LazyKType(D.b(FileSystemPath.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$22
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemPath.class);
                    }
                }), converters17);
            } else {
                cls8 = byte[].class;
            }
            AnyType[] anyTypeArr19 = {anyType25, anyType26};
            ReturnType returnType16 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType16 == null) {
                returnType16 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType16);
            }
            classComponentBuilder.getSyncFunctions().put("copy", new SyncFunctionComponent("copy", anyTypeArr19, returnType16, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemFile) objArr[0]).copy((FileSystemPath) objArr[1]);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters18 = classComponentBuilder.getConverters();
            AnyType anyType27 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType27 == null) {
                anyType27 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$24
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters18);
            }
            AnyType anyType28 = anyTypeProvider.getTypesMap().get(new Pair(D.b(FileSystemPath.class), bool));
            if (anyType28 == null) {
                anyType28 = new AnyType(new LazyKType(D.b(FileSystemPath.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$25
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemPath.class);
                    }
                }), converters18);
            }
            AnyType[] anyTypeArr20 = {anyType27, anyType28};
            ReturnType returnType17 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType17 == null) {
                returnType17 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType17);
            }
            classComponentBuilder.getSyncFunctions().put("move", new SyncFunctionComponent("move", anyTypeArr20, returnType17, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws CopyOrMoveDirectoryToFileException, DestinationDoesNotExistException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemFile) objArr[0]).move((FileSystemPath) objArr[1]);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters19 = classComponentBuilder.getConverters();
            AnyType anyType29 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType29 == null) {
                anyType29 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$27
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters19);
            }
            AnyType anyType30 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool));
            if (anyType30 == null) {
                anyType30 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$28
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters19);
            }
            AnyType[] anyTypeArr21 = {anyType29, anyType30};
            ReturnType returnType18 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType18 == null) {
                returnType18 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType18);
            }
            classComponentBuilder.getSyncFunctions().put("rename", new SyncFunctionComponent("rename", anyTypeArr21, returnType18, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemFile) objArr[0]).rename((String) objArr[1]);
                    return C2735B.f28704a;
                }
            }));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis4 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "uri");
            AnyType[] anyTypeArr22 = {new AnyType(propertyComponentBuilderWithThis4.getThisType(), null, 2, null)};
            ReturnType returnType19 = returnTypeProvider.getTypes().get(D.b(cls6));
            if (returnType19 == null) {
                returnType19 = new ReturnType(D.b(cls6));
                returnTypeProvider.getTypes().put(D.b(cls6), returnType19);
            }
            SyncFunctionComponent syncFunctionComponent4 = new SyncFunctionComponent(str4, anyTypeArr22, returnType19, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Property$4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((FileSystemFile) it[0]).asString();
                }
            });
            syncFunctionComponent4.setOwnerType(propertyComponentBuilderWithThis4.getThisType());
            syncFunctionComponent4.setCanTakeOwner(true);
            propertyComponentBuilderWithThis4.setGetter(syncFunctionComponent4);
            classComponentBuilder.getProperties().put("uri", propertyComponentBuilderWithThis4);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis5 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "contentUri");
            AnyType[] anyTypeArr23 = {new AnyType(propertyComponentBuilderWithThis5.getThisType(), null, 2, null)};
            ReturnType returnType20 = returnTypeProvider.getTypes().get(D.b(Uri.class));
            if (returnType20 == null) {
                returnType20 = new ReturnType(D.b(Uri.class));
                returnTypeProvider.getTypes().put(D.b(Uri.class), returnType20);
            }
            SyncFunctionComponent syncFunctionComponent5 = new SyncFunctionComponent(str4, anyTypeArr23, returnType20, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Property$5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((FileSystemFile) it[0]).asContentUri();
                }
            });
            syncFunctionComponent5.setOwnerType(propertyComponentBuilderWithThis5.getThisType());
            syncFunctionComponent5.setCanTakeOwner(true);
            propertyComponentBuilderWithThis5.setGetter(syncFunctionComponent5);
            classComponentBuilder.getProperties().put("contentUri", propertyComponentBuilderWithThis5);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis6 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "md5");
            AnyType[] anyTypeArr24 = {new AnyType(propertyComponentBuilderWithThis6.getThisType(), null, 2, null)};
            ReturnType returnType21 = returnTypeProvider.getTypes().get(D.b(cls6));
            if (returnType21 == null) {
                returnType21 = new ReturnType(D.b(cls6));
                returnTypeProvider.getTypes().put(D.b(cls6), returnType21);
            }
            SyncFunctionComponent syncFunctionComponent6 = new SyncFunctionComponent(str4, anyTypeArr24, returnType21, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Property$6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    try {
                        return ((FileSystemFile) it[0]).getMd5();
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
            syncFunctionComponent6.setOwnerType(propertyComponentBuilderWithThis6.getThisType());
            syncFunctionComponent6.setCanTakeOwner(true);
            propertyComponentBuilderWithThis6.setGetter(syncFunctionComponent6);
            classComponentBuilder.getProperties().put("md5", propertyComponentBuilderWithThis6);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis7 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "size");
            AnyType[] anyTypeArr25 = {new AnyType(propertyComponentBuilderWithThis7.getThisType(), null, 2, null)};
            ReturnType returnType22 = returnTypeProvider.getTypes().get(D.b(cls3));
            if (returnType22 == null) {
                returnType22 = new ReturnType(D.b(cls3));
                returnTypeProvider.getTypes().put(D.b(cls3), returnType22);
            }
            SyncFunctionComponent syncFunctionComponent7 = new SyncFunctionComponent(str4, anyTypeArr25, returnType22, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Property$7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    try {
                        return ((FileSystemFile) it[0]).getSize();
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
            syncFunctionComponent7.setOwnerType(propertyComponentBuilderWithThis7.getThisType());
            syncFunctionComponent7.setCanTakeOwner(true);
            propertyComponentBuilderWithThis7.setGetter(syncFunctionComponent7);
            classComponentBuilder.getProperties().put("size", propertyComponentBuilderWithThis7);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis8 = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), NotificationsService.EVENT_TYPE_KEY);
            AnyType[] anyTypeArr26 = {new AnyType(propertyComponentBuilderWithThis8.getThisType(), null, 2, null)};
            ReturnType returnType23 = returnTypeProvider.getTypes().get(D.b(cls6));
            if (returnType23 == null) {
                returnType23 = new ReturnType(D.b(cls6));
                returnTypeProvider.getTypes().put(D.b(cls6), returnType23);
            }
            SyncFunctionComponent syncFunctionComponent8 = new SyncFunctionComponent(str4, anyTypeArr26, returnType23, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Property$8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((FileSystemFile) it[0]).getType();
                }
            });
            syncFunctionComponent8.setOwnerType(propertyComponentBuilderWithThis8.getThisType());
            syncFunctionComponent8.setCanTakeOwner(true);
            propertyComponentBuilderWithThis8.setGetter(syncFunctionComponent8);
            classComponentBuilder.getProperties().put(NotificationsService.EVENT_TYPE_KEY, propertyComponentBuilderWithThis8);
            TypeConverterProvider converters20 = classComponentBuilder.getConverters();
            AnyType anyType31 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType31 == null) {
                anyType31 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$30
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters20);
            }
            AnyType[] anyTypeArr27 = {anyType31};
            ReturnType returnType24 = returnTypeProvider.getTypes().get(D.b(cls));
            if (returnType24 == null) {
                returnType24 = new ReturnType(D.b(cls));
                returnTypeProvider.getTypes().put(D.b(cls), returnType24);
            }
            classComponentBuilder.getSyncFunctions().put("open", new SyncFunctionComponent("open", anyTypeArr27, returnType24, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$38$$inlined$Function$31
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return new FileSystemFileHandle((FileSystemFile) objArr[0]);
                }
            }));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
            d dVarB4 = D.b(cls);
            Module module2 = moduleDefinitionBuilder.getModule();
            if (module2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext2 = module2.getAppContext();
            String simpleName2 = AbstractC3430a.b(dVarB4).getSimpleName();
            AbstractC2855l.f(simpleName2, "getSimpleName(...)");
            AnyType anyType32 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            ClassComponentBuilder classComponentBuilder4 = new ClassComponentBuilder(appContext2, simpleName2, dVarB4, anyType32 == null ? new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Class$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(FileSystemFileHandle.class);
                }
            }), null) : anyType32, moduleDefinitionBuilder.getConverters());
            TypeConverterProvider converters21 = classComponentBuilder4.getConverters();
            AnyType anyType33 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls7), bool));
            if (anyType33 == null) {
                anyType33 = new AnyType(new LazyKType(D.b(cls7), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Constructor$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFile.class);
                    }
                }), converters21);
            }
            AnyType[] anyTypeArr28 = {anyType33};
            ReturnType returnType25 = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType25 == null) {
                returnType25 = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType25);
            }
            classComponentBuilder4.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr28, returnType25, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return new FileSystemFileHandle((FileSystemFile) objArr[0]);
                }
            }));
            TypeConverterProvider converters22 = classComponentBuilder4.getConverters();
            AnyType anyType34 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType34 == null) {
                anyType34 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFileHandle.class);
                    }
                }), converters22);
            }
            AnyType anyType35 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType35 == null) {
                classComponentBuilder2 = classComponentBuilder4;
                anyType35 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Function$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Long.TYPE);
                    }
                }), converters22);
            } else {
                classComponentBuilder2 = classComponentBuilder4;
            }
            AnyType[] anyTypeArr29 = {anyType34, anyType35};
            ReturnType returnType26 = returnTypeProvider.getTypes().get(D.b(cls8));
            if (returnType26 == null) {
                returnType26 = new ReturnType(D.b(cls8));
                returnTypeProvider.getTypes().put(D.b(cls8), returnType26);
            }
            classComponentBuilder2.getSyncFunctions().put("readBytes", new SyncFunctionComponent("readBytes", anyTypeArr29, returnType26, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Function$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((FileSystemFileHandle) objArr[0]).read(((Number) objArr[1]).longValue());
                }
            }));
            TypeConverterProvider converters23 = classComponentBuilder2.getConverters();
            AnyType anyType36 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType36 == null) {
                anyType36 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Function$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFileHandle.class);
                    }
                }), converters23);
            }
            AnyType anyType37 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls8), bool));
            if (anyType37 == null) {
                anyType37 = new AnyType(new LazyKType(D.b(cls8), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Function$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(byte[].class);
                    }
                }), converters23);
            }
            AnyType[] anyTypeArr30 = {anyType36, anyType37};
            ReturnType returnType27 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType27 == null) {
                returnType27 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType27);
            }
            classComponentBuilder2.getSyncFunctions().put("writeBytes", new SyncFunctionComponent("writeBytes", anyTypeArr30, returnType27, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Function$6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws UnableToReadHandleException, UnableToWriteHandleException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemFileHandle) objArr[0]).write((byte[]) objArr[1]);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters24 = classComponentBuilder2.getConverters();
            AnyType anyType38 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType38 == null) {
                anyType38 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Function$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemFileHandle.class);
                    }
                }), converters24);
            }
            AnyType[] anyTypeArr31 = {anyType38};
            ReturnType returnType28 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType28 == null) {
                returnType28 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType28);
            }
            classComponentBuilder2.getSyncFunctions().put("close", new SyncFunctionComponent("close", anyTypeArr31, returnType28, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Function$8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws IOException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemFileHandle) objArr[0]).close();
                    return C2735B.f28704a;
                }
            }));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis9 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), "offset");
            AnyType[] anyTypeArr32 = {new AnyType(propertyComponentBuilderWithThis9.getThisType(), null, 2, null)};
            ReturnType returnType29 = returnTypeProvider.getTypes().get(D.b(cls3));
            if (returnType29 == null) {
                returnType29 = new ReturnType(D.b(cls3));
                returnTypeProvider.getTypes().put(D.b(cls3), returnType29);
            }
            SyncFunctionComponent syncFunctionComponent9 = new SyncFunctionComponent(str4, anyTypeArr32, returnType29, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((FileSystemFileHandle) it[0]).getOffset();
                }
            });
            syncFunctionComponent9.setOwnerType(propertyComponentBuilderWithThis9.getThisType());
            syncFunctionComponent9.setCanTakeOwner(true);
            propertyComponentBuilderWithThis9.setGetter(syncFunctionComponent9);
            classComponentBuilder2.getProperties().put("offset", propertyComponentBuilderWithThis9);
            AnyType anyType39 = new AnyType(propertyComponentBuilderWithThis9.getThisType(), null, 2, null);
            AnyType anyType40 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType40 == null) {
                anyType40 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$set$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Long.TYPE);
                    }
                }), null);
            }
            AnyType[] anyTypeArr33 = {anyType39, anyType40};
            ReturnType returnType30 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType30 == null) {
                returnType30 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType30);
            }
            SyncFunctionComponent syncFunctionComponent10 = new SyncFunctionComponent("set", anyTypeArr33, returnType30, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$set$2
                public final void invoke(Object[] it) throws IOException {
                    AbstractC2855l.g(it, "it");
                    Object obj = it[0];
                    Object obj2 = it[1];
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                    }
                    ((FileSystemFileHandle) obj).setOffset(Long.valueOf(((Long) obj2).longValue()));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
                    invoke((Object[]) obj);
                    return C2735B.f28704a;
                }
            });
            syncFunctionComponent10.setOwnerType(propertyComponentBuilderWithThis9.getThisType());
            syncFunctionComponent10.setCanTakeOwner(true);
            propertyComponentBuilderWithThis9.setSetter(syncFunctionComponent10);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis10 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), "size");
            AnyType[] anyTypeArr34 = {new AnyType(propertyComponentBuilderWithThis10.getThisType(), null, 2, null)};
            ReturnType returnType31 = returnTypeProvider.getTypes().get(D.b(cls3));
            if (returnType31 == null) {
                returnType31 = new ReturnType(D.b(cls3));
                returnTypeProvider.getTypes().put(D.b(cls3), returnType31);
            }
            SyncFunctionComponent syncFunctionComponent11 = new SyncFunctionComponent(str4, anyTypeArr34, returnType31, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$46$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((FileSystemFileHandle) it[0]).getSize();
                }
            });
            syncFunctionComponent11.setOwnerType(propertyComponentBuilderWithThis10.getThisType());
            syncFunctionComponent11.setCanTakeOwner(true);
            propertyComponentBuilderWithThis10.setGetter(syncFunctionComponent11);
            classComponentBuilder2.getProperties().put("size", propertyComponentBuilderWithThis10);
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder2.buildClass());
            d dVarB5 = D.b(cls2);
            Module module3 = moduleDefinitionBuilder.getModule();
            if (module3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext3 = module3.getAppContext();
            String simpleName3 = AbstractC3430a.b(dVarB5).getSimpleName();
            AbstractC2855l.f(simpleName3, "getSimpleName(...)");
            AnyType anyType41 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            ClassComponentBuilder classComponentBuilder5 = new ClassComponentBuilder(appContext3, simpleName3, dVarB5, anyType41 == null ? new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$$inlined$Class$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    return D.o(FileSystemDirectory.class);
                }
            }), null) : anyType41, moduleDefinitionBuilder.getConverters());
            TypeConverterProvider converters25 = classComponentBuilder5.getConverters();
            AnyType anyType42 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Uri.class), bool));
            if (anyType42 == null) {
                anyType42 = new AnyType(new LazyKType(D.b(Uri.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Constructor$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Uri.class);
                    }
                }), converters25);
            }
            AnyType[] anyTypeArr35 = {anyType42};
            ReturnType returnType32 = returnTypeProvider.getTypes().get(D.b(Object.class));
            if (returnType32 == null) {
                returnType32 = new ReturnType(D.b(Object.class));
                returnTypeProvider.getTypes().put(D.b(Object.class), returnType32);
            }
            classComponentBuilder5.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr35, returnType32, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return new FileSystemDirectory((Uri) objArr[0]);
                }
            }));
            TypeConverterProvider converters26 = classComponentBuilder5.getConverters();
            AnyType anyType43 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType43 == null) {
                anyType43 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters26);
            }
            AnyType[] anyTypeArr36 = {anyType43};
            ReturnType returnType33 = returnTypeProvider.getTypes().get(D.b(DirectoryInfo.class));
            if (returnType33 == null) {
                returnType33 = new ReturnType(D.b(DirectoryInfo.class));
                returnTypeProvider.getTypes().put(D.b(DirectoryInfo.class), returnType33);
            }
            classComponentBuilder5.getSyncFunctions().put(str3, new SyncFunctionComponent(str3, anyTypeArr36, returnType33, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((FileSystemDirectory) objArr[0]).info();
                }
            }));
            TypeConverterProvider converters27 = classComponentBuilder5.getConverters();
            AnyType anyType44 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType44 == null) {
                anyType44 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters27);
            }
            AnyType[] anyTypeArr37 = {anyType44};
            ReturnType returnType34 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType34 == null) {
                returnType34 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType34);
            }
            classComponentBuilder5.getSyncFunctions().put("delete", new SyncFunctionComponent("delete", anyTypeArr37, returnType34, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws UnableToDeleteException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemDirectory) objArr[0]).delete();
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters28 = classComponentBuilder5.getConverters();
            AnyType anyType45 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType45 == null) {
                anyType45 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters28);
            }
            AnyType anyType46 = anyTypeProvider.getTypesMap().get(new Pair(D.b(CreateOptions.class), bool2));
            if (anyType46 == null) {
                anyType46 = new AnyType(new LazyKType(D.b(CreateOptions.class), true, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(CreateOptions.class);
                    }
                }), converters28);
            }
            AnyType[] anyTypeArr38 = {anyType45, anyType46};
            ReturnType returnType35 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType35 == null) {
                returnType35 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType35);
            }
            classComponentBuilder5.getSyncFunctions().put("create", new SyncFunctionComponent("create", anyTypeArr38, returnType35, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws InvalidTypeFolderException, UnableToCreateException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    CreateOptions createOptions = (CreateOptions) objArr[1];
                    FileSystemDirectory fileSystemDirectory = (FileSystemDirectory) obj;
                    if (createOptions == null) {
                        createOptions = new CreateOptions(false, false, false, 7, null);
                    }
                    fileSystemDirectory.create(createOptions);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters29 = classComponentBuilder5.getConverters();
            AnyType anyType47 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType47 == null) {
                anyType47 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters29);
            }
            AnyType anyType48 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool));
            if (anyType48 == null) {
                anyType48 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$9
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters29);
            }
            AnyType[] anyTypeArr39 = {anyType47, anyType48};
            ReturnType returnType36 = returnTypeProvider.getTypes().get(D.b(cls2));
            if (returnType36 == null) {
                returnType36 = new ReturnType(D.b(cls2));
                returnTypeProvider.getTypes().put(D.b(cls2), returnType36);
            }
            classComponentBuilder5.getSyncFunctions().put("createDirectory", new SyncFunctionComponent("createDirectory", anyTypeArr39, returnType36, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((FileSystemDirectory) objArr[0]).createDirectory((String) objArr[1]);
                }
            }));
            TypeConverterProvider converters30 = classComponentBuilder5.getConverters();
            AnyType anyType49 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType49 == null) {
                anyType49 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$11
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters30);
            }
            AnyType anyType50 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool));
            if (anyType50 == null) {
                anyType50 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$12
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters30);
            }
            AnyType anyType51 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool2));
            if (anyType51 == null) {
                anyType51 = new AnyType(new LazyKType(D.b(cls6), true, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$13
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(String.class);
                    }
                }), converters30);
            }
            AnyType[] anyTypeArr40 = {anyType49, anyType50, anyType51};
            ReturnType returnType37 = returnTypeProvider.getTypes().get(D.b(cls7));
            if (returnType37 == null) {
                returnType37 = new ReturnType(D.b(cls7));
                returnTypeProvider.getTypes().put(D.b(cls7), returnType37);
            }
            classComponentBuilder5.getSyncFunctions().put("createFile", new SyncFunctionComponent("createFile", anyTypeArr40, returnType37, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    return ((FileSystemDirectory) obj).createFile((String) objArr[2], (String) objArr[1]);
                }
            }));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis11 = new PropertyComponentBuilderWithThis(classComponentBuilder5.getOwnerType().getKType(), "exists");
            AnyType[] anyTypeArr41 = {new AnyType(propertyComponentBuilderWithThis11.getThisType(), null, 2, null)};
            ReturnType returnType38 = returnTypeProvider.getTypes().get(D.b(Boolean.class));
            if (returnType38 == null) {
                returnType38 = new ReturnType(D.b(Boolean.class));
                returnTypeProvider.getTypes().put(D.b(Boolean.class), returnType38);
            }
            SyncFunctionComponent syncFunctionComponent12 = new SyncFunctionComponent(str4, anyTypeArr41, returnType38, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Boolean.valueOf(((FileSystemDirectory) it[0]).getExists());
                }
            });
            syncFunctionComponent12.setOwnerType(propertyComponentBuilderWithThis11.getThisType());
            syncFunctionComponent12.setCanTakeOwner(true);
            propertyComponentBuilderWithThis11.setGetter(syncFunctionComponent12);
            classComponentBuilder5.getProperties().put("exists", propertyComponentBuilderWithThis11);
            TypeConverterProvider converters31 = classComponentBuilder5.getConverters();
            AnyType anyType52 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType52 == null) {
                anyType52 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$15
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters31);
            }
            AnyType[] anyTypeArr42 = {anyType52};
            ReturnType returnType39 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType39 == null) {
                returnType39 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType39);
            }
            classComponentBuilder5.getSyncFunctions().put("validatePath", new SyncFunctionComponent("validatePath", anyTypeArr42, returnType39, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemDirectory) objArr[0]).validatePath();
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters32 = classComponentBuilder5.getConverters();
            AnyType anyType53 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType53 == null) {
                anyType53 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$17
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters32);
            }
            AnyType anyType54 = anyTypeProvider.getTypesMap().get(new Pair(D.b(FileSystemPath.class), bool));
            if (anyType54 == null) {
                anyType54 = new AnyType(new LazyKType(D.b(FileSystemPath.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$18
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemPath.class);
                    }
                }), converters32);
            }
            AnyType[] anyTypeArr43 = {anyType53, anyType54};
            ReturnType returnType40 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType40 == null) {
                returnType40 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType40);
            }
            classComponentBuilder5.getSyncFunctions().put("copy", new SyncFunctionComponent("copy", anyTypeArr43, returnType40, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$19
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemDirectory) objArr[0]).copy((FileSystemPath) objArr[1]);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters33 = classComponentBuilder5.getConverters();
            AnyType anyType55 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType55 == null) {
                anyType55 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$20
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters33);
            }
            AnyType anyType56 = anyTypeProvider.getTypesMap().get(new Pair(D.b(FileSystemPath.class), bool));
            if (anyType56 == null) {
                anyType56 = new AnyType(new LazyKType(D.b(FileSystemPath.class), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$21
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemPath.class);
                    }
                }), converters33);
            }
            AnyType[] anyTypeArr44 = {anyType55, anyType56};
            ReturnType returnType41 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType41 == null) {
                returnType41 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType41);
            }
            classComponentBuilder5.getSyncFunctions().put("move", new SyncFunctionComponent("move", anyTypeArr44, returnType41, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) throws CopyOrMoveDirectoryToFileException, DestinationDoesNotExistException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemDirectory) objArr[0]).move((FileSystemPath) objArr[1]);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters34 = classComponentBuilder5.getConverters();
            AnyType anyType57 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType57 == null) {
                anyType57 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$23
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters34);
            }
            AnyType anyType58 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls6), bool));
            if (anyType58 == null) {
                anyType58 = new AnyType(new LazyKType(D.b(cls6), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$24
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters34);
            }
            AnyType[] anyTypeArr45 = {anyType57, anyType58};
            ReturnType returnType42 = returnTypeProvider.getTypes().get(D.b(C2735B.class));
            if (returnType42 == null) {
                returnType42 = new ReturnType(D.b(C2735B.class));
                returnTypeProvider.getTypes().put(D.b(C2735B.class), returnType42);
            }
            classComponentBuilder5.getSyncFunctions().put("rename", new SyncFunctionComponent("rename", anyTypeArr45, returnType42, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$25
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    ((FileSystemDirectory) objArr[0]).rename((String) objArr[1]);
                    return C2735B.f28704a;
                }
            }));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis12 = new PropertyComponentBuilderWithThis(classComponentBuilder5.getOwnerType().getKType(), "uri");
            AnyType[] anyTypeArr46 = {new AnyType(propertyComponentBuilderWithThis12.getThisType(), null, 2, null)};
            ReturnType returnType43 = returnTypeProvider.getTypes().get(D.b(cls6));
            if (returnType43 == null) {
                returnType43 = new ReturnType(D.b(cls6));
                returnTypeProvider.getTypes().put(D.b(cls6), returnType43);
            }
            SyncFunctionComponent syncFunctionComponent13 = new SyncFunctionComponent(str4, anyTypeArr46, returnType43, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Property$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((FileSystemDirectory) it[0]).asString();
                }
            });
            syncFunctionComponent13.setOwnerType(propertyComponentBuilderWithThis12.getThisType());
            syncFunctionComponent13.setCanTakeOwner(true);
            propertyComponentBuilderWithThis12.setGetter(syncFunctionComponent13);
            classComponentBuilder5.getProperties().put("uri", propertyComponentBuilderWithThis12);
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis13 = new PropertyComponentBuilderWithThis(classComponentBuilder5.getOwnerType().getKType(), "size");
            AnyType[] anyTypeArr47 = {new AnyType(propertyComponentBuilderWithThis13.getThisType(), null, 2, null)};
            ReturnType returnType44 = returnTypeProvider.getTypes().get(D.b(cls3));
            if (returnType44 == null) {
                returnType44 = new ReturnType(D.b(cls3));
                returnTypeProvider.getTypes().put(D.b(cls3), returnType44);
            }
            SyncFunctionComponent syncFunctionComponent14 = new SyncFunctionComponent(str4, anyTypeArr47, returnType44, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Property$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return Long.valueOf(((FileSystemDirectory) it[0]).getSize());
                }
            });
            syncFunctionComponent14.setOwnerType(propertyComponentBuilderWithThis13.getThisType());
            syncFunctionComponent14.setCanTakeOwner(true);
            propertyComponentBuilderWithThis13.setGetter(syncFunctionComponent14);
            classComponentBuilder5.getProperties().put("size", propertyComponentBuilderWithThis13);
            TypeConverterProvider converters35 = classComponentBuilder5.getConverters();
            AnyType anyType59 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls2), bool));
            if (anyType59 == null) {
                anyType59 = new AnyType(new LazyKType(D.b(cls2), false, new InterfaceC3487a() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$26
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(FileSystemDirectory.class);
                    }
                }), converters35);
            }
            AnyType[] anyTypeArr48 = {anyType59};
            ReturnType returnType45 = returnTypeProvider.getTypes().get(D.b(List.class));
            if (returnType45 == null) {
                returnType45 = new ReturnType(D.b(List.class));
                returnTypeProvider.getTypes().put(D.b(List.class), returnType45);
            }
            classComponentBuilder5.getSyncFunctions().put("listAsRecords", new SyncFunctionComponent("listAsRecords", anyTypeArr48, returnType45, new Function1() { // from class: expo.modules.filesystem.FileSystemModule$definition$lambda$62$lambda$61$$inlined$Function$27
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((FileSystemDirectory) objArr[0]).listAsRecords();
                }
            }));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder5.buildClass());
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
