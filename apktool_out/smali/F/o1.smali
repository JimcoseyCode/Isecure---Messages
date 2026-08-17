.class public abstract LF/o1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/o1$a;
    }
.end annotation


# static fields
.field public static final a:Landroid/util/Range;


# direct methods
.method static constructor <clinit>()V
    .locals 2

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
    invoke-direct {v0, v1, v1}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LF/o1;->a:Landroid/util/Range;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Landroid/util/Size;)LF/o1$a;
    .locals 2

    .line 1
    new-instance v0, LF/p$b;

    .line 2
    .line 3
    invoke-direct {v0}, LF/p$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, LF/p$b;->f(Landroid/util/Size;)LF/o1$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p0}, LF/o1$a;->e(Landroid/util/Size;)LF/o1$a;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0}, LF/o1$a;->g(I)LF/o1$a;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v1, LF/o1;->a:Landroid/util/Range;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, LF/o1$a;->c(Landroid/util/Range;)LF/o1$a;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v1, Ly/H;->d:Ly/H;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, LF/o1$a;->b(Ly/H;)LF/o1$a;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0, v0}, LF/o1$a;->h(Z)LF/o1$a;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method


# virtual methods
.method public abstract b()Ly/H;
.end method

.method public abstract c()Landroid/util/Range;
.end method

.method public abstract d()LF/j0;
.end method

.method public abstract e()Landroid/util/Size;
.end method

.method public abstract f()Landroid/util/Size;
.end method

.method public abstract g()I
.end method

.method public abstract h()Z
.end method

.method public abstract i()LF/o1$a;
.end method
