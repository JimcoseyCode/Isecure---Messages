.class public interface abstract LF/I;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/I$c;,
        LF/I$d;
    }
.end annotation


# static fields
.field public static final a:LF/I;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LF/I$b;

    .line 2
    .line 3
    invoke-direct {v0}, LF/I$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF/I;->a:LF/I;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public abstract b(LF/k1$b;)V
.end method

.method public c(Ly/V$i;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d()V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract e(Ljava/util/List;II)Lm5/a;
.end method

.method public abstract h(I)V
.end method

.method public abstract j(LF/j0;)V
.end method

.method public l(II)Lm5/a;
    .locals 0

    .line 1
    new-instance p1, LF/I$a;

    .line 2
    .line 3
    invoke-direct {p1, p0}, LF/I$a;-><init>(LF/I;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LJ/n;->p(Ljava/lang/Object;)Lm5/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public abstract m()LF/j0;
.end method

.method public abstract n()V
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method
