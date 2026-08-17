.class final Lcom/swmansion/rnscreens/utils/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/utils/a$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/swmansion/rnscreens/utils/a$a;

.field private static final d:Lcom/swmansion/rnscreens/utils/a;


# instance fields
.field private final a:Lcom/swmansion/rnscreens/utils/b;

.field private final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/utils/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/utils/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/utils/a;->c:Lcom/swmansion/rnscreens/utils/a$a;

    .line 8
    .line 9
    new-instance v0, Lcom/swmansion/rnscreens/utils/a;

    .line 10
    .line 11
    new-instance v1, Lcom/swmansion/rnscreens/utils/b;

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v1, v2, v3}, Lcom/swmansion/rnscreens/utils/b;-><init>(IZ)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/utils/a;-><init>(Lcom/swmansion/rnscreens/utils/b;F)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/swmansion/rnscreens/utils/a;->d:Lcom/swmansion/rnscreens/utils/a;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lcom/swmansion/rnscreens/utils/b;F)V
    .locals 1

    .line 1
    const-string v0, "cacheKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/swmansion/rnscreens/utils/a;->a:Lcom/swmansion/rnscreens/utils/b;

    .line 10
    .line 11
    iput p2, p0, Lcom/swmansion/rnscreens/utils/a;->b:F

    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic a()Lcom/swmansion/rnscreens/utils/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/utils/a;->d:Lcom/swmansion/rnscreens/utils/a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final b()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/utils/a;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final c(Lcom/swmansion/rnscreens/utils/b;)Z
    .locals 2

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/a;->a:Lcom/swmansion/rnscreens/utils/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/utils/b;->a()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/high16 v1, -0x80000000

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/a;->a:Lcom/swmansion/rnscreens/utils/b;

    .line 17
    .line 18
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1
.end method
