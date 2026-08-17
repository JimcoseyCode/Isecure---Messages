.class LW2/l$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LW2/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW2/l;->a(Lc2/n;Lf2/d;LW2/x$a;ZZLW2/n$b;)LW2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LW2/l;


# direct methods
.method constructor <init>(LW2/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW2/l$a;->a:LW2/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ld3/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LW2/l$a;->b(Ld3/e;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(Ld3/e;)I
    .locals 0

    .line 1
    invoke-interface {p1}, Ld3/e;->l()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method
