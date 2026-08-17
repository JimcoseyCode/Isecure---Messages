.class public abstract LR8/J;
.super Ln7/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ln7/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR8/J$a;
    }
.end annotation


# static fields
.field public static final h:LR8/J$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR8/J$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LR8/J$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LR8/J;->h:LR8/J$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Ln7/g;->e:Ln7/g$b;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ln7/a;-><init>(Ln7/j$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic N0(LR8/J;ILjava/lang/String;ILjava/lang/Object;)LR8/J;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, LR8/J;->M0(ILjava/lang/String;)LR8/J;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: limitedParallelism"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public final A0(Ln7/f;)V
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LW8/i;

    .line 7
    .line 8
    invoke-virtual {p1}, LW8/i;->v()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public abstract J0(Ln7/j;Ljava/lang/Runnable;)V
.end method

.method public K0(Ln7/j;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LW8/j;->c(LR8/J;Ln7/j;Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public L0(Ln7/j;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public M0(ILjava/lang/String;)LR8/J;
    .locals 1

    .line 1
    invoke-static {p1}, LW8/m;->a(I)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LW8/l;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1, p2}, LW8/l;-><init>(LR8/J;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public e(Ln7/j$c;)Ln7/j$b;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ln7/g$a;->a(Ln7/g;Ln7/j$c;)Ln7/j$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LR8/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x40

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, LR8/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method public final w0(Ln7/f;)Ln7/f;
    .locals 1

    .line 1
    new-instance v0, LW8/i;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LW8/i;-><init>(LR8/J;Ln7/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public y0(Ln7/j$c;)Ln7/j;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ln7/g$a;->b(Ln7/g;Ln7/j$c;)Ln7/j;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
