.class public final LR8/M0;
.super Ln7/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LR8/A0;


# static fields
.field public static final h:LR8/M0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR8/M0;

    .line 2
    .line 3
    invoke-direct {v0}, LR8/M0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR8/M0;->h:LR8/M0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, LR8/A0;->c:LR8/A0$b;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ln7/a;-><init>(Ln7/j$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public A(LR8/v;)LR8/t;
    .locals 0

    .line 1
    sget-object p1, LR8/N0;->g:LR8/N0;

    .line 2
    .line 3
    return-object p1
.end method

.method public J(ZZLkotlin/jvm/functions/Function1;)LR8/f0;
    .locals 0

    .line 1
    sget-object p1, LR8/N0;->g:LR8/N0;

    .line 2
    .line 3
    return-object p1
.end method

.method public M()Ljava/util/concurrent/CancellationException;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "This job is always active"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public d()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public g0(Lkotlin/jvm/functions/Function1;)LR8/f0;
    .locals 0

    .line 1
    sget-object p1, LR8/N0;->g:LR8/N0;

    .line 2
    .line 3
    return-object p1
.end method

.method public k(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public start()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NonCancellable"

    .line 2
    .line 3
    return-object v0
.end method
