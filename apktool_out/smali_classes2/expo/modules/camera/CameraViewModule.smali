.class public final Lexpo/modules/camera/CameraViewModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/camera/CameraViewModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/camera/CameraViewModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "definition",
        "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "LR8/N;",
        "moduleScope",
        "LR8/N;",
        "Ljava/io/File;",
        "getCacheDirectory",
        "()Ljava/io/File;",
        "cacheDirectory",
        "Lexpo/modules/interfaces/permissions/Permissions;",
        "getPermissionsManager",
        "()Lexpo/modules/interfaces/permissions/Permissions;",
        "permissionsManager",
        "Companion",
        "expo-camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lexpo/modules/camera/CameraViewModule$Companion;

.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final moduleScope:LR8/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/camera/CameraViewModule$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/camera/CameraViewModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/camera/CameraViewModule;->Companion:Lexpo/modules/camera/CameraViewModule$Companion;

    .line 8
    .line 9
    const-class v0, Lexpo/modules/camera/CameraViewModule;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lexpo/modules/camera/CameraViewModule;->TAG:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LR8/d0;->c()LR8/K0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, LR8/O;->a(Ln7/j;)LR8/N;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lexpo/modules/camera/CameraViewModule;->moduleScope:LR8/N;

    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic access$getCacheDirectory(Lexpo/modules/camera/CameraViewModule;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/camera/CameraViewModule;->getCacheDirectory()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getModuleScope$p(Lexpo/modules/camera/CameraViewModule;)LR8/N;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/camera/CameraViewModule;->moduleScope:LR8/N;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getPermissionsManager(Lexpo/modules/camera/CameraViewModule;)Lexpo/modules/interfaces/permissions/Permissions;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/camera/CameraViewModule;->getPermissionsManager()Lexpo/modules/interfaces/permissions/Permissions;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getTAG$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/camera/CameraViewModule;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method private final getCacheDirectory()Ljava/io/File;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getCacheDirectory()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method private final getPermissionsManager()Lexpo/modules/interfaces/permissions/Permissions;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getPermissions()Lexpo/modules/interfaces/permissions/Permissions;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$PermissionsModuleNotFound;

    .line 13
    .line 14
    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$PermissionsModuleNotFound;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 37

    move-object/from16 v1, p0

    .line 1
    const-class v0, Ljava/lang/Float;

    const-class v2, Lexpo/modules/camera/records/FlashMode;

    const-class v3, Lexpo/modules/camera/records/CameraType;

    const-class v4, Lexpo/modules/camera/SavePictureOptions;

    const-class v5, Ljava/util/List;

    const-class v6, Lexpo/modules/camera/records/BarcodeSettings;

    const-string v7, "get"

    const-class v8, Lexpo/modules/camera/PictureRef;

    const-class v9, Ljava/lang/Integer;

    const-class v10, Lexpo/modules/camera/ExpoCameraView;

    const-class v11, Lexpo/modules/kotlin/Promise;

    const-class v12, Ljava/lang/Boolean;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, ".ModuleDefinition"

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 3
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "["

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "ExpoModulesCore"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "] "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 4
    invoke-static {v13}, Ll1/a;->c(Ljava/lang/String;)V

    .line 5
    :try_start_0
    new-instance v13, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    invoke-direct {v13, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 6
    const-string v14, "ExpoCamera"

    invoke-virtual {v13, v14}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 7
    const-string v14, "onModernBarcodeScanned"

    filled-new-array {v14}, [Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->Events([Ljava/lang/String;)V

    .line 8
    const-string v14, "isModernBarcodeScannerAvailable"

    .line 9
    new-instance v15, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;

    invoke-direct {v15, v14}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v16, v2

    .line 10
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    move-object/from16 v17, v3

    const/4 v3, 0x0

    move-object/from16 v18, v4

    new-array v4, v3, [Lexpo/modules/kotlin/types/AnyType;

    .line 11
    sget-object v19, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 12
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v3

    move-object/from16 v20, v6

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v3, :cond_0

    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v3, v6}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 13
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v6

    move-object/from16 v21, v8

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    invoke-interface {v6, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_19

    :cond_0
    move-object/from16 v21, v8

    .line 14
    :goto_0
    new-instance v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Property$1;

    invoke-direct {v6, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Property$1;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    invoke-direct {v2, v7, v4, v3, v6}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v15, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 15
    invoke-virtual {v13}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    const-string v2, "toggleRecordingAsyncAvailable"

    .line 17
    new-instance v3, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;

    invoke-direct {v3, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    new-instance v4, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v6, 0x0

    new-array v8, v6, [Lexpo/modules/kotlin/types/AnyType;

    .line 19
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v6

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v6, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v6, :cond_1

    new-instance v6, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-direct {v6, v14}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 20
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v14

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    invoke-interface {v14, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    :cond_1
    new-instance v14, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Property$2;

    invoke-direct {v14}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Property$2;-><init>()V

    invoke-direct {v4, v7, v8, v6, v14}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 22
    invoke-virtual {v13}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    const-string v2, "requestCameraPermissionsAsync"

    .line 24
    invoke-static {v11, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v6, Li7/B;

    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v14, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    move/from16 v22, v3

    const-class v3, Ljava/lang/String;

    if-eqz v22, :cond_2

    move-object/from16 v22, v9

    .line 25
    :try_start_1
    new-instance v9, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    move-object/from16 v23, v10

    move-object/from16 v24, v12

    const/4 v10, 0x0

    new-array v12, v10, [Lexpo/modules/kotlin/types/AnyType;

    .line 26
    new-instance v10, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$1;

    invoke-direct {v10, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$1;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 27
    invoke-direct {v9, v2, v12, v10}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v25, v5

    move-object/from16 v27, v7

    move-object/from16 v26, v13

    goto/16 :goto_2

    :cond_2
    move-object/from16 v22, v9

    move-object/from16 v23, v10

    move-object/from16 v24, v12

    .line 28
    invoke-virtual {v13}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 29
    sget-object v10, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 30
    new-instance v12, Lkotlin/Pair;

    move-object/from16 v25, v10

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    move-object/from16 v26, v13

    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v12, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    invoke-virtual/range {v25 .. v25}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_3

    .line 32
    sget-object v10, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$2;

    .line 33
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 34
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v25, v5

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    move-object/from16 v27, v7

    const/4 v7, 0x0

    invoke-direct {v13, v5, v7, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 35
    invoke-direct {v12, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v12

    goto :goto_1

    :cond_3
    move-object/from16 v25, v5

    move-object/from16 v27, v7

    .line 36
    :goto_1
    filled-new-array {v10}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 37
    new-instance v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$3;

    invoke-direct {v7, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$3;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 38
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 39
    new-instance v9, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 40
    :cond_4
    invoke-static {v6, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 41
    new-instance v9, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 42
    :cond_5
    invoke-static {v6, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 43
    new-instance v9, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 44
    :cond_6
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 45
    new-instance v9, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 46
    :cond_7
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 47
    new-instance v9, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_2

    .line 48
    :cond_8
    new-instance v9, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 49
    :goto_2
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    const-string v2, "requestMicrophonePermissionsAsync"

    .line 51
    invoke-static {v11, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 52
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    const/4 v7, 0x0

    new-array v9, v7, [Lexpo/modules/kotlin/types/AnyType;

    .line 53
    new-instance v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$4;

    invoke-direct {v7, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$4;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 54
    invoke-direct {v5, v2, v9, v7}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_4

    .line 55
    :cond_9
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 56
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 57
    new-instance v9, Lkotlin/Pair;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v10, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_a

    .line 59
    sget-object v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$5;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$5;

    .line 60
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 61
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x0

    invoke-direct {v10, v12, v13, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 62
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 63
    :cond_a
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 64
    new-instance v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$6;

    invoke-direct {v7, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$6;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 65
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    .line 66
    new-instance v9, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_3
    move-object v5, v9

    goto :goto_4

    .line 67
    :cond_b
    invoke-static {v6, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    .line 68
    new-instance v9, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 69
    :cond_c
    invoke-static {v6, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    .line 70
    new-instance v9, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 71
    :cond_d
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    .line 72
    new-instance v9, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 73
    :cond_e
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    .line 74
    new-instance v9, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 75
    :cond_f
    new-instance v9, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 76
    :goto_4
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    const-string v2, "getCameraPermissionsAsync"

    .line 78
    invoke-static {v11, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    .line 79
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    const/4 v7, 0x0

    new-array v9, v7, [Lexpo/modules/kotlin/types/AnyType;

    .line 80
    new-instance v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$7;

    invoke-direct {v7, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$7;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 81
    invoke-direct {v5, v2, v9, v7}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_6

    .line 82
    :cond_10
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 83
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 84
    new-instance v9, Lkotlin/Pair;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v10, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 85
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_11

    .line 86
    sget-object v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$8;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$8;

    .line 87
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 88
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x0

    invoke-direct {v10, v12, v13, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 89
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 90
    :cond_11
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 91
    new-instance v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$9;

    invoke-direct {v7, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$9;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 92
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    .line 93
    new-instance v9, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_5
    move-object v5, v9

    goto :goto_6

    .line 94
    :cond_12
    invoke-static {v6, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_13

    .line 95
    new-instance v9, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_5

    .line 96
    :cond_13
    invoke-static {v6, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_14

    .line 97
    new-instance v9, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_5

    .line 98
    :cond_14
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_15

    .line 99
    new-instance v9, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_5

    .line 100
    :cond_15
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_16

    .line 101
    new-instance v9, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_5

    .line 102
    :cond_16
    new-instance v9, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_5

    .line 103
    :goto_6
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    const-string v2, "getMicrophonePermissionsAsync"

    .line 105
    invoke-static {v11, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_17

    .line 106
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    const/4 v7, 0x0

    new-array v9, v7, [Lexpo/modules/kotlin/types/AnyType;

    .line 107
    new-instance v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$10;

    invoke-direct {v7, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$10;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 108
    invoke-direct {v5, v2, v9, v7}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_8

    .line 109
    :cond_17
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 110
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 111
    new-instance v9, Lkotlin/Pair;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v9, v10, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_18

    .line 113
    sget-object v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$11;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$11;

    .line 114
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 115
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v13, 0x0

    invoke-direct {v10, v11, v13, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 116
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v9

    .line 117
    :cond_18
    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 118
    new-instance v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$12;

    invoke-direct {v7, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunction$12;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 119
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_19

    .line 120
    new-instance v9, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_7
    move-object v5, v9

    goto :goto_8

    .line 121
    :cond_19
    invoke-static {v6, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1a

    .line 122
    new-instance v9, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 123
    :cond_1a
    invoke-static {v6, v14}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1b

    .line 124
    new-instance v9, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 125
    :cond_1b
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1c

    .line 126
    new-instance v9, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 127
    :cond_1c
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1d

    .line 128
    new-instance v9, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 129
    :cond_1d
    new-instance v9, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v9, v2, v5, v7}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 130
    :goto_8
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    const-string v2, "scanFromURLAsync"

    .line 132
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v7

    .line 133
    sget-object v9, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 134
    new-instance v10, Lkotlin/Pair;

    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v10, v11, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_1e

    .line 136
    sget-object v10, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$1;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$1;

    .line 137
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 138
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v28, v9

    invoke-static {v3}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    move-object/from16 v29, v6

    const/4 v6, 0x0

    invoke-direct {v13, v9, v6, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 139
    invoke-direct {v11, v13, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v11

    goto :goto_9

    :cond_1e
    move-object/from16 v29, v6

    move-object/from16 v28, v9

    .line 140
    :goto_9
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v6, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_1f

    .line 142
    sget-object v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$2;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$2;

    .line 143
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 144
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    move-object/from16 v30, v3

    const/4 v3, 0x0

    invoke-direct {v11, v13, v3, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 145
    invoke-direct {v9, v11, v7}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v9

    goto :goto_a

    :cond_1f
    move-object/from16 v30, v3

    .line 146
    :goto_a
    filled-new-array {v10, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 147
    new-instance v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3;

    invoke-direct {v6, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$3;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 148
    invoke-direct {v5, v2, v3, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 149
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    const-string v2, "launchScanner"

    .line 151
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 152
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 153
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_20

    .line 154
    sget-object v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$4;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$4;

    .line 155
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 156
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v13, 0x0

    invoke-direct {v9, v10, v13, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 157
    invoke-direct {v7, v9, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 158
    :cond_20
    filled-new-array {v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 159
    new-instance v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;

    invoke-direct {v6, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 160
    invoke-direct {v3, v2, v5, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 161
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    const-string v2, "dismissScanner"

    const/4 v7, 0x0

    .line 163
    new-array v3, v7, [Lexpo/modules/kotlin/types/AnyType;

    new-instance v5, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithoutArgs$1;

    invoke-direct {v5}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithoutArgs$1;-><init>()V

    .line 164
    new-instance v6, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v6, v2, v3, v5}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 165
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lexpo/modules/kotlin/events/EventName;->MODULE_DESTROY:Lexpo/modules/kotlin/events/EventName;

    new-instance v5, Lexpo/modules/kotlin/events/BasicEventListener;

    new-instance v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$OnDestroy$1;

    invoke-direct {v6, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$OnDestroy$1;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    invoke-direct {v5, v3, v6}, Lexpo/modules/kotlin/events/BasicEventListener;-><init>(Lexpo/modules/kotlin/events/EventName;Lw7/a;)V

    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    const-string v33, "Picture"

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v34

    .line 168
    new-instance v31, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 169
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    move-result-object v2

    if-eqz v2, :cond_58

    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v32

    .line 170
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-direct {v2, v3, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 171
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    const/4 v3, 0x0

    if-nez v2, :cond_21

    .line 172
    sget-object v2, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Class$1;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$Class$1;

    .line 173
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 174
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v13, 0x0

    invoke-direct {v6, v7, v13, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 175
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v35, v5

    goto :goto_b

    :cond_21
    move-object/from16 v35, v2

    .line 176
    :goto_b
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v36

    .line 177
    invoke-direct/range {v31 .. v36}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 178
    const-string v2, "width"

    .line 179
    new-instance v5, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v6

    invoke-virtual {v6}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v6

    invoke-direct {v5, v6, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 180
    new-instance v6, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v9

    const/4 v10, 0x2

    invoke-direct {v7, v9, v3, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v7

    .line 181
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v9

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-interface {v9, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v9, :cond_22

    new-instance v9, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v9, v11}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 182
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v11

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-interface {v11, v13, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    :cond_22
    new-instance v11, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$Property$1;

    invoke-direct {v11}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$Property$1;-><init>()V

    move-object/from16 v13, v27

    .line 184
    invoke-direct {v6, v13, v7, v9, v11}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 185
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v7

    invoke-virtual {v6, v7}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v7, 0x1

    .line 186
    invoke-virtual {v6, v7}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 187
    invoke-virtual {v5, v6}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 188
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    const-string v2, "height"

    .line 190
    new-instance v5, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v6

    invoke-virtual {v6}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v6

    invoke-direct {v5, v6, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 191
    new-instance v6, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v11

    invoke-direct {v9, v11, v3, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 192
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v10, :cond_23

    new-instance v10, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 193
    invoke-virtual/range {v19 .. v19}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v11

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-interface {v11, v3, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    :cond_23
    new-instance v3, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$Property$2;

    invoke-direct {v3}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$Property$2;-><init>()V

    .line 195
    invoke-direct {v6, v13, v9, v10, v3}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 196
    invoke-virtual {v5}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v3

    invoke-virtual {v6, v3}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    .line 197
    invoke-virtual {v6, v7}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 198
    invoke-virtual {v5, v6}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 199
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    const-string v2, "savePictureAsync"

    .line 201
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 202
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v6, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 203
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_24

    .line 204
    sget-object v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$1;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$1;

    .line 205
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 206
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v13, 0x0

    invoke-direct {v10, v11, v13, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 207
    invoke-direct {v9, v10, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v9

    .line 208
    :cond_24
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 209
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_25

    .line 210
    sget-object v9, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$2;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$2;

    .line 211
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 212
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v21, v8

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    invoke-direct {v13, v8, v7, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 213
    invoke-direct {v10, v13, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    goto :goto_c

    :cond_25
    move-object/from16 v21, v8

    .line 214
    :goto_c
    filled-new-array {v6, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 215
    new-instance v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$3;

    invoke-direct {v6, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$18$$inlined$AsyncFunctionWithPromise$3;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 216
    invoke-direct {v3, v2, v5, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 217
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    move-result-object v2

    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    .line 220
    new-instance v3, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;

    .line 221
    new-instance v31, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v32

    .line 222
    sget-object v34, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$View$1;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$View$1;

    const/16 v35, 0x2

    const/16 v36, 0x0

    const/16 v33, 0x0

    .line 223
    invoke-direct/range {v31 .. v36}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v31

    .line 224
    invoke-virtual/range {v26 .. v26}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v6

    .line 225
    invoke-direct {v3, v2, v5, v6}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;-><init>(LC7/d;LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 226
    invoke-static {v3}, Lexpo/modules/kotlin/views/decorators/CSSPropsKt;->UseCSSProps(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 227
    invoke-static {}, Lexpo/modules/camera/CameraViewModuleKt;->getCameraEvents()[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->EventsWithArray([Ljava/lang/String;)V

    .line 228
    const-string v2, "facing"

    new-instance v5, Lexpo/modules/camera/CameraViewModule$definition$1$12$1;

    invoke-direct {v5, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$1;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 229
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v6

    new-instance v8, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 230
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 231
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_26

    .line 232
    sget-object v9, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$1;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$1;

    .line 233
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 234
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v18, v14

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-direct {v13, v14, v7, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v9, 0x0

    .line 235
    invoke-direct {v10, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    goto :goto_d

    :cond_26
    move-object/from16 v18, v14

    .line 236
    :goto_d
    invoke-direct {v8, v2, v9, v5}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    const-string v2, "flashMode"

    new-instance v5, Lexpo/modules/camera/CameraViewModule$definition$1$12$2;

    invoke-direct {v5, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$2;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 238
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v6

    new-instance v8, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 239
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 240
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_27

    .line 241
    sget-object v9, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$2;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$2;

    .line 242
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 243
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-direct {v13, v14, v7, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v9, 0x0

    .line 244
    invoke-direct {v10, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 245
    :cond_27
    invoke-direct {v8, v2, v9, v5}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    const-string v2, "enableTorch"

    new-instance v5, Lexpo/modules/camera/CameraViewModule$definition$1$12$3;

    invoke-direct {v5, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$3;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 247
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v6

    new-instance v8, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 248
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 249
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_28

    .line 250
    sget-object v9, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$3;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$3;

    .line 251
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 252
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-direct {v13, v14, v7, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v9, 0x0

    .line 253
    invoke-direct {v10, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 254
    :cond_28
    invoke-direct {v8, v2, v9, v5}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    const-string v2, "animateShutter"

    sget-object v5, Lexpo/modules/camera/CameraViewModule$definition$1$12$4;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$1$12$4;

    .line 256
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v6

    new-instance v8, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 257
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_29

    .line 259
    sget-object v9, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$4;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$4;

    .line 260
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 261
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-direct {v13, v14, v7, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v9, 0x0

    .line 262
    invoke-direct {v10, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 263
    :cond_29
    invoke-direct {v8, v2, v9, v5}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    const-string v2, "zoom"

    new-instance v5, Lexpo/modules/camera/CameraViewModule$definition$1$12$5;

    invoke-direct {v5, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$5;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 265
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v6

    new-instance v8, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 266
    new-instance v9, Lkotlin/Pair;

    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 267
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_2a

    .line 268
    sget-object v9, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$5;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$5;

    .line 269
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 270
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v0

    invoke-direct {v13, v0, v7, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v9, 0x0

    .line 271
    invoke-direct {v10, v13, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 272
    :cond_2a
    invoke-direct {v8, v2, v9, v5}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v6, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    const-string v0, "mode"

    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$6;

    invoke-direct {v2, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$6;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 274
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 275
    new-instance v8, Lkotlin/Pair;

    const-class v9, Lexpo/modules/camera/records/CameraMode;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 276
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_2b

    .line 277
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$6;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$6;

    .line 278
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 279
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const-class v13, Lexpo/modules/camera/records/CameraMode;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 280
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 281
    :cond_2b
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    const-string v0, "mute"

    sget-object v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$7;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$1$12$7;

    .line 283
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 284
    new-instance v8, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 285
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_2c

    .line 286
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$7;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$7;

    .line 287
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 288
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 289
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 290
    :cond_2c
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    const-string v0, "videoQuality"

    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$8;

    invoke-direct {v2, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$8;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 292
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 293
    new-instance v8, Lkotlin/Pair;

    const-class v9, Lexpo/modules/camera/records/VideoQuality;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 294
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_2d

    .line 295
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$8;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$8;

    .line 296
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 297
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const-class v13, Lexpo/modules/camera/records/VideoQuality;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 298
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 299
    :cond_2d
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    const-string v0, "videoStabilizationMode"

    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$9;

    invoke-direct {v2, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$9;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 301
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 302
    new-instance v8, Lkotlin/Pair;

    const-class v9, Lexpo/modules/camera/records/VideoStabilizationMode;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 303
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_2e

    .line 304
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$9;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$9;

    .line 305
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 306
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const-class v13, Lexpo/modules/camera/records/VideoStabilizationMode;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 307
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 308
    :cond_2e
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    const-string v0, "barcodeScannerSettings"

    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$10;

    invoke-direct {v2, v1}, Lexpo/modules/camera/CameraViewModule$definition$1$12$10;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 310
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 311
    new-instance v8, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 312
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_2f

    .line 313
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$10;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$10;

    .line 314
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 315
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 316
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 317
    :cond_2f
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    const-string v0, "barcodeScannerEnabled"

    sget-object v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$11;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$1$12$11;

    .line 319
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 320
    new-instance v8, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 321
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_30

    .line 322
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$11;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$11;

    .line 323
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 324
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 325
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 326
    :cond_30
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    const-string v0, "pictureSize"

    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$12;

    invoke-direct {v2, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$12;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 328
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 329
    new-instance v8, Lkotlin/Pair;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 330
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_31

    .line 331
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$12;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$12;

    .line 332
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 333
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 334
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 335
    :cond_31
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    const-string v0, "autoFocus"

    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$13;

    invoke-direct {v2, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$13;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 337
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 338
    new-instance v8, Lkotlin/Pair;

    const-class v9, Lexpo/modules/camera/records/FocusMode;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 339
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_32

    .line 340
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$13;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$13;

    .line 341
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 342
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const-class v13, Lexpo/modules/camera/records/FocusMode;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 343
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 344
    :cond_32
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    const-string v0, "ratio"

    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$14;

    invoke-direct {v2, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$14;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 346
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 347
    new-instance v8, Lkotlin/Pair;

    const-class v9, Lexpo/modules/camera/records/CameraRatio;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 348
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_33

    .line 349
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$14;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$14;

    .line 350
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 351
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const-class v13, Lexpo/modules/camera/records/CameraRatio;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 352
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 353
    :cond_33
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    const-string v0, "mirror"

    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$15;

    invoke-direct {v2, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$15;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 355
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 356
    new-instance v8, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 357
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_34

    .line 358
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$15;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$15;

    .line 359
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 360
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-direct {v10, v13, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 361
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 362
    :cond_34
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    const-string v0, "videoBitrate"

    new-instance v2, Lexpo/modules/camera/CameraViewModule$definition$1$12$16;

    invoke-direct {v2, v3}, Lexpo/modules/camera/CameraViewModule$definition$1$12$16;-><init>(Lexpo/modules/kotlin/views/ViewDefinitionBuilder;)V

    .line 364
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getProps()Ljava/util/Map;

    move-result-object v5

    new-instance v6, Lexpo/modules/kotlin/views/ConcreteViewProp;

    .line 365
    new-instance v8, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v8, v9, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 366
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_35

    .line 367
    sget-object v8, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$16;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$Prop$16;

    .line 368
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 369
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v10, v11, v7, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 370
    invoke-direct {v9, v10, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 371
    :cond_35
    invoke-direct {v6, v0, v8, v2}, Lexpo/modules/kotlin/views/ConcreteViewProp;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$OnViewDidUpdateProps$1;

    invoke-direct {v0}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$OnViewDidUpdateProps$1;-><init>()V

    invoke-virtual {v3, v0}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->setOnViewDidUpdateProps(Lkotlin/jvm/functions/Function1;)V

    .line 373
    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$OnViewDestroys$1;

    invoke-direct {v0}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$OnViewDestroys$1;-><init>()V

    invoke-virtual {v3, v0}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->setOnViewDestroys(Lkotlin/jvm/functions/Function1;)V

    .line 374
    const-string v0, "takePicture"

    .line 375
    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 376
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 377
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_36

    .line 378
    sget-object v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$1;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$1;

    .line 379
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 380
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v13, 0x0

    invoke-direct {v8, v9, v13, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 381
    invoke-direct {v7, v8, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 382
    :cond_36
    new-instance v7, Lkotlin/Pair;

    const-class v8, Lexpo/modules/camera/PictureOptions;

    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    invoke-direct {v7, v8, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 383
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_37

    .line 384
    sget-object v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$2;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$2;

    .line 385
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 386
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    const-class v10, Lexpo/modules/camera/PictureOptions;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v13, 0x0

    invoke-direct {v9, v10, v13, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 387
    invoke-direct {v8, v9, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v8

    .line 388
    :cond_37
    filled-new-array {v6, v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 389
    new-instance v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3;

    invoke-direct {v6, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$3;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 390
    invoke-direct {v2, v0, v5, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 391
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    sget-object v0, Lexpo/modules/kotlin/functions/Queues;->MAIN:Lexpo/modules/kotlin/functions/Queues;

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;->runOnQueue(Lexpo/modules/kotlin/functions/Queues;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;

    .line 393
    const-string v2, "getAvailablePictureSizes"

    .line 394
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 395
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_38

    .line 396
    sget-object v5, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$2;

    .line 397
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 398
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v13, 0x0

    invoke-direct {v7, v8, v13, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v8, 0x0

    .line 399
    invoke-direct {v6, v7, v8}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 400
    :cond_38
    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    .line 401
    new-instance v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$3;

    invoke-direct {v6}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$3;-><init>()V

    move-object/from16 v7, v25

    .line 402
    invoke-static {v7, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_39

    .line 403
    new-instance v7, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v7, v2, v5, v6}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_e
    move-object/from16 v8, v18

    :goto_f
    move-object/from16 v9, v21

    :goto_10
    move-object/from16 v10, v30

    goto :goto_11

    .line 404
    :cond_39
    invoke-static {v7, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3a

    .line 405
    new-instance v7, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v7, v2, v5, v6}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_e

    :cond_3a
    move-object/from16 v8, v18

    .line 406
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3b

    .line 407
    new-instance v7, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v7, v2, v5, v6}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_f

    :cond_3b
    move-object/from16 v9, v21

    .line 408
    invoke-static {v7, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3c

    .line 409
    new-instance v7, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v7, v2, v5, v6}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_10

    :cond_3c
    move-object/from16 v10, v30

    .line 410
    invoke-static {v7, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3d

    .line 411
    new-instance v7, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v7, v2, v5, v6}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_11

    .line 412
    :cond_3d
    new-instance v7, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v7, v2, v5, v6}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 413
    :goto_11
    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    const-string v2, "record"

    .line 415
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    invoke-virtual {v3}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v6

    .line 416
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v7, v11, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 417
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_3e

    .line 418
    sget-object v7, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$4;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$4;

    .line 419
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 420
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    move-object/from16 v16, v3

    const/4 v3, 0x0

    invoke-direct {v13, v14, v3, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 421
    invoke-direct {v11, v13, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v11

    goto :goto_12

    :cond_3e
    move-object/from16 v16, v3

    .line 422
    :goto_12
    new-instance v3, Lkotlin/Pair;

    const-class v11, Lexpo/modules/camera/RecordingOptions;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    invoke-direct {v3, v11, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 423
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_3f

    .line 424
    sget-object v3, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$5;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$5;

    .line 425
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 426
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    const-class v14, Lexpo/modules/camera/RecordingOptions;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    move-object/from16 v30, v10

    const/4 v10, 0x0

    invoke-direct {v13, v14, v10, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 427
    invoke-direct {v11, v13, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v11

    goto :goto_13

    :cond_3f
    move-object/from16 v30, v10

    .line 428
    :goto_13
    filled-new-array {v7, v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 429
    new-instance v6, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6;

    invoke-direct {v6, v1}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunctionWithPromise$6;-><init>(Lexpo/modules/camera/CameraViewModule;)V

    .line 430
    invoke-direct {v5, v2, v3, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 431
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    invoke-virtual {v5, v0}, Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;->runOnQueue(Lexpo/modules/kotlin/functions/Queues;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;

    .line 433
    const-string v2, "toggleRecording"

    .line 434
    new-instance v3, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v3, v5, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 435
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_40

    .line 436
    sget-object v3, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$5;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$5;

    .line 437
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 438
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v13, 0x0

    invoke-direct {v6, v7, v13, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 439
    invoke-direct {v5, v6, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v5

    .line 440
    :cond_40
    filled-new-array {v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 441
    new-instance v5, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$6;

    invoke-direct {v5}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$6;-><init>()V

    move-object/from16 v6, v29

    .line 442
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_41

    .line 443
    new-instance v7, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_14
    move-object/from16 v10, v30

    goto :goto_15

    .line 444
    :cond_41
    invoke-static {v6, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_42

    .line 445
    new-instance v7, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_14

    .line 446
    :cond_42
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_43

    .line 447
    new-instance v7, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_14

    .line 448
    :cond_43
    invoke-static {v6, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_44

    .line 449
    new-instance v7, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_14

    :cond_44
    move-object/from16 v10, v30

    .line 450
    invoke-static {v6, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_45

    .line 451
    new-instance v7, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_15

    .line 452
    :cond_45
    new-instance v7, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 453
    :goto_15
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    const-string v2, "stopRecording"

    .line 455
    new-instance v3, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v3, v5, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 456
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_46

    .line 457
    sget-object v3, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$8;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$8;

    .line 458
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 459
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v13, 0x0

    invoke-direct {v7, v11, v13, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 460
    invoke-direct {v5, v7, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v5

    .line 461
    :cond_46
    filled-new-array {v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 462
    new-instance v5, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$9;

    invoke-direct {v5}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$9;-><init>()V

    .line 463
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_47

    .line 464
    new-instance v7, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_16

    .line 465
    :cond_47
    invoke-static {v6, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_48

    .line 466
    new-instance v7, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_16

    .line 467
    :cond_48
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_49

    .line 468
    new-instance v7, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_16

    .line 469
    :cond_49
    invoke-static {v6, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4a

    .line 470
    new-instance v7, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_16

    .line 471
    :cond_4a
    invoke-static {v6, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4b

    .line 472
    new-instance v7, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_16

    .line 473
    :cond_4b
    new-instance v7, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 474
    :goto_16
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    invoke-virtual {v7, v0}, Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;->runOnQueue(Lexpo/modules/kotlin/functions/Queues;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;

    .line 476
    const-string v0, "resumePreview"

    .line 477
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-direct {v2, v3, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 478
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    if-nez v2, :cond_4c

    .line 479
    sget-object v2, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$11;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$11;

    .line 480
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 481
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v13, 0x0

    invoke-direct {v5, v7, v13, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v2, 0x0

    .line 482
    invoke-direct {v3, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v2, v3

    .line 483
    :cond_4c
    filled-new-array {v2}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 484
    new-instance v3, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$12;

    invoke-direct {v3}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$12;-><init>()V

    .line 485
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4d

    .line 486
    new-instance v5, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v5, v0, v2, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_17

    .line 487
    :cond_4d
    invoke-static {v6, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4e

    .line 488
    new-instance v5, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v5, v0, v2, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_17

    .line 489
    :cond_4e
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4f

    .line 490
    new-instance v5, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v5, v0, v2, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_17

    .line 491
    :cond_4f
    invoke-static {v6, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_50

    .line 492
    new-instance v5, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v5, v0, v2, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_17

    .line 493
    :cond_50
    invoke-static {v6, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_51

    .line 494
    new-instance v5, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v5, v0, v2, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_17

    .line 495
    :cond_51
    new-instance v5, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v5, v0, v2, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 496
    :goto_17
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    const-string v0, "pausePreview"

    .line 498
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-direct {v2, v3, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 499
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    if-nez v2, :cond_52

    .line 500
    sget-object v2, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$14;->INSTANCE:Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$14;

    .line 501
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 502
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v13, 0x0

    invoke-direct {v5, v7, v13, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v2, 0x0

    .line 503
    invoke-direct {v3, v5, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v2, v3

    .line 504
    :cond_52
    filled-new-array {v2}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 505
    new-instance v3, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$15;

    invoke-direct {v3}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$lambda$28$$inlined$AsyncFunction$15;-><init>()V

    .line 506
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_53

    .line 507
    new-instance v4, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_18

    .line 508
    :cond_53
    invoke-static {v6, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_54

    .line 509
    new-instance v4, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_18

    .line 510
    :cond_54
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_55

    .line 511
    new-instance v4, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_18

    .line 512
    :cond_55
    invoke-static {v6, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_56

    .line 513
    new-instance v4, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_18

    .line 514
    :cond_56
    invoke-static {v6, v10}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_57

    .line 515
    new-instance v4, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_18

    .line 516
    :cond_57
    new-instance v4, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v4, v0, v2, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 517
    :goto_18
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/views/ViewDefinitionBuilder;->build()Lexpo/modules/kotlin/views/ViewManagerDefinition;

    move-result-object v0

    move-object/from16 v2, v26

    invoke-virtual {v2, v0}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->registerViewDefinition(Lexpo/modules/kotlin/views/ViewManagerDefinition;)V

    .line 519
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 520
    invoke-static {}, Ll1/a;->f()V

    return-object v0

    .line 521
    :cond_58
    :try_start_2
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 522
    :goto_19
    invoke-static {}, Ll1/a;->f()V

    throw v0
.end method
