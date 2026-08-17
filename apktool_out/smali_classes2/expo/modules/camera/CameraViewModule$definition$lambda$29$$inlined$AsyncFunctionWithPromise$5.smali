.class public final Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/camera/CameraViewModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lexpo/modules/camera/CameraViewModule;


# direct methods
.method public constructor <init>(Lexpo/modules/camera/CameraViewModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->this$0:Lexpo/modules/camera/CameraViewModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 27
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, Lexpo/modules/kotlin/Promise;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V

    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V
    .locals 5

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 1
    check-cast p1, Lexpo/modules/camera/records/BarcodeSettings;

    .line 2
    sget-object v0, Lexpo/modules/camera/utils/CameraUtils;->INSTANCE:Lexpo/modules/camera/utils/CameraUtils;

    invoke-virtual {v0}, Lexpo/modules/camera/utils/CameraUtils;->isMLKitBarcodeScannerAvailable()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    new-instance p1, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;

    invoke-direct {p1}, Lexpo/modules/camera/CameraExceptions$MLKitUnavailableException;-><init>()V

    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void

    .line 4
    :cond_0
    iget-object v1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-virtual {v1}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v1

    invoke-virtual {v1}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lexpo/modules/camera/utils/CameraUtils;->hasGooglePlayServices(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    new-instance p1, Lexpo/modules/camera/CameraExceptions$GooglePlayServicesUnavailableException;

    invoke-direct {p1}, Lexpo/modules/camera/CameraExceptions$GooglePlayServicesUnavailableException;-><init>()V

    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-virtual {v0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v0

    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_2

    .line 7
    new-instance p1, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;

    invoke-direct {p1}, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;-><init>()V

    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    return-void

    .line 8
    :cond_2
    :try_start_0
    new-instance v1, Li6/b$a;

    invoke-direct {v1}, Li6/b$a;-><init>()V

    .line 9
    invoke-virtual {p1}, Lexpo/modules/camera/records/BarcodeSettings;->getBarcodeTypes()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    .line 10
    invoke-virtual {p1}, Lexpo/modules/camera/records/BarcodeSettings;->getBarcodeTypes()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lj7/q;->e0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/camera/records/BarcodeType;

    invoke-virtual {v2}, Lexpo/modules/camera/records/BarcodeType;->mapToBarcode()I

    move-result v2

    .line 11
    invoke-virtual {p1}, Lexpo/modules/camera/records/BarcodeSettings;->getBarcodeTypes()Ljava/util/List;

    move-result-object p1

    const/4 v3, 0x1

    invoke-static {p1, v3}, Lj7/q;->Z(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    .line 12
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 14
    check-cast v4, Lexpo/modules/camera/records/BarcodeType;

    .line 15
    invoke-virtual {v4}, Lexpo/modules/camera/records/BarcodeType;->mapToBarcode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 16
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 17
    :cond_3
    invoke-static {v3}, Lj7/q;->O0(Ljava/util/Collection;)[I

    move-result-object p1

    array-length v3, p1

    invoke-static {p1, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    .line 18
    invoke-virtual {v1, v2, p1}, Li6/b$a;->b(I[I)Li6/b$a;

    .line 19
    :cond_4
    invoke-virtual {v1}, Li6/b$a;->a()Li6/b;

    move-result-object p1

    const-string v1, "build(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-static {v0, p1}, Li6/c;->a(Landroid/content/Context;Li6/b;)Li6/a;

    move-result-object p1

    const-string v0, "getClient(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-interface {p1}, Li6/a;->m()LP4/l;

    move-result-object p1

    .line 22
    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$1$8$1;

    iget-object v1, p0, Lexpo/modules/camera/CameraViewModule$definition$lambda$29$$inlined$AsyncFunctionWithPromise$5;->this$0:Lexpo/modules/camera/CameraViewModule;

    invoke-direct {v0, v1, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$8$1;-><init>(Lexpo/modules/camera/CameraViewModule;Lexpo/modules/kotlin/Promise;)V

    new-instance v1, Lexpo/modules/camera/CameraViewModuleKt$sam$com_google_android_gms_tasks_OnSuccessListener$0;

    invoke-direct {v1, v0}, Lexpo/modules/camera/CameraViewModuleKt$sam$com_google_android_gms_tasks_OnSuccessListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, LP4/l;->g(LP4/h;)LP4/l;

    move-result-object p1

    .line 23
    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$1$8$2;

    invoke-direct {v0, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$8$2;-><init>(Lexpo/modules/kotlin/Promise;)V

    invoke-virtual {p1, v0}, LP4/l;->a(LP4/e;)LP4/l;

    move-result-object p1

    .line 24
    new-instance v0, Lexpo/modules/camera/CameraViewModule$definition$1$8$3;

    invoke-direct {v0, p2}, Lexpo/modules/camera/CameraViewModule$definition$1$8$3;-><init>(Lexpo/modules/kotlin/Promise;)V

    invoke-virtual {p1, v0}, LP4/l;->e(LP4/g;)LP4/l;

    move-result-object p1

    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 26
    :catch_0
    new-instance p1, Lexpo/modules/camera/CameraExceptions$GooglePlayServicesUnavailableException;

    invoke-direct {p1}, Lexpo/modules/camera/CameraExceptions$GooglePlayServicesUnavailableException;-><init>()V

    invoke-interface {p2, p1}, Lexpo/modules/kotlin/Promise;->reject(Lexpo/modules/kotlin/exception/CodedException;)V

    :goto_1
    return-void
.end method
