.class final LK7/b;
.super LI7/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK7/b$a;
    }
.end annotation


# static fields
.field public static final h:LK7/b$a;

.field private static final i:LI7/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK7/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK7/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK7/b;->h:LK7/b$a;

    .line 8
    .line 9
    new-instance v0, LK7/b;

    .line 10
    .line 11
    invoke-direct {v0}, LK7/b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LK7/b;->i:LI7/i;

    .line 15
    .line 16
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, LB8/f;

    .line 2
    .line 3
    const-string v1, "FallbackBuiltIns"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LB8/f;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, LI7/i;-><init>(LB8/n;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, LI7/i;->f(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic F0()LI7/i;
    .locals 1

    .line 1
    sget-object v0, LK7/b;->i:LI7/i;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method protected G0()LN7/c$a;
    .locals 1

    .line 1
    sget-object v0, LN7/c$a;->a:LN7/c$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic M()LN7/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK7/b;->G0()LN7/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
