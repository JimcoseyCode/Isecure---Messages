package expo.modules.medialibrary.next;

import C7.o;
import C7.q;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.objects.PropertyComponentBuilderWithThis;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.Either;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.medialibrary.next.exceptions.PermissionException;
import expo.modules.medialibrary.next.objects.album.Album;
import expo.modules.medialibrary.next.objects.album.AlbumQuery;
import expo.modules.medialibrary.next.objects.album.factories.AlbumFactory;
import expo.modules.medialibrary.next.objects.album.factories.AlbumLegacyFactory;
import expo.modules.medialibrary.next.objects.album.factories.AlbumModernFactory;
import expo.modules.medialibrary.next.objects.asset.Asset;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetDeleter;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetLegacyDeleter;
import expo.modules.medialibrary.next.objects.asset.deleters.AssetModernDeleter;
import expo.modules.medialibrary.next.objects.asset.factories.AssetFactory;
import expo.modules.medialibrary.next.objects.asset.factories.AssetLegacyFactory;
import expo.modules.medialibrary.next.objects.asset.factories.AssetModernFactory;
import expo.modules.medialibrary.next.objects.query.MediaStoreQueryFormatter;
import expo.modules.medialibrary.next.objects.query.Query;
import expo.modules.medialibrary.next.objects.wrappers.MediaType;
import expo.modules.medialibrary.next.permissions.MediaStorePermissionsDelegate;
import expo.modules.medialibrary.next.permissions.SystemPermissionsDelegate;
import expo.modules.medialibrary.next.permissions.enums.GranularPermission;
import expo.modules.medialibrary.next.records.AssetField;
import expo.modules.medialibrary.next.records.SortDescriptor;
import i7.AbstractC2746i;
import i7.C2735B;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import l1.AbstractC2861a;
import v7.AbstractC3430a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010'\u001a\u00020(H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lexpo/modules/medialibrary/next/MediaLibraryNextModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "systemPermissionsDelegate", "Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "getSystemPermissionsDelegate", "()Lexpo/modules/medialibrary/next/permissions/SystemPermissionsDelegate;", "systemPermissionsDelegate$delegate", "Lkotlin/Lazy;", "mediaStorePermissionsDelegate", "Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "getMediaStorePermissionsDelegate", "()Lexpo/modules/medialibrary/next/permissions/MediaStorePermissionsDelegate;", "mediaStorePermissionsDelegate$delegate", "albumQuery", "Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;", "getAlbumQuery", "()Lexpo/modules/medialibrary/next/objects/album/AlbumQuery;", "albumQuery$delegate", "albumFactory", "Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;", "getAlbumFactory", "()Lexpo/modules/medialibrary/next/objects/album/factories/AlbumFactory;", "albumFactory$delegate", "assetFactory", "Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "getAssetFactory", "()Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;", "assetFactory$delegate", "assetDeleter", "Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "getAssetDeleter", "()Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;", "assetDeleter$delegate", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "expo-media-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MediaLibraryNextModule extends Module {

    /* JADX INFO: renamed from: systemPermissionsDelegate$delegate, reason: from kotlin metadata */
    private final Lazy systemPermissionsDelegate = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return MediaLibraryNextModule.systemPermissionsDelegate_delegate$lambda$0(this.f26664g);
        }
    });

    /* JADX INFO: renamed from: mediaStorePermissionsDelegate$delegate, reason: from kotlin metadata */
    private final Lazy mediaStorePermissionsDelegate = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.b
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return MediaLibraryNextModule.mediaStorePermissionsDelegate_delegate$lambda$1(this.f26665g);
        }
    });

    /* JADX INFO: renamed from: albumQuery$delegate, reason: from kotlin metadata */
    private final Lazy albumQuery = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.c
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return MediaLibraryNextModule.albumQuery_delegate$lambda$2(this.f26666g);
        }
    });

    /* JADX INFO: renamed from: albumFactory$delegate, reason: from kotlin metadata */
    private final Lazy albumFactory = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.d
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return MediaLibraryNextModule.albumFactory_delegate$lambda$3(this.f26667g);
        }
    });

    /* JADX INFO: renamed from: assetFactory$delegate, reason: from kotlin metadata */
    private final Lazy assetFactory = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.e
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return MediaLibraryNextModule.assetFactory_delegate$lambda$4(this.f26668g);
        }
    });

    /* JADX INFO: renamed from: assetDeleter$delegate, reason: from kotlin metadata */
    private final Lazy assetDeleter = AbstractC2746i.b(new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.f
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return MediaLibraryNextModule.assetDeleter_delegate$lambda$5(this.f26669g);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlbumFactory albumFactory_delegate$lambda$3(MediaLibraryNextModule mediaLibraryNextModule) {
        return Build.VERSION.SDK_INT >= 30 ? new AlbumModernFactory(mediaLibraryNextModule.getAssetFactory(), mediaLibraryNextModule.getAssetDeleter(), mediaLibraryNextModule.getMediaStorePermissionsDelegate(), mediaLibraryNextModule.getContext()) : new AlbumLegacyFactory(mediaLibraryNextModule.getAssetFactory(), mediaLibraryNextModule.getAssetDeleter(), mediaLibraryNextModule.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlbumQuery albumQuery_delegate$lambda$2(MediaLibraryNextModule mediaLibraryNextModule) {
        return new AlbumQuery(mediaLibraryNextModule.getAlbumFactory(), mediaLibraryNextModule.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetDeleter assetDeleter_delegate$lambda$5(MediaLibraryNextModule mediaLibraryNextModule) {
        return Build.VERSION.SDK_INT >= 30 ? new AssetModernDeleter(mediaLibraryNextModule.getMediaStorePermissionsDelegate()) : new AssetLegacyDeleter(mediaLibraryNextModule.getSystemPermissionsDelegate(), mediaLibraryNextModule.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AssetFactory assetFactory_delegate$lambda$4(MediaLibraryNextModule mediaLibraryNextModule) {
        return Build.VERSION.SDK_INT >= 30 ? new AssetModernFactory(mediaLibraryNextModule.getAssetDeleter(), mediaLibraryNextModule.getMediaStorePermissionsDelegate(), mediaLibraryNextModule.getContext()) : new AssetLegacyFactory(mediaLibraryNextModule.getAssetDeleter(), mediaLibraryNextModule.getSystemPermissionsDelegate(), mediaLibraryNextModule.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlbumFactory getAlbumFactory() {
        return (AlbumFactory) this.albumFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlbumQuery getAlbumQuery() {
        return (AlbumQuery) this.albumQuery.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetDeleter getAssetDeleter() {
        return (AssetDeleter) this.assetDeleter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssetFactory getAssetFactory() {
        return (AssetFactory) this.assetFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaStorePermissionsDelegate getMediaStorePermissionsDelegate() {
        return (MediaStorePermissionsDelegate) this.mediaStorePermissionsDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SystemPermissionsDelegate getSystemPermissionsDelegate() {
        return (SystemPermissionsDelegate) this.systemPermissionsDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaStorePermissionsDelegate mediaStorePermissionsDelegate_delegate$lambda$1(MediaLibraryNextModule mediaLibraryNextModule) {
        return new MediaStorePermissionsDelegate(mediaLibraryNextModule.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SystemPermissionsDelegate systemPermissionsDelegate_delegate$lambda$0(MediaLibraryNextModule mediaLibraryNextModule) {
        return new SystemPermissionsDelegate(mediaLibraryNextModule.getAppContext());
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        Class cls;
        Class cls2;
        Class cls3;
        AnyType anyType;
        String str;
        Class cls4;
        Class cls5;
        String str2;
        ModuleDefinitionBuilder moduleDefinitionBuilder;
        ReturnTypeProvider returnTypeProvider;
        AnyType anyType2;
        AnyType anyType3;
        AbstractC2861a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder2.Name("ExpoMediaLibraryNext");
            C7.d dVarB = D.b(Asset.class);
            Module module = moduleDefinitionBuilder2.getModule();
            if (module == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AppContext appContext = module.getAppContext();
            String simpleName = AbstractC3430a.b(dVarB).getSimpleName();
            AbstractC2855l.f(simpleName, "getSimpleName(...)");
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            C7.d dVarB2 = D.b(Asset.class);
            Boolean bool = Boolean.FALSE;
            AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB2, bool));
            if (anyType4 == null) {
                cls = String.class;
                cls2 = Object.class;
                cls3 = List.class;
                anyType = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Class$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), null);
            } else {
                cls = String.class;
                cls2 = Object.class;
                cls3 = List.class;
                anyType = anyType4;
            }
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, simpleName, dVarB, anyType, moduleDefinitionBuilder2.getConverters());
            TypeConverterProvider converters = classComponentBuilder.getConverters();
            AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Uri.class), bool));
            if (anyType5 == null) {
                cls4 = AssetField.class;
                cls5 = Album.class;
                str = "Required value was null.";
                anyType5 = new AnyType(new LazyKType(D.b(Uri.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Constructor$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Uri.class);
                    }
                }), converters);
            } else {
                str = "Required value was null.";
                cls4 = AssetField.class;
                cls5 = Album.class;
            }
            AnyType[] anyTypeArr = {anyType5};
            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider2.getTypes().get(D.b(cls2));
            if (returnType == null) {
                returnType = new ReturnType(D.b(cls2));
                returnTypeProvider2.getTypes().put(D.b(cls2), returnType);
            }
            classComponentBuilder.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr, returnType, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return this.this$0.getAssetFactory().create((Uri) objArr[0]);
                }
            }));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis = new PropertyComponentBuilderWithThis(classComponentBuilder.getOwnerType().getKType(), "id");
            AnyType[] anyTypeArr2 = {new AnyType(propertyComponentBuilderWithThis.getThisType(), null, 2, null)};
            ReturnType returnType2 = returnTypeProvider2.getTypes().get(D.b(Uri.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(D.b(Uri.class));
                returnTypeProvider2.getTypes().put(D.b(Uri.class), returnType2);
            }
            SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr2, returnType2, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((Asset) it[0]).getContentUri();
                }
            });
            syncFunctionComponent.setOwnerType(propertyComponentBuilderWithThis.getThisType());
            syncFunctionComponent.setCanTakeOwner(true);
            propertyComponentBuilderWithThis.setGetter(syncFunctionComponent);
            classComponentBuilder.getProperties().put("id", propertyComponentBuilderWithThis);
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction = classComponentBuilder.AsyncFunction("getCreationTime");
            String name = asyncFunctionBuilderAsyncFunction.getName();
            TypeConverterProvider converters2 = asyncFunctionBuilderAsyncFunction.getConverters();
            AnyType anyType6 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType6 == null) {
                returnTypeProvider = returnTypeProvider2;
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                str2 = "get";
                anyType6 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters2);
            } else {
                str2 = "get";
                moduleDefinitionBuilder = moduleDefinitionBuilder2;
                returnTypeProvider = returnTypeProvider2;
            }
            asyncFunctionBuilderAsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name, new AnyType[]{anyType6}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$2(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction2 = classComponentBuilder.AsyncFunction("getDuration");
            String name2 = asyncFunctionBuilderAsyncFunction2.getName();
            TypeConverterProvider converters3 = asyncFunctionBuilderAsyncFunction2.getConverters();
            AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType7 == null) {
                anyType7 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters3);
            }
            asyncFunctionBuilderAsyncFunction2.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, new AnyType[]{anyType7}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$4(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction3 = classComponentBuilder.AsyncFunction("getExif");
            String name3 = asyncFunctionBuilderAsyncFunction3.getName();
            TypeConverterProvider converters4 = asyncFunctionBuilderAsyncFunction3.getConverters();
            AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType8 == null) {
                anyType8 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters4);
            }
            asyncFunctionBuilderAsyncFunction3.setAsyncFunctionComponent(new SuspendFunctionComponent(name3, new AnyType[]{anyType8}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$6(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction4 = classComponentBuilder.AsyncFunction("getInfo");
            String name4 = asyncFunctionBuilderAsyncFunction4.getName();
            TypeConverterProvider converters5 = asyncFunctionBuilderAsyncFunction4.getConverters();
            AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType9 == null) {
                anyType9 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters5);
            }
            asyncFunctionBuilderAsyncFunction4.setAsyncFunctionComponent(new SuspendFunctionComponent(name4, new AnyType[]{anyType9}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$8(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction5 = classComponentBuilder.AsyncFunction("getLocation");
            String name5 = asyncFunctionBuilderAsyncFunction5.getName();
            TypeConverterProvider converters6 = asyncFunctionBuilderAsyncFunction5.getConverters();
            AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType10 == null) {
                anyType10 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$9
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters6);
            }
            asyncFunctionBuilderAsyncFunction5.setAsyncFunctionComponent(new SuspendFunctionComponent(name5, new AnyType[]{anyType10}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$10(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction6 = classComponentBuilder.AsyncFunction("getFilename");
            String name6 = asyncFunctionBuilderAsyncFunction6.getName();
            TypeConverterProvider converters7 = asyncFunctionBuilderAsyncFunction6.getConverters();
            AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType11 == null) {
                anyType11 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$11
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters7);
            }
            asyncFunctionBuilderAsyncFunction6.setAsyncFunctionComponent(new SuspendFunctionComponent(name6, new AnyType[]{anyType11}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$12(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction7 = classComponentBuilder.AsyncFunction("getHeight");
            String name7 = asyncFunctionBuilderAsyncFunction7.getName();
            TypeConverterProvider converters8 = asyncFunctionBuilderAsyncFunction7.getConverters();
            AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType12 == null) {
                anyType12 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$13
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters8);
            }
            asyncFunctionBuilderAsyncFunction7.setAsyncFunctionComponent(new SuspendFunctionComponent(name7, new AnyType[]{anyType12}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$14(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction8 = classComponentBuilder.AsyncFunction("getMediaType");
            String name8 = asyncFunctionBuilderAsyncFunction8.getName();
            TypeConverterProvider converters9 = asyncFunctionBuilderAsyncFunction8.getConverters();
            AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType13 == null) {
                anyType13 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$15
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters9);
            }
            asyncFunctionBuilderAsyncFunction8.setAsyncFunctionComponent(new SuspendFunctionComponent(name8, new AnyType[]{anyType13}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$16(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction9 = classComponentBuilder.AsyncFunction("getModificationTime");
            String name9 = asyncFunctionBuilderAsyncFunction9.getName();
            TypeConverterProvider converters10 = asyncFunctionBuilderAsyncFunction9.getConverters();
            AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType14 == null) {
                anyType14 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$17
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters10);
            }
            asyncFunctionBuilderAsyncFunction9.setAsyncFunctionComponent(new SuspendFunctionComponent(name9, new AnyType[]{anyType14}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$18(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction10 = classComponentBuilder.AsyncFunction("getShape");
            String name10 = asyncFunctionBuilderAsyncFunction10.getName();
            TypeConverterProvider converters11 = asyncFunctionBuilderAsyncFunction10.getConverters();
            AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType15 == null) {
                anyType15 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$19
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters11);
            }
            asyncFunctionBuilderAsyncFunction10.setAsyncFunctionComponent(new SuspendFunctionComponent(name10, new AnyType[]{anyType15}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$20(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction11 = classComponentBuilder.AsyncFunction("getUri");
            String name11 = asyncFunctionBuilderAsyncFunction11.getName();
            TypeConverterProvider converters12 = asyncFunctionBuilderAsyncFunction11.getConverters();
            AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType16 == null) {
                anyType16 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$21
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters12);
            }
            asyncFunctionBuilderAsyncFunction11.setAsyncFunctionComponent(new SuspendFunctionComponent(name11, new AnyType[]{anyType16}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$22(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction12 = classComponentBuilder.AsyncFunction("getWidth");
            String name12 = asyncFunctionBuilderAsyncFunction12.getName();
            TypeConverterProvider converters13 = asyncFunctionBuilderAsyncFunction12.getConverters();
            AnyType anyType17 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType17 == null) {
                anyType17 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$23
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters13);
            }
            asyncFunctionBuilderAsyncFunction12.setAsyncFunctionComponent(new SuspendFunctionComponent(name12, new AnyType[]{anyType17}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$24(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction13 = classComponentBuilder.AsyncFunction("delete");
            String name13 = asyncFunctionBuilderAsyncFunction13.getName();
            TypeConverterProvider converters14 = asyncFunctionBuilderAsyncFunction13.getConverters();
            AnyType anyType18 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType18 == null) {
                anyType18 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$25
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters14);
            }
            asyncFunctionBuilderAsyncFunction13.setAsyncFunctionComponent(new SuspendFunctionComponent(name13, new AnyType[]{anyType18}, new MediaLibraryNextModule$definition$lambda$53$lambda$21$$inlined$Coroutine$26(null)));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
            C7.d dVarB3 = D.b(cls5);
            Module module2 = moduleDefinitionBuilder.getModule();
            if (module2 == null) {
                throw new IllegalArgumentException(str);
            }
            AppContext appContext2 = module2.getAppContext();
            String simpleName2 = AbstractC3430a.b(dVarB3).getSimpleName();
            AbstractC2855l.f(simpleName2, "getSimpleName(...)");
            AnyType anyType19 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType19 == null) {
                anyType2 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Class$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Album.class);
                    }
                }), null);
            } else {
                anyType2 = anyType19;
            }
            ClassComponentBuilder classComponentBuilder2 = new ClassComponentBuilder(appContext2, simpleName2, dVarB3, anyType2, moduleDefinitionBuilder.getConverters());
            TypeConverterProvider converters15 = classComponentBuilder2.getConverters();
            AnyType anyType20 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType20 == null) {
                anyType20 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters15);
            }
            AnyType[] anyTypeArr3 = {anyType20};
            ReturnType returnType3 = returnTypeProvider.getTypes().get(D.b(cls2));
            if (returnType3 == null) {
                returnType3 = new ReturnType(D.b(cls2));
                returnTypeProvider.getTypes().put(D.b(cls2), returnType3);
            }
            classComponentBuilder2.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr3, returnType3, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return new Album((String) objArr[0], this.this$0.getAssetDeleter(), this.this$0.getAssetFactory(), this.this$0.getContext());
                }
            }));
            PropertyComponentBuilderWithThis propertyComponentBuilderWithThis2 = new PropertyComponentBuilderWithThis(classComponentBuilder2.getOwnerType().getKType(), "id");
            AnyType[] anyTypeArr4 = {new AnyType(propertyComponentBuilderWithThis2.getThisType(), null, 2, null)};
            ReturnType returnType4 = returnTypeProvider.getTypes().get(D.b(cls));
            if (returnType4 == null) {
                returnType4 = new ReturnType(D.b(cls));
                returnTypeProvider.getTypes().put(D.b(cls), returnType4);
            }
            SyncFunctionComponent syncFunctionComponent2 = new SyncFunctionComponent(str2, anyTypeArr4, returnType4, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Property$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return ((Album) it[0]).getId();
                }
            });
            syncFunctionComponent2.setOwnerType(propertyComponentBuilderWithThis2.getThisType());
            syncFunctionComponent2.setCanTakeOwner(true);
            propertyComponentBuilderWithThis2.setGetter(syncFunctionComponent2);
            classComponentBuilder2.getProperties().put("id", propertyComponentBuilderWithThis2);
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction14 = classComponentBuilder2.AsyncFunction("getTitle");
            String name14 = asyncFunctionBuilderAsyncFunction14.getName();
            TypeConverterProvider converters16 = asyncFunctionBuilderAsyncFunction14.getConverters();
            AnyType anyType21 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType21 == null) {
                anyType21 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Album.class);
                    }
                }), converters16);
            }
            asyncFunctionBuilderAsyncFunction14.setAsyncFunctionComponent(new SuspendFunctionComponent(name14, new AnyType[]{anyType21}, new MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$2(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction15 = classComponentBuilder2.AsyncFunction("getAssets");
            String name15 = asyncFunctionBuilderAsyncFunction15.getName();
            TypeConverterProvider converters17 = asyncFunctionBuilderAsyncFunction15.getConverters();
            AnyType anyType22 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType22 == null) {
                anyType22 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Album.class);
                    }
                }), converters17);
            }
            asyncFunctionBuilderAsyncFunction15.setAsyncFunctionComponent(new SuspendFunctionComponent(name15, new AnyType[]{anyType22}, new MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$4(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction16 = classComponentBuilder2.AsyncFunction("add");
            String name16 = asyncFunctionBuilderAsyncFunction16.getName();
            TypeConverterProvider converters18 = asyncFunctionBuilderAsyncFunction16.getConverters();
            AnyType anyType23 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType23 == null) {
                anyType23 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Album.class);
                    }
                }), converters18);
            }
            AnyType anyType24 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Asset.class), bool));
            if (anyType24 == null) {
                anyType24 = new AnyType(new LazyKType(D.b(Asset.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Asset.class);
                    }
                }), converters18);
            }
            asyncFunctionBuilderAsyncFunction16.setAsyncFunctionComponent(new SuspendFunctionComponent(name16, new AnyType[]{anyType23, anyType24}, new MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$7(null)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction17 = classComponentBuilder2.AsyncFunction("delete");
            String name17 = asyncFunctionBuilderAsyncFunction17.getName();
            TypeConverterProvider converters19 = asyncFunctionBuilderAsyncFunction17.getConverters();
            AnyType anyType25 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType25 == null) {
                anyType25 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Album.class);
                    }
                }), converters19);
            }
            asyncFunctionBuilderAsyncFunction17.setAsyncFunctionComponent(new SuspendFunctionComponent(name17, new AnyType[]{anyType25}, new MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Coroutine$9(null)));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder2.buildClass());
            C7.d dVarB4 = D.b(Query.class);
            Module module3 = moduleDefinitionBuilder.getModule();
            if (module3 == null) {
                throw new IllegalArgumentException(str);
            }
            AppContext appContext3 = module3.getAppContext();
            String simpleName3 = AbstractC3430a.b(dVarB4).getSimpleName();
            AbstractC2855l.f(simpleName3, "getSimpleName(...)");
            AnyType anyType26 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType26 == null) {
                anyType3 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Class$3
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), null);
            } else {
                anyType3 = anyType26;
            }
            ClassComponentBuilder classComponentBuilder3 = new ClassComponentBuilder(appContext3, simpleName3, dVarB4, anyType3, moduleDefinitionBuilder.getConverters());
            AnyType[] anyTypeArr5 = new AnyType[0];
            ReturnType returnType5 = returnTypeProvider.getTypes().get(D.b(cls2));
            if (returnType5 == null) {
                returnType5 = new ReturnType(D.b(cls2));
                returnTypeProvider.getTypes().put(D.b(cls2), returnType5);
            }
            classComponentBuilder3.setConstructor(new SyncFunctionComponent("constructor", anyTypeArr5, returnType5, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Constructor$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it) {
                    AbstractC2855l.g(it, "it");
                    return new Query(this.this$0.getAssetFactory(), this.this$0.getContext());
                }
            }));
            TypeConverterProvider converters20 = classComponentBuilder3.getConverters();
            AnyType anyType27 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType27 == null) {
                anyType27 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters20);
            }
            AnyType anyType28 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Integer.class), bool));
            if (anyType28 == null) {
                anyType28 = new AnyType(new LazyKType(D.b(Integer.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Integer.TYPE);
                    }
                }), converters20);
            }
            AnyType[] anyTypeArr6 = {anyType27, anyType28};
            ReturnType returnType6 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType6 == null) {
                returnType6 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType6);
            }
            classComponentBuilder3.getSyncFunctions().put("limit", new SyncFunctionComponent("limit", anyTypeArr6, returnType6, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((Query) objArr[0]).limit(((Number) objArr[1]).intValue());
                }
            }));
            TypeConverterProvider converters21 = classComponentBuilder3.getConverters();
            AnyType anyType29 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType29 == null) {
                anyType29 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters21);
            }
            AnyType anyType30 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Integer.class), bool));
            if (anyType30 == null) {
                anyType30 = new AnyType(new LazyKType(D.b(Integer.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Integer.TYPE);
                    }
                }), converters21);
            }
            AnyType[] anyTypeArr7 = {anyType29, anyType30};
            ReturnType returnType7 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType7 == null) {
                returnType7 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType7);
            }
            classComponentBuilder3.getSyncFunctions().put("offset", new SyncFunctionComponent("offset", anyTypeArr7, returnType7, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((Query) objArr[0]).offset(((Number) objArr[1]).intValue());
                }
            }));
            TypeConverterProvider converters22 = classComponentBuilder3.getConverters();
            AnyType anyType31 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType31 == null) {
                anyType31 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$7
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters22);
            }
            AnyType anyType32 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls5), bool));
            if (anyType32 == null) {
                anyType32 = new AnyType(new LazyKType(D.b(cls5), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Album.class);
                    }
                }), converters22);
            }
            AnyType[] anyTypeArr8 = {anyType31, anyType32};
            ReturnType returnType8 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType8 == null) {
                returnType8 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType8);
            }
            classComponentBuilder3.getSyncFunctions().put("album", new SyncFunctionComponent("album", anyTypeArr8, returnType8, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    return ((Query) objArr[0]).album((Album) objArr[1]);
                }
            }));
            TypeConverterProvider converters23 = classComponentBuilder3.getConverters();
            AnyType anyType33 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType33 == null) {
                anyType33 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$10
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters23);
            }
            AnyType anyType34 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType34 == null) {
                anyType34 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$11
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AssetField.class);
                    }
                }), converters23);
            }
            AnyType anyType35 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Either.class), bool));
            if (anyType35 == null) {
                anyType35 = new AnyType(new LazyKType(D.b(Either.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$12
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.q(Either.class, aVar.d(D.o(MediaType.class)), aVar.d(D.o(Long.TYPE)));
                    }
                }), converters23);
            }
            AnyType[] anyTypeArr9 = {anyType33, anyType34, anyType35};
            ReturnType returnType9 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType9 == null) {
                returnType9 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType9);
            }
            classComponentBuilder3.getSyncFunctions().put("eq", new SyncFunctionComponent("eq", anyTypeArr9, returnType9, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    AssetField assetField = (AssetField) obj2;
                    return ((Query) obj).eq(assetField, MediaStoreQueryFormatter.INSTANCE.parse(assetField, (Either<MediaType, Long>) objArr[2]));
                }
            }));
            TypeConverterProvider converters24 = classComponentBuilder3.getConverters();
            AnyType anyType36 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType36 == null) {
                anyType36 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$14
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters24);
            }
            AnyType anyType37 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType37 == null) {
                anyType37 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$15
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AssetField.class);
                    }
                }), converters24);
            }
            AnyType anyType38 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType38 == null) {
                anyType38 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$16
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.p(List.class, aVar.d(D.q(Either.class, aVar.d(D.o(MediaType.class)), aVar.d(D.o(Long.TYPE)))));
                    }
                }), converters24);
            }
            AnyType[] anyTypeArr10 = {anyType36, anyType37, anyType38};
            ReturnType returnType10 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType10 == null) {
                returnType10 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType10);
            }
            classComponentBuilder3.getSyncFunctions().put("within", new SyncFunctionComponent("within", anyTypeArr10, returnType10, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$17
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    List list = (List) objArr[2];
                    AssetField assetField = (AssetField) obj2;
                    Query query = (Query) obj;
                    ArrayList arrayList = new ArrayList(AbstractC2800q.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(MediaStoreQueryFormatter.INSTANCE.parse(assetField, (Either<MediaType, Long>) it.next()));
                    }
                    return query.within(assetField, arrayList);
                }
            }));
            TypeConverterProvider converters25 = classComponentBuilder3.getConverters();
            AnyType anyType39 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType39 == null) {
                anyType39 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$18
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters25);
            }
            AnyType anyType40 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType40 == null) {
                anyType40 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$19
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AssetField.class);
                    }
                }), converters25);
            }
            AnyType anyType41 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Long.class), bool));
            if (anyType41 == null) {
                anyType41 = new AnyType(new LazyKType(D.b(Long.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$20
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Long.TYPE);
                    }
                }), converters25);
            }
            AnyType[] anyTypeArr11 = {anyType39, anyType40, anyType41};
            ReturnType returnType11 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType11 == null) {
                returnType11 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType11);
            }
            classComponentBuilder3.getSyncFunctions().put("gt", new SyncFunctionComponent("gt", anyTypeArr11, returnType11, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$21
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    AssetField assetField = (AssetField) obj2;
                    return ((Query) obj).gt(assetField, MediaStoreQueryFormatter.INSTANCE.parse(assetField, ((Number) objArr[2]).longValue()));
                }
            }));
            TypeConverterProvider converters26 = classComponentBuilder3.getConverters();
            AnyType anyType42 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType42 == null) {
                anyType42 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$22
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters26);
            }
            AnyType anyType43 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType43 == null) {
                anyType43 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$23
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AssetField.class);
                    }
                }), converters26);
            }
            AnyType anyType44 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Long.class), bool));
            if (anyType44 == null) {
                anyType44 = new AnyType(new LazyKType(D.b(Long.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$24
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Long.TYPE);
                    }
                }), converters26);
            }
            AnyType[] anyTypeArr12 = {anyType42, anyType43, anyType44};
            ReturnType returnType12 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType12 == null) {
                returnType12 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType12);
            }
            classComponentBuilder3.getSyncFunctions().put("gte", new SyncFunctionComponent("gte", anyTypeArr12, returnType12, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$25
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    AssetField assetField = (AssetField) obj2;
                    return ((Query) obj).gte(assetField, MediaStoreQueryFormatter.INSTANCE.parse(assetField, ((Number) objArr[2]).longValue()));
                }
            }));
            TypeConverterProvider converters27 = classComponentBuilder3.getConverters();
            AnyType anyType45 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType45 == null) {
                anyType45 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$26
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters27);
            }
            AnyType anyType46 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType46 == null) {
                anyType46 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$27
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AssetField.class);
                    }
                }), converters27);
            }
            AnyType anyType47 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Long.class), bool));
            if (anyType47 == null) {
                anyType47 = new AnyType(new LazyKType(D.b(Long.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$28
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Long.TYPE);
                    }
                }), converters27);
            }
            AnyType[] anyTypeArr13 = {anyType45, anyType46, anyType47};
            ReturnType returnType13 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType13 == null) {
                returnType13 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType13);
            }
            classComponentBuilder3.getSyncFunctions().put("lt", new SyncFunctionComponent("lt", anyTypeArr13, returnType13, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$29
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    AssetField assetField = (AssetField) obj2;
                    return ((Query) obj).lt(assetField, MediaStoreQueryFormatter.INSTANCE.parse(assetField, ((Number) objArr[2]).longValue()));
                }
            }));
            TypeConverterProvider converters28 = classComponentBuilder3.getConverters();
            AnyType anyType48 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType48 == null) {
                anyType48 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$30
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters28);
            }
            AnyType anyType49 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls4), bool));
            if (anyType49 == null) {
                anyType49 = new AnyType(new LazyKType(D.b(cls4), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$31
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(AssetField.class);
                    }
                }), converters28);
            }
            AnyType anyType50 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Long.class), bool));
            if (anyType50 == null) {
                anyType50 = new AnyType(new LazyKType(D.b(Long.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$32
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Long.TYPE);
                    }
                }), converters28);
            }
            AnyType[] anyTypeArr14 = {anyType48, anyType49, anyType50};
            ReturnType returnType14 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType14 == null) {
                returnType14 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType14);
            }
            classComponentBuilder3.getSyncFunctions().put("lte", new SyncFunctionComponent("lte", anyTypeArr14, returnType14, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$33
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Object obj2 = objArr[1];
                    AssetField assetField = (AssetField) obj2;
                    return ((Query) obj).lte(assetField, MediaStoreQueryFormatter.INSTANCE.parse(assetField, ((Number) objArr[2]).longValue()));
                }
            }));
            TypeConverterProvider converters29 = classComponentBuilder3.getConverters();
            AnyType anyType51 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType51 == null) {
                anyType51 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$34
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters29);
            }
            AnyType anyType52 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Either.class), bool));
            if (anyType52 == null) {
                anyType52 = new AnyType(new LazyKType(D.b(Either.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$35
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.q(Either.class, aVar.d(D.o(AssetField.class)), aVar.d(D.o(SortDescriptor.class)));
                    }
                }), converters29);
            }
            AnyType[] anyTypeArr15 = {anyType51, anyType52};
            ReturnType returnType15 = returnTypeProvider.getTypes().get(D.b(Query.class));
            if (returnType15 == null) {
                returnType15 = new ReturnType(D.b(Query.class));
                returnTypeProvider.getTypes().put(D.b(Query.class), returnType15);
            }
            classComponentBuilder3.getSyncFunctions().put("orderBy", new SyncFunctionComponent("orderBy", anyTypeArr15, returnType15, new Function1() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Function$36
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    AbstractC2855l.g(objArr, "<destruct>");
                    Object obj = objArr[0];
                    Either either = (Either) objArr[1];
                    Query query = (Query) obj;
                    return either.isFirstType(D.b(AssetField.class)) ? query.orderBy(new SortDescriptor((AssetField) either.getFirstType(D.b(AssetField.class)), null, 2, null)) : query.orderBy((SortDescriptor) either.getSecondType(D.b(SortDescriptor.class)));
                }
            }));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction18 = classComponentBuilder3.AsyncFunction("exe");
            String name18 = asyncFunctionBuilderAsyncFunction18.getName();
            TypeConverterProvider converters30 = asyncFunctionBuilderAsyncFunction18.getConverters();
            AnyType anyType53 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Query.class), bool));
            if (anyType53 == null) {
                anyType53 = new AnyType(new LazyKType(D.b(Query.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Query.class);
                    }
                }), converters30);
            }
            asyncFunctionBuilderAsyncFunction18.setAsyncFunctionComponent(new SuspendFunctionComponent(name18, new AnyType[]{anyType53}, new MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Coroutine$2(null)));
            moduleDefinitionBuilder.getClassData().add(classComponentBuilder3.buildClass());
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction19 = moduleDefinitionBuilder3.AsyncFunction("createAsset");
            String name19 = asyncFunctionBuilderAsyncFunction19.getName();
            TypeConverterProvider converters31 = asyncFunctionBuilderAsyncFunction19.getConverters();
            AnyType anyType54 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Uri.class), bool));
            if (anyType54 == null) {
                anyType54 = new AnyType(new LazyKType(D.b(Uri.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Uri.class);
                    }
                }), converters31);
            }
            C7.d dVarB5 = D.b(cls5);
            Boolean bool2 = Boolean.TRUE;
            AnyType anyType55 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, bool2));
            if (anyType55 == null) {
                anyType55 = new AnyType(new LazyKType(D.b(cls5), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.f(Album.class);
                    }
                }), converters31);
            }
            asyncFunctionBuilderAsyncFunction19.setAsyncFunctionComponent(new SuspendFunctionComponent(name19, new AnyType[]{anyType54, anyType55}, new MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$3(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction20 = moduleDefinitionBuilder3.AsyncFunction("createAlbum");
            String name20 = asyncFunctionBuilderAsyncFunction20.getName();
            TypeConverterProvider converters32 = asyncFunctionBuilderAsyncFunction20.getConverters();
            AnyType anyType56 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType56 == null) {
                anyType56 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters32);
            }
            AnyType anyType57 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Either.class), bool));
            if (anyType57 == null) {
                anyType57 = new AnyType(new LazyKType(D.b(Either.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        q.a aVar = q.f518c;
                        return D.q(Either.class, aVar.d(D.p(List.class, aVar.d(D.o(Asset.class)))), aVar.d(D.p(List.class, aVar.d(D.o(Uri.class)))));
                    }
                }), converters32);
            }
            AnyType anyType58 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Boolean.class), bool));
            if (anyType58 == null) {
                anyType58 = new AnyType(new LazyKType(D.b(Boolean.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$6
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters32);
            }
            asyncFunctionBuilderAsyncFunction20.setAsyncFunctionComponent(new SuspendFunctionComponent(name20, new AnyType[]{anyType56, anyType57, anyType58}, new MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$7(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction21 = moduleDefinitionBuilder3.AsyncFunction("getAlbum");
            String name21 = asyncFunctionBuilderAsyncFunction21.getName();
            TypeConverterProvider converters33 = asyncFunctionBuilderAsyncFunction21.getConverters();
            AnyType anyType59 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls), bool));
            if (anyType59 == null) {
                anyType59 = new AnyType(new LazyKType(D.b(cls), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$8
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(String.class);
                    }
                }), converters33);
            }
            asyncFunctionBuilderAsyncFunction21.setAsyncFunctionComponent(new SuspendFunctionComponent(name21, new AnyType[]{anyType59}, new MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$9(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction22 = moduleDefinitionBuilder3.AsyncFunction("deleteAlbums");
            String name22 = asyncFunctionBuilderAsyncFunction22.getName();
            TypeConverterProvider converters34 = asyncFunctionBuilderAsyncFunction22.getConverters();
            AnyType anyType60 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType60 == null) {
                anyType60 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$10
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(List.class, q.f518c.d(D.o(Album.class)));
                    }
                }), converters34);
            }
            asyncFunctionBuilderAsyncFunction22.setAsyncFunctionComponent(new SuspendFunctionComponent(name22, new AnyType[]{anyType60}, new MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$11(null, this)));
            AsyncFunctionBuilder asyncFunctionBuilderAsyncFunction23 = moduleDefinitionBuilder3.AsyncFunction("deleteAssets");
            String name23 = asyncFunctionBuilderAsyncFunction23.getName();
            TypeConverterProvider converters35 = asyncFunctionBuilderAsyncFunction23.getConverters();
            AnyType anyType61 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool));
            if (anyType61 == null) {
                anyType61 = new AnyType(new LazyKType(D.b(cls3), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$12
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.p(List.class, q.f518c.d(D.o(Asset.class)));
                    }
                }), converters35);
            }
            asyncFunctionBuilderAsyncFunction23.setAsyncFunctionComponent(new SuspendFunctionComponent(name23, new AnyType[]{anyType61}, new MediaLibraryNextModule$definition$lambda$53$$inlined$Coroutine$13(null, this)));
            TypeConverterProvider converters36 = moduleDefinitionBuilder3.getConverters();
            AnyType anyType62 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Boolean.class), bool));
            if (anyType62 == null) {
                anyType62 = new AnyType(new LazyKType(D.b(Boolean.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$1
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters36);
            }
            AnyType anyType63 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool2));
            if (anyType63 == null) {
                anyType63 = new AnyType(new LazyKType(D.b(cls3), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$2
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.g(List.class, q.f518c.d(D.o(GranularPermission.class)));
                    }
                }), converters36);
            }
            moduleDefinitionBuilder3.getAsyncFunctions().put("requestPermissionsAsync", new AsyncFunctionWithPromiseComponent("requestPermissionsAsync", new AnyType[]{anyType62, anyType63}, new Function2() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$3
                public final void invoke(Object[] objArr, Promise promise) throws PermissionException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    List<? extends GranularPermission> list = (List) objArr[1];
                    this.this$0.getSystemPermissionsDelegate().requestPermissions(((Boolean) obj).booleanValue(), list, promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws PermissionException {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            TypeConverterProvider converters37 = moduleDefinitionBuilder3.getConverters();
            AnyType anyType64 = anyTypeProvider.getTypesMap().get(new Pair(D.b(Boolean.class), bool));
            if (anyType64 == null) {
                anyType64 = new AnyType(new LazyKType(D.b(Boolean.class), false, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$4
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.o(Boolean.TYPE);
                    }
                }), converters37);
            }
            AnyType anyType65 = anyTypeProvider.getTypesMap().get(new Pair(D.b(cls3), bool2));
            if (anyType65 == null) {
                anyType65 = new AnyType(new LazyKType(D.b(cls3), true, new InterfaceC3487a() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$5
                    @Override // w7.InterfaceC3487a
                    public final o invoke() {
                        return D.g(List.class, q.f518c.d(D.o(GranularPermission.class)));
                    }
                }), converters37);
            }
            moduleDefinitionBuilder3.getAsyncFunctions().put("getPermissionsAsync", new AsyncFunctionWithPromiseComponent("getPermissionsAsync", new AnyType[]{anyType64, anyType65}, new Function2() { // from class: expo.modules.medialibrary.next.MediaLibraryNextModule$definition$lambda$53$$inlined$AsyncFunctionWithPromise$6
                public final void invoke(Object[] objArr, Promise promise) throws PermissionException {
                    AbstractC2855l.g(objArr, "<destruct>");
                    AbstractC2855l.g(promise, "promise");
                    Object obj = objArr[0];
                    List<? extends GranularPermission> list = (List) objArr[1];
                    this.this$0.getSystemPermissionsDelegate().getPermissions(((Boolean) obj).booleanValue(), list, promise);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws PermissionException {
                    invoke((Object[]) obj, (Promise) obj2);
                    return C2735B.f28704a;
                }
            }));
            moduleDefinitionBuilder3.RegisterActivityContracts(new MediaLibraryNextModule$definition$1$11(this, null));
            ModuleDefinitionData moduleDefinitionDataBuildModule = moduleDefinitionBuilder3.buildModule();
            AbstractC2861a.f();
            return moduleDefinitionDataBuildModule;
        } catch (Throwable th) {
            AbstractC2861a.f();
            throw th;
        }
    }
}
