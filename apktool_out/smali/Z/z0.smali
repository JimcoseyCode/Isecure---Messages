.class public abstract LZ/z0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/z0$a;
    }
.end annotation


# static fields
.field public static final a:Landroid/util/Range;

.field public static final b:LZ/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Range;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const v2, 0x7fffffff

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, LZ/z0;->a:Landroid/util/Range;

    .line 19
    .line 20
    sget-object v0, LZ/v;->c:LZ/v;

    .line 21
    .line 22
    sget-object v1, LZ/v;->b:LZ/v;

    .line 23
    .line 24
    sget-object v2, LZ/v;->a:LZ/v;

    .line 25
    .line 26
    filled-new-array {v0, v1, v2}, [LZ/v;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0}, LZ/p;->a(LZ/v;)LZ/p;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v1, v0}, LZ/y;->e(Ljava/util/List;LZ/p;)LZ/y;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, LZ/z0;->b:LZ/y;

    .line 43
    .line 44
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()LZ/z0$a;
    .locals 2

    .line 1
    new-instance v0, LZ/n$b;

    .line 2
    .line 3
    invoke-direct {v0}, LZ/n$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LZ/z0;->b:LZ/y;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, LZ/n$b;->e(LZ/y;)LZ/z0$a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, LZ/z0$a;->d(I)LZ/z0$a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, LZ/z0;->a:Landroid/util/Range;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, LZ/z0$a;->c(Landroid/util/Range;)LZ/z0$a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, -0x1

    .line 24
    invoke-virtual {v0, v1}, LZ/z0$a;->b(I)LZ/z0$a;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method


# virtual methods
.method abstract b()I
.end method

.method public abstract c()Landroid/util/Range;
.end method

.method public abstract d()I
.end method

.method public abstract e()LZ/y;
.end method

.method public abstract f()LZ/z0$a;
.end method
