.class public final LI7/g;
.super LI7/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/g$a;
    }
.end annotation


# static fields
.field public static final h:LI7/g$a;

.field private static final i:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LI7/g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LI7/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LI7/g;->h:LI7/g$a;

    .line 8
    .line 9
    sget-object v0, LI7/f;->g:LI7/f;

    .line 10
    .line 11
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LI7/g;->i:Lkotlin/Lazy;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 1
    new-instance v0, LB8/f;

    const-string v1, "DefaultBuiltIns"

    invoke-direct {v0, v1}, LB8/f;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, LI7/i;-><init>(LB8/n;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, LI7/i;->f(Z)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    .line 3
    :cond_0
    invoke-direct {p0, p1}, LI7/g;-><init>(Z)V

    return-void
.end method

.method private static final F0()LI7/g;
    .locals 4

    .line 1
    new-instance v0, LI7/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, LI7/g;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final synthetic G0()Lkotlin/Lazy;
    .locals 1

    .line 1
    sget-object v0, LI7/g;->i:Lkotlin/Lazy;

    .line 2
    .line 3
    return-object v0
.end method

.method static synthetic H0()LI7/g;
    .locals 1

    .line 1
    invoke-static {}, LI7/g;->F0()LI7/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
