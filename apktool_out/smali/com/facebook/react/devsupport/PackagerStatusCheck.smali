.class public final Lcom/facebook/react/devsupport/PackagerStatusCheck;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\t\u0008\u0016\u00a2\u0006\u0004\u0008\u0004\u0010\u0006J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/PackagerStatusCheck;",
        "",
        "Le9/z;",
        "client",
        "<init>",
        "(Le9/z;)V",
        "()V",
        "",
        "host",
        "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;",
        "callback",
        "Li7/B;",
        "run",
        "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V",
        "Le9/z;",
        "Companion",
        "ReactAndroid_release"
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
.field private static final Companion:Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;

.field private static final PACKAGER_OK_STATUS:Ljava/lang/String; = "packager-status:running"

.field private static final PACKAGER_STATUS_URL_TEMPLATE:Ljava/lang/String; = "%s://%s/status"


# instance fields
.field private final client:Le9/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/devsupport/PackagerStatusCheck;->Companion:Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    sget-object v0, Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;->INSTANCE:Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/inspector/DevSupportHttpClient;->getHttpClient$ReactAndroid_release()Le9/z;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/devsupport/PackagerStatusCheck;-><init>(Le9/z;)V

    return-void
.end method

.method public constructor <init>(Le9/z;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/PackagerStatusCheck;->client:Le9/z;

    return-void
.end method


# virtual methods
.method public final run(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V
    .locals 1

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lcom/facebook/react/devsupport/PackagerStatusCheck;->Companion:Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;

    .line 12
    .line 13
    invoke-static {v0, p1}, Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;->access$createPackagerStatusURL(Lcom/facebook/react/devsupport/PackagerStatusCheck$Companion;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Le9/B$a;

    .line 18
    .line 19
    invoke-direct {v0}, Le9/B$a;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Le9/B$a;->m(Ljava/lang/String;)Le9/B$a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Le9/B$a;->b()Le9/B;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lcom/facebook/react/devsupport/PackagerStatusCheck;->client:Le9/z;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Le9/z;->a(Le9/B;)Le9/e;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Lcom/facebook/react/devsupport/PackagerStatusCheck$run$1;

    .line 37
    .line 38
    invoke-direct {v0, p2}, Lcom/facebook/react/devsupport/PackagerStatusCheck$run$1;-><init>(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0}, Le9/e;->t0(Le9/f;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
