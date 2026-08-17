.class public final synthetic Lx/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/j0$b;


# instance fields
.field public final synthetic a:Lx/l$a;

.field public final synthetic b:LF/j0;


# direct methods
.method public synthetic constructor <init>(Lx/l$a;LF/j0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx/k;->a:Lx/l$a;

    .line 5
    .line 6
    iput-object p2, p0, Lx/k;->b:LF/j0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LF/j0$a;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lx/k;->a:Lx/l$a;

    .line 2
    .line 3
    iget-object v1, p0, Lx/k;->b:LF/j0;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lx/l$a;->a(Lx/l$a;LF/j0;LF/j0$a;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method
