.class public final Lexpo/modules/camera/analyzers/MLKitBarcodeAnalyzerKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "T",
        "LP4/l;",
        "await",
        "(LP4/l;Ln7/f;)Ljava/lang/Object;",
        "expo-camera_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final await(LP4/l;Ln7/f;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LP4/l;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, LR8/o;

    .line 2
    .line 3
    invoke-static {p1}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v0, v1, v2}, LR8/o;-><init>(Ln7/f;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, LR8/o;->F()V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lexpo/modules/camera/analyzers/MLKitBarcodeAnalyzerKt$await$2$1;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lexpo/modules/camera/analyzers/MLKitBarcodeAnalyzerKt$await$2$1;-><init>(LR8/m;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lexpo/modules/camera/analyzers/MLKitBarcodeAnalyzerKt$sam$com_google_android_gms_tasks_OnSuccessListener$0;

    .line 20
    .line 21
    invoke-direct {v2, v1}, Lexpo/modules/camera/analyzers/MLKitBarcodeAnalyzerKt$sam$com_google_android_gms_tasks_OnSuccessListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v2}, LP4/l;->g(LP4/h;)LP4/l;

    .line 25
    .line 26
    .line 27
    new-instance v1, Lexpo/modules/camera/analyzers/MLKitBarcodeAnalyzerKt$await$2$2;

    .line 28
    .line 29
    invoke-direct {v1, v0}, Lexpo/modules/camera/analyzers/MLKitBarcodeAnalyzerKt$await$2$2;-><init>(LR8/m;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1}, LP4/l;->e(LP4/g;)LP4/l;

    .line 33
    .line 34
    .line 35
    new-instance v1, Lexpo/modules/camera/analyzers/MLKitBarcodeAnalyzerKt$await$2$3;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lexpo/modules/camera/analyzers/MLKitBarcodeAnalyzerKt$await$2$3;-><init>(LR8/m;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, LP4/l;->a(LP4/e;)LP4/l;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, LR8/o;->z()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-ne p0, v0, :cond_0

    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-object p0
.end method
