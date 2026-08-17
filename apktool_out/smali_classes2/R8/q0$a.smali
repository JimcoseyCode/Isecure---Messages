.class public final LR8/q0$a;
.super Ln7/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR8/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    sget-object v0, LR8/J;->h:LR8/J$a;

    new-instance v1, LR8/p0;

    invoke-direct {v1}, LR8/p0;-><init>()V

    .line 3
    invoke-direct {p0, v0, v1}, Ln7/b;-><init>(Ln7/j$c;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR8/q0$a;-><init>()V

    return-void
.end method

.method public static synthetic c(Ln7/j$b;)LR8/q0;
    .locals 0

    .line 1
    invoke-static {p0}, LR8/q0$a;->d(Ln7/j$b;)LR8/q0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d(Ln7/j$b;)LR8/q0;
    .locals 1

    .line 1
    instance-of v0, p0, LR8/q0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LR8/q0;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method
