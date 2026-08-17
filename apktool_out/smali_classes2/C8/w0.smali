.class public abstract LC8/w0;
.super LC8/E0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC8/w0$a;
    }
.end annotation


# static fields
.field public static final c:LC8/w0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LC8/w0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LC8/w0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LC8/w0;->c:LC8/w0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LC8/E0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final i(LC8/v0;Ljava/util/List;)LC8/E0;
    .locals 1

    .line 1
    sget-object v0, LC8/w0;->c:LC8/w0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, LC8/w0$a;->b(LC8/v0;Ljava/util/List;)LC8/E0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final j(Ljava/util/Map;)LC8/w0;
    .locals 1

    .line 1
    sget-object v0, LC8/w0;->c:LC8/w0$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LC8/w0$a;->c(Ljava/util/Map;)LC8/w0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public e(LC8/S;)LC8/B0;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, LC8/w0;->k(LC8/v0;)LC8/B0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public abstract k(LC8/v0;)LC8/B0;
.end method
