.class public final synthetic Lexpo/modules/imagepicker/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/interfaces/permissions/PermissionsResponseListener;


# instance fields
.field public final synthetic a:Lexpo/modules/kotlin/Promise;

.field public final synthetic b:Ljava/lang/ref/WeakReference;

.field public final synthetic c:Lexpo/modules/imagepicker/ImagePickerModule;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/kotlin/Promise;Ljava/lang/ref/WeakReference;Lexpo/modules/imagepicker/ImagePickerModule;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/imagepicker/c;->a:Lexpo/modules/kotlin/Promise;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/imagepicker/c;->b:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/imagepicker/c;->c:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onResult(Ljava/util/Map;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/imagepicker/c;->a:Lexpo/modules/kotlin/Promise;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/imagepicker/c;->b:Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/imagepicker/c;->c:Lexpo/modules/imagepicker/ImagePickerModule;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Lexpo/modules/imagepicker/ImagePickerModule;->b(Lexpo/modules/kotlin/Promise;Ljava/lang/ref/WeakReference;Lexpo/modules/imagepicker/ImagePickerModule;Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
